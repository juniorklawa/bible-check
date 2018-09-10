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

public class aVT extends AppCompatActivity {



    public TextView genesis,exodo,levitico,numeros,deuteronomio,josue,juizes,rute,psamuel,ssamauel,preis,sreis,pcronicas,scronicas,esdras,neemias,ester,jo,salmos,proverbios,
            eclesiastes,cantares,isaias,jeremias,lamentacoesdejeremias,ezequiel,daniel,oseias,joel,amos,obadias,jonas,miqueias,naum,habacuque,sofonias,ageu,zacarias,malaquias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_vt);

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        genesis = (TextView) findViewById(R.id.genesis);
        exodo = (TextView) findViewById(R.id.exodo);
        levitico = (TextView) findViewById(R.id.levitico);
        numeros = (TextView) findViewById(R.id.numeros);
        deuteronomio = (TextView) findViewById(R.id.deuteronomio);
        josue = (TextView) findViewById(R.id.josue);
        juizes = (TextView) findViewById(R.id.juizes);
        rute = (TextView) findViewById(R.id.rute);
        psamuel = (TextView) findViewById(R.id.psamuel);
        ssamauel = (TextView) findViewById(R.id.ssamuel);
        preis = (TextView) findViewById(R.id.preis);
        sreis = (TextView) findViewById(R.id.sreis);
        pcronicas = (TextView) findViewById(R.id.pcronicas);
        scronicas = (TextView) findViewById(R.id.scronicas);
        esdras = (TextView) findViewById(R.id.esdras);
        neemias = (TextView) findViewById(R.id.neemias);
        ester = (TextView) findViewById(R.id.ester);
        jo = (TextView) findViewById(R.id.jo);
        salmos = (TextView) findViewById(R.id.salmos);
        proverbios = (TextView) findViewById(R.id.proverbios);
        eclesiastes = (TextView) findViewById(R.id.eclesiastes);
        cantares = (TextView) findViewById(R.id.canticodoscanticos);
        isaias = (TextView) findViewById(R.id.isaias);
        jeremias = (TextView) findViewById(R.id.jeremias);
        lamentacoesdejeremias = (TextView) findViewById(R.id.lamentacoesdejeremias);
        ezequiel = (TextView) findViewById(R.id.ezequiel);
        daniel = (TextView) findViewById(R.id.daniel);
        oseias = (TextView) findViewById(R.id.oseias);
        joel = (TextView) findViewById(R.id.joel);
        amos = (TextView) findViewById(R.id.amos);
        obadias = (TextView) findViewById(R.id.obadias);
        jonas = (TextView) findViewById(R.id.jonas);
        miqueias = (TextView) findViewById(R.id.miqueias);
        naum = (TextView) findViewById(R.id.naum);
        habacuque = (TextView) findViewById(R.id.habacuque);
        sofonias = (TextView) findViewById(R.id.sofonias);
        ageu = (TextView) findViewById(R.id.ageu);
        zacarias = (TextView) findViewById(R.id.zacarias);
        malaquias = (TextView) findViewById(R.id.malaquias);
        carregarCapitulos();




        genesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtGenesis.class));
                //Toast.makeText(aNT.this,String.valueOf(ntMateus.capitulosLidos),Toast.LENGTH_SHORT).show();

            }
        });

        exodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Toast.makeText(aNT.this,String.valueOf(ntMateus.capitulosLidos),Toast.LENGTH_SHORT).show();
                startActivity(new Intent(aVT.this,vtExodo.class));
            }
        });

        levitico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtLevitico.class));
            }
        });
        numeros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtNumeros.class));
            }
        });
        deuteronomio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtDeuteronomio.class));
            }
        });
        josue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJosue.class));
            }
        });
        juizes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJuizes.class));
            }
        });
        rute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtRute.class));
            }
        });
        psamuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtPSamuel.class));
            }
        });
        ssamauel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtSSamuel.class));
            }
        });
        preis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtPReis.class));
            }
        });
        sreis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtSReis.class));
            }
        });
        pcronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtPCronicas.class));
            }
        });
        scronicas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtSCronicas.class));
            }
        });
        esdras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtEsdras.class));
            }
        });
        neemias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtNeemias.class));
            }
        });
        ester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtEster.class));
            }
        });
        salmos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtSalmos.class));
            }
        });
        proverbios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtProverbios.class));
            }
        });
        proverbios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtProverbios.class));
            }
        });
        eclesiastes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtEclesiastes.class));
            }
        });
        cantares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtCanticoDosCanticos.class));
            }
        });
        isaias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtIsaias.class));
            }
        });
        jeremias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJeremias.class));
            }
        });
        lamentacoesdejeremias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtLamentacoesDeJeremias.class));
            }
        });
        ezequiel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtEzequiel.class));
            }
        });
        daniel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtDaniel.class));
            }
        });
        oseias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtOseias.class));
            }
        });
        joel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJoel.class));
            }
        });
        amos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtAmos.class));
            }
        });
        obadias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtObadias.class));
            }
        });
        jonas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJonas.class));
            }
        });
        miqueias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtMiqueias.class));
            }
        });
        naum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtNaum.class));
            }
        });
        habacuque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtHabacuque.class));
            }
        });
        sofonias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtSofonias.class));
            }
        });
        ageu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtAgeu.class));
            }
        });
        zacarias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtZacarias.class));
            }
        });
        malaquias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtMalaquias.class));
            }
        });
        jo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(aVT.this,vtJo.class));
            }
        });






        // checaStatus();

        //Start Activity





    }

    @Override
    protected void onResume() {
        super.onResume();
        checaStatus();


    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);

        vtGenesis.capitulosLidos = preferences.getFloat("CapGenesis", vtGenesis.capitulosLidos);
        vtExodo.capitulosLidos = preferences.getFloat("CapExodo", vtExodo.capitulosLidos);
        vtLevitico.capitulosLidos = preferences.getFloat("CapLevitico", vtLevitico.capitulosLidos);
        vtNumeros.capitulosLidos = preferences.getFloat("CapNumeros", vtNumeros.capitulosLidos);
        vtDeuteronomio.capitulosLidos = preferences.getFloat("CapDeuteronomio", vtDeuteronomio.capitulosLidos);
        vtJosue.capitulosLidos = preferences.getFloat("CapJosue", vtJosue.capitulosLidos);
        vtJuizes.capitulosLidos = preferences.getFloat("CapJuizes", vtJuizes.capitulosLidos);
        vtRute.capitulosLidos = preferences.getFloat("CapRute", vtRute.capitulosLidos);
        vtPSamuel.capitulosLidos = preferences.getFloat("CapPSamuel", vtPSamuel.capitulosLidos);
        vtSSamuel.capitulosLidos = preferences.getFloat("CapSSamuel", vtSSamuel.capitulosLidos);
        vtPReis.capitulosLidos = preferences.getFloat("CapPReis", vtPReis.capitulosLidos);
        vtSReis.capitulosLidos = preferences.getFloat("CapSReis", vtSReis.capitulosLidos);
        vtPCronicas.capitulosLidos = preferences.getFloat("CapPCronicas", vtPCronicas.capitulosLidos);
        vtSCronicas.capitulosLidos = preferences.getFloat("CapSCronicas", vtSCronicas.capitulosLidos);
        vtEsdras.capitulosLidos = preferences.getFloat("CapEsdras", vtEsdras.capitulosLidos);
        vtNeemias.capitulosLidos = preferences.getFloat("CapNeemias", vtNeemias.capitulosLidos);
        vtEster.capitulosLidos = preferences.getFloat("CapEster", vtEster.capitulosLidos);
        vtJo.capitulosLidos = preferences.getFloat("CapJo", vtJo.capitulosLidos);
        vtSalmos.capitulosLidos = preferences.getFloat("CapSalmos", vtSalmos.capitulosLidos);
        vtProverbios.capitulosLidos = preferences.getFloat("CapProverbios", vtProverbios.capitulosLidos);
        vtEclesiastes.capitulosLidos = preferences.getFloat("CapEclesiastes", vtEclesiastes.capitulosLidos);
        vtCanticoDosCanticos.capitulosLidos = preferences.getFloat("CapCantares", vtCanticoDosCanticos.capitulosLidos);
        vtIsaias.capitulosLidos = preferences.getFloat("CapIsaias", vtIsaias.capitulosLidos);
        vtJeremias.capitulosLidos = preferences.getFloat("CapJeremias", vtJeremias.capitulosLidos);
        vtLamentacoesDeJeremias.capitulosLidos = preferences.getFloat("CapLamentacoesDeJeremias", vtLamentacoesDeJeremias.capitulosLidos);
        vtEzequiel.capitulosLidos = preferences.getFloat("CapEzequiel", vtEzequiel.capitulosLidos);
        vtDaniel.capitulosLidos = preferences.getFloat("CapDaniel", vtDaniel.capitulosLidos);
        vtOseias.capitulosLidos = preferences.getFloat("CapOseias", vtOseias.capitulosLidos);
        vtJoel.capitulosLidos = preferences.getFloat("CapJoel", vtJoel.capitulosLidos);
        vtAmos.capitulosLidos = preferences.getFloat("CapAmos", vtAmos.capitulosLidos);
        vtObadias.capitulosLidos = preferences.getFloat("CapObadias", vtObadias.capitulosLidos);
        vtJonas.capitulosLidos = preferences.getFloat("CapJonas", vtJonas.capitulosLidos);
        vtMiqueias.capitulosLidos = preferences.getFloat("CapMiqueias", vtMiqueias.capitulosLidos);
        vtNaum.capitulosLidos = preferences.getFloat("CapNaum", vtNaum.capitulosLidos);
        vtHabacuque.capitulosLidos = preferences.getFloat("CapHabacuque", vtHabacuque.capitulosLidos);
        vtSofonias.capitulosLidos = preferences.getFloat("CapSofonias", vtSofonias.capitulosLidos);
        vtAgeu.capitulosLidos = preferences.getFloat("CapAgeu", vtAgeu.capitulosLidos);
        vtZacarias.capitulosLidos = preferences.getFloat("CapZacarias", vtZacarias.capitulosLidos);
        vtMalaquias.capitulosLidos = preferences.getFloat("CapMalaquias", vtMalaquias.capitulosLidos);


    }


    public void checaStatus () {

        if (vtGenesis.capitulosLidos == 50f) {

            genesis.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            genesis.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtExodo.capitulosLidos == 40f) {

            exodo.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            exodo.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtLevitico.capitulosLidos == 27f) {

            levitico.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            levitico.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtNumeros.capitulosLidos == 36f) {

            numeros.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            numeros.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtDeuteronomio.capitulosLidos == 34f) {

            deuteronomio.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            deuteronomio.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtJosue.capitulosLidos == 24f) {

            josue.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            josue.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtJuizes.capitulosLidos == 21f) {

            juizes.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            juizes.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtRute.capitulosLidos == 4f) {

            rute.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            rute.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtPSamuel.capitulosLidos == 31f) {

            psamuel.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            psamuel.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtSSamuel.capitulosLidos == 24f) {

            ssamauel.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            ssamauel.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtPReis.capitulosLidos == 22f) {

            preis.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            preis.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtSReis.capitulosLidos == 25f) {

            sreis.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            sreis.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtPCronicas.capitulosLidos == 29f) {

            pcronicas.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            pcronicas.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtSCronicas.capitulosLidos == 36f) {

            scronicas.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            scronicas.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtEsdras.capitulosLidos == 10f) {

            esdras.setBackgroundColor(Color.parseColor("#A5D6A7"));

        }

        else {
            esdras.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtNeemias.capitulosLidos == 13f) {

            neemias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            neemias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtEster.capitulosLidos == 10f) {

            ester.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            ester.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtJo.capitulosLidos == 42f) {

            jo.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            jo.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtSalmos.capitulosLidos == 150f) {

            salmos.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            salmos.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtProverbios.capitulosLidos == 31f) {

            proverbios.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            proverbios.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtEclesiastes.capitulosLidos == 12f) {

            eclesiastes.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            eclesiastes.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtCanticoDosCanticos.capitulosLidos == 8f) {

            cantares.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            cantares.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (vtIsaias.capitulosLidos == 66f) {

            isaias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            isaias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (vtJeremias.capitulosLidos == 52f) {

            jeremias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            jeremias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (vtLamentacoesDeJeremias.capitulosLidos == 5f) {

            lamentacoesdejeremias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            lamentacoesdejeremias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (vtEzequiel.capitulosLidos == 48f) {

            ezequiel.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            ezequiel.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtDaniel.capitulosLidos == 12f) {

            daniel.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            daniel.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        if (vtOseias.capitulosLidos == 14f) {

            oseias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            oseias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtJoel.capitulosLidos == 3f) {

            joel.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            joel.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtAmos.capitulosLidos == 9f) {

            amos.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            amos.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtObadias.capitulosLidos == 1f) {

            obadias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            obadias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtJonas.capitulosLidos == 4f) {

            jonas.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            jonas.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtMiqueias.capitulosLidos == 7f) {

            miqueias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            miqueias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtNaum.capitulosLidos == 3f) {

            naum.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            naum.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtHabacuque.capitulosLidos == 3f) {

            habacuque.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            habacuque.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtSofonias.capitulosLidos == 3f) {

            sofonias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            sofonias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtAgeu.capitulosLidos == 2f) {

            ageu.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            ageu.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtZacarias.capitulosLidos == 14f) {

            zacarias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            zacarias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }

        if (vtMalaquias.capitulosLidos == 4f) {

            malaquias.setBackgroundColor(Color.parseColor("#A5D6A7"));
        }
        else {
            malaquias.setBackgroundColor(Color.parseColor("#FFFFFF"));
        }






    }




}


