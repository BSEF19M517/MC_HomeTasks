package com.bsef19m517.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Exam_A extends AppCompatActivity {

    String[] animalPhotos;
    ImageView[] imageViewsID;
    RadioGroup[] radioGroupsID;
    RadioButton[][] radioButtonsID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_a);

        /*ImageView imageView = findViewById(R.id.ques1_image);
        String uri = "@drawable/cat";
        int imageResource = getResources().getIdentifier(uri,null,getPackageName());
        Drawable res = getResources().getDrawable(imageResource);
        imageView.setImageDrawable(res);*/

        setIDs();
        setImages();
        setOptions();
    }

    private void setIDs(){
        imageViewsID = new ImageView[]{
                findViewById(R.id.ques1_image),findViewById(R.id.ques2_image),findViewById(R.id.ques3_image),findViewById(R.id.ques4_image),findViewById(R.id.ques5_image)
        };
        radioGroupsID = new RadioGroup[]{
                findViewById(R.id.ques1),findViewById(R.id.ques2),findViewById(R.id.ques3),findViewById(R.id.ques4),findViewById(R.id.ques5)
        };
        radioButtonsID = new RadioButton[][]{
                {findViewById(R.id.ques1_op1),findViewById(R.id.ques1_op2),findViewById(R.id.ques1_op3),findViewById(R.id.ques1_op4)},
                {findViewById(R.id.ques2_op1),findViewById(R.id.ques2_op2),findViewById(R.id.ques2_op3),findViewById(R.id.ques2_op4)},
                {findViewById(R.id.ques3_op1),findViewById(R.id.ques3_op2),findViewById(R.id.ques3_op3),findViewById(R.id.ques3_op4)},
                {findViewById(R.id.ques4_op1),findViewById(R.id.ques4_op2),findViewById(R.id.ques4_op3),findViewById(R.id.ques4_op4)},
                {findViewById(R.id.ques5_op1),findViewById(R.id.ques5_op2),findViewById(R.id.ques5_op3),findViewById(R.id.ques5_op4)}
        };

        animalPhotos = new String[]{"alligator","bear","cat","dog","elephant","fox","giraffe",
                "horse","iguana","jellyfish","koala","lion","monkey","newt",
                "owl","pig","quail","raccoon","seagull","tiger","urchin",
                "vulture","whale","xrayfish","yak","zebra"};
    }

    private void setImages(){
        imageViewsID[0].setImageResource(R.drawable.fox);
        imageViewsID[1].setImageResource(R.drawable.zebra);
        imageViewsID[2].setImageResource(Integer.parseInt("@drawable/tiger"));
        imageViewsID[3].setImageResource(Integer.parseInt("@drawable/cat"));
        imageViewsID[4].setImageResource(Integer.parseInt("@drawable/newt"));
    }
    private void setOptions(){
        radioButtonsID[0][0].setText(animalPhotos[23]);
        radioButtonsID[0][1].setText(animalPhotos[22]);
        radioButtonsID[0][2].setText(animalPhotos[5]);
        radioButtonsID[0][3].setText(animalPhotos[3]);

        radioButtonsID[1][0].setText(animalPhotos[0]);
        radioButtonsID[1][1].setText(animalPhotos[25]);
        radioButtonsID[1][2].setText(animalPhotos[19]);
        radioButtonsID[1][3].setText(animalPhotos[17]);

        radioButtonsID[2][0].setText(animalPhotos[11]);
        radioButtonsID[2][1].setText(animalPhotos[1]);
        radioButtonsID[2][2].setText(animalPhotos[9]);
        radioButtonsID[2][3].setText(animalPhotos[19]);

        radioButtonsID[3][0].setText(animalPhotos[2]);
        radioButtonsID[3][1].setText(animalPhotos[21]);
        radioButtonsID[3][2].setText(animalPhotos[16]);
        radioButtonsID[3][3].setText(animalPhotos[3]);

        radioButtonsID[4][0].setText(animalPhotos[4]);
        radioButtonsID[4][1].setText(animalPhotos[9]);
        radioButtonsID[4][2].setText(animalPhotos[23]);
        radioButtonsID[4][3].setText(animalPhotos[13]);

    }
}