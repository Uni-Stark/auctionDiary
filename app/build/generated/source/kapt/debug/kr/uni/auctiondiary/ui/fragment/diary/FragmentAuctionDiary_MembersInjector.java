// Generated by Dagger (https://dagger.dev).
package kr.uni.auctiondiary.ui.fragment.diary;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FragmentAuctionDiary_MembersInjector implements MembersInjector<FragmentAuctionDiary> {
  private final Provider<AuctionDiaryViewModel> viewModelProvider;

  public FragmentAuctionDiary_MembersInjector(Provider<AuctionDiaryViewModel> viewModelProvider) {
    this.viewModelProvider = viewModelProvider;
  }

  public static MembersInjector<FragmentAuctionDiary> create(
      Provider<AuctionDiaryViewModel> viewModelProvider) {
    return new FragmentAuctionDiary_MembersInjector(viewModelProvider);
  }

  @Override
  public void injectMembers(FragmentAuctionDiary instance) {
    injectViewModel(instance, viewModelProvider.get());
  }

  @InjectedFieldSignature("kr.uni.auctiondiary.ui.fragment.diary.FragmentAuctionDiary.viewModel")
  public static void injectViewModel(FragmentAuctionDiary instance,
      AuctionDiaryViewModel viewModel) {
    instance.viewModel = viewModel;
  }
}
