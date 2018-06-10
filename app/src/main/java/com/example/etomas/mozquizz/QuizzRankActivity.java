package com.example.etomas.mozquizz;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class QuizzRankActivity extends AppCompatActivity {

    private List<Ranking> playerRankingList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_rank);


    }

    //TODO how to add this layout to an xml file
    public void newMotherLinearViewGroup(){

        LinearLayout newLinearLayout =  new LinearLayout(this);
        setContentView(newLinearLayout);
        LinearLayout.LayoutParams newLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        newLinearLayout.setOrientation(LinearLayout.VERTICAL);

        for (int index =0; index>=playerRankingList.size(); index++){
            newLinearLayout.addView(newChildLinearViewGroup(index),newLayoutParams);
        }

    }

    //creation of a linearlayout that will return a view that contain two TextViews playerName e playerPoints
    public View newChildLinearViewGroup(int index){

        LinearLayout newLinearLayout =  new LinearLayout(this);
        setContentView(newLinearLayout);
        LinearLayout.LayoutParams newLayoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        newLinearLayout.setOrientation(LinearLayout.HORIZONTAL);
        newLinearLayout.addView(addPlayerNameTextView(index),newLayoutParams);
        newLinearLayout.addView(addPlayerPointsTextView(index),newLayoutParams);

        return  newLinearLayout;
    }

    //creation of a Textview for playerName this Textview will return a view that will be used on newChildLinerViewGroup method
    public View addPlayerNameTextView(int index){

        TextView newTextView = new TextView(this);
        newTextView.setText(playerRankingList.get(index).getPlayerName());

        return newTextView;
    }


    //creation of a Textview for playerPoints this Textview will return a view that will be used on newChildLinerViewGroup method
    public View addPlayerPointsTextView(int index){

        TextView newTextView = new TextView(this);
        newTextView.setText(playerRankingList.get(index).getPlayerPoints());

        return newTextView;
    }

}
