// Generated by Dagger (https://dagger.dev).
package kr.uni.auctiondiary.ui.main;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainViewModel> viewModelProvider;

  public MainActivity_MembersInjector(Provider<MainViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<MainActivity> create(Provider<MainViewModel> viewModelProvider) {
    return new MainActivity_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("kr.uni.auctiondiary.ui.main.MainActivity.viewModel")
  public static void injectViewModel(MainActivity instance, MainViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}