package com.example.ravi.sd;

import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class results extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.textView3);
        tv4=(TextView)findViewById(R.id.textView4);
        tv5=(TextView)findViewById(R.id.textView5);
        tv6=(TextView)findViewById(R.id.textView6);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it=new Intent(results.this,MainActivity.class);
                it.putExtra("res","http://www.results.manabadi.co.in/AP-SSC-Subject-Wise-Results-2014-1.htm");
                startActivity(it);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it1=new Intent(results.this,MainActivity.class);
                it1.putExtra("res","http://www.results.manabadi.co.in/ap-intermediate-1st-year-examination-results-2015-23-04-2015.htm");
                startActivity(it1);
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it2=new Intent(results.this,MainActivity.class);
                it2.putExtra("res","http://www.results.manabadi.co.in/2016/ap/original/inter-2NDyear/ap-intermediate-2nd-year-regular-exam-results-2016.htm");
                startActivity(it2);
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it3=new Intent(results.this,MainActivity.class);
                it3.putExtra("res","http://jntukresults.edu.in/view-results-56735763.html");
                startActivity(it3);
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it4=new Intent(results.this,MainActivity.class);
                it4.putExtra("res","https://jntukresults.edu.in/view-results-56735811.html");
                startActivity(it4);
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it5=new Intent(results.this,MainActivity.class);
                it5.putExtra("res","https://jntukresults.edu.in/view-results-56735876.html");
                startActivity(it5);
            }
        });

    }
}
