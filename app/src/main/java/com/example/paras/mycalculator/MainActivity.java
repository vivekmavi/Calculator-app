package com.example.paras.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn4,btn7,btndot ;
    EditText edt1;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn4 = (Button) findViewById(R.id.btn4);
        btn7 = (Button) findViewById(R.id.btn7);
        btndot = (Button) findViewById(R.id.btndot);

        btn1.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btndot.setOnClickListener(this);


        edt1 = (EditText) findViewById(R.id.edit1);
    }

    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.btn1)
        {   text = edt1.getText().toString();
            edt1.setText(text+"1");
            Toast.makeText(this, "1pressed", Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.btn4)
        {   text = edt1.getText().toString();
            edt1.setText(text+"4");
            Toast.makeText(this, "4pressed", Toast.LENGTH_SHORT).show();
        }
        if(view.getId()==R.id.btn7)
        {   text = edt1.getText().toString();
            edt1.setText(text+"7");
        }
        if(view.getId()==R.id.btndot)
        {   text = edt1.getText().toString();
            edt1.setText(text+".");
        }
    }
}
