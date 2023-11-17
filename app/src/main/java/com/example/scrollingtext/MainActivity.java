package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean editable = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText articleEditText = findViewById(R.id.article);
        Button button = findViewById(R.id.edit_button);

        button.setOnClickListener(v -> changeEditable(articleEditText, button));

        };


    private void changeEditable(EditText articleEditText, Button button){
        if(editable){
            button.setText("ADD COMMENT");
            articleEditText.setEnabled(false);
            articleEditText.setFocusable(false);
            articleEditText.setFocusableInTouchMode(false);
            editable = !editable;
        }else{
            button.setText("GUARDAR");
            articleEditText.setEnabled(true);
            articleEditText.setFocusable(true);
            articleEditText.setFocusableInTouchMode(true);
            editable = !editable;
        }
    }

}

