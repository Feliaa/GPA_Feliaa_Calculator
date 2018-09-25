package com.example.mosterjr.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText score1;
    EditText score2;
    EditText score3;
    EditText score4;
    EditText score5;
    TextView gpattl;
    Button calcbutton;
    Button gpaclearbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1 = (EditText) findViewById(R.id.gpa1);
        score2 = (EditText) findViewById(R.id.gpa2);
        score3 = (EditText) findViewById(R.id.gpa3);
        score4 = (EditText) findViewById(R.id.gpa4);
        score5 = (EditText) findViewById(R.id.gpa5);
        gpattl = (TextView) findViewById(R.id.gpadisplay);
        calcbutton = (Button) findViewById(R.id.gpacalbutton);
        gpaclearbutton = (Button) findViewById(R.id.cleartext);

    }

 public void calcgpa(View view){

     int sc1 = 0;
     int sc2 = 0;
     int sc3 = 0;
     int sc4 = 0;
     int sc5 = 0;
     int i =0;

     if(score1.getText().toString().length()==0) {
        score1.setError("This Field is required");
    }else {
        sc1 = Integer.parseInt(score1.getText().toString().trim());//Reads Score 1 field and set it to int sc1
         i++;
    }

     if(score2.getText().toString().length()==0) {
         score2.setError("This Field is required");
     }else {
         sc2 = Integer.parseInt(score2.getText().toString().trim());//Reads Score 2 field and set it to int sc2
         i++;
     }

     if(score3.getText().toString().length()==0) {
         score3.setError("This Field is required");
     }else {
         sc3 = Integer.parseInt(score3.getText().toString().trim());//Reads Score 3 field and set it to int sc3
         i++;
     }

     if(score4.getText().toString().length()==0) {
         score4.setError("This Field is required");
     }else {
         sc4 = Integer.parseInt(score4.getText().toString().trim());//Reads Score 4 field and set it to int sc4
         i++;
     }


     if(score5.getText().toString().length()==0) {
         score5.setError("This Field is required");
     }else {
         sc5 = Integer.parseInt(score5.getText().toString().trim());//Reads Score 5 field and set it to int sc5
         i++;
     }


    if (i==5){
        int scttl = (sc1+sc2+sc3+sc4+sc5)/5; //calcualates GPS by adding SCORE1,SCORE2,SCORE3,SCORE4,SCORE5 the devicing by a hard coded 5 since this only take in 5 grades
        gpattl.setText(String.valueOf(scttl)); //display's the GPA
        if (scttl <= 60) {

            gpattl.setBackgroundColor(getColor(R.color.red));
        }else if (scttl <= 61 || scttl <=79 ){

            gpattl.setBackgroundColor(getColor(R.color.yellow));

        }else{

            gpattl.setBackgroundColor(getColor(R.color.green));
        }
        calcbutton.setVisibility(View.INVISIBLE);
        gpaclearbutton.setVisibility(View.VISIBLE);
    }

 }
    public void gpaclanup(View view){

        score1.setText("");
        score2.setText("");
        score3.setText("");
        score4.setText("");
        score5.setText("");
        gpattl.setText("");
        calcbutton.setVisibility(View.VISIBLE);
        gpaclearbutton.setVisibility(View.INVISIBLE);

            }

}
