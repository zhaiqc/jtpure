package com.pure.purelive.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.pure.purelive.R;
import com.pure.purelive.utils.SimpleUtils;
import com.pure.purelive.widget.BlackTextView;
import com.pure.purelive.widget.CircleImageView;
import com.pure.purelive.AppContext;

import com.pure.purelive.bean.ManageListBean;
import com.pure.purelive.ui.other.DrawableRes;

import java.util.List;

/**
 * 管理员
 */
public class ManageListAdapter extends BaseAdapter {
    private List<ManageListBean> users;
    public ManageListAdapter(List<ManageListBean> users) {
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if(convertView == null){
            convertView = View.inflate(AppContext.getInstance(), R.layout.item_attention_fans,null);
            viewHolder = new ViewHolder();
            viewHolder.mUHead = (CircleImageView) convertView.findViewById(R.id.cv_userHead);
            viewHolder.mUSex  = (ImageView) convertView.findViewById(R.id.tv_item_usex);
            viewHolder.mULevel  = (ImageView) convertView.findViewById(R.id.tv_item_ulevel);
            viewHolder.mUNice = (BlackTextView) convertView.findViewById(R.id.tv_item_uname);
            viewHolder.mUSign = (BlackTextView) convertView.findViewById(R.id.tv_item_usign);
            viewHolder.mIsFollow = (ImageView) convertView.findViewById(R.id.iv_item_attention);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }



        final ManageListBean u = users.get(position);


        SimpleUtils.loadImageForView(AppContext.getInstance(),viewHolder.mUHead,u.getAvatar(),0);
        viewHolder.mUSex.setImageResource(u.getSex() == 1 ? R.drawable.global_male : R.drawable.global_female);
        viewHolder.mIsFollow.setVisibility(View.GONE);
        viewHolder.mULevel.setImageResource(DrawableRes.LevelImg[u.getLevel() == 0?0:u.getLevel()-1]);
        viewHolder.mUNice.setText(u.getUser_nicename());
        viewHolder.mUSign.setText(u.getSignature());
        return convertView;
    }
    private class ViewHolder{
        public CircleImageView mUHead;
        public ImageView mUSex,mULevel,mIsFollow;
        public BlackTextView mUNice,mUSign;
    }
}
