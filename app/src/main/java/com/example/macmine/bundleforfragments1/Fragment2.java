package com.example.macmine.bundleforfragments1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment {

    TextView name, age;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        init(v);
        return  v;
    }

    private void init(View v) {

        name = (TextView) v.findViewById(R.id.name);
        age = (TextView) v.findViewById(R.id.age);


      String myName = getArguments().getString("mName");    // getting data from Fragment1 ...sending from there thorugh bundle by attaching it to fragment when calling..
        int myAge = getArguments().getInt("mAge");


        name.setText("Name: "+myName);
        age.setText("Age: "+String.valueOf(myAge));


    }

}
