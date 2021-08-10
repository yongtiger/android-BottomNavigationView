package cc.brainbook.android.bottomnavigationview.sample.features;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import cc.brainbook.android.bottomnavigationview.sample.R;
import cc.brainbook.android.bottomnavigationview.sample.databinding.ActivityMainBinding;
import cc.brainbook.android.bottomnavigationview.sample.features.badgeview.BadgeViewActivity;
import cc.brainbook.android.bottomnavigationview.sample.features.centerfab.CenterFabActivity;
import cc.brainbook.android.bottomnavigationview.sample.features.setupwithviewpager.SetupWithViewPagerActivity;
import cc.brainbook.android.bottomnavigationview.sample.features.style.StyleActivity;
import cc.brainbook.android.bottomnavigationview.sample.features.viewpager.WithViewPagerActivity;

///https://github.com/ittianyu/BottomNavigationViewEx
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ActivityMainBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        bind = DataBindingUtil.setContentView(this, R.layout.activity_main);

        init();
    }

    private void init() {
        bind.btnStyle.setOnClickListener(this);
        bind.btnWithViewPager.setOnClickListener(this);
        bind.btnSetupWithViewPager.setOnClickListener(this);
        bind.btnBadgeView.setOnClickListener(this);
        bind.btnCenterFab.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_style:
                startActivity(new Intent(this, StyleActivity.class));
                break;
            case R.id.btn_with_view_pager:
                startActivity(new Intent(this, WithViewPagerActivity.class));
                break;
            case R.id.btn_setup_with_view_pager:
                startActivity(new Intent(this, SetupWithViewPagerActivity.class));
                break;
            case R.id.btn_badge_view:
                startActivity(new Intent(this, BadgeViewActivity.class));
                break;
            case R.id.btn_center_fab:
                startActivity(new Intent(this, CenterFabActivity.class));
                break;

        }
    }
}
