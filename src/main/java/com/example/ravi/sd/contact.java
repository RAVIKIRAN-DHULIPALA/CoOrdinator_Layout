package com.example.ravi.sd;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class contact extends AppCompatActivity {
    de.hdodenhof.circleimageview.CircleImageView iv1;
    ImageView iv2,iv3;
    String s;
    CollapsingToolbarLayout c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        iv1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.img);
        c=(CollapsingToolbarLayout)findViewById(R.id.collapsing);
        iv2=(ImageView)findViewById(R.id.image2);
        iv3=(ImageView)findViewById(R.id.image3);
        s=getIntent().getStringExtra("pin");
        switch (s) {
            case "0545":
                iv1.setImageResource(R.drawable.dilip_pic);
                c.setTitle("DILIP KUMAR");
                break;
            case "0535":
                iv1.setImageResource(R.drawable.ravi_pic);
                c.setTitle("RAVI KIRAN");
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
        iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_DIAL);
                switch (s) {
                    case "0535":
                        intent.setData(Uri.parse("tel:7382443733"));
                        startActivity(intent);
                        break;
                    case "0545":
                        intent.setData(Uri.parse("tel:9100373455"));
                        startActivity(intent);
                        break;
                    case "0525":
                        intent.setData(Uri.parse("tel:9885750628"));
                        startActivity(intent);
                        break;
                    case "0544":
                        intent.setData(Uri.parse("tel:7013398386"));
                        startActivity(intent);
                        break;
                    case "0543":
                        intent.setData(Uri.parse("tel:9666523923"));
                        startActivity(intent);
                        break;
                    case "0542":
                        intent.setData(Uri.parse("tel:9652482083"));
                        startActivity(intent);
                        break;
                    case "0541":
                        intent.setData(Uri.parse("tel:8341653079"));
                        startActivity(intent);
                        break;
                    case "0510":
                        intent.setData(Uri.parse("tel:7036596667"));
                        startActivity(intent);
                        break;
                }
            }
        });
        iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (s) {
                    case "0535": {
                        Uri uri = Uri.parse("smsto:" + "7382443733");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0545": {
                        Uri uri = Uri.parse("smsto:" + "9100373455");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0525": {
                        Uri uri = Uri.parse("smsto:" + "9885750628");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0544": {
                        Uri uri = Uri.parse("smsto:" + "7013398386");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0543": {
                        Uri uri = Uri.parse("smsto:" + "9666523923");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0542": {
                        Uri uri = Uri.parse("smsto:" + "9652482083");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0541": {
                        Uri uri = Uri.parse("smsto:" + "8341653079");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                    case "0510": {
                        Uri uri = Uri.parse("smsto:" + "7036596667");
                        Intent i = new Intent(Intent.ACTION_SENDTO, uri);
                        i.setPackage("com.whatsapp");
                        startActivity(i);
                        break;
                    }
                }
            }
            });


    }
}
