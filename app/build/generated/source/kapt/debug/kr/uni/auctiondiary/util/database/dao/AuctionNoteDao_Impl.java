package kr.uni.auctiondiary.util.database.dao;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AuctionNoteDao_Impl implements AuctionNoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<AuctionNoteEntity> __insertionAdapterOfAuctionNoteEntity;

  private final EntityDeletionOrUpdateAdapter<AuctionNoteEntity> __deletionAdapterOfAuctionNoteEntity;

  private final SharedSQLiteStatement __preparedStmtOfTruncate;

  public AuctionNoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfAuctionNoteEntity = new EntityInsertionAdapter<AuctionNoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `AUCTION_NOTE` (`NOTE_IDX`,`PICTURE_PATH`,`SIMPLE_PLACE`,`DETAIL_PLACE`,`TAG`) VALUES (nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AuctionNoteEntity value) {
        stmt.bindLong(1, value.getIdx());
        if (value.getPicturePath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPicturePath());
        }
        if (value.getSimplePlace() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSimplePlace());
        }
        if (value.getDetailPlcae() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDetailPlcae());
        }
        if (value.getTag() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTag());
        }
      }
    };
    this.__deletionAdapterOfAuctionNoteEntity = new EntityDeletionOrUpdateAdapter<AuctionNoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `AUCTION_NOTE` WHERE `NOTE_IDX` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, AuctionNoteEntity value) {
        stmt.bindLong(1, value.getIdx());
      }
    };
    this.__preparedStmtOfTruncate = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM AUCTION_NOTE";
        return _query;
      }
    };
  }

  @Override
  public void insert(final AuctionNoteEntity data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfAuctionNoteEntity.insert(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(final AuctionNoteEntity data) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfAuctionNoteEntity.handle(data);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void truncate() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfTruncate.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfTruncate.release(_stmt);
    }
  }

  @Override
  public LiveData<List<AuctionNoteEntity>> fetchAll() {
    final String _sql = "SELECT * FROM AUCTION_NOTE ORDER BY NOTE_IDX DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"AUCTION_NOTE"}, false, new Callable<List<AuctionNoteEntity>>() {
      @Override
      public List<AuctionNoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfIdx = CursorUtil.getColumnIndexOrThrow(_cursor, "NOTE_IDX");
          final int _cursorIndexOfPicturePath = CursorUtil.getColumnIndexOrThrow(_cursor, "PICTURE_PATH");
          final int _cursorIndexOfSimplePlace = CursorUtil.getColumnIndexOrThrow(_cursor, "SIMPLE_PLACE");
          final int _cursorIndexOfDetailPlcae = CursorUtil.getColumnIndexOrThrow(_cursor, "DETAIL_PLACE");
          final int _cursorIndexOfTag = CursorUtil.getColumnIndexOrThrow(_cursor, "TAG");
          final List<AuctionNoteEntity> _result = new ArrayList<AuctionNoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final AuctionNoteEntity _item;
            final int _tmpIdx;
            _tmpIdx = _cursor.getInt(_cursorIndexOfIdx);
            final String _tmpPicturePath;
            if (_cursor.isNull(_cursorIndexOfPicturePath)) {
              _tmpPicturePath = null;
            } else {
              _tmpPicturePath = _cursor.getString(_cursorIndexOfPicturePath);
            }
            final String _tmpSimplePlace;
            if (_cursor.isNull(_cursorIndexOfSimplePlace)) {
              _tmpSimplePlace = null;
            } else {
              _tmpSimplePlace = _cursor.getString(_cursorIndexOfSimplePlace);
            }
            final String _tmpDetailPlcae;
            if (_cursor.isNull(_cursorIndexOfDetailPlcae)) {
              _tmpDetailPlcae = null;
            } else {
              _tmpDetailPlcae = _cursor.getString(_cursorIndexOfDetailPlcae);
            }
            final String _tmpTag;
            if (_cursor.isNull(_cursorIndexOfTag)) {
              _tmpTag = null;
            } else {
              _tmpTag = _cursor.getString(_cursorIndexOfTag);
            }
            _item = new AuctionNoteEntity(_tmpIdx,_tmpPicturePath,_tmpSimplePlace,_tmpDetailPlcae,_tmpTag);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
