package com.example.ravi.sd;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    Button b;
    EditText et;
    TextView t;
    int c=3;
    String name;
    ImageView iv2;
    private CheckBox checkBoxRememberMe;
    //DatabaseHelper mydb;
    //Session session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //mydb=new DatabaseHelper(this);
        //setTitle("Login Page");
        /*if(session.login()){
            startActivity(new Intent(this,HomeActivity.class));
        }*/
        iv2=(ImageView)findViewById(R.id.imageView4);
        iv2.setImageResource(R.drawable.logowide);
        b=(Button) findViewById(R.id.but);
        et=(EditText) findViewById(R.id.textf);
        if (!new PrefManager(this).isUserLogedOut()) {
            //user's email and password both are saved in preference
            startHomeActivity();
        }
        b.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                name=et.getText().toString();
                if(name.equals("0535")||name.equals("0544")||name.equals("0545")||name.equals("0525")||name.equals("0543")||name.equals("0510")||name.equals("0541")||name.equals("0542")) {
                    /*if (checkBoxRememberMe.isChecked())
                                saveLoginDetails(name);*/
                    startHomeActivity();
                    //mydb.insertData(name);


                }else{
                    c--;
                    et.setError("INVALID PIN");
                    et.requestFocus();
                    if(c==0){
                        String msg1="Login failed";
                        Toast.makeText(loginActivity.this,msg1,Toast.LENGTH_LONG).show();
                        b.setEnabled(false);
                    }
                }
            }
        });
    }

    private void startHomeActivity() {
        Intent t = new Intent(loginActivity.this,HomeActivity.class);
        t.putExtra("pin", name);
        startActivity(t);
    }
   /* private void saveLoginDetails(String pin) {
        new PrefManager(this).saveLoginDetails(pin);
    }*/
    boolean twice= false;
    @Override
    public void onBackPressed(){
        if(twice==true){
            Intent intent=new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            finish();
            System.exit(0);
        }
        //super.onBackPressed();
        Toast.makeText(loginActivity.this,"press again to exit",Toast.LENGTH_LONG).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               twice=true;
            }
        },1000);

    }
}
