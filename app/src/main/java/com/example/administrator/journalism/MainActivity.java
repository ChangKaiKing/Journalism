package com.example.administrator.journalism;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.List;

public class MainActivity extends FragmentActivity {


    private android.support.v4.app.FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          //不显示actionbar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


    }


    public void BtnAction(View view) {
        switch (view.getId()) {
            case R.id.news_id:
                break;
            case R.id.delicate_id:

                break;
            case R.id.periphery_id:

                break;
            case R.id.people_id:

                break;
        }
    }
}
