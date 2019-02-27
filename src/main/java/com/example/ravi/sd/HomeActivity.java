package com.example.ravi.sd;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.media.MediaCas;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import javax.net.ssl.SSLSessionContext;

public class HomeActivity extends AppCompatActivity  {
    boolean isuser = false;
    CardView id, con, res, log;
    CollapsingToolbarLayout c;
    String s;
    de.hdodenhof.circleimageview.CircleImageView iv1;
    //DatabaseHelper mydb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*Cursor resf=mydb.getAllData();
        if(resf.getCount()==0){
            Intent intent=new Intent(this,loginActivity.class);
            startActivity(intent);
        }
        else{
            String s=resf.getString(0);
            Intent t1=new Intent(this,HomeActivity.class);
            t1.putExtra("pin",s);
            startActivity(t1);
        }*/
        s = getIntent().getStringExtra("pin");
        c = (CollapsingToolbarLayout) findViewById(R.id.collapsing);
        iv1 = (de.hdodenhof.circleimageview.CircleImageView) findViewById(R.id.img);
        switch (s) {
            case "0535":
                iv1.setImageResource(R.drawable.ravi_pic);
                c.setTitle("RAVI KIRAN");
                break;
            case "0545":
                iv1.setImageResource(R.drawable.dilip_pic);
                c.setTitle("DILIP KUMAR");
                break;
            case "0525":
                iv1.setImageResource(R.drawable.anu_pic);
                c.setTitle("ANOOJA");
                break;
            case "0544":
                iv1.setImageResource(R.drawable.maggi_pic);
                c.setTitle("MEGHANA");
                break;
            case "0543":
                iv1.setImageResource(R.drawable.sachin_pic);
                c.setTitle("SACHIN");
                break;
            case "0542":
                iv1.setImageResource(R.drawable.anabel_pic);
                c.setTitle("SUJANA");
                break;
            case "0541":
                iv1.setImageResource(R.drawable.sai_pic);
                c.setTitle("SAI RAM");
                break;
            case "0510":
                iv1.setImageResource(R.drawable.sahi_pic);
                c.setTitle("SAHITYA");
                break;
        }
        //defining cards
        id = (CardView) findViewById(R.id.Id);
        con = (CardView) findViewById(R.id.contact);
        res = (CardView) findViewById(R.id.results);
        log = (CardView) findViewById(R.id.logout);
        id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t = new Intent(HomeActivity.this, card.class);
                t.putExtra("pin", s);
                startActivity(t);
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t1 = new Intent(HomeActivity.this, contact.class);
                t1.putExtra("pin", s);
                startActivity(t1);

            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent t2 = new Intent(HomeActivity.this, results.class);
                startActivity(t2);

            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Integer deleteRows=mydb.deleteData(s);
                Intent t3 = new Intent(HomeActivity.this, loginActivity.class);
                startActivity(t3);
                s=null;


            }
        });
    }
    @Override
    public void onBackPressed(){
    }
}




