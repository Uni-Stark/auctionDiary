package kr.uni.auctiondiary.util.database.repo

import android.content.Context
import androidx.lifecycle.LiveData
import kotlinx.coroutines.InternalCoroutinesApi
import kr.uni.auctiondiary.util.database.AppDatabase
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity

@InternalCoroutinesApi
class AuctionNoteRepo(context: Context) {
    private var appDataBase: AppDatabase = AppDatabase.getInstance(context)
    private var auctionNoteDao: AuctionNoteDao = appDataBase.auctionNoteDao()

    fun insert(data: AuctionNoteEntity) = auctionNoteDao.insert(data)
    fun delete(data: AuctionNoteEntity) = auctionNoteDao.delete(data)
    fun truncate() = auctionNoteDao.truncate()
    fun fetchAll(): LiveData<List<AuctionNoteEntity>> = auctionNoteDao.fetchAll()
}