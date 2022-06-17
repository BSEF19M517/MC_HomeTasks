package com.bsef19m517.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Exam extends AppCompatActivity {
    String[] animalPhotos;
    ImageView[] imageViewsID;
    RadioGroup[] radioGroupsID;
    RadioButton[][] radioButtonsID;
    int[] answers;
    HashMap<Integer,Integer[]> questionContent = new HashMap<Integer,Integer[]>();
    Integer[] imageIndex = new Integer[5];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        imageIndex = generateRandom(5);
        for (Integer img: imageIndex) {
            questionContent.put(img,generateRandom(4,img));
        }
        setIDs();
        setExam();
    }
    private void setExam(){
        String uri = null;
        int imageResource;
        Drawable res;
        for(int i=0;i<5;i++){
            int[] options = IntegerToIntArr(questionContent.get(imageIndex[i]));
            uri = "@drawable/"+animalPhotos[imageIndex[i]];
            imageResource = getResources().getIdentifier(uri,null,getPackageName());
            res = getResources().getDrawable(imageResource);
            imageViewsID[i].setImageDrawable(res);
            for(int j=0;j<4;j++){
                radioButtonsID[i][j].setText(animalPhotos[options[i]]);
            }
        }
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
        answers = IntegerToIntArr(imageIndex);
        animalPhotos = new String[]{"alligator","bear","cat","dog","elephant","fox","giraffe",
                "horse","iguana","jellyfish","koala","lion","monkey","newt",
                "owl","pig","quail","raccoon","seagull","tiger","urchin",
                "vulture","whale","xrayfish","yak","zebra"};
    }
    private int[] IntegerToIntArr(Integer[] IntegerArr){
        int[] intArr = new int[IntegerArr.length];
        for(int i=0;i<IntegerArr.length;i++){
            intArr[i] = IntegerArr[i];
        }
        return intArr;
    }
    //generate n random numbers
    private Integer[] generateRandom(int n){
        Integer rand;
        Integer[] randArr = new Integer[n];

        //set to store random values without duplicates
        Set<Integer> randSet = new HashSet<Integer>();
        while(randSet.size() <= n){
            rand = ThreadLocalRandom.current().nextInt(26);
            randSet.add(rand);
        }

        //putting set values into an Integer array
        randArr = randSet.toArray(randArr);
        return randArr;
    }
    //generate n random numbers including pre
    private Integer[] generateRandom(int n,int pre){
        Integer rand;
        Integer[] randArr = new Integer[n];

        //set to store random values without duplicates
        Set<Integer> randSet = new HashSet<Integer>();
        randSet.add(pre);
        while(randSet.size() <= n){
            rand = ThreadLocalRandom.current().nextInt(26);
            randSet.add(rand);
        }

        //putting set values into an Integer array
        //after shuffling
        List<Integer> randList = new ArrayList<>(randSet);
        Collections.shuffle(randList);
        randArr = randList.toArray(randArr);
        return randArr;
    }
}