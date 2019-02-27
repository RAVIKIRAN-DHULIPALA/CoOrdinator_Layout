package com.example.ravi.sd;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class card extends AppCompatActivity {
    de.hdodenhof.circleimageview.CircleImageView iv1;
    ImageView iv2;
    String s;
    CollapsingToolbarLayout c;
    TextView tv,tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card);
        iv1=(de.hdodenhof.circleimageview.CircleImageView)findViewById(R.id.img);
        iv2=(ImageView)findViewById(R.id.image2);
        c=(CollapsingToolbarLayout)findViewById(R.id.collapsing);
        tv=(TextView)findViewById(R.id.textView8);
        tv1=(TextView)findViewById(R.id.textView10);
        s=getIntent().getStringExtra("pin");
        switch (s) {
            case "0545":
                iv1.setImageResource(R.drawable.dilip_pic);
                iv2.setImageResource(R.drawable.dilip_det);
                c.setTitle("DILIP KUMAR");
                tv.setText(new StringBuilder().append("Blood group :").append("O +ve"));
                tv1.setText("dilipkumarpasala1060@gmail.com");
                break;
            case "0535":
                iv1.setImageResource(R.drawable.ravi_pic);
                iv2.setImageResource(R.drawable.ravi_det);
                c.setTitle("RAVI KIRAN");
                tv.setText(new StringBuilder().append("Blood group :").append("A +ve"));
                tv1.setText("ravikiran.d39@gmail.com");
                break;
            case "0525":
                iv1.setImageResource(R.drawable.anu_pic);
                iv2.setImageResource(R.drawable.anu_det);
                c.setTitle("ANOOJA");
                tv.setText(new StringBuilder().append("Blood group :").append("O +ve"));
                tv1.setText("anuja@gmail.com");
                break;
            case "0544":
                iv1.setImageResource(R.drawable.maggi_pic);
                iv2.setImageResource(R.drawable.maggi_det);
                c.setTitle("MEGHANA");
                tv.setText(new StringBuilder().append("Blood group :").append("B -ve"));
                tv1.setText("meghana@gmail.com");
                break;
            case "0543":
                iv1.setImageResource(R.drawable.sachin_pic);
                iv2.setImageResource(R.drawable.sachin_det);
                c.setTitle("SACHIN");
                tv.setText(new StringBuilder().append("Blood group :").append("O +ve"));
                tv1.setText("sachin@gmail.com");
                break;
            case "0542":
                iv1.setImageResource(R.drawable.anabel_pic);
                iv2.setImageResource(R.drawable.anabel_det);
                c.setTitle("SUJANA");
                tv.setText(new StringBuilder().append("Blood group :").append("AB +ve"));
                tv1.setText("sujana@gmail.com");
                break;
            case "0541":
                iv1.setImageResource(R.drawable.sai_pic);
                iv2.setImageResource(R.drawable.sai_det);
                c.setTitle("SAI RAM");
                tv.setText(new StringBuilder().append("Blood group :").append("A -ve"));
                tv1.setText("sairam@gmail.com");
                break;
            case "0510":
                iv1.setImageResource(R.drawable.sahi_pic);
                iv2.setImageResource(R.drawable.sahi_det);
                c.setTitle("SAHITYA");
                tv.setText(new StringBuilder().append("Blood group :").append("B +ve"));
                tv1.setText("sahitya@gmail.com");
                break;
        }

    }
}
