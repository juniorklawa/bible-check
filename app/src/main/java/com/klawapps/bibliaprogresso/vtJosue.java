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

public class vtJosue extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 24f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_josue);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("jse1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("jse2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("jse3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("jse4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("jse5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("jse6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("jse7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("jse8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("jse9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("jse10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("jse11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("jse12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("jse13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("jse14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("jse15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("jse16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("jse17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("jse18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("jse19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("jse20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("jse21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("jse22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("jse23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("jse24"));
        cb24.setOnCheckedChangeListener(this);

  
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
                saveInSp("jse1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("jse2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("jse3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("jse4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("jse5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("jse6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("jse7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("jse8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("jse9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("jse10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("jse11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("jse12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("jse13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("jse14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("jse15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("jse16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("jse17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("jse18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("jse19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("jse20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("jse21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("jse22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("jse23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("jse24",isChecked);
                //text.setText(capitulosLidos);
                break;
            

        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapJosue",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapJosue", capitulosLidos);


    }

}
