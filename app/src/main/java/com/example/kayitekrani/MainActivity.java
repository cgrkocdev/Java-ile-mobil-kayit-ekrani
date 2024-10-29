package com.example.kayitekrani;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener , TextView.OnEditorActionListener  {
    Button bKayit;
    TextView tv;
    EditText et;
     String isim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bKayit=findViewById(R.id.buttonKayit);
        bKayit.setOnClickListener(this);
        tv = findViewById(R.id.textViewMessage);
        et = findViewById(R.id.etName);


    }

    @Override
    public void onClick(View v) {
       isim = et.getText().toString();
       tv.setText("Sn  " + isim + " sisteme kaydınız yapıldı.");
    }

    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
        return false;
    }
}