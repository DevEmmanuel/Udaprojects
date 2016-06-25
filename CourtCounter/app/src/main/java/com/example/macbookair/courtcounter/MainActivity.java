package com.example.macbookair.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamAscore=0;
    int teamBscore=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void threepointsA(View v){
        teamAscore+=3;
        displayscoreforA(teamAscore);
    }
    public void twopointsA(View v){
        teamAscore+=2;
        displayscoreforA(teamAscore);
    }
    public void onepointsA(View v){
        teamAscore+=1;
        displayscoreforA(teamAscore);
    }
    public void threepointsB(View v){
        teamBscore+=3;
        displayscoreforB(teamBscore);
    }
    public void twopointsB(View v){
        teamBscore+=2;
        displayscoreforB(teamBscore);
    }
    public void onepointsB(View v){
        teamBscore+=1;
        displayscoreforB(teamBscore);
    }
    public void displayscoreforA(int score){
        TextView ob=(TextView)findViewById(R.id.teamA);
        ob.setText(String.valueOf(score));

    }
    public void displayscoreforB(int score){
        TextView ob=(TextView)findViewById(R.id.teamB);
        ob.setText(String.valueOf(score));

    }
    public void resetscore(View v){
        teamAscore=0;
        teamBscore=0;
        displayscoreforA(teamAscore);
        displayscoreforB(teamBscore);
    }
}
