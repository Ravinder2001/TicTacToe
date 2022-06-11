package com.xyz.tic_tac_toe_masai;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix,
            buttonSeven, buttonEight, buttonNine, buttonReset;

    int turn = 1;
    boolean isEnded = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOne = findViewById(R.id.buttonOne);
        buttonTwo = findViewById(R.id.buttonTwo);
        buttonThree = findViewById(R.id.buttonThree);
        buttonFour = findViewById(R.id.buttonFour);
        buttonFive = findViewById(R.id.buttonFive);
        buttonSix = findViewById(R.id.buttonSix);
        buttonSeven = findViewById(R.id.buttonSeven);
        buttonEight = findViewById(R.id.buttonEight);
        buttonNine = findViewById(R.id.buttonNine);
        buttonReset = findViewById(R.id.buttonReset);


        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonOne);
            }
        });

        buttonTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonTwo);

            }
        });

        buttonThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonThree);
            }
        });

        buttonFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonFour);

            }
        });

        buttonFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonFive);
            }
        });


        buttonSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonSix);
            }
        });

        buttonSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonSeven);
            }
        });

        buttonEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonEight);
            }
        });

        buttonNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playGame(buttonNine);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recreate();
            }
        });

    }


    private void playGame(Button button) {
        if (button.getText().toString().equals("")) {
            if (turn == 1) {
                button.setText("X");
                turn = 2;

            } else {
                button.setText("O");
                turn = 1;
            }

            endGame();
        }
    }

    private void endGame() {
        String box1, box2, box3, box4, box5, box6, box7, box8, box9;
        box1 = buttonOne.getText().toString();
        box2 = buttonTwo.getText().toString();
        box3 = buttonThree.getText().toString();
        box4 = buttonFour.getText().toString();
        box5 = buttonFive.getText().toString();
        box6 = buttonSix.getText().toString();
        box7 = buttonSeven.getText().toString();
        box8 = buttonEight.getText().toString();
        box9 = buttonNine.getText().toString();


        if (box1.equals("X") && box2.equals("X") && box3.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (box4.equals("X") && box5.equals("X") && box6.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (box7.equals("X") && box8.equals("X") && box9.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (box1.equals("O") && box2.equals("O") && box3.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (box4.equals("O") && box5.equals("O") && box6.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }

        if (box7.equals("O") && box8.equals("O") && box9.equals("O")) {
            Toast.makeText(MainActivity.this, "Player O won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }
        if (box1.equals("X") && box4.equals("X") && box7.equals("X")) {
            Toast.makeText(MainActivity.this, "Player X won", Toast.LENGTH_SHORT).show();
            isEnded = true;
        }


        if (isEnded) {
            buttonOne.setEnabled(false);
            buttonTwo.setEnabled(false);
            buttonThree.setEnabled(false);
            buttonFour.setEnabled(false);
            buttonFive.setEnabled(false);
            buttonSix.setEnabled(false);
            buttonSeven.setEnabled(false);
            buttonEight.setEnabled(false);
            buttonNine.setEnabled(false);
            buttonReset.setText("Play Again");
        }

    }
}