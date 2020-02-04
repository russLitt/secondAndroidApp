package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.secondapp.MESSAGE";
    DatePicker picker;
    DatePicker picker2;
    Button btnGet;
    TextView tvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the ENTER button */
    public void enterTermInfo(View view) {
        Intent intent = new Intent(this, DisplayTermInfoActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);

        DatePicker datePicker1 = (DatePicker) findViewById(R.id.datePicker1);
        DatePicker datePicker2 = (DatePicker) findViewById(R.id.datePicker2);
        String startDate = datePicker1.toString();
        String endDate = datePicker2.toString();

//        btnGet.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                tvw.setText("Selected Date: "+ picker.getDayOfMonth()+"/"+ (picker.getMonth() + 1)+"/"+picker.getYear());
//                tvw.setText("Selected Date: "+ picker2.getDayOfMonth()+"/"+ (picker2.getMonth() + 1)+"/"+picker2.getYear());
//            }
//        });

        startActivity(intent);



    }
}
