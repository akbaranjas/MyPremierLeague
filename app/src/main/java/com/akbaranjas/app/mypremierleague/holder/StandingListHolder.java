package com.akbaranjas.app.mypremierleague.holder;

import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.akbaranjas.app.mypremierleague.R;
import com.akbaranjas.app.mypremierleague.utils.svgdecoder.GRequestBuilder;
import com.akbaranjas.app.mypremierleague.utils.svgdecoder.SvgDecoder;
import com.akbaranjas.app.mypremierleague.utils.svgdecoder.SvgDrawableTranscoder;
import com.akbaranjas.app.mypremierleague.utils.svgdecoder.SvgSoftwareLayerSetter;
import com.bumptech.glide.GenericRequestBuilder;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.StreamEncoder;
import com.bumptech.glide.load.resource.file.FileToStreamDecoder;
import com.caverock.androidsvg.SVG;

import java.io.InputStream;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Asus A450C on 24/05/2017.
 */

public class StandingListHolder extends RecyclerView.ViewHolder  {

    @BindView(R.id.standing_item)
    RelativeLayout itemStandings;
    @BindView(R.id.txt_club_name)
    TextView txtClubName;
    @BindView(R.id.linear_no)
    LinearLayout linearPosition;
    @BindView(R.id.txt_position)
    TextView txtPosition;
    @BindView(R.id.img_club_logo)
    ImageView imgClubLogo;
    @BindView(R.id.txt_games_played)
    TextView txtGamesPlayed;
    @BindView(R.id.txt_games_points)
    TextView txtGamePoints;

    public StandingListHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public RelativeLayout getItemStandings() {
        return itemStandings;
    }

    public void bind(String clubName, int LeaguePosition, String LogoURL,
                     int gamesPlayed, int gamesPoint) {
        String ext = LogoURL.substring(LogoURL.length() - 3);
        txtClubName.setText(clubName);
        Uri uri = Uri.parse(LogoURL);
        if(ext.equals("svg")) {
            GRequestBuilder.getRequestBuilder(itemView.getContext())
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .load(uri)
                    .into(imgClubLogo);
        }else if(ext.equals("png")){
            Glide.with(itemView.getContext())
                    .load(uri)
                    .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                    .into(imgClubLogo);
        }
        txtGamesPlayed.setText("Games Played : " + String.valueOf(gamesPlayed));
        txtGamePoints.setText("Points : " + String.valueOf(gamesPoint));
        txtPosition.setText(String.valueOf(LeaguePosition));

    }


}
