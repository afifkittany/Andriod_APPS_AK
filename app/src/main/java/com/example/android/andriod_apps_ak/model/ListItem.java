package com.example.android.andriod_apps_ak.model;

/**java rerprenstion of our data' to be displayed on recycleview
 * Created by android on 28/12/2016.
 */

public class ListItem {
    private String title;
    private String subTitle;

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    private int imageResId;


    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}


