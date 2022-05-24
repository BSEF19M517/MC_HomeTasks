package com.bsef19m517.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LessonOne extends AppCompatActivity implements View.OnClickListener{
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_one);

        a = findViewById(R.id.button6);
        b = findViewById(R.id.button7);
        c = findViewById(R.id.button8);
        d = findViewById(R.id.button9);
        e = findViewById(R.id.button10);
        f = findViewById(R.id.button11);
        g = findViewById(R.id.button12);
        h = findViewById(R.id.button13);
        i = findViewById(R.id.button14);
        j = findViewById(R.id.button15);
        k = findViewById(R.id.button16);
        l = findViewById(R.id.button17);
        m = findViewById(R.id.button18);
        n = findViewById(R.id.button21);
        o = findViewById(R.id.button24);
        p = findViewById(R.id.button27);
        q = findViewById(R.id.button19);
        r = findViewById(R.id.button22);
        s = findViewById(R.id.button25);
        t = findViewById(R.id.button28);
        u = findViewById(R.id.button20);
        v = findViewById(R.id.button23);
        w = findViewById(R.id.button26);
        x = findViewById(R.id.button29);
        y = findViewById(R.id.button31);
        z = findViewById(R.id.button32);


        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        u.setOnClickListener(this);
        v.setOnClickListener(this);
        w.setOnClickListener(this);
        x.setOnClickListener(this);
        y.setOnClickListener(this);
        z.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){
        Intent intent = new Intent(LessonOne.this,LessonTwo.class);
        switch (v.getId()){
            case R.id.button6:
                intent.putExtra("NAME","A");
                break;
            case R.id.button7:
                intent.putExtra("NAME","B");
                break;
            case R.id.button8:
                intent.putExtra("NAME","C");
                break;
            case R.id.button9:
                intent.putExtra("NAME","D");
                break;
            case R.id.button10:
                intent.putExtra("NAME","E");
                break;
            case R.id.button11:
                intent.putExtra("NAME","F");
                break;
            case R.id.button12:
                intent.putExtra("NAME","G");
                break;
            case R.id.button13:
                intent.putExtra("NAME","H");
                break;
            case R.id.button14:
                intent.putExtra("NAME","I");
                break;
            case R.id.button15:
                intent.putExtra("NAME","J");
                break;
            case R.id.button16:
                intent.putExtra("NAME","K");
                break;
            case R.id.button17:
                intent.putExtra("NAME","L");
                break;
            case R.id.button18:
                intent.putExtra("NAME","M");
                break;
            case R.id.button21:
                intent.putExtra("NAME","N");
                break;
            case R.id.button24:
                intent.putExtra("NAME","O");
                break;
            case R.id.button27:
                intent.putExtra("NAME","P");
                break;
            case R.id.button19:
                intent.putExtra("NAME","Q");
                break;
            case R.id.button22:
                intent.putExtra("NAME","R");
                break;
            case R.id.button25:
                intent.putExtra("NAME","S");
                break;
            case R.id.button28:
                intent.putExtra("NAME","T");
                break;
            case R.id.button20:
                intent.putExtra("NAME","U");
                break;
            case R.id.button23:
                intent.putExtra("NAME","V");
                break;
            case R.id.button26:
                intent.putExtra("NAME","W");
                break;
            case R.id.button29:
                intent.putExtra("NAME","X");
                break;
            case R.id.button31:
                intent.putExtra("NAME","Y");
                break;
            case R.id.button32:
                intent.putExtra("NAME","Z");
                break;
        }
        startActivity(intent);
    }
}