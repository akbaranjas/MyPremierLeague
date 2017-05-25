package com.akbaranjas.app.mypremierleague.view.splash;

import android.content.Intent;
import android.os.Bundle;

import com.akbaranjas.app.mypremierleague.R;
import com.akbaranjas.app.mypremierleague.base.BaseActivity;
import com.akbaranjas.app.mypremierleague.presenter.splash.SplashPresenter;
import com.akbaranjas.app.mypremierleague.presenter.splash.SplashPresenterImpl;
import com.akbaranjas.app.mypremierleague.view.main.MainActivity;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public class SplashActivity extends BaseActivity implements SplashView {

    SplashPresenter splashPresenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind(R.layout.activity_splash);
        splashPresenter = new SplashPresenterImpl(this);
        splashPresenter.waitSplash(5000);
    }

    @Override
    public void openMain() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}
