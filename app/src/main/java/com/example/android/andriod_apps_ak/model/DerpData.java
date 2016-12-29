package com.example.android.andriod_apps_ak.model;

import com.example.android.andriod_apps_ak.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by android on 28/12/2016.
 */

public class DerpData {
    private static final String[] titles = {"First Lesson","Second Lesson","Third Lesson", "Four Lesson","Five Lesson "
            ,"Six Lesson", "Seven Lesson", "Eight Lesson","Nine Lesson", "Ten Lesson"};



    private static final String[] subTitles = {"26/12/2016",
            "02/01/2017",
            "04/01/2017",
            "06/01/2017",
            "09/01/2017",
            "11/01/2017",
            "13/01/2017",
            "16/01/2017",
            "18/01/2017",
            "20/01/2017"};
    private static final int icon = R.drawable.ic_tonality_black_36dp;

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();

        //RecyclerView


            for (int i = 0; i < (titles.length); i++) {
                ListItem item = new ListItem();
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                item.setImageResId(icon);
                data.add(item);
            }

        return data;
    }
}
