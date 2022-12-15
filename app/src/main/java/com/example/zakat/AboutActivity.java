package com.example.zakat;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        textView = findViewById(R.id.textView13);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}