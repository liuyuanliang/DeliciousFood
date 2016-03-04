package util;

import android.util.Log;

/**
 * 日志类,调试时将CURRENT修改为低等级,运行时一般将CURRENT改为ERROR就行
 */
public class L {
    private static final String TAG = "print";
    private static final int ALL = 7;
    private static final int VERBOSE = 6;
    private static final int DEBUG = 5;
    private static final int INFO = 4;
    private static final int WARM = 3;
    private static final int ERROR = 2;
    private static final int ASSERT = 1;

    private static final int CURRENT = ALL;

    /**
     * 常用的
     *
     * @param msg
     */
    public static void v(String msg) {
        if (CURRENT >= VERBOSE) {
            Log.v(TAG, "--------->" + msg);
        }
    }

    public static void d(String msg) {
        if (CURRENT >= DEBUG) {
            Log.d(TAG, "--------->" + msg);
        }
    }

    public static void i(String msg) {
        if (CURRENT >= INFO) {
            Log.i(TAG, "--------->" + msg);
        }
    }

    public static void w(String msg) {
        if (CURRENT >= WARM) {
            Log.w(TAG, "--------->" + msg);
        }
    }

    public static void e(String msg) {
        if (CURRENT >= ERROR) {
            Log.e(TAG, "--------->" + msg);
        }
    }

    /**
     * 自定义Tag
     * @param msg
     */
    public static void v(String tag,String msg) {
        if (CURRENT >= VERBOSE) {
            Log.v(tag, "--------->" + msg);
        }
    }

    public static void d(String tag,String msg) {
        if (CURRENT >= DEBUG) {
            Log.d(tag, "--------->" + msg);
        }
    }

    public static void i(String tag,String msg) {
        if (CURRENT >= INFO) {
            Log.i(tag, "--------->" + msg);
        }
    }

    public static void w(String tag,String msg) {
        if (CURRENT >= WARM) {
            Log.w(tag, "--------->" + msg);
        }
    }

    public static void e(String tag,String msg) {
        if (CURRENT >= ERROR) {
            Log.e(tag, "--------->" + msg);
        }
    }

}
