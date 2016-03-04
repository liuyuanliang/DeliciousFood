package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

import fragment.NavViewPagerFragment;

/**
 * Created by admin on 2016/2/25.
 */
public class NavViewPagerAdapter extends FragmentStatePagerAdapter{

    private static final String TAG = "print";
    private List<String> datas;

    public NavViewPagerAdapter(FragmentManager fm,List<String> datas) {
        super(fm);
        this.datas = datas;
    }

    @Override
    public Fragment getItem(int position) {

        return NavViewPagerFragment.getInstance(datas.get(position));
    }

    @Override
    public int getCount() {
        return datas.size();
    }
}
