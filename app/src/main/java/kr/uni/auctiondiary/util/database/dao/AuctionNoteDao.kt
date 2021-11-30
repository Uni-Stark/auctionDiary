package kr.uni.auctiondiary.util.database.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity

@Dao
interface AuctionNoteDao {

    @Query("SELECT * FROM AUCTION_NOTE ORDER BY NOTE_IDX DESC")
    fun fetchAll(): LiveData<List<AuctionNoteEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(data: AuctionNoteEntity)

    @Delete
    fun delete(data: AuctionNoteEntity)

    @Query("DELETE FROM AUCTION_NOTE")
    fun truncate()
}