package com.sarmadali.mvvm_arch;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    TextView textView;
    Button addition;
    Button subtraction;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        textView = findViewById(R.id.textView);
        setText();

        addition = findViewById(R.id.sum);
        subtraction = findViewById(R.id.subtract);

        addition.setOnClickListener(v -> increase());

        subtraction.setOnClickListener(v -> decrease());

    }

    //set text
    private void setText(){
        textView.setText(String.valueOf(viewModel.count));
    }

    //for button addition onclick
    private void increase(){
        viewModel.increment();
        setText();
    }

    //for button addition onclick
    private void decrease(){
        viewModel.decrement();
        setText();
    }
}