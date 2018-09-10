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

public class vtIsaias extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 66f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_isaias);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox    cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,
                cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45,cb46,cb47,cb48,cb49,
                cb50,cb51,cb52,cb53,cb54,cb55,cb56,cb57,cb58,cb59,cb60,cb61,cb62,cb63,cb64,cb65,cb66;


        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("isias1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("isias2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("isias3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("isias4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("isias5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("isias6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("isias7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("isias8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("isias9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("isias10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("isias11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("isias12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("isias13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("isias14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("isias15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("isias16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("isias17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("isias18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("isias19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("isias20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("isias21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("isias22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("isias23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("isias24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("isias25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("isias26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("isias27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("isias28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("isias29"));
        cb29.setOnCheckedChangeListener(this);

        cb30 = (CheckBox)findViewById(R.id.checkBox30);
        cb30.setChecked(getFromSP("isias30"));
        cb30.setOnCheckedChangeListener(this);

        cb31 = (CheckBox)findViewById(R.id.checkBox31);
        cb31.setChecked(getFromSP("isias31"));
        cb31.setOnCheckedChangeListener(this);

        cb32 = (CheckBox)findViewById(R.id.checkBox32);
        cb32.setChecked(getFromSP("isias32"));
        cb32.setOnCheckedChangeListener(this);

        cb33 = (CheckBox)findViewById(R.id.checkBox33);
        cb33.setChecked(getFromSP("isias33"));
        cb33.setOnCheckedChangeListener(this);

        cb34 = (CheckBox)findViewById(R.id.checkBox34);
        cb34.setChecked(getFromSP("isias34"));
        cb34.setOnCheckedChangeListener(this);

        cb35 = (CheckBox)findViewById(R.id.checkBox35);
        cb35.setChecked(getFromSP("isias35"));
        cb35.setOnCheckedChangeListener(this);

        cb36 = (CheckBox)findViewById(R.id.checkBox36);
        cb36.setChecked(getFromSP("isias36"));
        cb36.setOnCheckedChangeListener(this);

        cb37 = (CheckBox)findViewById(R.id.checkBox37);
        cb37.setChecked(getFromSP("isias37"));
        cb37.setOnCheckedChangeListener(this);

        cb38 = (CheckBox)findViewById(R.id.checkBox38);
        cb38.setChecked(getFromSP("isias38"));
        cb38.setOnCheckedChangeListener(this);

        cb39 = (CheckBox)findViewById(R.id.checkBox39);
        cb39.setChecked(getFromSP("isias39"));
        cb39.setOnCheckedChangeListener(this);

        cb40 = (CheckBox)findViewById(R.id.checkBox40);
        cb40.setChecked(getFromSP("isias40"));
        cb40.setOnCheckedChangeListener(this);

        cb41 = (CheckBox)findViewById(R.id.checkBox41);
        cb41.setChecked(getFromSP("isias41"));
        cb41.setOnCheckedChangeListener(this);

        cb42 = (CheckBox)findViewById(R.id.checkBox42);
        cb42.setChecked(getFromSP("isias42"));
        cb42.setOnCheckedChangeListener(this);

        cb43 = (CheckBox)findViewById(R.id.checkBox43);
        cb43.setChecked(getFromSP("isias43"));
        cb43.setOnCheckedChangeListener(this);


        cb44 = (CheckBox)findViewById(R.id.checkBox44);
        cb44.setChecked(getFromSP("isias44"));
        cb44.setOnCheckedChangeListener(this);


        cb45 = (CheckBox)findViewById(R.id.checkBox45);
        cb45.setChecked(getFromSP("isias45"));
        cb45.setOnCheckedChangeListener(this);


        cb46 = (CheckBox)findViewById(R.id.checkBox46);
        cb46.setChecked(getFromSP("isias46"));
        cb46.setOnCheckedChangeListener(this);


        cb47 = (CheckBox)findViewById(R.id.checkBox47);
        cb47.setChecked(getFromSP("isias47"));
        cb47.setOnCheckedChangeListener(this);


        cb48 = (CheckBox)findViewById(R.id.checkBox48);
        cb48.setChecked(getFromSP("isias48"));
        cb48.setOnCheckedChangeListener(this);


        cb49 = (CheckBox)findViewById(R.id.checkBox49);
        cb49.setChecked(getFromSP("isias49"));
        cb49.setOnCheckedChangeListener(this);


        cb50 = (CheckBox)findViewById(R.id.checkBox50);
        cb50.setChecked(getFromSP("isias50"));
        cb50.setOnCheckedChangeListener(this);

        cb51 = (CheckBox)findViewById(R.id.checkBox51);
        cb51.setChecked(getFromSP("isias51"));
        cb51.setOnCheckedChangeListener(this);

        cb52 = (CheckBox)findViewById(R.id.checkBox52);
        cb52.setChecked(getFromSP("isias52"));
        cb52.setOnCheckedChangeListener(this);

        cb53 = (CheckBox)findViewById(R.id.checkBox53);
        cb53.setChecked(getFromSP("isias53"));
        cb53.setOnCheckedChangeListener(this);

        cb54 = (CheckBox)findViewById(R.id.checkBox54);
        cb54.setChecked(getFromSP("isias54"));
        cb54.setOnCheckedChangeListener(this);

        cb55 = (CheckBox)findViewById(R.id.checkBox55);
        cb55.setChecked(getFromSP("isias55"));
        cb55.setOnCheckedChangeListener(this);

        cb56 = (CheckBox)findViewById(R.id.checkBox56);
        cb56.setChecked(getFromSP("isias6"));
        cb56.setOnCheckedChangeListener(this);

        cb57 = (CheckBox)findViewById(R.id.checkBox57);
        cb57.setChecked(getFromSP("isias57"));
        cb57.setOnCheckedChangeListener(this);

        cb58 = (CheckBox)findViewById(R.id.checkBox58);
        cb58.setChecked(getFromSP("isias58"));
        cb58.setOnCheckedChangeListener(this);

        cb59 = (CheckBox)findViewById(R.id.checkBox59);
        cb59.setChecked(getFromSP("isias59"));
        cb59.setOnCheckedChangeListener(this);

        cb60 = (CheckBox)findViewById(R.id.checkBox60);
        cb60.setChecked(getFromSP("isias60"));
        cb60.setOnCheckedChangeListener(this);

        cb61 = (CheckBox)findViewById(R.id.checkBox61);
        cb61.setChecked(getFromSP("isias61"));
        cb61.setOnCheckedChangeListener(this);

        cb62 = (CheckBox)findViewById(R.id.checkBox62);
        cb62.setChecked(getFromSP("isias62"));
        cb62.setOnCheckedChangeListener(this);

        cb63 = (CheckBox)findViewById(R.id.checkBox63);
        cb63.setChecked(getFromSP("isias63"));
        cb63.setOnCheckedChangeListener(this);

        cb64 = (CheckBox)findViewById(R.id.checkBox64);
        cb64.setChecked(getFromSP("isias64"));
        cb64.setOnCheckedChangeListener(this);

        cb65 = (CheckBox)findViewById(R.id.checkBox65);
        cb65.setChecked(getFromSP("isias65"));
        cb65.setOnCheckedChangeListener(this);

        cb66 = (CheckBox)findViewById(R.id.checkBox66);
        cb66.setChecked(getFromSP("isias66"));
        cb66.setOnCheckedChangeListener(this);

      

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
                saveInSp("isias1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("isias2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("isias3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("isias4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("isias5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("isias6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("isias7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("isias8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("isias9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("isias10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("isias11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("isias12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("isias13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("isias14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("isias15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("isias16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("isias17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("isias18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("isias19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("isias20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("isias21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("isias22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("isias23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("isias24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("isias25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("isias26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("isias27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("isias28",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox29:
                saveInSp("isias29",isChecked);
                break;
            case R.id.checkBox30:
                saveInSp("isias30",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox31:
                saveInSp("isias31",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox32:
                saveInSp("isias32",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox33:
                saveInSp("isias33",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox34:
                saveInSp("isias34",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox35:
                saveInSp("isias35",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox36:
                saveInSp("isias36",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox37:
                saveInSp("isias37",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox38:
                saveInSp("isias38",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox39:
                saveInSp("isias39",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox40:
                saveInSp("isias40",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox41:
                saveInSp("isias41",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox42:
                saveInSp("isias42",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox43:
                saveInSp("isias43",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox44:
                saveInSp("isias44",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox45:
                saveInSp("isias45",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox46:
                saveInSp("isias46",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox47:
                saveInSp("isias47",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox48:
                saveInSp("isias48",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox49:
                saveInSp("isias49",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox50:
                saveInSp("isias50",isChecked);
                //text.setText(capitulosLidos);
                break;

            //50 - 100

            case R.id.checkBox51:
                saveInSp("isias51",isChecked);
                break;
            case R.id.checkBox52:
                saveInSp("isias52",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox53:
                saveInSp("isias53",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox54:
                saveInSp("isias54",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox55:
                saveInSp("isias55",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox56:
                saveInSp("isias56",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox57:
                saveInSp("isias57",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox58:
                saveInSp("isias58",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox59:
                saveInSp("isias59",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox60:
                saveInSp("isias60",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox61:
                saveInSp("isias61",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox62:
                saveInSp("isias62",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox63:
                saveInSp("isias63",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox64:
                saveInSp("isias64",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox65:
                saveInSp("isias65",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox66:
                saveInSp("isias66",isChecked);
                //text.setText(capitulosLidos);
                break;
         
        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapIsaias",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapIsaias", capitulosLidos);


    }

}
