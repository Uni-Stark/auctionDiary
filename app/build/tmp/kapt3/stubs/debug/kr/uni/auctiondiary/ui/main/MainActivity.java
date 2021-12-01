package kr.uni.auctiondiary.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentActivity;
import com.google.android.material.tabs.TabLayoutMediator;
import dagger.hilt.android.AndroidEntryPoint;
import kotlinx.coroutines.InternalCoroutinesApi;
import kr.uni.auctiondiary.R;
import kr.uni.auctiondiary.databinding.ActivityMainBinding;
import kr.uni.auctiondiary.util.BaseActivity;
import javax.inject.Inject;

@kotlinx.coroutines.InternalCoroutinesApi()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Lkr/uni/auctiondiary/ui/main/MainActivity;", "Lkr/uni/auctiondiary/util/BaseActivity;", "()V", "binding", "Lkr/uni/auctiondiary/databinding/ActivityMainBinding;", "getBinding", "()Lkr/uni/auctiondiary/databinding/ActivityMainBinding;", "setBinding", "(Lkr/uni/auctiondiary/databinding/ActivityMainBinding;)V", "viewModel", "Lkr/uni/auctiondiary/ui/main/MainViewModel;", "getViewModel", "()Lkr/uni/auctiondiary/ui/main/MainViewModel;", "setViewModel", "(Lkr/uni/auctiondiary/ui/main/MainViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "tabLayoutSetting", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends kr.uni.auctiondiary.util.BaseActivity {
    @javax.inject.Inject()
    public kr.uni.auctiondiary.ui.main.MainViewModel viewModel;
    public kr.uni.auctiondiary.databinding.ActivityMainBinding binding;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.uni.auctiondiary.ui.main.MainViewModel getViewModel() {
        return null;
    }
    
    public final void setViewModel(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.ui.main.MainViewModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kr.uni.auctiondiary.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    kr.uni.auctiondiary.databinding.ActivityMainBinding p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void tabLayoutSetting() {
    }
}