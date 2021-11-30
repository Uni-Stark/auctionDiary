package kr.uni.auctiondiary.util.database.repo;

import android.content.Context;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.InternalCoroutinesApi;
import kr.uni.auctiondiary.util.database.AppDatabase;
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;

@kotlinx.coroutines.InternalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eJ\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lkr/uni/auctiondiary/util/database/repo/AuctionNoteRepo;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "appDataBase", "Lkr/uni/auctiondiary/util/database/AppDatabase;", "auctionNoteDao", "Lkr/uni/auctiondiary/util/database/dao/AuctionNoteDao;", "delete", "", "data", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "fetchAll", "Landroidx/lifecycle/LiveData;", "", "insert", "truncate", "app_debug"})
public final class AuctionNoteRepo {
    private kr.uni.auctiondiary.util.database.AppDatabase appDataBase;
    private kr.uni.auctiondiary.util.database.dao.AuctionNoteDao auctionNoteDao;
    
    public AuctionNoteRepo(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity data) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity data) {
    }
    
    public final void truncate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity>> fetchAll() {
        return null;
    }
}