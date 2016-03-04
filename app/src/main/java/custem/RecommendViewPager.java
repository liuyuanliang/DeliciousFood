package custem;

import android.content.Context;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.qf.deliiousfoot.R;

import java.util.ArrayList;
import java.util.List;

import adapter.Vp_RecommendPagerAdapter;
import loopingviewpager.LoopViewPager;
import model.RecommendEntity;

/**
 * 推荐页三参ViewPager组件
 */
public class RecommendViewPager extends FrameLayout implements ViewPager.OnPageChangeListener {

    private FragmentManager manager;
    private LoopViewPager viewPager;

    List<ArrayList<String>> datas;
    private NavView navView;
    private Vp_RecommendPagerAdapter vp_recommendPagerAdapter;

    public RecommendViewPager(Context context, FragmentManager manager) {
        super(context);
        this.manager = manager;
        init();
    }

    /**
     * 初始化方法
     */
    private void init() {
        LayoutInflater.from(getContext()).inflate(R.layout.viewpager_recommend, this, true);

        viewPager = (LoopViewPager) findViewById(R.id.vp_recommend);

        navView = (NavView) findViewById(R.id.nv_sancan);

        viewPager.addOnPageChangeListener(this);
    }

    /**
     * 提供一个外部传入数据的方法
     */
    public void setDatas(List<RecommendEntity.ObjEntity.SanCanEntity> list, List<RecommendEntity.ObjEntity.SanCanTitlesEntity> san_can_titles) {

        datas = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 3) {
            ArrayList<String> strList = new ArrayList<>();
            //第一张图片
            strList.add(list.get(i).getTitlepic());
            strList.add(list.get(i).getTitle());
            strList.add(list.get(i).getDescr());
            //第二张图片
            strList.add(list.get(i + 1).getTitlepic());
            strList.add(list.get(i + 1).getTitle());
            strList.add(list.get(i + 1).getDescr());
            //第三张图片
            strList.add(list.get(i + 2).getTitlepic());
            strList.add(list.get(i + 2).getTitle());
            strList.add(list.get(i + 2).getDescr());
            //标题
            strList.add(san_can_titles.get(i / 3).getTitle());
            strList.add(san_can_titles.get(i / 3).getSub_title());

            datas.add(strList);
        }

        vp_recommendPagerAdapter = new Vp_RecommendPagerAdapter(manager, datas);
       
        navView.setCount(datas.size());
        viewPager.setAdapter(vp_recommendPagerAdapter);

    }

    /**
     * viewpager的滑动监听器
     * @param position
     * @param positionOffset
     * @param positionOffsetPixels
     */
    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (navView.getCount()>0){
            position = LoopViewPager.toRealPosition(position, navView.getCount());
            if (position==navView.getCount()-1){
                navView.setNavAddress(position,0);
            }else {
                navView.setNavAddress(position,positionOffset);
            }

        }
    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
