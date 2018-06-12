package com.example.etomas.mozquizz;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.BitSet;

public class Quizz implements Parcelable{

    private String question;
    private String questionCategory;
    private String answer_1;
    private Boolean forAnswer_1;
    private String answer_2;
    private Boolean forAnswer_2;
    private String answer_3;
    private Boolean forAnswer_3;
    private String answer_4;
    private Boolean forAnswer_4;


    public Quizz() {
    }

    public Quizz(Parcel in){
        question = in.readString();
        answer_1 = in.readString();
        forAnswer_1 =in.readByte()!=0;
        answer_2 = in.readString();
        forAnswer_2 =in.readByte()!=0;
        answer_3 = in.readString();
        forAnswer_3 =in.readByte()!=0;
        answer_4 = in.readString();
        forAnswer_4 =in.readByte()!=0;
    }
    public Quizz(String question, String questionCategory, String answer_1, Boolean forAnswer_1, String answer_2, Boolean forAnswer_2, String answer_3, Boolean forAnswer_3, String answer_4, Boolean forAnswer_4) {
        this.question = question;
        this.questionCategory = questionCategory;
        this.answer_1 = answer_1;
        this.forAnswer_1 = forAnswer_1;
        this.answer_2 = answer_2;
        this.forAnswer_2 = forAnswer_2;
        this.answer_3 = answer_3;
        this.forAnswer_3 = forAnswer_3;
        this.answer_4 = answer_4;
        this.forAnswer_4 = forAnswer_4;
    }

    public Quizz(String question, String answer_1, Boolean forAnswer_1, String answer_2, Boolean forAnswer_2, String answer_3, Boolean forAnswer_3, String answer_4, Boolean forAnswer_4) {
        this.question = question;
        this.answer_1 = answer_1;
        this.forAnswer_1 = forAnswer_1;
        this.answer_2 = answer_2;
        this.forAnswer_2 = forAnswer_2;
        this.answer_3 = answer_3;
        this.forAnswer_3 = forAnswer_3;
        this.answer_4 = answer_4;
        this.forAnswer_4 = forAnswer_4;
    }

    public Quizz(String question, String answer_1, String answer_2, String answer_3, String answer_4) {

        this.question = question;
        this.answer_1 = answer_1;
        this.answer_2 = answer_2;
        this.answer_3 = answer_3;
        this.answer_4 = answer_4;

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer_1(String answer_1) {
        this.answer_1 = answer_1;
    }

    public void setAnswer_2(String answer_2) {
        this.answer_2 = answer_2;
    }

    public void setAnswer_3(String answer_3) {
        this.answer_3 = answer_3;
    }

    public void setAnswer_4(String answer_4) {
        this.answer_4 = answer_4;
    }

    public void setForAnswer_1(Boolean forAnswer_1) {
        this.forAnswer_1 = forAnswer_1;
    }

    public void setForAnswer_2(Boolean forAnswer_2) {
        this.forAnswer_2 = forAnswer_2;
    }

    public void setForAnswer_3(Boolean forAnswer_3) {
        this.forAnswer_3 = forAnswer_3;
    }

    public void setForAnswer_4(Boolean forAnswer_4) {
        this.forAnswer_4 = forAnswer_4;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer_1() {
        return answer_1;
    }

    public String getAnswer_2() {
        return answer_2;
    }

    public String getAnswer_3() {
        return answer_3;
    }

    public String getAnswer_4() {
        return answer_4;
    }

    public Boolean getForAnswer_1() {
        return forAnswer_1;
    }

    public Boolean getForAnswer_2() {
        return forAnswer_2;
    }

    public Boolean getForAnswer_3() {
        return forAnswer_3;
    }

    public Boolean getForAnswer_4() {
        return forAnswer_4;
    }

    public String getQuestionCategory() {
        return questionCategory;
    }

    public void setQuestionCategory(String questionCategory) {
        this.questionCategory = questionCategory;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(question);
        dest.writeString(answer_1);
        dest.writeByte((byte)(forAnswer_1?1:0));
        dest.writeString(answer_2);
        dest.writeByte((byte)(forAnswer_2?1:0));
        dest.writeString(answer_3);
        dest.writeByte((byte)(forAnswer_3?1:0));
        dest.writeString(answer_4);
        dest.writeByte((byte)(forAnswer_4?1:0));

    }

    public static final Parcelable.Creator<Quizz> CREATOR = new Parcelable.Creator<Quizz>(){

        public Quizz createFromParcel(Parcel in){
            return new Quizz(in);
        }

        @Override
        public Quizz[] newArray(int size) {
            return new Quizz[size];
        }

    };
}
