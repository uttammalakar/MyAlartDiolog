package com.example.myalartdiolog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private AlertDialog.Builder aB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.bexit);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        aB=new AlertDialog.Builder(MainActivity.this);
        //for titel
        aB.setTitle("alart titel");
        //for message
        aB.setMessage("do u want to exit");
        //for icon
        aB.setIcon(R.drawable.ic_launcher_foreground);

        // set caancelable
        aB.setCancelable(false);
        // set possitive button
        aB.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        // set negative button
        aB.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                 dialogInterface.cancel();
            }
        });
        //nutral button
        aB.setNeutralButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();

            }
        });
        AlertDialog alertDialog=aB.create();
        alertDialog.show();


    }
}