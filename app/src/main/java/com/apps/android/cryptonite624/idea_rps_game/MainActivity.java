package com.apps.android.cryptonite624.idea_rps_game;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button rockButton, paperButton, scissorsButton;
    ImageView computerChoiceImage, userChoiceImage;
    String userChoiceString;
    int userChoiceInt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        computerChoiceImage = findViewById(R.id.comp_choice_imageview);
        userChoiceImage = findViewById(R.id.user_choice_imageview);

        rockButton = findViewById(R.id.rock_button);
        paperButton = findViewById(R.id.paper_button);
        scissorsButton = findViewById(R.id.scissors_button);

        rockButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoiceString = "rock";
                userChoiceInt = 0;
                runGame();
            }
        });

        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoiceString = "paper";
                userChoiceInt = 1;
                runGame();
            }
        });

        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userChoiceString = "scissors";
                userChoiceInt = 2;
                runGame();
            }
        });
    }

    public void runGame() {
        //0 = rock, 1 = paper, 2 = scissors
        int indicator = (int)((Math.random()*3)+0);

        //both have same choice
        if(indicator == userChoiceInt) {
           if(indicator == 0) {
               userChoiceImage.setImageResource(R.drawable.rock);
               computerChoiceImage.setImageResource(R.drawable.rock);
           } else if(indicator == 1) {
               userChoiceImage.setImageResource(R.drawable.paper);
               computerChoiceImage.setImageResource(R.drawable.paper);
           } else {
               userChoiceImage.setImageResource(R.drawable.scissors);
               computerChoiceImage.setImageResource(R.drawable.scissors);
           }
            Toast.makeText(MainActivity.this, "Draw", Toast.LENGTH_SHORT).show();
        } else {        //different choices
           if(indicator == 0) {         //computer choice == rock
               computerChoiceImage.setImageResource(R.drawable.rock);
               if(userChoiceInt == 1) {         //rock vs paper
                   userChoiceImage.setImageResource(R.drawable.paper);
                   Toast.makeText(MainActivity.this, "You won", Toast.LENGTH_SHORT).show();
               } else if (userChoiceInt == 2){                         //rock vs scissors
                   userChoiceImage.setImageResource(R.drawable.scissors);
                   Toast.makeText(MainActivity.this, "You lost", Toast.LENGTH_SHORT).show();
               }
           }
           else if(indicator == 1) {    //computer choice == paper
               computerChoiceImage.setImageResource(R.drawable.paper);
               if(userChoiceInt == 0) {         //paper vs rock
                   userChoiceImage.setImageResource(R.drawable.rock);
                   Toast.makeText(MainActivity.this, "You lost", Toast.LENGTH_SHORT).show();
               } else if(userChoiceInt == 2){                         //paper vs scissors
                   userChoiceImage.setImageResource(R.drawable.scissors);
                   Toast.makeText(MainActivity.this, "You won", Toast.LENGTH_SHORT).show();
               }
           } else {                     //computer choice == scissors
               computerChoiceImage.setImageResource(R.drawable.scissors);
               if(userChoiceInt == 0) {         //scissors vs rock
                   userChoiceImage.setImageResource(R.drawable.rock);
                   Toast.makeText(MainActivity.this, "You won", Toast.LENGTH_SHORT).show();
               } else if(userChoiceInt == 1) {                         //scissors vs paper
                   userChoiceImage.setImageResource(R.drawable.paper);
                   Toast.makeText(MainActivity.this, "You lost", Toast.LENGTH_SHORT).show();
               }
           }
        }
    }




}
