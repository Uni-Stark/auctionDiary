package kr.uni.auctiondiary.util;

import android.app.Application;
import dagger.hilt.android.HiltAndroidApp;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lkr/uni/auctiondiary/util/UniApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_debug"})
@dagger.hilt.android.HiltAndroidApp()
public final class UniApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final kr.uni.auctiondiary.util.UniApp.Companion Companion = null;
    @org.jetbrains.annotations.Nullable()
    private static kr.uni.auctiondiary.util.UniApp instance;
    
    public UniApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R*\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00048F@BX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lkr/uni/auctiondiary/util/UniApp$Companion;", "", "()V", "<set-?>", "Lkr/uni/auctiondiary/util/UniApp;", "instance", "getInstance", "()Lkr/uni/auctiondiary/util/UniApp;", "setInstance", "(Lkr/uni/auctiondiary/util/UniApp;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        @kotlin.jvm.Synchronized()
        public final synchronized kr.uni.auctiondiary.util.UniApp getInstance() {
            return null;
        }
        
        private final void setInstance(kr.uni.auctiondiary.util.UniApp p0) {
        }
    }
}