package com.example.etomas.mozquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Quizz> quizzList= new ArrayList<>();
    private int i = 0;
    private int totalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayQuizz(i);
    }

    public void trackingBar(int amountQuestionAnswered, int amountOfQuestion, int amountOfpoints){

        TextView tracking_question_answered, tracking_total_question, tracking_points;

        tracking_question_answered = findViewById(R.id.id_tracking_question_answered_txt_view);
        tracking_total_question = findViewById(R.id.id_tracking_total_question_txt_view);
        tracking_points = findViewById(R.id.id_tracking_points_txt_view);

        tracking_question_answered.setText(String.valueOf(amountQuestionAnswered));
        tracking_total_question.setText(String.valueOf(amountOfQuestion));
        tracking_points.setText(String.valueOf(amountOfpoints));


    }


    public void displayQuizz(int index){

        createQuizz(quizzList);

        int totalAmountOfQuestion = quizzList.size();
        int totalQuestionAnswered = index;

        trackingBar(totalQuestionAnswered, totalAmountOfQuestion, totalPoints);

        String option = "";

        if(quizzList.get(index).getQuestionCategory().equalsIgnoreCase("Physics")){

        }
            displayQuestion(quizzList.get(index).getQuestion());
            displayFirstAnswer(quizzList.get(index).getAnswer_1());
            displaySecondAnswer(quizzList.get(index).getAnswer_2());
            displayThirdAnswer(quizzList.get(index).getAnswer_3());
            displayFourthAnswer(quizzList.get(index).getAnswer_4());

    }

    public void answerOne(View view){

        //createQuizz(quizzList);


            if(quizzList.get(i).getForAnswer_1()){

                displayResults("Certo");
                i++;
                totalPoints = totalPoints + 5;
                displayQuizz(i);

            }else{

                displayResults("Errado");

            }

    }

    public void answerTwo(View view){

        //createQuizz(quizzList);


        if(quizzList.get(i).getForAnswer_2()){

            displayResults("Certo");
            i++;
            totalPoints = totalPoints + 5;
            displayQuizz(i);

        }else{

            displayResults("Errado");

        }

    }

    public void answerThree(View view){

        //createQuizz(quizzList);


        if(quizzList.get(i).getForAnswer_3()){

            displayResults("Certo");
            i++;
            totalPoints = totalPoints + 5;
            displayQuizz(i);

        }else{

            displayResults("Errado");

        }

    }

    public void answerFour(View view){

        //createQuizz(quizzList);


        if(quizzList.get(i).getForAnswer_4()){

            displayResults("Certo");
            i++;
            totalPoints = totalPoints + 5;
            displayQuizz(i);

        }else{

            displayResults("Errado");

        }

    }

    public void displayQuestion(String result){

        TextView id_question = findViewById(R.id.id_question_txt_view);
        id_question.setText(result);

    }

    public void displayFirstAnswer(String result){

        TextView id_first_answer = findViewById(R.id.id_first_answer_txt_view);
        id_first_answer.setText(result);

    }

    public void displaySecondAnswer(String result){

        TextView id_second_answer = findViewById(R.id.id_second_answer_txt_view);
        id_second_answer.setText(result);

    }

    public void displayThirdAnswer(String result){

        TextView id_third_answer = findViewById(R.id.id_third_answer_txt_view);
        id_third_answer.setText(result);

    }

    public void displayFourthAnswer(String result){

        TextView id_fourth_answer = findViewById(R.id.id_fourth_answer_txt_view);
        id_fourth_answer.setText(result);

    }



    public void displayResults(String result){

        TextView id_display_result = findViewById(R.id.id_display_result_txt_view);
        id_display_result.setText(result);

    }

    public void createQuizz(List<Quizz> quizzList){

        Quizz one =  new Quizz("Qual e a data de Independencia Nacional de Mocambique?",
                "25 de Junho de 1975",true,
                "25 de Julho de 1965",false,
                "25 de Julho de 1955",false,
                "25 de Julho de 1975",false);

        Quizz two =  new Quizz("Qual foi a 1a capital de Mocambique?",
                "Matola",false,
                "Lourenco Marques",false,
                "Ilha de Mocambique",true,
                "Maputo",false);

        Quizz three =  new Quizz("Qual e o resultado de: 2-5+(4-2)*4?",
                "8",false,
                "-4",false,
                "10",false,
                "5",true);

        Quizz four =  new Quizz("Quem foi o primeiro presidente de Mocambique?",
                "Armando Emilio Guebuza",false,
                "Samora Moises Machel",true,
                "Eduardo Chivambo Mondlane",false,
                "Alberto Joaquim Chissano",false);

        Quizz five =  new Quizz("Quem foi o primeiro presidente de FRELIMO?",
                "Armando Emilio Guebuza",false,
                "Samora Moises Machel",false,
                "Eduardo Chivambo Mondlane",true,
                "Alberto Joaquim Chissano",false);

        Quizz six =  new Quizz("Qual e o resultado de: 18:3-6-1?",
                "Todas as respostas estao erradas",true,
                "0",false,
                "1",false,
                "6",false);

        /*

        Quizz seven =  new Quizz("Qual e a data de independencia de Mocambique?",
                "25 de Junho de 1975",true,
                "25 de Julho de 1965",false,
                "25 de Julho de 1955",false,
                "25 de Julho de 1975",false);

        Quizz eight =  new Quizz("Qual e a data de independencia de Mocambique?",
                "25 de Junho de 1975",true,
                "25 de Julho de 1965",false,
                "25 de Julho de 1955",false,
                "25 de Julho de 1975",false);

        Quizz nine =  new Quizz("Qual e a data de independencia de Mocambique?",
                "25 de Junho de 1975",true,
                "25 de Julho de 1965",false,
                "25 de Julho de 1955",false,
                "25 de Julho de 1975",false);

        Quizz ten =  new Quizz("Qual e a data de independencia de Mocambique?",
                "25 de Junho de 1975",true,
                "25 de Julho de 1965",false,
                "25 de Julho de 1955",false,
                "25 de Julho de 1975",false);

                */

        quizzList.add(one);
        quizzList.add(two);
        quizzList.add(three);
        quizzList.add(four);
        quizzList.add(five);
        quizzList.add(six);

        /*
        quizzList.add(seven);
        quizzList.add(eight);
        quizzList.add(nine);
        quizzList.add(ten);
        */

        //return quizzList;
    }

    //TODO the app should allow open questions
    //TODO the app should allow one answer questions;
}
