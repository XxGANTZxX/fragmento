package com.example.fragmento;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  rojoclick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Rojo fragment = new Rojo();
        fragmentTransaction.replace(R.id.frames, fragment);
        fragmentTransaction.commit();
    }
    public void  azulclick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Azul fragment = new Azul();
        fragmentTransaction.replace(R.id.frames, fragment);
        fragmentTransaction.commit();
    }
    public void  verdeclick(View view) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        Verde fragment = new Verde();
        fragmentTransaction.replace(R.id.frames, fragment);
        fragmentTransaction.commit();
    }
}

