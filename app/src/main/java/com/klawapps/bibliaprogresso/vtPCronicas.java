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

public class vtPCronicas extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 29f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_pcronicas);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28,cb29;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("pcrnl1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("pcrnl2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("pcrnl3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("pcrnl4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("pcrnl5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("pcrnl6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("pcrnl7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("pcrnl8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("pcrnl9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("pcrnl10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("pcrnl11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("pcrnl12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("pcrnl13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("pcrnl14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("pcrnl15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("pcrnl16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("pcrnl17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("pcrnl18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("pcrnl19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("pcrnl20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("pcrnl21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("pcrnl22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("pcrnl23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("pcrnl24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("pcrnl25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("pcrnl26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("pcrnl27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("pcrnl28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("pcrnl29"));
        cb29.setOnCheckedChangeListener(this);



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
                saveInSp("pcrnl1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("pcrnl2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("pcrnl3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("pcrnl4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("pcrnl5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("pcrnl6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("pcrnl7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("pcrnl8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("pcrnl9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("pcrnl10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("pcrnl11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("pcrnl12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("pcrnl13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("pcrnl14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("pcrnl15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("pcrnl16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("pcrnl17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("pcrnl18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("pcrnl19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("pcrnl20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("pcrnl21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("pcrnl22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("pcrnl23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("pcrnl24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("pcrnl25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("pcrnl26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("pcrnl27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("pcrnl28",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox29:
                saveInSp("pcrnl29",isChecked);
                //text.setText(capitulosLidos);
                break;

        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapPCronicas",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapPCronicas", capitulosLidos);


    }

}
