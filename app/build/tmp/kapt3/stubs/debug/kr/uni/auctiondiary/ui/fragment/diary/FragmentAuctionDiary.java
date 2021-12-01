package kr.uni.auctiondiary.ui.fragment.diary;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.*;
import kr.uni.auctiondiary.R;
import kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding;
import kr.uni.auctiondiary.ui.activity.WriteAuctionActivity;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;
import kr.uni.auctiondiary.util.database.repo.AuctionNoteRepo;
import java.util.*;
import javax.inject.Inject;

@kotlinx.coroutines.InternalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J$\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006%"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/FragmentAuctionDiary;", "Landroidx/fragment/app/Fragment;", "()V", "adapter", "Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter;", "getAdapter", "()Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter;", "setAdapter", "(Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter;)V", "binding", "Lkr/uni/auctiondiary/databinding/FragmentAuctionDiaryBinding;", "getBinding", "()Lkr/uni/auctiondiary/databinding/FragmentAuctionDiaryBinding;", "setBinding", "(Lkr/uni/auctiondiary/databinding/FragmentAuctionDiaryBinding;)V", "viewModel", "Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryViewModel;", "getViewModel", "()Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initList", "", "listSetOnMainThread", "state", "", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Companion", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class FragmentAuctionDiary extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy viewModel$delegate = null;
    public kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding binding;
    public kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    public static final kr.uni.auctiondiary.ui.fragment.diary.FragmentAuctionDiary.Companion Companion = null;
    private static final int SHOW_LIST = 1001;
    private static final int SHOW_EMPTY_LIST = 1002;
    
    public FragmentAuctionDiary() {
        super();
    }
    
    private final kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.databinding.FragmentAuctionDiaryBinding p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter getAdapter() {
        return null;
    }
    
    public final void setAdapter(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * ----------------------------------
     *
     *    RecyclerView Setting 해주기
     *
     *    ----------------------------------
     */
    private final void initList() {
    }
    
    private final void listSetOnMainThread(int state) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/FragmentAuctionDiary$Companion;", "", "()V", "SHOW_EMPTY_LIST", "", "SHOW_LIST", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}