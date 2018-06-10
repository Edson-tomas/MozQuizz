package com.example.etomas.mozquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class QuizzCategoryActivity extends AppCompatActivity {

    private List<Quizz> quizzList = new ArrayList<>();
    private List<QuizzCategory> categoriesList = new ArrayList<>();
    private int i = 0;
    private int totalPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_category);
    }

    public void onMathCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onPortugueseCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onChemistryCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onPhysicsCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onGeographyCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onBiologyCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onComputerScienceCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }

    public void onHistoryCategoryClick(View view) {

        Intent activityIntent = new Intent(this, MathematicsActivity.class);
        startActivity(activityIntent);

    }


}
