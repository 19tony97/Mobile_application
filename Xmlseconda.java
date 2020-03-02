package com.example.anton.mobile;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Xmlseconda extends XmlActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seconda);


        Button buttonToccami2 = findViewById(R.id.butToccami2);
        final MediaPlayer so = MediaPlayer.create(this, R.raw.maracas);


        buttonToccami2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                so.start();

            }
        });

        Button buttonIndietro2 = findViewById(R.id.butIndietro2);

        buttonIndietro2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),XmlActivity.class));
            }
        });


    }


}
