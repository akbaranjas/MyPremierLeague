package com.akbaranjas.app.mypremierleague.utils.retrofit;

import com.akbaranjas.app.mypremierleague.utils.OkHttpTime;
import com.akbaranjas.app.mypremierleague.utils.URLs;

import retrofit2.GsonConverterFactory;
import retrofit2.Retrofit;
import retrofit2.RxJavaCallAdapterFactory;

/**
 * Created by Asus A450C on 24/05/2017.
 */
public class APIClient   {

    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(URLs.getMainURL() + "/")
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(OkHttpTime.client)
                    .build();
        }
        return retrofit;
    }
}
