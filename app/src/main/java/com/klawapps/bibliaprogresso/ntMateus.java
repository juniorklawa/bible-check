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

public class ntMateus extends Activity implements CompoundButton.OnCheckedChangeListener {


    public static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 28f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nt_mateus);


        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,cb26,cb27,cb28;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("mt1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("mt2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("mt3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("mt4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("mt5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("mt6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("mt7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("mt8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("mt9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("mt10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("mt11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("mt12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("mt13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("mt14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("mt15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("mt16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("mt17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("mt18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("mt19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("mt20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("mt21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("mt22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("mt23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("mt24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("mt25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("mt26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("mt27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("mt28"));
        cb28.setOnCheckedChangeListener(this);





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
                saveInSp("mt1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("mt2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("mt3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("mt4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("mt5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("mt6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("mt7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("mt8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("mt9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("mt10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("mt11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("mt12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("mt13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("mt14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("mt15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("mt16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("mt17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("mt18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("mt19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("mt20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("mt21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("mt22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("mt23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("mt24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("mt25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("mt26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("mt27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("mt28",isChecked);
                //text.setText(capitulosLidos);
                break;



        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapMateusF",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapMateusF", capitulosLidos);


    }


}

