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

public class vtNeemias extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 13f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_neemias);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("neemiasl1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("neemiasl2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("neemiasl3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("neemiasl4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("neemiasl5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("neemiasl6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("neemiasl7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("neemiasl8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("neemiasl9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("neemiasl10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("neemiasl11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("neemiasl12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("neemiasl13"));
        cb13.setOnCheckedChangeListener(this);



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
                saveInSp("neemiasl1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("neemiasl2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("neemiasl3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("neemiasl4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("neemiasl5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("neemiasl6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("neemiasl7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("neemiasl8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("neemiasl9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("neemiasl10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("neemiasl11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("neemiasl12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("neemiasl13",isChecked);
                //text.setText(capitulosLidos);
                break;

        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapNeemias",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapNeemias", capitulosLidos);


    }

}
