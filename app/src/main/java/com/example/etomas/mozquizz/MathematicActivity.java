package com.example.etomas.mozquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.List;

public class MathematicActivity extends AppCompatActivity {

    public List<Quizz> questionList;
    private int i = 0;
    private int totalPoints = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mathematic);
    }


    public void trackingBar(int amountQuestionAnswered, int amountOfQuestion, int amountOfpoints){

        TextView tracking_question_answered, tracking_total_question, tracking_points;

        tracking_question_answered = findViewById(R.id.id_math_tracking_question_answered_txt_view);
        tracking_total_question = findViewById(R.id.id_math_tracking_total_question_txt_view);
        tracking_points = findViewById(R.id.id_math_tracking_points_txt_view);

        tracking_question_answered.setText(String.valueOf(amountQuestionAnswered));
        tracking_total_question.setText(String.valueOf(amountOfQuestion));
        tracking_points.setText(String.valueOf(amountOfpoints));


    }


    public void displayQuizz(int index){

        int totalAmountOfQuestion = questionList.size();
        int totalQuestionAnswered = index;

        trackingBar(totalQuestionAnswered, totalAmountOfQuestion, totalPoints);

        String option = "";

        if(questionList.get(index).getQuestionCategory().equalsIgnoreCase("Physics")){

        }
        displayQuestion(questionList.get(index).getQuestion());
        displayFirstAnswer(questionList.get(index).getAnswer_1());
        displaySecondAnswer(questionList.get(index).getAnswer_2());
        displayThirdAnswer(questionList.get(index).getAnswer_3());
        displayFourthAnswer(questionList.get(index).getAnswer_4());

    }

    public void answerOne(View view){

        if(questionList.get(i).getForAnswer_1()){

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


        if(questionList.get(i).getForAnswer_2()){

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


        if(questionList.get(i).getForAnswer_3()){

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


        if(questionList.get(i).getForAnswer_4()){

            displayResults("Certo");
            i++;
            totalPoints = totalPoints + 5;
            displayQuizz(i);

        }else{

            displayResults("Errado");

        }

    }

    public void displayQuestion(String result){

        TextView id_question = findViewById(R.id.id_math_question_txt_view);
        id_question.setText(result);

    }

    public void displayFirstAnswer(String result){

        TextView id_first_answer = findViewById(R.id.id_math_first_answer_txt_view);
        id_first_answer.setText(result);

    }

    public void displaySecondAnswer(String result){

        TextView id_second_answer = findViewById(R.id.id_math_second_answer_txt_view);
        id_second_answer.setText(result);

    }

    public void displayThirdAnswer(String result){

        TextView id_third_answer = findViewById(R.id.id_math_third_answer_txt_view);
        id_third_answer.setText(result);

    }

    public void displayFourthAnswer(String result){

        TextView id_fourth_answer = findViewById(R.id.id_math_fourth_answer_txt_view);
        id_fourth_answer.setText(result);

    }


    public void displayResults(String result){

        TextView id_display_result = findViewById(R.id.id_math_display_result_txt_view);
        id_display_result.setText(result);

    }
}
