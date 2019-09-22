package com.example.kaitest2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.kaitest2.Model.WinterSaleBanner;
import com.example.kaitest2.databinding.AdapterWintersaleBannerBinding;

import java.util.List;

public class WinterSaleAdapter extends RecyclerView.Adapter<WinterSaleAdapter.ViewHolder> {
    private List<WinterSaleBanner> bannerList;
    private Context context;
    public AdapterWintersaleBannerBinding adapterWintersaleBannerBinding;

    public void setAdapterDetails(List<WinterSaleBanner> banner, Context context) {
        this.bannerList = banner;
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        adapterWintersaleBannerBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.adapter_wintersale_banner, parent, false);
        return new ViewHolder(adapterWintersaleBannerBinding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        WinterSaleBanner banner = bannerList.get(position);
        Glide.with(context)
                .load(banner.getCategoryImage())
                .into(holder.binding.bannerImage);
        holder.binding.bannerText.setText(banner.getDiscount());
    }

    @Override
    public int getItemCount() {
        return bannerList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        public AdapterWintersaleBannerBinding binding;

        ViewHolder(@NonNull AdapterWintersaleBannerBinding bannerBinding) {
            super(bannerBinding.getRoot());
            this.binding = bannerBinding;
        }
    }
}
