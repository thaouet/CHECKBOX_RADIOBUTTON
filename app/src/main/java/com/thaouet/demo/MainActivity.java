package com.thaouet.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    CompoundButton.OnCheckedChangeListener listener1 = new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

           CheckBox cb = (CheckBox) compoundButton;

           if (b)
           txt.setText(cb.getText() + " CHECKED".toString());
           else
               txt.setText(cb.getText() + "unCHECKED".toString());
           // Toast.makeText(MainActivity.this,cb.getText().toString()+ String.valueOf(b), Toast.LENGTH_LONG).show();
        }
    };

    RadioGroup.OnCheckedChangeListener listener2 = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {

            //RadioGroup rg = radioGroup;

           // if ( i == R.id.checkBox1)
           // { txt.setText("CHOCOLAT");}
          //  txt.setText(String.valueOf(i) + " " +String.valueOf(rg.getCheckedRadioButtonId()));

           if (i == R.id.radioButton1)

            Toast.makeText(MainActivity.this,"CHOCOLAT " , Toast.LENGTH_LONG).show();
        }
    };

TextView txt;
    CheckBox cb1,cb2,cb3;
    RadioGroup rg1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      cb1 = findViewById(R.id.checkBox1);
      cb2 = findViewById(R.id.checkBox2);
      cb3 = findViewById(R.id.checkBox3);
       cb1.setOnCheckedChangeListener(listener1);
        cb2.setOnCheckedChangeListener(listener1);
        cb3.setOnCheckedChangeListener(listener1);
        txt = findViewById(R.id.textView3);
      rg1 = findViewById(R.id.group1);
       rg1.setOnCheckedChangeListener(listener2);


    }

    public void RadioButtonClick(View view) {

        RadioButton b  = (RadioButton) view;
        if (b.isChecked())
        txt.setText(b.getText() + " CHECKED".toString());
        else
            txt.setText(b.getText() + " UNCHECKED".toString());

    }
}