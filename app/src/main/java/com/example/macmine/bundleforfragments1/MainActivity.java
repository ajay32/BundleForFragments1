package com.example.macmine.bundleforfragments1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadfragment(new Fragment1(), true, "fragment1");
    }


    public void loadfragment(Fragment fragment, boolean isbackstack, String name) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        if (fragment != null) {
            if (isbackstack) {
                fragmentManager.beginTransaction()
                        .replace(R.id.container_body, fragment).addToBackStack(name).commit();
            } else {
                fragmentManager.beginTransaction()
                        .replace(R.id.container_body, fragment).commit();
            }
        } else {
            Log.e("ajaymehta", "Error in creating fragment");
        }
    }
}
