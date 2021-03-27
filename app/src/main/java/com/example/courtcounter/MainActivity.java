package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.view.View;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int foulTeamA = 0;
    int offsideA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;
    int offsideB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void goalA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreA(scoreTeamA);
    }
    public void foulA(View view){
        foulTeamA = foulTeamA + 1;
        displayFoulA(foulTeamA);
    }
    public void offsideA(View view){
        offsideA = offsideA + 1;
        displayOffsideA(offsideA);
    }
    private void displayScoreA(int sValue){
        TextView teamScore = findViewById(R.id.teamScoreA);
        teamScore.setText(String.valueOf(sValue));
    }
    private void displayFoulA(int fValue) {
        TextView teamScore = findViewById(R.id.teamFoulCountA);
        teamScore.setText(String.valueOf(fValue));
    }
    private void displayOffsideA(int oValue){
        TextView teamScore = findViewById(R.id.teamOffsideCountA);
        teamScore.setText(String.valueOf(oValue));
    }
    public void goalB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreB(scoreTeamB);
    }
    public void foulB(View view){
        foulTeamB = foulTeamB + 1;
        displayFoulB(foulTeamB);
    }
    public void offsideB(View view){
        offsideB = offsideB + 1;
        displayOffsideB(offsideB);
    }
    private void displayScoreB(int sValue){
        TextView teamScore = findViewById(R.id.teamScoreB);
        teamScore.setText(String.valueOf(sValue));
    }
    private void displayFoulB(int fValue) {
        TextView teamScore = findViewById(R.id.teamFoulCountB);
        teamScore.setText(String.valueOf(fValue));
    }
    private void displayOffsideB(int oValue){
        TextView teamScore = findViewById(R.id.teamOffsideCountB);
        teamScore.setText(String.valueOf(oValue));
    }
    public void endMatch(View view){
        String winner;
        if (scoreTeamA > scoreTeamB){
            winner = "The winner is Team A";
        }
        else if (scoreTeamB > scoreTeamA){
            winner = "The winner is Team B";
        }
        else {
            winner = "It is a draw";
        }
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setMessage(winner);
        dialog.setTitle("Match Results");
        dialog.setNeutralButton("Reset", (dialog1, which) -> Toast.makeText(getApplicationContext(),"Stats Reset",Toast.LENGTH_LONG).show());
        AlertDialog alertDialog= dialog.create();
        alertDialog.show();

        scoreTeamA = 0;
        foulTeamA = 0;
        offsideA = 0;
        scoreTeamB = 0;
        foulTeamB = 0;
        offsideB = 0;

        displayScoreA(scoreTeamA);
        displayFoulA(foulTeamA);
        displayOffsideA(offsideA);
        displayScoreB(scoreTeamB);
        displayFoulB(foulTeamB);
        displayOffsideB(offsideB);
    }
}