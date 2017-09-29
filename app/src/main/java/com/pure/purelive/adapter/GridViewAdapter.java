package com.pure.purelive.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pure.purelive.AppContext;
import com.pure.purelive.R;
import com.pure.purelive.bean.GiftBean;
import com.pure.purelive.widget.BlackTextView;
import com.pure.purelive.widget.LoadUrlImageView;


import java.util.List;

/**
 * 直播间礼物列表
 */
public class GridViewAdapter extends BaseAdapter {
    private List<GiftBean> giftList;

    public GridViewAdapter(List<GiftBean> giftList) {
        this.giftList = giftList;
    }

    @Override
    public int getCount() {
        return giftList.size();
    }

    @Override
    public Object getItem(int position) {
        return giftList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if(convertView == null){
            convertView = View.inflate(AppContext.getInstance(), R.layout.item_show_gift,null);
            viewHolder = new ViewHolder();
            viewHolder.mGiftViewImg = (LoadUrlImageView) convertView.findViewById(R.id.iv_show_gift_img);
            viewHolder.mGiftPrice = (BlackTextView) convertView.findViewById(R.id.tv_show_gift_price);
            viewHolder.mGiftExperience = (BlackTextView) convertView.findViewById(R.id.tv_show_gift_experience);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        GiftBean g = giftList.get(position);
        viewHolder.mGiftViewImg.setNull_drawable(R.drawable.chat_item_gift_stick);
        viewHolder.mGiftViewImg.setImageLoadUrl(g.getGifticon());
        viewHolder.mGiftExperience.setText("+" + g.getExperience() + "经验值");
        viewHolder.mGiftPrice.setText(g.getNeedcoin()+"");
        if(g.getType() == 1){
            convertView.findViewById(R.id.iv_show_gift_selected).setBackgroundResource(R.drawable.icon_continue_gift);
        }
        return convertView;
    }
    private class ViewHolder{
        public LoadUrlImageView mGiftViewImg;
        public BlackTextView mGiftPrice,mGiftExperience;
    }
}
