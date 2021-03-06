package kr.uni.auctiondiary.databinding;
import kr.uni.auctiondiary.R;
import kr.uni.auctiondiary.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentAuctionDiaryBindingImpl extends FragmentAuctionDiaryBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.addAuctionNote, 1);
        sViewsWithIds.put(R.id.addListImage, 2);
        sViewsWithIds.put(R.id.addList, 3);
        sViewsWithIds.put(R.id.list, 4);
        sViewsWithIds.put(R.id.noAuctionListContainer, 5);
        sViewsWithIds.put(R.id.noDiaryText, 6);
        sViewsWithIds.put(R.id.noDiaryButton, 7);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentAuctionDiaryBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentAuctionDiaryBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[5]
            , (android.widget.Button) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            );
        this.mainContainer.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.fm == variableId) {
            setFm((kr.uni.auctiondiary.ui.fragment.diary.FragmentAuctionDiary) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFm(@Nullable kr.uni.auctiondiary.ui.fragment.diary.FragmentAuctionDiary Fm) {
        this.mFm = Fm;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): fm
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}