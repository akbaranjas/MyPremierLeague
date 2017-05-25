package com.akbaranjas.app.mypremierleague.holder;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.akbaranjas.app.mypremierleague.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Asus A450C on 25/05/2017.
 */
public class PlayerHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.txt_squad_name)
    TextView txtSquadName;
    @BindView(R.id.txt_position)
    TextView txtPosition;
    @BindView(R.id.txt_jersey_number)
    TextView txtJerseyNumber;
    @BindView(R.id.txt_date_of_birth)
    TextView txtDoB;
    @BindView(R.id.txt_nationality)
    TextView txtNationality;

    public PlayerHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void bind(String squadName, String position, int jerseyNumber,
                     String dateofBirth, String nationality) {

        txtSquadName.setText(squadName);
        txtPosition.setText("Position : " +position);
        txtJerseyNumber.setText("Jersey Number : " + String.valueOf(jerseyNumber));
        txtDoB.setText("Date of Birth : " + dateofBirth);
        txtNationality.setText("Nationality : " + nationality);

    }
}
