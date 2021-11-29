package kr.uni.auctiondiary;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kr.uni.auctiondiary.databinding.ActivityMainBindingImpl;
import kr.uni.auctiondiary.databinding.FragmentAuctionBindingImpl;
import kr.uni.auctiondiary.databinding.FragmentBoardBindingImpl;
import kr.uni.auctiondiary.databinding.FragmentImjangBindingImpl;
import kr.uni.auctiondiary.databinding.FragmentSettingBindingImpl;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_FRAGMENTAUCTION = 2;

  private static final int LAYOUT_FRAGMENTBOARD = 3;

  private static final int LAYOUT_FRAGMENTIMJANG = 4;

  private static final int LAYOUT_FRAGMENTSETTING = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.uni.auctiondiary.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.uni.auctiondiary.R.layout.fragment_auction, LAYOUT_FRAGMENTAUCTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.uni.auctiondiary.R.layout.fragment_board, LAYOUT_FRAGMENTBOARD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.uni.auctiondiary.R.layout.fragment_auction_diary, LAYOUT_FRAGMENTIMJANG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(kr.uni.auctiondiary.R.layout.fragment_setting, LAYOUT_FRAGMENTSETTING);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTAUCTION: {
          if ("layout/fragment_auction_0".equals(tag)) {
            return new FragmentAuctionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_auction is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOARD: {
          if ("layout/fragment_board_0".equals(tag)) {
            return new FragmentBoardBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_board is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTIMJANG: {
          if ("layout/fragment_imjang_0".equals(tag)) {
            return new FragmentImjangBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_imjang is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSETTING: {
          if ("layout/fragment_setting_0".equals(tag)) {
            return new FragmentSettingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_setting is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(3);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "activity");
      sKeys.put(2, "fm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", kr.uni.auctiondiary.R.layout.activity_main);
      sKeys.put("layout/fragment_auction_0", kr.uni.auctiondiary.R.layout.fragment_auction);
      sKeys.put("layout/fragment_board_0", kr.uni.auctiondiary.R.layout.fragment_board);
      sKeys.put("layout/fragment_imjang_0", kr.uni.auctiondiary.R.layout.fragment_auction_diary);
      sKeys.put("layout/fragment_setting_0", kr.uni.auctiondiary.R.layout.fragment_setting);
    }
  }
}
