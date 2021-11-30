package kr.uni.auctiondiary.ui;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;
import kr.uni.auctiondiary.util.UniApp;

@OriginatingElement(
    topLevelClass = UniApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface UniApp_GeneratedInjector {
  void injectUniApp(UniApp uniApp);
}
