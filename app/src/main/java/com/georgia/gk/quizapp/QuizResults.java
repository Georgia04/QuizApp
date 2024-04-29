package com.georgia.gk.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewButton = findViewById(R.id.startNewQuizButton);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final int getCorrectAnswer = getIntent().getIntExtra("Correct", 0 );
        final int getIncorrectAnswer = getIntent().getIntExtra("Incorrect", 0 );

        correctAnswers.setText(String.valueOf(getCorrectAnswer));
        incorrectAnswers.setText(String.valueOf(getIncorrectAnswer));

        startNewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}