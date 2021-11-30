package kr.uni.auctiondiary.util.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity


@Database(
    entities = [AuctionNoteEntity::class], version = 1, exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun auctionNoteDao(): AuctionNoteDao

    companion object {
        private const val DB_NAME = "auctionDiary.db"
        private var instance: AppDatabase? = null

        @InternalCoroutinesApi
        fun getInstance(context: Context): AppDatabase {
            return instance ?: kotlinx.coroutines.internal.synchronized(this) {
                instance ?: buildDatabase(context)
            }
        }

        private fun buildDatabase(context: Context): AppDatabase {
            return Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                DB_NAME
            )
                .addCallback(object : RoomDatabase.Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                    }
                })
                .build()
        }
    }


}