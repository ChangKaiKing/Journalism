package com.example.administrator.journalism.qiushi;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.example.administrator.journalism.R;
import java.util.List;

/**
 * Created by Administrator on 2016/10/27.
 */

public class FirstFragment extends Fragment {
    private TabLayout mTab;
    private ViewPager mVp;
    private FragmentStatePagerAdapter adapter;
    private String[] webname;
    private String[] urls;
    private List<String> mTblist;
    private List<Fragment> fragments;
    private ImageView mImg;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.firstfragment, null);

        return view;
    }

}
