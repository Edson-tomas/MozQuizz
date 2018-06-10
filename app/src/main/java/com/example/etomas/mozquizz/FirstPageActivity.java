package com.example.etomas.mozquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FirstPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
    }

    public void onAddQuestionsClick(View view) {

        Intent activityIntent = new Intent(this, AddingQuestionActivity.class);
        startActivity(activityIntent);

    }

    public void onPlayClick(View view) {

        Intent activityIntent = new Intent(this, AddingQuestionActivity.class);
        startActivity(activityIntent);

    }

    public void onPlayerRankingClick(View view) {

        Intent activityIntent = new Intent(this, AddingQuestionActivity.class);
        startActivity(activityIntent);

    }
}
