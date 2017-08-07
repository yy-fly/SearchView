package com.yyfly.android.search.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.yyfly.android.search.R;
import com.yyfly.android.search.SearchEntity;

import java.util.ArrayList;
import java.util.List;


/**
 * Default adapter used for the suggestion/history ListView.
 */
public class SearchHistoryAdapter extends BaseAdapter {

    /**
     * 数据集合
     **/
    List<SearchEntity> mList = new ArrayList<>();
    /**
     * 关联Activity
     **/
    Context mContext;

    public SearchHistoryAdapter(Context mContext, List<SearchEntity> mList) {
        super();
        this.mList = mList;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        if (mList != null)
            return mList.size();
        else
            return 0;
    }

    @Override
    public SearchEntity getItem(int position) {
        return mList == null ? null : mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ListViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.sv_item_lv_search, parent, false);
            holder = new ListViewHolder(convertView);
            convertView.setTag(holder);
        } else {
            holder = (ListViewHolder) convertView.getTag();
        }
        SearchEntity searchEntity = mList.get(position);
        holder.tv_content.setText(searchEntity.getKeyWord());

        if (searchEntity.isHistory()) {
            holder.iv_icon.setImageResource(R.drawable.sv_ic_action_history_black);
        } else {
            holder.iv_icon.setImageResource(R.drawable.sv_ic_action_search_black);
        }
        return convertView;
    }

    private class ListViewHolder {
        ImageView iv_icon;
        TextView tv_content;

        public ListViewHolder(View convertView) {
            iv_icon = (ImageView) convertView.findViewById(R.id.iv_icon);
            tv_content = (TextView) convertView.findViewById(R.id.tv_str);
        }
    }
}
