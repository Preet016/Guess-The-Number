package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int rand;
    public void rightGuess(View view){


        EditText type=(EditText)findViewById(R.id.gussedNumber);

        int userGuess = Integer.parseInt(type.getText().toString());
        if(userGuess==rand){
            Toast.makeText(this, "Congrats!!    You Guessed It Right", Toast.LENGTH_LONG).show();
            ImageView image=findViewById(R.id.imageButton);
            image.setImageResource(R.drawable.success);
            rand=(int) (Math.random()*23);
        }
        else if(userGuess<rand){
            Toast.makeText(this, "Guess little bit higher", Toast.LENGTH_SHORT).show();
        }
        else if(userGuess>rand){
            Toast.makeText(this, "Guess little bit lower", Toast.LENGTH_LONG).show();
        }
        else if(userGuess<0 || userGuess<23 || userGuess>23){
            Toast.makeText(this, "Not In Range", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rand=(int) (Math.random()*23);
    }
}