package com.neeraj.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button b1;
    private Button b2;
    private ConstraintLayout rootLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        rootLayout = findViewById(R.id.rootLayout);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                simpleSnackBar();
            }
        });

    }


    public void simpleSnackBar() {
        Snackbar snackbar = Snackbar.make(rootLayout, "done", Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction("ok", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "clicked", Toast.LENGTH_SHORT).show();
            }
        });
        snackbar.show();
    }
}