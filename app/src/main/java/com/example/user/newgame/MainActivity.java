package com.example.user.newgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(Button) findViewById(R.id.b1);
        b2 =(Button) findViewById(R.id.b2);
        b3 =(Button) findViewById(R.id.b3);
        b4 =(Button) findViewById(R.id.b4);
        b5 =(Button) findViewById(R.id.b5);
        b6 =(Button) findViewById(R.id.b6);
        b7 =(Button) findViewById(R.id.b7);
        b8 =(Button) findViewById(R.id.b8);
        b9 =(Button) findViewById(R.id.b9);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b1.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b1.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b1.setText("O");
                    }
                }
                endGame();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b2.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b2.setText("O");
                    }
                }
                endGame();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b3.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b3.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b3.setText("O");
                    }
                }
                endGame();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b4.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b4.setText("O");
                    }
                }
                endGame();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b5.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b5.setText("O");
                    }
                }
                endGame();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b6.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b6.setText("O");
                    }
                }
                endGame();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b7.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b7.setText("O");
                    }
                }
                endGame();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b8.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b8.setText("O");
                    }
                }
                endGame();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")) {
                    if (turn ==1){
                        turn =2;
                        b9.setText("X");
                    } else  if (turn == 2) {
                        turn =1 ;
                        b9.setText("O");
                    }
                }
                endGame();
            }
        });

    }
}
