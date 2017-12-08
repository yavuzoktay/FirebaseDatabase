package com.yavuzoktay.firebasedatabase;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Yavuz on 8.12.2017.
 */

public class ListViewAdapter extends BaseAdapter {

    Activity activity;
    List<User> lstUsers;
    LayoutInflater inflater;

    public ListViewAdapter(Activity activity, List<User> lstUsers) {
        this.activity = activity;
        this.lstUsers = lstUsers;
    }

    @Override
    public int getCount() {
        return lstUsers.size();
    }

    @Override
    public Object getItem(int position) {
        return lstUsers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        inflater= (LayoutInflater) activity.getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View itemView=inflater.inflate(R.layout.listview_item,null);

        TextView txtUser=itemView.findViewById(R.id.list_name);
        TextView txtEmail=itemView.findViewById(R.id.list_email);

        txtUser.setText(lstUsers.get(position).getName());
        txtEmail.setText(lstUsers.get(position).getEmail());

        return itemView;
    }
}
