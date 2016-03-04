package model;

import java.util.List;

/**
 * Created by admin on 2016/3/1.
 */
public class MyYLEntity {
    private String titlePic1;
    private String titlePic2;
    private String title1;
    private String title2;

    public MyYLEntity(String titlePic1, String titlePic2, String title1, String title2) {
        this.titlePic1 = titlePic1;
        this.titlePic2 = titlePic2;
        this.title1 = title1;
        this.title2 = title2;
    }

    public String getTitlePic1() {
        return titlePic1;
    }

    public void setTitlePic1(String titlePic1) {
        this.titlePic1 = titlePic1;
    }

    public String getTitlePic2() {
        return titlePic2;
    }

    public void setTitlePic2(String titlePic2) {
        this.titlePic2 = titlePic2;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }
}
