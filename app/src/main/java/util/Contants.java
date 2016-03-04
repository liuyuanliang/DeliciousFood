package util;

/**
 * 常量接口
 */
public interface Contants {
    /**
     * 下载接口
     */
    interface URL{
        /**
         * 推荐页接口
         */
        String FIRST_URL = "http://api.meishi.cc/v5/index4.php?format=json";

        String RECOMMEND_LV_URL = "http://api.meishi.cc/v5/index4.php?format=json&c_md5=958586a040c1db0420851cf2e13487fe&page=%d";

    }

    interface KEY{

        String NAV_URL = "navurl";

        String RECOMMEND_VP_DATA = "recommend_vp_fragem_data";
    }
}
