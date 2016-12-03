package com.example.wn81.patient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Hasta> listofPatients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listofPatients= new ArrayList<>();
    }
    public void add (View v){
        EditText etName= (EditText) findViewById(R.id.adi);
        EditText etSurName= (EditText) findViewById(R.id.sayadi);



        String HstName=etName.getText().toString();
        String HstSurname=etSurName.getText().toString();

        Hasta hasta=new Hasta(HstName,HstSurname);

        listofPatients.add(hasta);
        Log.i("", "Hastanın Adı: "+HstName+"\n" +"Hastanın Soyadı: "+HstSurname);
        Toast.makeText(getApplicationContext(), "Kayıt İşlemi Tamamlandı", Toast.LENGTH_LONG).show();





    }
    public void list (View v){

        TextView tvList= (TextView) findViewById(R.id.textView);

        String listAsString="";

        for (Hasta hastasd:listofPatients){
            listAsString=listAsString+ "Hastanın Adı: "+ hastasd.name +"\n"+"Hastanın Soyadı: "+hastasd.surName+"\n"+"\n";
        }
        tvList.setText(listAsString);


    }
}
