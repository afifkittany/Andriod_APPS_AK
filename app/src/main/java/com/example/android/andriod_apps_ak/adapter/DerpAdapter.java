package com.example.android.andriod_apps_ak.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.andriod_apps_ak.R;
import com.example.android.andriod_apps_ak.model.ListItem;

import java.util.List;

/**
 * Created by android on 28/12/2016.
 */

public class DerpAdapter extends RecyclerView.Adapter<DerpAdapter.DerpHolder> {

    private List<ListItem> ListData;
    private LayoutInflater inflater;


    public DerpAdapter(List<ListItem> listData, Context c){
        this.inflater=LayoutInflater.from(c);
        this.ListData=listData;
    }

    @Override
    public DerpHolder onCreateViewHolder(ViewGroup parent, int viewType) {
     View view=inflater.inflate(R.layout.list_item,parent, false);
        return new DerpHolder(view);
    }

    @Override
    public void onBindViewHolder(DerpHolder holder, int position) {
        final ListItem item=ListData.get(position);
        holder.title.setText(item.getTitle());
        holder.subTitle.setText(item.getSubTitle());
        holder.icon.setImageResource(item.getImageResId());


        }




    @Override
    public int getItemCount() {
        return ListData.size();
    }

    class DerpHolder extends RecyclerView.ViewHolder{

        private TextView title;
        private TextView subTitle;
        private ImageView icon;

        public DerpHolder(View itemView) {
            super(itemView);

            title= (TextView)itemView.findViewById(R.id.lbl_item_text);
            subTitle= (TextView)itemView.findViewById(R.id.lbl_item_sub_title);
            icon=(ImageView)itemView.findViewById(R.id.image_item_icon);


        }
    }
}
