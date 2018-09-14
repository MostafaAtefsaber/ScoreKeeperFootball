package com.example.mostafa.scorekeeperfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int ScoureTeamA = 0;
    int ScoureTeamB = 0;
    int ScoureFTeamA = 0;
    int ScoureFTeamB = 0;
    int ScourePTeamA = 0;
    int ScourePTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Team A
    /*
    add three points for team A
     */
    public void GoalA(View view){
        ScoureTeamA = ScoureTeamA + 1;
        displayscoreForTeamA(ScoureTeamA);
    }
    /*
    add two points for team A
     */
    public void FoulA(View view){
        ScoureFTeamA = ScoureFTeamA + 1;
        displayscoreFoulForTeamA(ScoureFTeamA);
    }
    /*
    add one points for team A
     */
    public void PenaltyA(View view){
        ScourePTeamA = ScourePTeamA + 1;
        displayscorePenaltyForTeamA(ScourePTeamA);
    }
    /*
    display score for team A
     */
    public void displayscoreForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayscoreFoulForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_scoreFoul);
        scoreView.setText(String.valueOf(score));

    }
    public void displayscorePenaltyForTeamA(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_a_scorePenalty);
        scoreView.setText(String.valueOf(score));

    }
    // Team B

    /*
    add three points for team B
     */
    public void GoalB(View view){
        ScoureTeamB = ScoureTeamB + 1;
        displayscoreForTeamB(ScoureTeamB);
    }
    /*
    add two points for team B
     */
    public void FoulB(View view){
        ScoureFTeamB = ScoureFTeamB + 1;
        displayscoreFoulForTeamB(ScoureFTeamB);
    }
    /*
    add one points for team B
     */
    public void PenaltyB(View view){
        ScourePTeamB = ScourePTeamB + 1;
        displayscorePenaltyForTeamB(ScourePTeamB);
    }
    /*
    display score for team B
     */
    public void displayscoreForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));

    }
    public void displayscoreFoulForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_scoreFoul);
        scoreView.setText(String.valueOf(score));

    }
    public void displayscorePenaltyForTeamB(int score){
        TextView scoreView =(TextView) findViewById(R.id.team_b_scorePenalty);
        scoreView.setText(String.valueOf(score));

    }
    // Reset a and b

    public  void  Reset(View view){
         ScoureTeamA = 0;
         ScoureTeamB = 0;
         ScoureFTeamA = 0;
         ScoureFTeamB = 0;
         ScourePTeamA = 0;
         ScourePTeamB = 0;
        displayscoreForTeamA(ScoureTeamA);
        displayscoreForTeamB(ScoureTeamB);
        displayscoreFoulForTeamA(ScoureFTeamA);
        displayscoreFoulForTeamB(ScoureFTeamB);
        displayscorePenaltyForTeamA(ScourePTeamA);
        displayscorePenaltyForTeamB(ScourePTeamB);
    }
}