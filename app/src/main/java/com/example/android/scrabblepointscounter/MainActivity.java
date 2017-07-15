package com.example.android.scrabblepointscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score;
    int scoreB;
    int scoreC;
    int scoreD;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForPlayerA(0);
        displayForPlayerB(0);
    }

    /**
     * Displays the given score for player 1.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scoreFive(View view) {
        score = score + 5;
        display(score);
    }

    public void scoreTwo(View view) {
        score = score + 2;
        display(score);
    }

    public void scoreOne(View view) {
        score = score + 1;
        display(score);
    }

    public void minusA(View view) {
        score = score - 1;
        if (score < 0) {
            score = 0;
        }
        displayForPlayerA(score);
    }

    public void display(int number) {
        TextView countViewer = (TextView) findViewById(R.id.team_a_score);
        countViewer.setText("" + number);
    }

    /* Displays the given score for player 2.
        */
    public void displayForPlayerB(int scoreB) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    public void scoreFiveB(View view) {
        scoreB = scoreB + 5;
        displayForPlayerB(scoreB);
    }

    public void scoreTwoB(View view) {
        scoreB = scoreB + 2;
        displayForPlayerB(scoreB);
    }

    public void scoreOneB(View view) {
        scoreB = scoreB + 1;
        displayForPlayerB(scoreB);
    }

    public void minusB(View view) {
        scoreB = scoreB - 1;
        if (scoreB < 0) {
            scoreB = 0;
        }
        displayForPlayerB(scoreB);
    }

    /* Displays the given score for Player 3.
               */
    public void displayForPlayerC(int scoreC) {
        TextView scoreView = (TextView) findViewById(R.id.team_c_score);
        scoreView.setText(String.valueOf(scoreC));
    }

    public void scoreFiveC(View view) {
        scoreC = scoreC + 5;
        displayForPlayerC(scoreC);
    }

    public void scoreTwoC(View view) {
        scoreC = scoreC + 2;
        displayForPlayerC(scoreC);
    }

    public void scoreOneC(View view) {
        scoreC = scoreC + 1;
        displayForPlayerC(scoreC);
    }

    public void minusC(View view) {
        scoreC = scoreC - 1;
        if (scoreC < 0) {
            scoreC = 0;
        }
        displayForPlayerC(scoreC);
    }

    /* Displays the given score for Team 4.
            */
    public void displayForPlayerD(int scoreD) {
        TextView scoreView = (TextView) findViewById(R.id.team_d_score);
        scoreView.setText(String.valueOf(scoreD));
    }

    public void scoreFiveD(View view) {
        scoreD = scoreD + 5;
        displayForPlayerD(scoreD);
    }

    public void scoreTwoD(View view) {
        scoreD = scoreD + 2;
        displayForPlayerD(scoreD);
    }

    public void scoreOneD(View view) {
        scoreD = scoreD + 1;
        displayForPlayerD(scoreD);
    }

    public void minusD(View view) {
        scoreD = scoreD - 1;
        if (scoreD < 0) {
            scoreD = 0;
        }
        displayForPlayerD(scoreD);
    }

    /* NewGame. This method will reset all scores.
    */
    public void Reset(View view) {
        scoreB = 0;
        score = 0;
        scoreC = 0;
        scoreD = 0;

        displayForPlayerA(score);
        displayForPlayerB(scoreB);
        displayForPlayerC(scoreC);
        displayForPlayerD(scoreD);
    }
}
