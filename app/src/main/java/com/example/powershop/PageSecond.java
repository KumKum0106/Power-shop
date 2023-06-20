package com.example.powershop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PageSecond extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_second);
        Button btn = (Button)findViewById(R.id.button3);
        EditText email = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText pass = (EditText)findViewById(R.id.editTextPassword);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().isEmpty() || pass.getText().toString().isEmpty()){
                    Toast.makeText(PageSecond.this, "Enter the data", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(PageSecond.this, "Email - " +email.getText().toString() + "\n" + "Password - " +pass.getText().toString(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}