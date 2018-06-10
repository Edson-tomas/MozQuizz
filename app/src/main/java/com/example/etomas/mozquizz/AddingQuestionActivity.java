package com.example.etomas.mozquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class AddingQuestionActivity extends AppCompatActivity {

    public List<Quizz> questionList = new ArrayList<>();
    private CheckBox is_first_answer_true_cb, is_second_answer_true_cb, is_third_answer_true_cb, is_fourth_answer_true_cb;
    private EditText add_question_et, add_first_answer_et, add_second_answer_et, add_third_answer_et, add_fourth_answer_et;
    private Spinner add_category_sp;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_question);
    }

    public void firstAnswerTrue(View view){

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_first_answer_true_cb.isChecked()){

            is_second_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void secondAnswerTrue(View view){

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_second_answer_true_cb.isChecked()){

            is_first_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void thirdAnswerTrue(View view){

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_third_answer_true_cb.isChecked()){

            is_first_answer_true_cb.setEnabled(false);
            is_second_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void fourthAnswerTrue(View view){

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_fourth_answer_true_cb.isChecked()){

            is_first_answer_true_cb.setEnabled(false);
            is_second_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);

        }

    }

    //create questions and answers, which one is true and add the question to an category
    public void createQuestion(List<Quizz> question){

        add_question_et = findViewById(R.id.id_add_question_et_view);
        add_first_answer_et = findViewById(R.id.id_add_first_answer_et_view);
        add_second_answer_et = findViewById(R.id.id_add_second_answer_et_view);
        add_third_answer_et = findViewById(R.id.id_add_third_answer_et_view);
        add_fourth_answer_et = findViewById(R.id.id_add_fourth_answer_et_view);

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        add_category_sp = findViewById(R.id.id_add_category_sp_view);

        //Add items to spinner from an array
        ArrayAdapter<CharSequence> add_category_sp_adapter = ArrayAdapter.createFromResource(this, R.array.quizz_category, R.layout.support_simple_spinner_dropdown_item);
        add_category_sp.setAdapter(add_category_sp_adapter);

        //Adding questions to list question
        question.add(new Quizz(
                add_question_et.getText().toString(),add_category_sp.getSelectedItem().toString(),
                add_first_answer_et.getText().toString(),is_first_answer_true_cb.isChecked(),
                add_second_answer_et.getText().toString(),is_second_answer_true_cb.isChecked(),
                add_third_answer_et.getText().toString(),is_third_answer_true_cb.isChecked(),
                add_fourth_answer_et.getText().toString(),is_fourth_answer_true_cb.isChecked()
        ));

    }

    //Clear data
    public void cleanBoxes(){

        add_question_et = findViewById(R.id.id_add_question_et_view);
        add_first_answer_et = findViewById(R.id.id_add_first_answer_et_view);
        add_second_answer_et = findViewById(R.id.id_add_second_answer_et_view);
        add_third_answer_et = findViewById(R.id.id_add_third_answer_et_view);
        add_fourth_answer_et = findViewById(R.id.id_add_fourth_answer_et_view);

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        add_category_sp = findViewById(R.id.id_add_category_sp_view);

        add_question_et.getText().clear();
        add_first_answer_et.getText().clear();
        add_second_answer_et.getText().clear();
        add_third_answer_et.getText().clear();
        add_fourth_answer_et.getText().clear();

        is_first_answer_true_cb.setChecked(false);
        is_second_answer_true_cb.setChecked(false);
        is_third_answer_true_cb.setChecked(false);
        is_fourth_answer_true_cb.setChecked(false);

        add_category_sp.setSelection(0);


    }

    //will save the data in the form
    public void saveQuizz(View view){

        if (add_category_sp.isSelected()){

            add_category_sp.requestFocus();

        }if (add_question_et.getText().toString().isEmpty()){

            add_question_et.requestFocus();

        }if (add_first_answer_et.getText().toString().isEmpty()){

            add_first_answer_et.requestFocus();

        }if (add_second_answer_et.getText().toString().isEmpty()){

            add_second_answer_et.requestFocus();

        }if (add_third_answer_et.getText().toString().isEmpty()){

            add_third_answer_et.requestFocus();

        }if (add_fourth_answer_et.getText().toString().isEmpty()){

            add_fourth_answer_et.requestFocus();

        }else {

            createQuestion(questionList);
            cleanBoxes();

        }

    }

    //will clear the form
    public void cancelSave(View view){
        cleanBoxes();
    }


}
