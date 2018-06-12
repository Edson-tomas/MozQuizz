package com.example.etomas.mozquizz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AddingQuestionActivity extends AppCompatActivity {

    public ArrayList<Quizz> questionList = new ArrayList<>();
    private CheckBox is_first_answer_true_cb, is_second_answer_true_cb, is_third_answer_true_cb, is_fourth_answer_true_cb;
    private EditText add_question_et, add_first_answer_et, add_second_answer_et, add_third_answer_et, add_fourth_answer_et;
    private Spinner add_category_sp;
    int index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_question);

        populatingTheSpinner();
    }

    public void firstAnswerTrue(View view) {

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_first_answer_true_cb.isChecked()) {

            is_second_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void secondAnswerTrue(View view) {

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_second_answer_true_cb.isChecked()) {

            is_first_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void thirdAnswerTrue(View view) {

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_third_answer_true_cb.isChecked()) {

            is_first_answer_true_cb.setEnabled(false);
            is_second_answer_true_cb.setEnabled(false);
            is_fourth_answer_true_cb.setEnabled(false);

        }

    }

    public void fourthAnswerTrue(View view) {

        is_first_answer_true_cb = findViewById(R.id.id_is_first_answer_true_cb_view);
        is_second_answer_true_cb = findViewById(R.id.id_is_second_answer_true_cb_view);
        is_third_answer_true_cb = findViewById(R.id.id_is_third_answer_true_cb_view);
        is_fourth_answer_true_cb = findViewById(R.id.id_is_fourth_answer_true_cb_view);

        if (is_fourth_answer_true_cb.isChecked()) {

            is_first_answer_true_cb.setEnabled(false);
            is_second_answer_true_cb.setEnabled(false);
            is_third_answer_true_cb.setEnabled(false);

        }

    }

    //create questions and answers, which one is true and add the question to an category
    public void createQuestion(List<Quizz> question) {

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

        //Adding questions to list question
        question.add(new Quizz(
                add_question_et.getText().toString(), add_category_sp.getSelectedItem().toString(),
                add_first_answer_et.getText().toString(), is_first_answer_true_cb.isChecked(),
                add_second_answer_et.getText().toString(), is_second_answer_true_cb.isChecked(),
                add_third_answer_et.getText().toString(), is_third_answer_true_cb.isChecked(),
                add_fourth_answer_et.getText().toString(), is_fourth_answer_true_cb.isChecked()
        ));

    }


    //Clear data
    public void cleanBoxes() {

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
    public void saveQuizz(View view) {

        if (add_category_sp.isSelected()) {

            add_category_sp.requestFocus();

            Toast msg = Toast.makeText(this, "Select a question Category", Toast.LENGTH_LONG);
            msg.show();


        }
        if (add_question_et.getText().toString().isEmpty()) {

            add_question_et.requestFocus();
            Toast msg = Toast.makeText(this, "The field is empty.", Toast.LENGTH_LONG);
            msg.show();

        }
        if (add_first_answer_et.getText().toString().isEmpty()) {

            add_first_answer_et.requestFocus();
            Toast msg = Toast.makeText(this, "The 1st answer is empty", Toast.LENGTH_LONG);
            msg.show();

        }
        if (add_second_answer_et.getText().toString().isEmpty()) {

            add_second_answer_et.requestFocus();
            Toast msg = Toast.makeText(this, "The 2nd answer is empty.", Toast.LENGTH_LONG);
            msg.show();

        }
        if (add_third_answer_et.getText().toString().isEmpty()) {

            add_third_answer_et.requestFocus();
            Toast msg = Toast.makeText(this, "The 3rd answer is Empty", Toast.LENGTH_LONG);
            msg.show();

        }
        if (add_fourth_answer_et.getText().toString().isEmpty()) {

            add_fourth_answer_et.requestFocus();
            Toast msg = Toast.makeText(this, "The 4th answer is empty.", Toast.LENGTH_LONG);
            msg.show();

        }
        if (is_first_answer_true_cb.isChecked() &&
                is_second_answer_true_cb.isChecked() &&
                is_third_answer_true_cb.isChecked() &&
                is_fourth_answer_true_cb.isChecked()) {


        } else {

            createQuestion(questionList);
            cleanBoxes();
            Toast msg = Toast.makeText(this, "Saving...", Toast.LENGTH_LONG);
            msg.show();

        }

        sendingDataToMathActivity(questionList);

    }

    //will clear the form
    public void cancelSave(View view) {
        cleanBoxes();
    }


    public void sendingDataToMathActivity(ArrayList<Quizz> quizzArrayList) {

        Intent questionsListIntent = new Intent(AddingQuestionActivity.this, MathematicsActivity.class);
        Bundle questionsListBundle = new Bundle();
        questionsListBundle.putParcelableArrayList("arrayListOfQuestions", quizzArrayList);
        questionsListIntent.putExtras(questionsListBundle);

    }

    public void populatingTheSpinner(){

        add_category_sp = findViewById(R.id.id_add_category_sp_view);

        //Add items to spinner from an array
        ArrayAdapter<CharSequence> add_category_sp_adapter = ArrayAdapter.createFromResource(this, R.array.quizz_category, R.layout.support_simple_spinner_dropdown_item);
        add_category_sp.setAdapter(add_category_sp_adapter);
    }
}
