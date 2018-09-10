package com.klawapps.bibliaprogresso;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class aNT extends AppCompatActivity {



    public TextView mateusid, marcosid,lucasid,joaoid,atosid,romanosid,pcorintios,scorintios,galatas,efesios,filipenses,colossenses,ptessalonicenses,
                    stessalonicenses,ptimotio,stimotio,tito,filemom,hebreus,tiago,ppedro,spedro,pjoao,sjoao,tjoao,judas,apocalipse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        carregarCapitulos();

        mateusid = (TextView) findViewById(R.id.mateusid);
        atosid = (TextView) findViewById(R.id.atosid);
        marcosid = (TextView) findViewById(R.id.marcosid);
        lucasid = (TextView) findViewById(R.id.lucasid);
        joaoid = (TextView) findViewById(R.id.joao);
        romanosid = (TextView) findViewById(R.id.romanosid);
        pcorintios = (TextView) findViewById(R.id.primeiracorintios);
        scorintios = (TextView) findViewById(R.id.segundacorintios);
        galatas = (TextView) findViewById(R.id.galatas);
        efesios = (TextView) findViewById(R.id.efesios);
        filipenses = (TextView) findViewById(R.id.filipenses);
        colossenses = (TextView) findViewById(R.id.colossenses);
        ptessalonicenses = (TextView) findViewById(R.id.primeiratessalonicenses);
        stessalonicenses = (TextView) findViewById(R.id.segundatessalonicenses);
        ptimotio = (TextView) findViewById(R.id.primeiratimotio);
        stimotio = (TextView) findViewById(R.id.segundatimotio);
        tito = (TextView) findViewById(R.id.tito);
        filemom = (TextView) findViewById(R.id.filemon);
        hebreus = (TextView) findViewById(R.id.hebreus);
        tiago = (TextView) findViewById(R.id.tiago);
        ppedro = (TextView) findViewById(R.id.primeirapedro);
        spedro = (TextView) findViewById(R.id.segundapedro);
        pjoao = (TextView) findViewById(R.id.primeirajoao);
        sjoao = (TextView) findViewById(R.id.segundajoao);
        tjoao = (TextView) findViewById(R.id.terceirajoao);
        judas = (TextView) findViewById(R.id.judas);
        apocalipse = (TextView) findViewById(R.id.apocalipse);

        checaStatus();

        //Start Activity

        mateusid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(aNT.this,ntMateus.class));
                //Toast.makeText(aNT.this,String.valueOf(ntMateus.capitulosLidos),Toast.LENGTH_SHORT).show();

            }
        });

        marcosid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(aNT.this,String.valueOf(ntMateus.capitulosLidos),Toast.LENGTH_SHORT).show();
                startActivity(new Intent(aNT.this,ntMarcos.class));
            }
        });

        lucasid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntLucas.class));
            }
        });
        joaoid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntJoao.class));
            }
        });
        atosid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntAtos.class));
            }
        });
        romanosid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntRomanos.class));
            }
        });
        pcorintios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntPrimeiraCorintios.class));
            }
        });
        scorintios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntSegundaCorintios.class));
            }
        });
        galatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntGalatas.class));
            }
        });
        efesios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntEfesios.class));
            }
        });
        filipenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntFilipenses.class));
            }
        });
        colossenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntColossenses.class));
            }
        });
        ptessalonicenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntPrimeiraTessalonicenses.class));
            }
        });
        stessalonicenses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntSegundaTessalonicenses.class));
            }
        });
        ptimotio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntPrimeiraTimotio.class));
            }
        });
        stimotio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntSegundaTimotio.class));
            }
        });
        tito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntTito.class));
            }
        });
        filemom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntFilemom.class));
            }
        });
        hebreus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntHebreus.class));
            }
        });
        tiago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntTiago.class));
            }
        });
        ppedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntPrimeiraPedro.class));
            }
        });
        spedro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntSegundaPedro.class));
            }
        });
        pjoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntPrimeiraJoao.class));
            }
        });
        sjoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntSegundaJoao.class));
            }
        });
        tjoao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntTerceiraJoao.class));
            }
        });
        judas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntJudas.class));
            }
        });
        apocalipse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aNT.this,ntApocalipse.class));
            }
        });




    }

    @Override
    protected void onResume() {
        super.onResume();
        checaStatus();


    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);

        ntMateus.capitulosLidos = preferences.getFloat("CapMateusF", ntMateus.capitulosLidos);
        ntMarcos.capitulosLidos = preferences.getFloat("CapMarcosF", ntMarcos.capitulosLidos);
        ntLucas.capitulosLidos = preferences.getFloat("CapLucasF", ntLucas.capitulosLidos);
        ntJoao.capitulosLidos = preferences.getFloat("CapJoaoF", ntJoao.capitulosLidos);
        ntAtos.capitulosLidos = preferences.getFloat("CapAtosF", ntAtos.capitulosLidos);
        ntRomanos.capitulosLidos = preferences.getFloat("CapRomanosF", ntRomanos.capitulosLidos);
        ntPrimeiraCorintios.capitulosLidos = preferences.getFloat("CapPCorintios", ntPrimeiraCorintios.capitulosLidos);
        ntSegundaCorintios.capitulosLidos = preferences.getFloat("CapSCorintios", ntSegundaCorintios.capitulosLidos);
        ntGalatas.capitulosLidos = preferences.getFloat("CapGalatas", ntGalatas.capitulosLidos);
        ntEfesios.capitulosLidos = preferences.getFloat("CapEfesios", ntEfesios.capitulosLidos);
        ntFilipenses.capitulosLidos = preferences.getFloat("CapFilipenses", ntFilipenses.capitulosLidos);
        ntColossenses.capitulosLidos = preferences.getFloat("CapColossenses", ntColossenses.capitulosLidos);
        ntPrimeiraTessalonicenses.capitulosLidos = preferences.getFloat("CapPTessalonicenses", ntPrimeiraCorintios.capitulosLidos);
        ntSegundaTessalonicenses.capitulosLidos = preferences.getFloat("CapSTessalonicenses", ntSegundaTessalonicenses.capitulosLidos);
        ntPrimeiraTimotio.capitulosLidos = preferences.getFloat("CapPTimotio", ntPrimeiraTimotio.capitulosLidos);
        ntSegundaTimotio.capitulosLidos = preferences.getFloat("CapSTimotio", ntSegundaTimotio.capitulosLidos);
        ntTito.capitulosLidos = preferences.getFloat("CapTito", ntTito.capitulosLidos);
        ntFilemom.capitulosLidos = preferences.getFloat("CapFilemom", ntFilemom.capitulosLidos);
        ntHebreus.capitulosLidos = preferences.getFloat("CapHebreus", ntHebreus.capitulosLidos);
        ntTiago.capitulosLidos = preferences.getFloat("CapTiago", ntTiago.capitulosLidos);
        ntPrimeiraPedro.capitulosLidos = preferences.getFloat("CapPedro", ntPrimeiraPedro.capitulosLidos);
        ntSegundaPedro.capitulosLidos = preferences.getFloat("CapSPedro", ntSegundaPedro.capitulosLidos);
        ntPrimeiraJoao.capitulosLidos = preferences.getFloat("CapPJoao", ntPrimeiraJoao.capitulosLidos);
        ntSegundaJoao.capitulosLidos = preferences.getFloat("CapSegundaJoao", ntSegundaJoao.capitulosLidos);
        ntTerceiraJoao.capitulosLidos = preferences.getFloat("CapTSegundaJoao", ntTerceiraJoao.capitulosLidos);
        ntJudas.capitulosLidos = preferences.getFloat("CapJudas", ntJudas.capitulosLidos);
        ntApocalipse.capitulosLidos = preferences.getFloat("CapApocalipse", ntApocalipse.capitulosLidos);


    }

    public void checaStatus () {

        if (ntMateus.capitulosLidos == 28f) {

            mateusid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            mateusid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntMarcos.capitulosLidos == 16f) {

            marcosid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            marcosid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntLucas.capitulosLidos == 24f) {

            lucasid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            lucasid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntJoao.capitulosLidos == 21f) {

            joaoid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            joaoid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntAtos.capitulosLidos == 28f) {

            atosid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            atosid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntRomanos.capitulosLidos == 16f) {

            romanosid.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            romanosid.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntPrimeiraCorintios.capitulosLidos == 16f) {

            pcorintios.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            pcorintios.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntSegundaCorintios.capitulosLidos == 13f) {

            scorintios.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            scorintios.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntGalatas.capitulosLidos == 6f) {

            galatas.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            galatas.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntEfesios.capitulosLidos == 6f) {

            efesios.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            efesios.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntFilipenses.capitulosLidos == 4f) {

            filipenses.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            filipenses.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntColossenses.capitulosLidos == 4f) {

            colossenses.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            colossenses.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntPrimeiraTessalonicenses.capitulosLidos == 5f) {

            ptessalonicenses.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            ptessalonicenses.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntSegundaTessalonicenses.capitulosLidos == 3f) {

            stessalonicenses.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            stessalonicenses.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntPrimeiraTimotio.capitulosLidos == 6f) {

            ptimotio.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            ptimotio.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntSegundaTimotio.capitulosLidos == 4f) {

            stimotio.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            stimotio.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntTito.capitulosLidos == 3f) {

            tito.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            tito.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntFilemom.capitulosLidos == 1f) {

            filemom.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            filemom.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntHebreus.capitulosLidos == 13f) {

            hebreus.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            hebreus.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntTiago.capitulosLidos == 5f) {

            tiago.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            tiago.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntPrimeiraPedro.capitulosLidos == 5f) {

            ppedro.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            ppedro.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntSegundaPedro.capitulosLidos == 3f) {

            spedro.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            spedro.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (ntPrimeiraJoao.capitulosLidos == 5f) {

            pjoao.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            pjoao.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (ntSegundaJoao.capitulosLidos == 1f) {

            sjoao.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            sjoao.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (ntTerceiraJoao.capitulosLidos == 1f) {

            tjoao.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            tjoao.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (ntJudas.capitulosLidos == 1f) {

            judas.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            judas.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (ntApocalipse.capitulosLidos == 22f) {

            apocalipse.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            apocalipse.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }





    }


}