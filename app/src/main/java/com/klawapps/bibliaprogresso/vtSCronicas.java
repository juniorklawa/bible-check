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

public class vtSCronicas extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 36f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_scronicas);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;


        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,
                cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36;


        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("scrnc1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("scrnc2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("scrnc3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("scrnc4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("scrnc5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("scrnc6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("scrnc7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("scrnc8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("scrnc9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("scrnc10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("scrnc11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("scrnc12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("scrnc13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("scrnc14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("scrnc15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("scrnc16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("scrnc17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("scrnc18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("scrnc19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("scrnc20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("scrnc21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("scrnc22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("scrnc23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("scrnc24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("scrnc25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("scrnc26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("scrnc27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("scrnc28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("scrnc29"));
        cb29.setOnCheckedChangeListener(this);

        cb30 = (CheckBox)findViewById(R.id.checkBox30);
        cb30.setChecked(getFromSP("scrnc30"));
        cb30.setOnCheckedChangeListener(this);

        cb31 = (CheckBox)findViewById(R.id.checkBox31);
        cb31.setChecked(getFromSP("scrnc31"));
        cb31.setOnCheckedChangeListener(this);

        cb32 = (CheckBox)findViewById(R.id.checkBox32);
        cb32.setChecked(getFromSP("scrnc32"));
        cb32.setOnCheckedChangeListener(this);

        cb33 = (CheckBox)findViewById(R.id.checkBox33);
        cb33.setChecked(getFromSP("scrnc33"));
        cb33.setOnCheckedChangeListener(this);

        cb34 = (CheckBox)findViewById(R.id.checkBox34);
        cb34.setChecked(getFromSP("scrnc34"));
        cb34.setOnCheckedChangeListener(this);

        cb35 = (CheckBox)findViewById(R.id.checkBox35);
        cb35.setChecked(getFromSP("scrnc35"));
        cb35.setOnCheckedChangeListener(this);

        cb36 = (CheckBox)findViewById(R.id.checkBox36);
        cb36.setChecked(getFromSP("scrnc36"));
        cb36.setOnCheckedChangeListener(this);
        

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
                saveInSp("scrnc1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("scrnc2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("scrnc3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("scrnc4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("scrnc5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("scrnc6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("scrnc7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("scrnc8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("scrnc9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("scrnc10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("scrnc11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("scrnc12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("scrnc13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("scrnc14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("scrnc15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("scrnc16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("scrnc17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("scrnc18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("scrnc19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("scrnc20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("scrnc21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("scrnc22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("scrnc23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("scrnc24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("scrnc25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("scrnc26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("scrnc27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("scrnc28",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox29:
                saveInSp("scrnc29",isChecked);
                break;
            case R.id.checkBox30:
                saveInSp("scrnc30",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox31:
                saveInSp("scrnc31",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox32:
                saveInSp("scrnc32",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox33:
                saveInSp("scrnc33",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox34:
                saveInSp("scrnc34",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox35:
                saveInSp("scrnc35",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox36:
                saveInSp("scrnc36",isChecked);
                //text.setText(capitulosLidos);
                break;

        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapSCronicas",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapSCronicas", capitulosLidos);


    }

}
