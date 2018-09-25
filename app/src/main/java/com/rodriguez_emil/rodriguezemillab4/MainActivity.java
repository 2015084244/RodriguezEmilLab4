package com.rodriguez_emil.rodriguezemillab4;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4ITG", "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4ITG", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4ITG", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4ITG", "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4ITG", "onStop: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4ITG", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4ITG", "onDestroy: ");
    }

    public void showToastie(View v){
        Toast.makeText(this, "BACK button is clicked", Toast.LENGTH_LONG).show();
    }
    public void showSnackie(View v){
        Snackbar.make(v, "NEXT button is clicked", Snackbar.LENGTH_LONG).show();
    }
}
