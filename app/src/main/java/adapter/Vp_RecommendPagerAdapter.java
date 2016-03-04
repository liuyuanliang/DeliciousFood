package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import fragment.Vp_RecommendFragment;
import loopingviewpager.LoopViewPager;
import util.L;

/**
 * Created by admin on 2016/2/26.
 */
public class Vp_RecommendPagerAdapter extends FragmentStatePagerAdapter{

    private static final String TAG = "print";
    private List<ArrayList<String>> datas;

    public Vp_RecommendPagerAdapter(FragmentManager fm,List<ArrayList<String>> datas) {
        super(fm);
        this.datas = datas;
      //  Log.e(TAG, "Vp_RecommendPagerAdapter: "+datas );
    }

    @Override
    public Fragment getItem(int position) {
      //  L.e("中"+position);
        position = LoopViewPager.toRealPosition(position, getCount());
     //   L.e("中后"+datas.get(position%datas.size()));
        return Vp_RecommendFragment.getInstance(datas.get(position%datas.size()));
    }

    @Override
    public int getCount() {
        return datas.size();
    }
}
