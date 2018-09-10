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

public class vtSalmos extends Activity implements CompoundButton.OnCheckedChangeListener {


    static float capitulosLidos;
    private float progresso;
    public TextView textoCap;
    public TextView textoProgresso;
    float capitulosLivro = 150f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vt_salmos);
        textoProgresso = (TextView) findViewById(R.id.textoProgresso);

        carregarCapitulos();

        //progresso = (capitulosLidos/28)*100;

        AdView adView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .setRequestAgent("android_studio:ad_template").build();
        adView.loadAd(adRequest);


        CheckBox    cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9,cb10,cb11,cb12,cb13,cb14,cb15,cb16,cb17,cb18,cb19,cb20,cb21,cb22,cb23,cb24,cb25,
                    cb26,cb27,cb28,cb29,cb30,cb31,cb32,cb33,cb34,cb35,cb36,cb37,cb38,cb39,cb40,cb41,cb42,cb43,cb44,cb45,cb46,cb47,cb48,cb49,
                    cb50,cb51,cb52,cb53,cb54,cb55,cb56,cb57,cb58,cb59,cb60,cb61,cb62,cb63,cb64,cb65,cb66,cb67,cb68,cb69,cb70,cb71,cb72,cb73,
                    cb74,cb75,cb76,cb77,cb78,cb79,cb80,cb81,cb82,cb83,cb84,cb85,cb86,cb87,cb88,cb89,cb90,cb91,cb92,cb93,cb94,cb95,cb96,cb97,
                    cb98,cb99,cb100,cb101,cb102,cb103,cb104,cb105,cb106,cb107,cb108,cb109,cb110,cb111,cb112,cb113,cb114,cb115,cb116,cb117,cb118,
                    cb119,cb120,cb121,cb122,cb123,cb124,cb125,cb126,cb127,cb128,cb129,cb130,cb131,cb132,cb133,cb134,cb135,cb136,cb137,cb138,
                    cb139,cb140,cb141,cb142,cb143,cb144,cb145,cb146,cb147,cb148,cb149,cb150;



        cb1 = (CheckBox)findViewById(R.id.checkBox1);
        cb1.setChecked(getFromSP("slms1"));
        cb1.setOnCheckedChangeListener(this);

        cb2 = (CheckBox)findViewById(R.id.checkBox2);
        cb2.setChecked(getFromSP("slms2"));
        cb2.setOnCheckedChangeListener(this);

        cb3 = (CheckBox)findViewById(R.id.checkBox3);
        cb3.setChecked(getFromSP("slms3"));
        cb3.setOnCheckedChangeListener(this);

        cb4 = (CheckBox)findViewById(R.id.checkBox4);
        cb4.setChecked(getFromSP("slms4"));
        cb4.setOnCheckedChangeListener(this);

        cb5 = (CheckBox)findViewById(R.id.checkBox5);
        cb5.setChecked(getFromSP("slms5"));
        cb5.setOnCheckedChangeListener(this);

        cb6 = (CheckBox)findViewById(R.id.checkBox6);
        cb6.setChecked(getFromSP("slms6"));
        cb6.setOnCheckedChangeListener(this);

        cb7 = (CheckBox)findViewById(R.id.checkBox7);
        cb7.setChecked(getFromSP("slms7"));
        cb7.setOnCheckedChangeListener(this);

        cb8 = (CheckBox)findViewById(R.id.checkBox8);
        cb8.setChecked(getFromSP("slms8"));
        cb8.setOnCheckedChangeListener(this);

        cb9 = (CheckBox)findViewById(R.id.checkBox9);
        cb9.setChecked(getFromSP("slms9"));
        cb9.setOnCheckedChangeListener(this);

        cb10 = (CheckBox)findViewById(R.id.checkBox10);
        cb10.setChecked(getFromSP("slms10"));
        cb10.setOnCheckedChangeListener(this);

        cb11 = (CheckBox)findViewById(R.id.checkBox11);
        cb11.setChecked(getFromSP("slms11"));
        cb11.setOnCheckedChangeListener(this);

        cb12 = (CheckBox)findViewById(R.id.checkBox12);
        cb12.setChecked(getFromSP("slms12"));
        cb12.setOnCheckedChangeListener(this);

        cb13 = (CheckBox)findViewById(R.id.checkBox13);
        cb13.setChecked(getFromSP("slms13"));
        cb13.setOnCheckedChangeListener(this);

        cb14 = (CheckBox)findViewById(R.id.checkBox14);
        cb14.setChecked(getFromSP("slms14"));
        cb14.setOnCheckedChangeListener(this);

        cb15 = (CheckBox)findViewById(R.id.checkBox15);
        cb15.setChecked(getFromSP("slms15"));
        cb15.setOnCheckedChangeListener(this);

        cb16 = (CheckBox)findViewById(R.id.checkBox16);
        cb16.setChecked(getFromSP("slms16"));
        cb16.setOnCheckedChangeListener(this);

        cb17 = (CheckBox)findViewById(R.id.checkBox17);
        cb17.setChecked(getFromSP("slms17"));
        cb17.setOnCheckedChangeListener(this);

        cb18 = (CheckBox)findViewById(R.id.checkBox18);
        cb18.setChecked(getFromSP("slms18"));
        cb18.setOnCheckedChangeListener(this);

        cb19 = (CheckBox)findViewById(R.id.checkBox19);
        cb19.setChecked(getFromSP("slms19"));
        cb19.setOnCheckedChangeListener(this);

        cb20 = (CheckBox)findViewById(R.id.checkBox20);
        cb20.setChecked(getFromSP("slms20"));
        cb20.setOnCheckedChangeListener(this);

        cb21 = (CheckBox)findViewById(R.id.checkBox21);
        cb21.setChecked(getFromSP("slms21"));
        cb21.setOnCheckedChangeListener(this);

        cb22 = (CheckBox)findViewById(R.id.checkBox22);
        cb22.setChecked(getFromSP("slms22"));
        cb22.setOnCheckedChangeListener(this);

        cb23 = (CheckBox)findViewById(R.id.checkBox23);
        cb23.setChecked(getFromSP("slms23"));
        cb23.setOnCheckedChangeListener(this);

        cb24 = (CheckBox)findViewById(R.id.checkBox24);
        cb24.setChecked(getFromSP("slms24"));
        cb24.setOnCheckedChangeListener(this);

        cb25 = (CheckBox)findViewById(R.id.checkBox25);
        cb25.setChecked(getFromSP("slms25"));
        cb25.setOnCheckedChangeListener(this);

        cb26 = (CheckBox)findViewById(R.id.checkBox26);
        cb26.setChecked(getFromSP("slms26"));
        cb26.setOnCheckedChangeListener(this);

        cb27 = (CheckBox)findViewById(R.id.checkBox27);
        cb27.setChecked(getFromSP("slms27"));
        cb27.setOnCheckedChangeListener(this);

        cb28 = (CheckBox)findViewById(R.id.checkBox28);
        cb28.setChecked(getFromSP("slms28"));
        cb28.setOnCheckedChangeListener(this);

        cb29 = (CheckBox)findViewById(R.id.checkBox29);
        cb29.setChecked(getFromSP("slms29"));
        cb29.setOnCheckedChangeListener(this);

        cb30 = (CheckBox)findViewById(R.id.checkBox30);
        cb30.setChecked(getFromSP("slms30"));
        cb30.setOnCheckedChangeListener(this);

        cb31 = (CheckBox)findViewById(R.id.checkBox31);
        cb31.setChecked(getFromSP("slms31"));
        cb31.setOnCheckedChangeListener(this);

        cb32 = (CheckBox)findViewById(R.id.checkBox32);
        cb32.setChecked(getFromSP("slms32"));
        cb32.setOnCheckedChangeListener(this);

        cb33 = (CheckBox)findViewById(R.id.checkBox33);
        cb33.setChecked(getFromSP("slms33"));
        cb33.setOnCheckedChangeListener(this);

        cb34 = (CheckBox)findViewById(R.id.checkBox34);
        cb34.setChecked(getFromSP("slms34"));
        cb34.setOnCheckedChangeListener(this);

        cb35 = (CheckBox)findViewById(R.id.checkBox35);
        cb35.setChecked(getFromSP("slms35"));
        cb35.setOnCheckedChangeListener(this);

        cb36 = (CheckBox)findViewById(R.id.checkBox36);
        cb36.setChecked(getFromSP("slms36"));
        cb36.setOnCheckedChangeListener(this);

        cb37 = (CheckBox)findViewById(R.id.checkBox37);
        cb37.setChecked(getFromSP("slms37"));
        cb37.setOnCheckedChangeListener(this);

        cb38 = (CheckBox)findViewById(R.id.checkBox38);
        cb38.setChecked(getFromSP("slms38"));
        cb38.setOnCheckedChangeListener(this);

        cb39 = (CheckBox)findViewById(R.id.checkBox39);
        cb39.setChecked(getFromSP("slms39"));
        cb39.setOnCheckedChangeListener(this);

        cb40 = (CheckBox)findViewById(R.id.checkBox40);
        cb40.setChecked(getFromSP("slms40"));
        cb40.setOnCheckedChangeListener(this);

        cb41 = (CheckBox)findViewById(R.id.checkBox41);
        cb41.setChecked(getFromSP("slms41"));
        cb41.setOnCheckedChangeListener(this);

        cb42 = (CheckBox)findViewById(R.id.checkBox42);
        cb42.setChecked(getFromSP("slms42"));
        cb42.setOnCheckedChangeListener(this);

        cb43 = (CheckBox)findViewById(R.id.checkBox43);
        cb43.setChecked(getFromSP("slms43"));
        cb43.setOnCheckedChangeListener(this);


        cb44 = (CheckBox)findViewById(R.id.checkBox44);
        cb44.setChecked(getFromSP("slms44"));
        cb44.setOnCheckedChangeListener(this);


        cb45 = (CheckBox)findViewById(R.id.checkBox45);
        cb45.setChecked(getFromSP("slms45"));
        cb45.setOnCheckedChangeListener(this);


        cb46 = (CheckBox)findViewById(R.id.checkBox46);
        cb46.setChecked(getFromSP("slms46"));
        cb46.setOnCheckedChangeListener(this);


        cb47 = (CheckBox)findViewById(R.id.checkBox47);
        cb47.setChecked(getFromSP("slms47"));
        cb47.setOnCheckedChangeListener(this);


        cb48 = (CheckBox)findViewById(R.id.checkBox48);
        cb48.setChecked(getFromSP("slms48"));
        cb48.setOnCheckedChangeListener(this);


        cb49 = (CheckBox)findViewById(R.id.checkBox49);
        cb49.setChecked(getFromSP("slms49"));
        cb49.setOnCheckedChangeListener(this);


        cb50 = (CheckBox)findViewById(R.id.checkBox50);
        cb50.setChecked(getFromSP("slms50"));
        cb50.setOnCheckedChangeListener(this);

        cb51 = (CheckBox)findViewById(R.id.checkBox51);
        cb51.setChecked(getFromSP("slms51"));
        cb51.setOnCheckedChangeListener(this);

        cb52 = (CheckBox)findViewById(R.id.checkBox52);
        cb52.setChecked(getFromSP("slms52"));
        cb52.setOnCheckedChangeListener(this);

        cb53 = (CheckBox)findViewById(R.id.checkBox53);
        cb53.setChecked(getFromSP("slms53"));
        cb53.setOnCheckedChangeListener(this);

        cb54 = (CheckBox)findViewById(R.id.checkBox54);
        cb54.setChecked(getFromSP("slms54"));
        cb54.setOnCheckedChangeListener(this);

        cb55 = (CheckBox)findViewById(R.id.checkBox55);
        cb55.setChecked(getFromSP("slms55"));
        cb55.setOnCheckedChangeListener(this);

        cb56 = (CheckBox)findViewById(R.id.checkBox56);
        cb56.setChecked(getFromSP("slms6"));
        cb56.setOnCheckedChangeListener(this);

        cb57 = (CheckBox)findViewById(R.id.checkBox57);
        cb57.setChecked(getFromSP("slms57"));
        cb57.setOnCheckedChangeListener(this);

        cb58 = (CheckBox)findViewById(R.id.checkBox58);
        cb58.setChecked(getFromSP("slms58"));
        cb58.setOnCheckedChangeListener(this);

        cb59 = (CheckBox)findViewById(R.id.checkBox59);
        cb59.setChecked(getFromSP("slms59"));
        cb59.setOnCheckedChangeListener(this);

        cb60 = (CheckBox)findViewById(R.id.checkBox60);
        cb60.setChecked(getFromSP("slms60"));
        cb60.setOnCheckedChangeListener(this);

        cb61 = (CheckBox)findViewById(R.id.checkBox61);
        cb61.setChecked(getFromSP("slms61"));
        cb61.setOnCheckedChangeListener(this);

        cb62 = (CheckBox)findViewById(R.id.checkBox62);
        cb62.setChecked(getFromSP("slms62"));
        cb62.setOnCheckedChangeListener(this);

        cb63 = (CheckBox)findViewById(R.id.checkBox63);
        cb63.setChecked(getFromSP("slms63"));
        cb63.setOnCheckedChangeListener(this);

        cb64 = (CheckBox)findViewById(R.id.checkBox64);
        cb64.setChecked(getFromSP("slms64"));
        cb64.setOnCheckedChangeListener(this);

        cb65 = (CheckBox)findViewById(R.id.checkBox65);
        cb65.setChecked(getFromSP("slms65"));
        cb65.setOnCheckedChangeListener(this);

        cb66 = (CheckBox)findViewById(R.id.checkBox66);
        cb66.setChecked(getFromSP("slms66"));
        cb66.setOnCheckedChangeListener(this);

        cb67 = (CheckBox)findViewById(R.id.checkBox67);
        cb67.setChecked(getFromSP("slms67"));
        cb67.setOnCheckedChangeListener(this);

        cb68 = (CheckBox)findViewById(R.id.checkBox68);
        cb68.setChecked(getFromSP("slms68"));
        cb68.setOnCheckedChangeListener(this);

        cb69 = (CheckBox)findViewById(R.id.checkBox69);
        cb69.setChecked(getFromSP("slms69"));
        cb69.setOnCheckedChangeListener(this);

        cb70 = (CheckBox)findViewById(R.id.checkBox70);
        cb70.setChecked(getFromSP("slms70"));
        cb70.setOnCheckedChangeListener(this);

        cb71 = (CheckBox)findViewById(R.id.checkBox71);
        cb71.setChecked(getFromSP("slms71"));
        cb71.setOnCheckedChangeListener(this);

        cb72 = (CheckBox)findViewById(R.id.checkBox72);
        cb72.setChecked(getFromSP("slms72"));
        cb72.setOnCheckedChangeListener(this);

        cb73 = (CheckBox)findViewById(R.id.checkBox73);
        cb73.setChecked(getFromSP("slms73"));
        cb73.setOnCheckedChangeListener(this);

        cb74 = (CheckBox)findViewById(R.id.checkBox74);
        cb74.setChecked(getFromSP("slms74"));
        cb74.setOnCheckedChangeListener(this);

        cb75 = (CheckBox)findViewById(R.id.checkBox75);
        cb75.setChecked(getFromSP("slms75"));
        cb75.setOnCheckedChangeListener(this);

        cb76 = (CheckBox)findViewById(R.id.checkBox76);
        cb76.setChecked(getFromSP("slms76"));
        cb76.setOnCheckedChangeListener(this);

        cb77 = (CheckBox)findViewById(R.id.checkBox77);
        cb77.setChecked(getFromSP("slms77"));
        cb77.setOnCheckedChangeListener(this);

        cb78 = (CheckBox)findViewById(R.id.checkBox78);
        cb78.setChecked(getFromSP("slms78"));
        cb78.setOnCheckedChangeListener(this);

        cb79 = (CheckBox)findViewById(R.id.checkBox79);
        cb79.setChecked(getFromSP("slms79"));
        cb79.setOnCheckedChangeListener(this);

        cb80 = (CheckBox)findViewById(R.id.checkBox80);
        cb80.setChecked(getFromSP("slms80"));
        cb80.setOnCheckedChangeListener(this);

        cb81 = (CheckBox)findViewById(R.id.checkBox81);
        cb81.setChecked(getFromSP("slms81"));
        cb81.setOnCheckedChangeListener(this);

        cb82 = (CheckBox)findViewById(R.id.checkBox82);
        cb82.setChecked(getFromSP("slms82"));
        cb82.setOnCheckedChangeListener(this);

        cb83 = (CheckBox)findViewById(R.id.checkBox83);
        cb83.setChecked(getFromSP("slms83"));
        cb83.setOnCheckedChangeListener(this);

        cb84 = (CheckBox)findViewById(R.id.checkBox84);
        cb84.setChecked(getFromSP("slms84"));
        cb84.setOnCheckedChangeListener(this);

        cb85 = (CheckBox)findViewById(R.id.checkBox85);
        cb85.setChecked(getFromSP("slms85"));
        cb85.setOnCheckedChangeListener(this);

        cb86 = (CheckBox)findViewById(R.id.checkBox86);
        cb86.setChecked(getFromSP("slms86"));
        cb86.setOnCheckedChangeListener(this);

        cb87 = (CheckBox)findViewById(R.id.checkBox87);
        cb87.setChecked(getFromSP("slms87"));
        cb87.setOnCheckedChangeListener(this);

        cb88 = (CheckBox)findViewById(R.id.checkBox88);
        cb88.setChecked(getFromSP("slms88"));
        cb88.setOnCheckedChangeListener(this);

        cb89 = (CheckBox)findViewById(R.id.checkBox89);
        cb89.setChecked(getFromSP("slms89"));
        cb89.setOnCheckedChangeListener(this);

        cb90 = (CheckBox)findViewById(R.id.checkBox90);
        cb90.setChecked(getFromSP("slms90"));
        cb90.setOnCheckedChangeListener(this);

        cb91 = (CheckBox)findViewById(R.id.checkBox91);
        cb91.setChecked(getFromSP("slms91"));
        cb91.setOnCheckedChangeListener(this);

        cb92 = (CheckBox)findViewById(R.id.checkBox92);
        cb92.setChecked(getFromSP("slms92"));
        cb92.setOnCheckedChangeListener(this);

        cb93 = (CheckBox)findViewById(R.id.checkBox93);
        cb93.setChecked(getFromSP("slms93"));
        cb93.setOnCheckedChangeListener(this);


        cb94 = (CheckBox)findViewById(R.id.checkBox94);
        cb94.setChecked(getFromSP("slms94"));
        cb94.setOnCheckedChangeListener(this);


        cb95 = (CheckBox)findViewById(R.id.checkBox95);
        cb95.setChecked(getFromSP("slms95"));
        cb95.setOnCheckedChangeListener(this);


        cb96 = (CheckBox)findViewById(R.id.checkBox96);
        cb96.setChecked(getFromSP("slms96"));
        cb96.setOnCheckedChangeListener(this);


        cb97 = (CheckBox)findViewById(R.id.checkBox97);
        cb97.setChecked(getFromSP("slms97"));
        cb97.setOnCheckedChangeListener(this);


        cb98 = (CheckBox)findViewById(R.id.checkBox98);
        cb98.setChecked(getFromSP("slms98"));
        cb98.setOnCheckedChangeListener(this);


        cb99 = (CheckBox)findViewById(R.id.checkBox99);
        cb99.setChecked(getFromSP("slms99"));
        cb99.setOnCheckedChangeListener(this);


        cb100 = (CheckBox)findViewById(R.id.checkBox100);
        cb100.setChecked(getFromSP("slms100"));
        cb100.setOnCheckedChangeListener(this);

        cb101 = (CheckBox)findViewById(R.id.checkBox101);
        cb101.setChecked(getFromSP("slms101"));
        cb101.setOnCheckedChangeListener(this);

        cb102 = (CheckBox)findViewById(R.id.checkBox102);
        cb102.setChecked(getFromSP("slms102"));
        cb102.setOnCheckedChangeListener(this);

        cb103 = (CheckBox)findViewById(R.id.checkBox103);
        cb103.setChecked(getFromSP("slms103"));
        cb103.setOnCheckedChangeListener(this);

        cb104 = (CheckBox)findViewById(R.id.checkBox104);
        cb104.setChecked(getFromSP("slms104"));
        cb104.setOnCheckedChangeListener(this);

        cb105 = (CheckBox)findViewById(R.id.checkBox105);
        cb105.setChecked(getFromSP("slms105"));
        cb105.setOnCheckedChangeListener(this);

        cb106 = (CheckBox)findViewById(R.id.checkBox106);
        cb106.setChecked(getFromSP("slms106"));
        cb106.setOnCheckedChangeListener(this);

        cb107 = (CheckBox)findViewById(R.id.checkBox107);
        cb107.setChecked(getFromSP("slms107"));
        cb107.setOnCheckedChangeListener(this);

        cb108 = (CheckBox)findViewById(R.id.checkBox108);
        cb108.setChecked(getFromSP("slms108"));
        cb108.setOnCheckedChangeListener(this);

        cb109 = (CheckBox)findViewById(R.id.checkBox109);
        cb109.setChecked(getFromSP("slms109"));
        cb109.setOnCheckedChangeListener(this);

        cb110 = (CheckBox)findViewById(R.id.checkBox110);
        cb110.setChecked(getFromSP("slms110"));
        cb110.setOnCheckedChangeListener(this);

        cb111 = (CheckBox)findViewById(R.id.checkBox111);
        cb111.setChecked(getFromSP("slms111"));
        cb111.setOnCheckedChangeListener(this);

        cb112 = (CheckBox)findViewById(R.id.checkBox112);
        cb112.setChecked(getFromSP("slms112"));
        cb112.setOnCheckedChangeListener(this);

        cb113 = (CheckBox)findViewById(R.id.checkBox113);
        cb113.setChecked(getFromSP("slms113"));
        cb113.setOnCheckedChangeListener(this);

        cb114 = (CheckBox)findViewById(R.id.checkBox114);
        cb114.setChecked(getFromSP("slms114"));
        cb114.setOnCheckedChangeListener(this);

        cb115 = (CheckBox)findViewById(R.id.checkBox115);
        cb115.setChecked(getFromSP("slms115"));
        cb115.setOnCheckedChangeListener(this);

        cb116 = (CheckBox)findViewById(R.id.checkBox116);
        cb116.setChecked(getFromSP("slms116"));
        cb116.setOnCheckedChangeListener(this);

        cb117 = (CheckBox)findViewById(R.id.checkBox117);
        cb117.setChecked(getFromSP("slms117"));
        cb117.setOnCheckedChangeListener(this);

        cb118 = (CheckBox)findViewById(R.id.checkBox118);
        cb118.setChecked(getFromSP("slms118"));
        cb118.setOnCheckedChangeListener(this);

        cb119 = (CheckBox)findViewById(R.id.checkBox119);
        cb119.setChecked(getFromSP("slms119"));
        cb119.setOnCheckedChangeListener(this);

        cb120 = (CheckBox)findViewById(R.id.checkBox120);
        cb120.setChecked(getFromSP("slms120"));
        cb120.setOnCheckedChangeListener(this);

        cb121 = (CheckBox)findViewById(R.id.checkBox121);
        cb121.setChecked(getFromSP("slms121"));
        cb121.setOnCheckedChangeListener(this);

        cb122 = (CheckBox)findViewById(R.id.checkBox122);
        cb122.setChecked(getFromSP("slms122"));
        cb122.setOnCheckedChangeListener(this);

        cb123 = (CheckBox)findViewById(R.id.checkBox123);
        cb123.setChecked(getFromSP("slms123"));
        cb123.setOnCheckedChangeListener(this);

        cb124 = (CheckBox)findViewById(R.id.checkBox124);
        cb124.setChecked(getFromSP("slms24"));
        cb124.setOnCheckedChangeListener(this);

        cb125 = (CheckBox)findViewById(R.id.checkBox125);
        cb125.setChecked(getFromSP("slms125"));
        cb125.setOnCheckedChangeListener(this);

        cb126 = (CheckBox)findViewById(R.id.checkBox126);
        cb126.setChecked(getFromSP("slms126"));
        cb126.setOnCheckedChangeListener(this);

        cb127 = (CheckBox)findViewById(R.id.checkBox127);
        cb127.setChecked(getFromSP("slms127"));
        cb127.setOnCheckedChangeListener(this);

        cb128 = (CheckBox)findViewById(R.id.checkBox128);
        cb128.setChecked(getFromSP("slms128"));
        cb128.setOnCheckedChangeListener(this);

        cb129 = (CheckBox)findViewById(R.id.checkBox129);
        cb129.setChecked(getFromSP("slms129"));
        cb129.setOnCheckedChangeListener(this);

        cb130 = (CheckBox)findViewById(R.id.checkBox130);
        cb130.setChecked(getFromSP("slms130"));
        cb130.setOnCheckedChangeListener(this);

        cb131 = (CheckBox)findViewById(R.id.checkBox131);
        cb131.setChecked(getFromSP("slms131"));
        cb131.setOnCheckedChangeListener(this);

        cb132 = (CheckBox)findViewById(R.id.checkBox132);
        cb132.setChecked(getFromSP("slms132"));
        cb132.setOnCheckedChangeListener(this);

        cb133 = (CheckBox)findViewById(R.id.checkBox133);
        cb133.setChecked(getFromSP("slms133"));
        cb133.setOnCheckedChangeListener(this);

        cb134 = (CheckBox)findViewById(R.id.checkBox134);
        cb134.setChecked(getFromSP("slms134"));
        cb134.setOnCheckedChangeListener(this);

        cb135 = (CheckBox)findViewById(R.id.checkBox135);
        cb135.setChecked(getFromSP("slms135"));
        cb135.setOnCheckedChangeListener(this);

        cb136 = (CheckBox)findViewById(R.id.checkBox136);
        cb136.setChecked(getFromSP("slms136"));
        cb136.setOnCheckedChangeListener(this);

        cb137 = (CheckBox)findViewById(R.id.checkBox137);
        cb137.setChecked(getFromSP("slms137"));
        cb137.setOnCheckedChangeListener(this);

        cb138 = (CheckBox)findViewById(R.id.checkBox138);
        cb138.setChecked(getFromSP("slms138"));
        cb138.setOnCheckedChangeListener(this);

        cb139 = (CheckBox)findViewById(R.id.checkBox139);
        cb139.setChecked(getFromSP("slms100"));
        cb139.setOnCheckedChangeListener(this);

        cb140 = (CheckBox)findViewById(R.id.checkBox140);
        cb140.setChecked(getFromSP("slms140"));
        cb140.setOnCheckedChangeListener(this);

        cb141 = (CheckBox)findViewById(R.id.checkBox141);
        cb141.setChecked(getFromSP("slms141"));
        cb141.setOnCheckedChangeListener(this);

        cb142 = (CheckBox)findViewById(R.id.checkBox142);
        cb142.setChecked(getFromSP("slms142"));
        cb142.setOnCheckedChangeListener(this);

        cb143 = (CheckBox)findViewById(R.id.checkBox143);
        cb143.setChecked(getFromSP("slms143"));
        cb143.setOnCheckedChangeListener(this);

        cb144 = (CheckBox)findViewById(R.id.checkBox144);
        cb144.setChecked(getFromSP("slms144"));
        cb144.setOnCheckedChangeListener(this);

        cb145 = (CheckBox)findViewById(R.id.checkBox145);
        cb145.setChecked(getFromSP("slms145"));
        cb145.setOnCheckedChangeListener(this);

        cb146 = (CheckBox)findViewById(R.id.checkBox146);
        cb146.setChecked(getFromSP("slms146"));
        cb146.setOnCheckedChangeListener(this);

        cb147 = (CheckBox)findViewById(R.id.checkBox147);
        cb147.setChecked(getFromSP("slms147"));
        cb147.setOnCheckedChangeListener(this);

        cb148 = (CheckBox)findViewById(R.id.checkBox148);
        cb148.setChecked(getFromSP("slms148"));
        cb148.setOnCheckedChangeListener(this);

        cb149 = (CheckBox)findViewById(R.id.checkBox149);
        cb149.setChecked(getFromSP("slms149"));
        cb149.setOnCheckedChangeListener(this);

        cb150 = (CheckBox)findViewById(R.id.checkBox150);
        cb150.setChecked(getFromSP("slms150"));
        cb150.setOnCheckedChangeListener(this);


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
                saveInSp("slms1",isChecked);
                break;
            case R.id.checkBox2:
                saveInSp("slms2",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox3:
                saveInSp("slms3",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox4:
                saveInSp("slms4",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox5:
                saveInSp("slms5",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox6:
                saveInSp("slms6",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox7:
                saveInSp("slms7",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox8:
                saveInSp("slms8",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox9:
                saveInSp("slms9",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox10:
                saveInSp("slms10",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox11:
                saveInSp("slms11",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox12:
                saveInSp("slms12",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox13:
                saveInSp("slms13",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox14:
                saveInSp("slms14",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox15:
                saveInSp("slms15",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox16:
                saveInSp("slms16",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox17:
                saveInSp("slms17",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox18:
                saveInSp("slms18",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox19:
                saveInSp("slms19",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox20:
                saveInSp("slms20",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox21:
                saveInSp("slms21",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox22:
                saveInSp("slms22",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox23:
                saveInSp("slms23",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox24:
                saveInSp("slms24",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox25:
                saveInSp("slms25",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox26:
                saveInSp("slms26",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox27:
                saveInSp("slms27",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox28:
                saveInSp("slms28",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox29:
                saveInSp("slms29",isChecked);
                break;
            case R.id.checkBox30:
                saveInSp("slms30",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox31:
                saveInSp("slms31",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox32:
                saveInSp("slms32",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox33:
                saveInSp("slms33",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox34:
                saveInSp("slms34",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox35:
                saveInSp("slms35",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox36:
                saveInSp("slms36",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox37:
                saveInSp("slms37",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox38:
                saveInSp("slms38",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox39:
                saveInSp("slms39",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox40:
                saveInSp("slms40",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox41:
                saveInSp("slms41",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox42:
                saveInSp("slms42",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox43:
                saveInSp("slms43",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox44:
                saveInSp("slms44",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox45:
                saveInSp("slms45",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox46:
                saveInSp("slms46",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox47:
                saveInSp("slms47",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox48:
                saveInSp("slms48",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox49:
                saveInSp("slms49",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox50:
                saveInSp("slms50",isChecked);
                //text.setText(capitulosLidos);
                break;

            //50 - 100

            case R.id.checkBox51:
                saveInSp("slms51",isChecked);
                break;
            case R.id.checkBox52:
                saveInSp("slms52",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox53:
                saveInSp("slms53",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox54:
                saveInSp("slms54",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox55:
                saveInSp("slms55",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox56:
                saveInSp("slms56",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox57:
                saveInSp("slms57",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox58:
                saveInSp("slms58",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox59:
                saveInSp("slms59",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox60:
                saveInSp("slms60",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox61:
                saveInSp("slms61",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox62:
                saveInSp("slms62",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox63:
                saveInSp("slms63",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox64:
                saveInSp("slms64",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox65:
                saveInSp("slms65",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox66:
                saveInSp("slms66",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox67:
                saveInSp("slms67",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox68:
                saveInSp("slms68",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox69:
                saveInSp("slms69",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox70:
                saveInSp("slms70",isChecked);
                //text.setText(capitulosLidos);
            case R.id.checkBox71:
                saveInSp("slms71",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox72:
                saveInSp("slms72",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox73:
                saveInSp("slms73",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox74:
                saveInSp("slms74",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox75:
                saveInSp("slms75",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox76:
                saveInSp("slms76",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox77:
                saveInSp("slms77",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox78:
                saveInSp("slms78",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox79:
                saveInSp("slms79",isChecked);
                break;
            case R.id.checkBox80:
                saveInSp("slms80",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox81:
                saveInSp("slms81",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox82:
                saveInSp("slms82",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox83:
                saveInSp("slms83",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox84:
                saveInSp("slms84",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox85:
                saveInSp("slms85",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox86:
                saveInSp("slms86",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox87:
                saveInSp("slms87",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox88:
                saveInSp("slms88",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox89:
                saveInSp("slms89",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox90:
                saveInSp("slms90",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox91:
                saveInSp("slms91",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox92:
                saveInSp("slms92",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox93:
                saveInSp("slms93",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox94:
                saveInSp("slms94",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox95:
                saveInSp("slms95",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox96:
                saveInSp("slms96",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox97:
                saveInSp("slms97",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox98:
                saveInSp("slms98",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox99:
                saveInSp("slms99",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox100:
                saveInSp("slms100",isChecked);
                //text.setText(capitulosLidos);
                break;

            // 101-150
            case R.id.checkBox101:
                saveInSp("slms101",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox102:
                saveInSp("slms102",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox103:
                saveInSp("slms103",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox104:
                saveInSp("slms104",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox105:
                saveInSp("slms105",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox106:
                saveInSp("slms106",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox107:
                saveInSp("slms107",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox108:
                saveInSp("slms108",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox109:
                saveInSp("slms109",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox110:
                saveInSp("slms110",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox111:
                saveInSp("slms111",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox112:
                saveInSp("slms112",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox113:
                saveInSp("slms113",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox114:
                saveInSp("slms114",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox115:
                saveInSp("slms115",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox116:
                saveInSp("slms116",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox117:
                saveInSp("slms117",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox118:
                saveInSp("slms118",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox119:
                saveInSp("slms119",isChecked);
                //text.setText(capitulosLidos);
                break;

            case R.id.checkBox120:
                saveInSp("slms120",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox121:
                saveInSp("slms121",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox122:
                saveInSp("slms122",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox123:
                saveInSp("slms123",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox124:
                saveInSp("slms124",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox125:
                saveInSp("slms125",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox126:
                saveInSp("slms126",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox127:
                saveInSp("slms127",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox128:
                saveInSp("slms128",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox129:
                saveInSp("slms129",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox130:
                saveInSp("slms130",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox131:
                saveInSp("slms131",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox132:
                saveInSp("slms132",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox133:
                saveInSp("slms133",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox134:
                saveInSp("slms134",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox135:
                saveInSp("slms135",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox136:
                saveInSp("slms136",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox137:
                saveInSp("slms137",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox138:
                saveInSp("slms138",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox139:
                saveInSp("slms139",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox140:
                saveInSp("slms140",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox141:
                saveInSp("slms141",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox142:
                saveInSp("slms142",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox143:
                saveInSp("slms143",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox144:
                saveInSp("slms144",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox145:
                saveInSp("slms145",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox146:
                saveInSp("slms146",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox147:
                saveInSp("slms147",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox148:
                saveInSp("slms148",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox149:
                saveInSp("slms149",isChecked);
                //text.setText(capitulosLidos);
                break;
            case R.id.checkBox150:
                saveInSp("slms150",isChecked);
                //text.setText(capitulosLidos);
                break;


        }

    }


    public void salvarCapitulos() {


        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putFloat("CapSalmos",capitulosLidos);
        editor.commit();
    }

    public void carregarCapitulos() {

        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        capitulosLidos = preferences.getFloat("CapSalmos", capitulosLidos);


    }

}
