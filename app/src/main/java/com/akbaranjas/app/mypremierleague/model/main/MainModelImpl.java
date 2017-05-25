package com.akbaranjas.app.mypremierleague.model.main;

import com.akbaranjas.app.mypremierleague.utils.retrofit.APIClient;
import com.akbaranjas.app.mypremierleague.utils.retrofit.APIInterface;


/**
 * Created by Asus A450C on 24/05/2017.
 */
public class MainModelImpl implements MainModel{

    @Override
    public APIInterface build() {
        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        return apiInterface;
    }
}
