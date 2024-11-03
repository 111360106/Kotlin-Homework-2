package com.example.lab5;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(FragmentActivity activity) {
        super(activity);
    }

    @Override
    public int getItemCount() {
        return 3; // 返回 Fragment 的數量
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FirstFragment(); // 第一個 Fragment
            case 1:
                return new SecondFragment(); // 第二個 Fragment
            default:
                return new ThirdFragment(); // 第三個 Fragment
        }
    }
}
