package kr.uni.auctiondiary.util.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlinx.coroutines.InternalCoroutinesApi;
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;

@androidx.room.Database(entities = {kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lkr/uni/auctiondiary/util/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "auctionNoteDao", "Lkr/uni/auctiondiary/util/database/dao/AuctionNoteDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final kr.uni.auctiondiary.util.database.AppDatabase.Companion Companion = null;
    private static final java.lang.String DB_NAME = "auctionDiary.db";
    private static kr.uni.auctiondiary.util.database.AppDatabase instance;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract kr.uni.auctiondiary.util.database.dao.AuctionNoteDao auctionNoteDao();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lkr/uni/auctiondiary/util/database/AppDatabase$Companion;", "", "()V", "DB_NAME", "", "instance", "Lkr/uni/auctiondiary/util/database/AppDatabase;", "buildDatabase", "context", "Landroid/content/Context;", "getInstance", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlinx.coroutines.InternalCoroutinesApi()
        public final kr.uni.auctiondiary.util.database.AppDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private final kr.uni.auctiondiary.util.database.AppDatabase buildDatabase(android.content.Context context) {
            return null;
        }
    }
}