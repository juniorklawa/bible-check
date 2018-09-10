package com.klawapps.bibliaprogresso;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import org.w3c.dom.Text;

public class aCena extends AppCompatActivity {

    public CardView vt;
    public CardView nt;
    public String traducao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_cena);


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);








        final SharedPreferences prefs= PreferenceManager.getDefaultSharedPreferences(this);


        if(!prefs.contains("firstTime")){


            final AlertDialog.Builder builder = new AlertDialog.Builder(aCena.this);
            builder.setMessage(R.string.traducao);

            AlertDialog alertDialog = builder.create();
            alertDialog.show();


            //Other dialog code


            SharedPreferences.Editor editor = prefs.edit();
            editor.putBoolean("firstTime",true);
            editor.commit();
            //more code....

        }







        nt = (CardView) findViewById(R.id.novotestamento);
        vt = (CardView) findViewById(R.id.velhotestamentoid);


        nt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aCena.this,aNT.class));

            }
        });

        vt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aCena.this,aVT.class));

            }
        });
    }
}
