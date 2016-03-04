package base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by admin on 2016/2/25.
 */
public abstract class BaseActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(contentView());

        ButterKnife.bind(this);
        initViews();
        loadDatas();
    }

    /**
     * 加载数据方法
     */
    protected void loadDatas(){

    }

    /**
     * 初始化
     */
    protected void initViews(){

    }

    /**
     * 布局Id
     * @return
     */
    protected abstract int contentView();
}
