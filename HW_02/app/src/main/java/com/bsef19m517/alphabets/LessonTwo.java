package com.bsef19m517.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LessonTwo extends AppCompatActivity {
    String uri = null;
    ImageView imageview;
    TextView textView;
    String animal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_two);

        Intent intent = getIntent();
        String name = intent.getStringExtra("NAME");

        switch (name) {
            case "A":
                uri = "@drawable/alligator";
                animal = "Alligator";
                break;
            case "B":
                uri = "@drawable/bear";
                animal = "Bear";
                break;
            case "C":
                uri = "@drawable/cat";
                animal = "Cat";
                break;
            case "D":
                uri = "@drawable/dog";
                animal = "Dog";
                break;
            case "E":
                uri = "@drawable/elephant";
                animal = "Elephant";
                break;
            case "F":
                uri = "@drawable/fox";
                animal = "Fox";
                break;
            case "G":
                uri = "@drawable/giraffe";
                animal = "Giraffe";
                break;
            case "H":
                uri = "@drawable/horse";
                animal = "Horse";
                break;
            case "I":
                uri = "@drawable/iguana";
                animal = "Iguana";
                break;
            case "J":
                uri = "@drawable/jellyfish";
                animal = "Jellyfish";
                break;
            case "K":
                uri = "@drawable/koala";
                animal = "Koala";
                break;
            case "L":
                uri = "@drawable/lion";
                animal = "Lion";
                break;
            case "M":
                uri = "@drawable/monkey";
                animal = "Monkey";
                break;
            case "N":
                uri = "@drawable/newt";
                animal = "Newt";
                break;
            case "O":
                uri = "@drawable/owl";
                animal = "Owl";
                break;
            case "P":
                uri = "@drawable/pig";
                animal = "Pig";
                break;
            case "Q":
                uri = "@drawable/quail";
                animal = "Quail";
                break;
            case "R":
                uri = "@drawable/raccoon";
                animal = "Raccoon";
                break;
            case "S":
                uri = "@drawable/seagull";
                animal = "Seagull";
                break;
            case "T":
                uri = "@drawable/tiger";
                animal = "Tiger";
                break;
            case "U":
                uri = "@drawable/urchin";
                animal = "Urchin";
                break;
            case "V":
                uri = "@drawable/vulture";
                animal = "Vulture";
                break;
            case "W":
                uri = "@drawable/whale";
                animal = "Whale";
                break;
            case "X":
                uri = "@drawable/xrayfish";
                animal = "X-ray Fish";
                break;
            case "Y":
                uri = "@drawable/yak";
                animal = "Yak";
                break;
            case "Z":
                uri = "@drawable/zebra";
                animal = "Zebra";
                break;
        }
        int imageResource = getResources().getIdentifier(uri,null,getPackageName());
        imageview = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView3);
        Drawable res = getResources().getDrawable(imageResource);
        imageview.setImageDrawable(res);
        textView.setText(animal);
    }
}