package com.example.czaszycia;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int licznik = 0;
    TextView licznikTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("CzasZycia", "wywolana metoda onCreate");
        setContentView(R.layout.activity_main);
        licznikTextView = findViewById(R.id.licznikTextView);
        if(savedInstanceState != null){
            licznik = savedInstanceState.getInt("Licznik", 0);
        }
    }

    public void zwieksz(View view){
        licznik= licznik + 1;
        licznikTextView.setText(String.valueOf(licznik));
    }

    public void zmniejsz(View view){
        licznik= licznik - 1;
        licznikTextView.setText(String.valueOf(licznik));

    }
    protected void onStart(){
        super.onStart();
        Log.i("CzasZycia","Wywolana meteda onStart");
    }
    protected void onResume(){
        super.onResume();
        Log.i("CzasZycia","Wywolana meteda onResume");
    }
    protected void onPause(){
        super.onPause();
        Log.i("CzasZycia","Wywolana meteda onPause");
    }
    protected void onStop(){
        super.onStop();
        Log.i("CzasZycia","Wywolana meteda onStop");
    }
    protected void onDestroy(){
        super.onDestroy();
        Log.i("CzasZycia","Wywolana meteda onDestroy");
    }
    protected void onSaveInstanceState(@NonNull Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i("CzasZycia", "Wywolana meteda onSaveInstance");
    }
}