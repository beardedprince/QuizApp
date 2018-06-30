package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    int Q1 = R.id.Q1Opt3;
    int Q2 = R.id.Q2Opt3;
    int Q3 = R.id.Q3Opt4;
    int Q4 = R.id.Q4Opt1;
    int Q5 = R.id.Q5Opt2;
    int Q6 = R.id.Q6Opt2;
    int Q7 = R.id.check1;
    String Q8 = "kotlin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the View your Scores button is clicked.
     */
    public void quizCheck (View v){
        ArrayList <String> wrongAnswer = new ArrayList<String>();

        int numberOfCorrectAnswer = 0 ;

        if (correctAns1()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 1");
        }


    if (correctAns2()){
        numberOfCorrectAnswer++;
    }
        else {
        wrongAnswer.add("Question 2");
    }

        if (correctAns3()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 3");
        }

        if (correctAns4()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 4");
        }

        if (correctAns5()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 5");
        }

        if (correctAns6()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 6");
        }

        if (correctAns7()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 7");
        }

        if (correctAns8()){
            numberOfCorrectAnswer++;
        }
        else {
            wrongAnswer.add("Question 8");
        }

        Context context = getApplicationContext();
        CharSequence text = "You got " + numberOfCorrectAnswer  + " answers right.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
}

    private boolean correctAns1(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup1);
        if (grp.getCheckedRadioButtonId()==Q1){
            return true;
        }
        return false;
    }

    private boolean correctAns2(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup2);
        if (grp.getCheckedRadioButtonId()==Q2){
            return true;
        }
        return false;
    }

    private boolean correctAns3(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup3);
        if (grp.getCheckedRadioButtonId()==Q3){
            return true;
        }
        return false;
    }

    private boolean correctAns4(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup4);
        if (grp.getCheckedRadioButtonId()==Q4){
            return true;
        }
        return false;
    }

    private boolean correctAns5(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup5);
        if (grp.getCheckedRadioButtonId()==Q5){
            return true;
        }
        return false;
    }

    private boolean correctAns6(){
        RadioGroup grp = (RadioGroup) findViewById(R.id.radioGroup6);
        if (grp.getCheckedRadioButtonId()==Q6){
            return true;
        }
        return false;
    }

    private boolean correctAns7(){
        CheckBox grp1 = (CheckBox) findViewById(R.id.check1);
        CheckBox grp2 = (CheckBox) findViewById(R.id.check2);
        CheckBox grp3 = (CheckBox) findViewById(R.id.check3);
        CheckBox grp4 = (CheckBox) findViewById(R.id.check4);

        if (grp1.isChecked() && grp2.isChecked() && grp3.isChecked() && !grp4.isChecked()){
            return true;
        }
        return false;
    }

    private boolean correctAns8 (){
        EditText txt = (EditText) findViewById(R.id.input);
        return txt.getText().toString().equalsIgnoreCase(Q8);
    }
}
