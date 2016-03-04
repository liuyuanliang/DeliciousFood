package fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

import com.facebook.drawee.view.SimpleDraweeView;
import com.qf.deliiousfoot.R;

import base.BaseFragment;
import util.Contants;

/**
 * Created by admin on 2016/2/26.
 */
public class NavViewPagerFragment extends BaseFragment{

    private SimpleDraweeView simpleDraweeView;

    @Override
    protected int contentView() {
        return R.layout.nav_vp_layout;
    }

    public static Fragment getInstance(String url){
        NavViewPagerFragment fragment = new NavViewPagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Contants.KEY.NAV_URL, url);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    protected void initView(View view) {
        simpleDraweeView = (SimpleDraweeView) view.findViewById(R.id.sdv_nav);
    }

    @Override
    protected void loadDatas() {
        Bundle arguments = getArguments();
        String url = arguments.getString(Contants.KEY.NAV_URL);
        Uri uri = Uri.parse(url);
        simpleDraweeView.setImageURI(uri);
    }
}
