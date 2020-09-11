package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;
    private Button button;
    private int image[] = {R.drawable.facebook,R.drawable.twitter,R.drawable.snapchat,R.drawable.whatsapp,R.drawable.instagram,
            R.drawable.tinder,R.drawable.telegram};
    private  String socialName[];
    private MyAdapter myAdapter;
    private String inventor[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        socialName = getResources().getStringArray(R.array.socialAppName);
        inventor = getResources().getStringArray(R.array.inventor);
        myAdapter = new MyAdapter(MainActivity.this, image,socialName, inventor);

        spinner = findViewById(R.id.spinnerId);
        textView = findViewById(R.id.textviewId);
        button = findViewById(R.id.buttonId);

        spinner.setAdapter(myAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText(socialName[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = textView.getText().toString();
                Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("socialName",name);
                startActivity(intent);
            }
        });

    }
}