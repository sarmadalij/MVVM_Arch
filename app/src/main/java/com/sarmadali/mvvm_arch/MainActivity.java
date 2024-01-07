package com.sarmadali.mvvm_arch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    MainViewModel viewModel;
    TextView textView;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);
        textView = findViewById(R.id.textView);
        setText();
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increase(textView);
            }
        });

    }

    //set text
    private void setText(){
        textView.setText(String.valueOf(viewModel.count));
    }

    //for button onclick
    private void increase(View v){
        viewModel.increment();
        setText();
    }
}