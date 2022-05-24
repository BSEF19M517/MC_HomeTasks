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

        if(name.equals("A")){
            uri = "@drawable/alligator";
            animal = "Alligator";
        }
        else if(name.equals("B")){
            uri = "@drawable/bear";
            animal = "Bear";
        }
        else if(name.equals("C")){
            uri = "@drawable/cat";
            animal = "Cat";
        }
        else if(name.equals("D")){
            uri = "@drawable/dog";
            animal = "Dog";
        }
        else if(name.equals("E")){
            uri = "@drawable/elephant";
            animal = "Elephant";
        }
        else if(name.equals("F")){
            uri = "@drawable/fox";
            animal = "Fox";
        }
        else if(name.equals("G")){
            uri = "@drawable/giraffe";
            animal = "Giraffe";
        }
        else if(name.equals("H")){
            uri = "@drawable/horse";
            animal = "Horse";
        }
        else if(name.equals("I")){
            uri = "@drawable/iguana";
            animal = "Iguana";
        }
        else if(name.equals("J")){
            uri = "@drawable/jellyfish";
            animal = "Jellyfish";
        }
        else if(name.equals("K")){
            uri = "@drawable/koala";
            animal = "Koala";
        }
        else if(name.equals("L")){
            uri = "@drawable/lion";
            animal = "Lion";
        }
        else if(name.equals("M")){
            uri = "@drawable/monkey";
            animal = "Monkey";
        }
        else if(name.equals("N")){
            uri = "@drawable/newt";
            animal = "Newt";
        }
        else if(name.equals("O")){
            uri = "@drawable/owl";
            animal = "Owl";
        }
        else if(name.equals("P")){
            uri = "@drawable/pig";
            animal = "Pig";
        }
        else if(name.equals("Q")){
            uri = "@drawable/quail";
            animal = "Quail";
        }
        else if(name.equals("R")){
            uri = "@drawable/raccoon";
            animal = "Raccoon";
        }
        else if(name.equals("S")){
            uri = "@drawable/seagull";
            animal = "Seagull";
        }
        else if(name.equals("T")){
            uri = "@drawable/tiger";
            animal = "Tiger";
        }
        else if(name.equals("U")){
            uri = "@drawable/urchin";
            animal = "Urchin";
        }
        else if(name.equals("V")){
            uri = "@drawable/vulture";
            animal = "Vulture";
        }
        else if(name.equals("W")){
            uri = "@drawable/whale";
            animal = "Whale";
        }
        else if(name.equals("X")){
            uri = "@drawable/xrayfish";
            animal = "X-ray Fish";
        }
        else if(name.equals("Y")){
            uri = "@drawable/yak";
            animal = "Yak";
        }
        else if(name.equals("Z")){
            uri = "@drawable/zebra";
            animal = "Zebra";
        }
        int imageResource = getResources().getIdentifier(uri,null,getPackageName());
        imageview = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView3);
        Drawable res = getResources().getDrawable(imageResource);
        imageview.setImageDrawable(res);
        textView.setText(animal);
    }
}