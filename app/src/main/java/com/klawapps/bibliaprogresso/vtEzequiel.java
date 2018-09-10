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

public class vtEzequiel extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 48f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_ezequiel);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,
                cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45,cb46,cb47,cb48;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("ezequiel1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("ezequiel2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("ezequiel3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("ezequiel4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("ezequiel5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("ezequiel6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("ezequiel7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("ezequiel8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("ezequiel9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("ezequiel10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("ezequiel11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("ezequiel12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("ezequiel13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("ezequiel14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("ezequiel15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("ezequiel16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("ezequiel17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("ezequiel18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("ezequiel19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("ezequiel20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("ezequiel21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("ezequiel22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("ezequiel23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("ezequiel24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("ezequiel25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("ezequiel26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("ezequiel27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("ezequiel28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("ezequiel29"));
        cb29.setOnCheckedChangeListener(this);

        cb30 = (CheckBox)findViewById(R.id.checkBox30);
        cb30.setChecked(getFromSP("ezequiel30"));
        cb30.setOnCheckedChangeListener(this);

        cb31 = (CheckBox)findViewById(R.id.checkBox31);
        cb31.setChecked(getFromSP("ezequiel31"));
        cb31.setOnCheckedChangeListener(this);

        cb32 = (CheckBox)findViewById(R.id.checkBox32);
        cb32.setChecked(getFromSP("ezequiel32"));
        cb32.setOnCheckedChangeListener(this);

        cb33 = (CheckBox)findViewById(R.id.checkBox33);
        cb33.setChecked(getFromSP("ezequiel33"));
        cb33.setOnCheckedChangeListener(this);

        cb34 = (CheckBox)findViewById(R.id.checkBox34);
        cb34.setChecked(getFromSP("ezequiel34"));
        cb34.setOnCheckedChangeListener(this);

        cb35 = (CheckBox)findViewById(R.id.checkBox35);
        cb35.setChecked(getFromSP("ezequiel35"));
        cb35.setOnCheckedChangeListener(this);

        cb36 = (CheckBox)findViewById(R.id.checkBox36);
        cb36.setChecked(getFromSP("ezequiel36"));
        cb36.setOnCheckedChangeListener(this);

        cb37 = (CheckBox)findViewById(R.id.checkBox37);
        cb37.setChecked(getFromSP("ezequiel37"));
        cb37.setOnCheckedChangeListener(this);

        cb38 = (CheckBox)findViewById(R.id.checkBox38);
        cb38.setChecked(getFromSP("ezequiel38"));
        cb38.setOnCheckedChangeListener(this);

        cb39 = (CheckBox)findViewById(R.id.checkBox39);
        cb39.setChecked(getFromSP("ezequiel39"));
        cb39.setOnCheckedChangeListener(this);

        cb40 = (CheckBox)findViewById(R.id.checkBox40);
        cb40.setChecked(getFromSP("ezequiel40"));
        cb40.setOnCheckedChangeListener(this);

        cb41 = (CheckBox)findViewById(R.id.checkBox41);
        cb41.setChecked(getFromSP("ezequiel41"));
        cb41.setOnCheckedChangeListener(this);

        cb42 = (CheckBox)findViewById(R.id.checkBox42);
        cb42.setChecked(getFromSP("ezequiel42"));
        cb42.setOnCheckedChangeListener(this);

        cb43 = (CheckBox)findViewById(R.id.checkBox43);
        cb43.setChecked(getFromSP("ezequiel43"));
        cb43.setOnCheckedChangeListener(this);


        cb44 = (CheckBox)findViewById(R.id.checkBox44);
        cb44.setChecked(getFromSP("ezequiel44"));
        cb44.setOnCheckedChangeListener(this);


        cb45 = (CheckBox)findViewById(R.id.checkBox45);
        cb45.setChecked(getFromSP("ezequiel45"));
        cb45.setOnCheckedChangeListener(this);


        cb46 = (CheckBox)findViewById(R.id.checkBox46);
        cb46.setChecked(getFromSP("ezequiel46"));
        cb46.setOnCheckedChangeListener(this);


        cb47 = (CheckBox)findViewById(R.id.checkBox47);
        cb47.setChecked(getFromSP("ezequiel47"));
        cb47.setOnCheckedChangeListener(this);


        cb48 = (CheckBox)findViewById(R.id.checkBox48);
        cb48.setChecked(getFromSP("ezequiel48"));
        cb48.setOnCheckedChangeListener(this);



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
                saveInSp("ezequiel1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("ezequiel2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("ezequiel3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("ezequiel4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("ezequiel5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("ezequiel6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("ezequiel7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("ezequiel8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("ezequiel9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("ezequiel10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("ezequiel11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("ezequiel12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("ezequiel13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("ezequiel14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("ezequiel15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("ezequiel16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("ezequiel17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("ezequiel18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("ezequiel19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("ezequiel20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("ezequiel21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("ezequiel22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("ezequiel23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("ezequiel24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("ezequiel25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("ezequiel26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("ezequiel27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("ezequiel28",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox29:
                saveInSp("ezequiel29",isChecked);
                break;
            case R.id.checkBox30:
                saveInSp("ezequiel30",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox31:
                saveInSp("ezequiel31",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox32:
                saveInSp("ezequiel32",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox33:
                saveInSp("ezequiel33",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox34:
                saveInSp("ezequiel34",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox35:
                saveInSp("ezequiel35",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox36:
                saveInSp("ezequiel36",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox37:
                saveInSp("ezequiel37",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox38:
                saveInSp("ezequiel38",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox39:
                saveInSp("ezequiel39",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox40:
                saveInSp("ezequiel40",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox41:
                saveInSp("ezequiel41",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox42:
                saveInSp("ezequiel42",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox43:
                saveInSp("ezequiel43",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox44:
                saveInSp("ezequiel44",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox45:
                saveInSp("ezequiel45",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox46:
                saveInSp("ezequiel46",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox47:
                saveInSp("ezequiel47",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox48:
                saveInSp("ezequiel48",isChecked);
                //text.setText(capitulosLidos);
                break;


        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapEzequiel",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapEzequiel", capitulosLidos);


    }

}
