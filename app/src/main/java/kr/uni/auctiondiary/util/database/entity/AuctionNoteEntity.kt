package kr.uni.auctiondiary.util.database.entity


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "AUCTION_NOTE")
data class AuctionNoteEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "NOTE_IDX") var idx: Int,
    @ColumnInfo(name = "PICTURE_PATH") var picturePath: String = "",
    @ColumnInfo(name = "SIMPLE_PLACE") var simplePlace: String = "",
    @ColumnInfo(name = "DETAIL_PLACE") var detailPlcae: String = "",
    @ColumnInfo(name = "TAG") var tag: String = ""
)
