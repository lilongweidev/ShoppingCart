package com.llw.cart.adapter;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.llw.cart.bean.CarResponse;
import com.llw.cart.R;

import java.util.List;

/**
 * 商品适配器
 *
 * @author llw
 */
public class GoodsAdapter extends BaseQuickAdapter<CarResponse.OrderDataBean.CartlistBean, BaseViewHolder> {

    public GoodsAdapter(int layoutResId, @Nullable List<CarResponse.OrderDataBean.CartlistBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CarResponse.OrderDataBean.CartlistBean item) {
        helper.setText(R.id.tv_good_name, item.getProductName())
                .setText(R.id.tv_good_color, item.getColor())
                .setText(R.id.tv_good_size, item.getSize())
                .setText(R.id.tv_goods_price, item.getPrice() + "")
                .setText(R.id.tv_goods_num, item.getCount() + "");
        ImageView goodImg = helper.getView(R.id.iv_goods);
        Glide.with(mContext).load(item.getDefaultPic()).into(goodImg);

        ImageView checkedGoods = helper.getView(R.id.iv_checked_goods);
        //判断商品是否选中
        if (item.isChecked()) {
            checkedGoods.setImageDrawable(mContext.getDrawable(R.drawable.ic_checked));
        } else {
            checkedGoods.setImageDrawable(mContext.getDrawable(R.drawable.ic_check));
        }
        //添加点击事件
        helper.addOnClickListener(R.id.iv_checked_goods)//选中商品
                .addOnClickListener(R.id.tv_increase_goods_num)//增加商品
                .addOnClickListener(R.id.tv_reduce_goods_num);//减少商品
    }
}
