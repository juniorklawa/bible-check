package com.klawapps.bibliaprogresso;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class vtJeremias extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 52f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_jeremias);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox    cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,
                cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45,cb46,cb47,cb48,cb49,
                cb50,cb51,cb52;

        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("jrms1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("jrms2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("jrms3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("jrms4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("jrms5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("jrms6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("jrms7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("jrms8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("jrms9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("jrms10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("jrms11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("jrms12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("jrms13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("jrms14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("jrms15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("jrms16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("jrms17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("jrms18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("jrms19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("jrms20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("jrms21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("jrms22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("jrms23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("jrms24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("jrms25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("jrms26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("jrms27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("jrms28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("jrms29"));
        cb29.setOnCheckedChangeListener(this);

        cb30 = (CheckBox)findViewById(R.id.checkBox30);
        cb30.setChecked(getFromSP("jrms30"));
        cb30.setOnCheckedChangeListener(this);

        cb31 = (CheckBox)findViewById(R.id.checkBox31);
        cb31.setChecked(getFromSP("jrms31"));
        cb31.setOnCheckedChangeListener(this);

        cb32 = (CheckBox)findViewById(R.id.checkBox32);
        cb32.setChecked(getFromSP("jrms32"));
        cb32.setOnCheckedChangeListener(this);

        cb33 = (CheckBox)findViewById(R.id.checkBox33);
        cb33.setChecked(getFromSP("jrms33"));
        cb33.setOnCheckedChangeListener(this);

        cb34 = (CheckBox)findViewById(R.id.checkBox34);
        cb34.setChecked(getFromSP("jrms34"));
        cb34.setOnCheckedChangeListener(this);

        cb35 = (CheckBox)findViewById(R.id.checkBox35);
        cb35.setChecked(getFromSP("jrms35"));
        cb35.setOnCheckedChangeListener(this);

        cb36 = (CheckBox)findViewById(R.id.checkBox36);
        cb36.setChecked(getFromSP("jrms36"));
        cb36.setOnCheckedChangeListener(this);

        cb37 = (CheckBox)findViewById(R.id.checkBox37);
        cb37.setChecked(getFromSP("jrms37"));
        cb37.setOnCheckedChangeListener(this);

        cb38 = (CheckBox)findViewById(R.id.checkBox38);
        cb38.setChecked(getFromSP("jrms38"));
        cb38.setOnCheckedChangeListener(this);

        cb39 = (CheckBox)findViewById(R.id.checkBox39);
        cb39.setChecked(getFromSP("jrms39"));
        cb39.setOnCheckedChangeListener(this);

        cb40 = (CheckBox)findViewById(R.id.checkBox40);
        cb40.setChecked(getFromSP("jrms40"));
        cb40.setOnCheckedChangeListener(this);

        cb41 = (CheckBox)findViewById(R.id.checkBox41);
        cb41.setChecked(getFromSP("jrms41"));
        cb41.setOnCheckedChangeListener(this);

        cb42 = (CheckBox)findViewById(R.id.checkBox42);
        cb42.setChecked(getFromSP("jrms42"));
        cb42.setOnCheckedChangeListener(this);

        cb43 = (CheckBox)findViewById(R.id.checkBox43);
        cb43.setChecked(getFromSP("jrms43"));
        cb43.setOnCheckedChangeListener(this);


        cb44 = (CheckBox)findViewById(R.id.checkBox44);
        cb44.setChecked(getFromSP("jrms44"));
        cb44.setOnCheckedChangeListener(this);


        cb45 = (CheckBox)findViewById(R.id.checkBox45);
        cb45.setChecked(getFromSP("jrms45"));
        cb45.setOnCheckedChangeListener(this);


        cb46 = (CheckBox)findViewById(R.id.checkBox46);
        cb46.setChecked(getFromSP("jrms46"));
        cb46.setOnCheckedChangeListener(this);


        cb47 = (CheckBox)findViewById(R.id.checkBox47);
        cb47.setChecked(getFromSP("jrms47"));
        cb47.setOnCheckedChangeListener(this);


        cb48 = (CheckBox)findViewById(R.id.checkBox48);
        cb48.setChecked(getFromSP("jrms48"));
        cb48.setOnCheckedChangeListener(this);


        cb49 = (CheckBox)findViewById(R.id.checkBox49);
        cb49.setChecked(getFromSP("jrms49"));
        cb49.setOnCheckedChangeListener(this);


        cb50 = (CheckBox)findViewById(R.id.checkBox50);
        cb50.setChecked(getFromSP("jrms50"));
        cb50.setOnCheckedChangeListener(this);

        cb51 = (CheckBox)findViewById(R.id.checkBox51);
        cb51.setChecked(getFromSP("jrms51"));
        cb51.setOnCheckedChangeListener(this);

        cb52 = (CheckBox)findViewById(R.id.checkBox52);
        cb52.setChecked(getFromSP("jrms52"));
        cb52.setOnCheckedChangeListener(this);

       


        //textoCap.setText(String.valueOf(capitulosLidos));

        textoProgresso.setText(String.format("%.1f",(capitulosLidos/capitulosLivro)*100)+"%");


    }
    private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("BIBLIA_PROGRESSO", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
    private void saveInSp(String key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("BIBLIA_PROGRESSO", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }
    @Override
    public void onCheckedChanged(CompoundButton buttonView,
                                 boolean isChecked) {



        if (isChecked) {
            capitulosLidos += 1;
        } else if (isChecked == false) {
            if (capitulosLidos > 0) {
                capitulosLidos -= 1;
            }
        }
        salvarCapitulos();
        textoProgresso.setText(String.format("%.1f",(capitulosLidos/capitulosLivro)*100)+"% concluído");


        // TODO Auto-generated method stub
        switch(buttonView.getId()){
            case R.id.checkBox1:
                saveInSp("jrms1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("jrms2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("jrms3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("jrms4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("jrms5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("jrms6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("jrms7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("jrms8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("jrms9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("jrms10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("jrms11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("jrms12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("jrms13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("jrms14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("jrms15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("jrms16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("jrms17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("jrms18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("jrms19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("jrms20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("jrms21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("jrms22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("jrms23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("jrms24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("jrms25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("jrms26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("jrms27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("jrms28",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox29:
                saveInSp("jrms29",isChecked);
                break;
            case R.id.checkBox30:
                saveInSp("jrms30",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox31:
                saveInSp("jrms31",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox32:
                saveInSp("jrms32",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox33:
                saveInSp("jrms33",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox34:
                saveInSp("jrms34",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox35:
                saveInSp("jrms35",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox36:
                saveInSp("jrms36",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox37:
                saveInSp("jrms37",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox38:
                saveInSp("jrms38",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox39:
                saveInSp("jrms39",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox40:
                saveInSp("jrms40",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox41:
                saveInSp("jrms41",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox42:
                saveInSp("jrms42",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox43:
                saveInSp("jrms43",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox44:
                saveInSp("jrms44",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox45:
                saveInSp("jrms45",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox46:
                saveInSp("jrms46",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox47:
                saveInSp("jrms47",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox48:
                saveInSp("jrms48",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox49:
                saveInSp("jrms49",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox50:
                saveInSp("jrms50",isChecked);
                //text.setText(capitulosLidos);
                break;

            //50 - 100

            case R.id.checkBox51:
                saveInSp("jrms51",isChecked);
                break;
            case R.id.checkBox52:
                saveInSp("jrms52",isChecked);
                //text.setText(capitulosLidos);
                break;
     
        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapJeremias",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapJeremias", capitulosLidos);


    }

}
