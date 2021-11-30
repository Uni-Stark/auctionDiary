package kr.uni.auctiondiary.util.database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.*;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\n\u001a\u00020\u0003H\'\u00a8\u0006\u000b"}, d2 = {"Lkr/uni/auctiondiary/util/database/dao/AuctionNoteDao;", "", "delete", "", "data", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "fetchAll", "Landroidx/lifecycle/LiveData;", "", "insert", "truncate", "app_debug"})
public abstract interface AuctionNoteDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM AUCTION_NOTE ORDER BY NOTE_IDX DESC")
    public abstract androidx.lifecycle.LiveData<java.util.List<kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity>> fetchAll();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity data);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity data);
    
    @androidx.room.Query(value = "DELETE FROM AUCTION_NOTE")
    public abstract void truncate();
}