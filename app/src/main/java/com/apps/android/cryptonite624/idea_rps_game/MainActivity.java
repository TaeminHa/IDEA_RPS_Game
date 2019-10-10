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

        /*TODO
        *  instantiate three buttons*/

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

    /*TODO
    *  create a function that'll change the imageView display according to the results of the game*/





}
