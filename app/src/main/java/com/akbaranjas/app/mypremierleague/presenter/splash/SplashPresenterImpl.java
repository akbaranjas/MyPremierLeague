package com.akbaranjas.app.mypremierleague.presenter.splash;

import android.os.Handler;

import com.akbaranjas.app.mypremierleague.view.splash.SplashView;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public class SplashPresenterImpl implements SplashPresenter {

    SplashView view;

    public SplashPresenterImpl(SplashView view) {
        this.view = view;
    }

    @Override public void waitSplash(int duration) {
        new Handler().postDelayed(() -> {
            view.openMain();
        }, duration);
    }
}
