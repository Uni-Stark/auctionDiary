package kr.uni.auctiondiary.util.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao;
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile AuctionNoteDao _auctionNoteDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `AUCTION_NOTE` (`NOTE_IDX` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `PICTURE_PATH` TEXT NOT NULL, `SIMPLE_PLACE` TEXT NOT NULL, `DETAIL_PLACE` TEXT NOT NULL, `TAG` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '2a7e5534106d8b1b9999b144fe7c44ef')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `AUCTION_NOTE`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsAUCTIONNOTE = new HashMap<String, TableInfo.Column>(5);
        _columnsAUCTIONNOTE.put("NOTE_IDX", new TableInfo.Column("NOTE_IDX", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAUCTIONNOTE.put("PICTURE_PATH", new TableInfo.Column("PICTURE_PATH", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAUCTIONNOTE.put("SIMPLE_PLACE", new TableInfo.Column("SIMPLE_PLACE", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAUCTIONNOTE.put("DETAIL_PLACE", new TableInfo.Column("DETAIL_PLACE", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsAUCTIONNOTE.put("TAG", new TableInfo.Column("TAG", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysAUCTIONNOTE = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesAUCTIONNOTE = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoAUCTIONNOTE = new TableInfo("AUCTION_NOTE", _columnsAUCTIONNOTE, _foreignKeysAUCTIONNOTE, _indicesAUCTIONNOTE);
        final TableInfo _existingAUCTIONNOTE = TableInfo.read(_db, "AUCTION_NOTE");
        if (! _infoAUCTIONNOTE.equals(_existingAUCTIONNOTE)) {
          return new RoomOpenHelper.ValidationResult(false, "AUCTION_NOTE(kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity).\n"
                  + " Expected:\n" + _infoAUCTIONNOTE + "\n"
                  + " Found:\n" + _existingAUCTIONNOTE);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "2a7e5534106d8b1b9999b144fe7c44ef", "1f6aa0473049807b23ded7968d605f51");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "AUCTION_NOTE");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `AUCTION_NOTE`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(AuctionNoteDao.class, AuctionNoteDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public AuctionNoteDao auctionNoteDao() {
    if (_auctionNoteDao != null) {
      return _auctionNoteDao;
    } else {
      synchronized(this) {
        if(_auctionNoteDao == null) {
          _auctionNoteDao = new AuctionNoteDao_Impl(this);
        }
        return _auctionNoteDao;
      }
    }
  }
}
