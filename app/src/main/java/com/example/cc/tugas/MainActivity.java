package com.example.cc.tugas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openalamat(View v){
        Uri uri = Uri.parse("geo:-6.903444, 110.623087="+ Uri.encode("Rumah Kediaman"));
        Intent it = new Intent(Intent.ACTION_VIEW,uri);
        it.setPackage("com.google.android.apps.maps");
        startActivity(it);
    }
    public void opentelp(View v){
        TextView Phone = (TextView) findViewById(R.id.Phone);
        String phone =Phone.getText().toString();

        Uri uri = Uri.parse("tel:"+phone);
        Intent it = new Intent(Intent.ACTION_DIAL,uri);
        startActivity(it);
    }
    public void klikemail(View v){
        TextView email =(TextView) findViewById(R.id.email);
        String Email = email.getText().toString();

        Intent intent =new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,Email);
        intent.putExtra(Intent.EXTRA_SUBJECT,"Android Layout");
        intent.putExtra(Intent.EXTRA_TEXT,"Lagi Belajar Android");
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent,"Choose an App"));
    }
}
