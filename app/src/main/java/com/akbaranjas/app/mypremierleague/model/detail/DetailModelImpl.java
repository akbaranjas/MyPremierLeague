package com.akbaranjas.app.mypremierleague.model.detail;

import com.akbaranjas.app.mypremierleague.utils.retrofit.APIClient;
import com.akbaranjas.app.mypremierleague.utils.retrofit.APIInterface;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public class DetailModelImpl implements DetailModel {
    @Override
    public APIInterface build() {
        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);
        return apiInterface;
    }
}
