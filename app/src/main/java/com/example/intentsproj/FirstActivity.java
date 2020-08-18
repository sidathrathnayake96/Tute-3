package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    EditText et1,et2;
    Button btns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        et1= findViewById(R.id.etNum1);
        et2= findViewById(R.id.etNum2);

        btns=findViewById(R.id.btnSend);

        btns.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

//take the numbers
                String n1 = et1.getText().toString();
                String n2=et2.getText().toString();
//create intent load number

                Intent i = new Intent(FirstActivity.this,SecondActivity.class
                );
                i.putExtra("Extra1",n1);
                i.putExtra("Extra2",n2);
//send intent

                startActivity(i);
//toast
                Toast toast = Toast.makeText(getApplicationContext(),"You Click on ok",Toast.LENGTH_LONG);
                toast.setGravity(Gravity.TOP|Gravity.CENTER, 0,0);
                toast.show();

            }
        });
    }
}


