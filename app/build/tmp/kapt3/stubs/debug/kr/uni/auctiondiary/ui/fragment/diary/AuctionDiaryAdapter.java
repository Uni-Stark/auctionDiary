package kr.uni.auctiondiary.ui.fragment.diary;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import kr.uni.auctiondiary.databinding.ListAuctionNoteBinding;
import kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class AuctionDiaryAdapter extends androidx.recyclerview.widget.ListAdapter<kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity, kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public static final kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter.Companion Companion = null;
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity> diffUtil = null;
    
    public AuctionDiaryAdapter() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.ui.fragment.diary.AuctionDiaryAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000bH\u0002J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lkr/uni/auctiondiary/databinding/ListAuctionNoteBinding;", "(Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter;Lkr/uni/auctiondiary/databinding/ListAuctionNoteBinding;)V", "bind", "", "data", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "setImage", "path", "", "setPlaceName", "name", "setTag", "tag", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final kr.uni.auctiondiary.databinding.ListAuctionNoteBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        kr.uni.auctiondiary.databinding.ListAuctionNoteBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        kr.uni.auctiondiary.util.database.entity.AuctionNoteEntity data) {
        }
        
        private final void setPlaceName(java.lang.String name) {
        }
        
        private final void setTag(java.lang.String tag) {
        }
        
        private final void setImage(java.lang.String path) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lkr/uni/auctiondiary/ui/fragment/diary/AuctionDiaryAdapter$Companion;", "", "()V", "diffUtil", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lkr/uni/auctiondiary/util/database/entity/AuctionNoteEntity;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}