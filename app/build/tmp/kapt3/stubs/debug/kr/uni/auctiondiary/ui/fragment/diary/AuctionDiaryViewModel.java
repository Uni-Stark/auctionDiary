package kr.uni.auctiondiary.ui.fragment.diary;

import android.content.Context;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import dagger.hilt.android.scopes.FragmentScoped;
import kotlinx.coroutines.InternalCoroutinesApi;
import kr.uni.auctiondiary.util.database.AppDatabase;
import kr.uni.auctiondiary.util.database.dao.AuctionNoteDao;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;
import kr.uni.auctiondiary.util.database.repo.AuctionNoteRepo;
import javax.inject.Inject;

@dagger.hilt.android.scopes.FragmentScoped()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u0003R\u0014\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryViewModel;", "Landroidx/lifecycle/ViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "database", "Lkr/uni/auctiondiary/util/database/repo/AuctionNoteRepo;", "getDatabase$annotations", "()V", "fetchAuctionNoteData", "Landroidx/lifecycle/LiveData;", "", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "getCurrentLocation", "", "app_debug"})
public final class AuctionDiaryViewModel extends androidx.lifecycle.ViewModel {
    private final kr.uni.auctiondiary.util.database.repo.AuctionNoteRepo database = null;
    
    @javax.inject.Inject()
    public AuctionDiaryViewModel(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.InternalCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void getDatabase$annotations() {
    }
    
    /**
     * @return_LiveData_for_automatically_refresh_recycler_view
     */
    @org.jetbrains.annotations.NotNull()
    @kotlinx.coroutines.InternalCoroutinesApi()
    public final androidx.lifecycle.LiveData<java.util.List<kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity>> fetchAuctionNoteData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCurrentLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}