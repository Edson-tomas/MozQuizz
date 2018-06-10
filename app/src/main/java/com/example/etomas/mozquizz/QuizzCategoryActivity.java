package com.example.etomas.mozquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class QuizzCategoryActivity extends AppCompatActivity {

    private List<Quizz> quizzList= new ArrayList<>();
    private List<QuizzCategory> categoriesList = new ArrayList<>();
    private int i = 0;
    private int totalPoints = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_category);
    }

    public void mathCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void portCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void chemistryCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void physiqueCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void geographyCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void biologyCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void computerScienceCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }

    public void historyCategory(View view){

        //deve inicializar o jogo somente com perguntas da categoria de matematica;

    }


}
