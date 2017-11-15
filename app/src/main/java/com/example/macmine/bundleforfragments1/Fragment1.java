package com.example.macmine.bundleforfragments1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {

    Button btnCallFrag;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment1, container, false);
        init(v);
        return v;
    }

    private void init(View v) {


        btnCallFrag = (Button) v.findViewById(R.id.btn_callFrag);

        btnCallFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle = new Bundle();
                bundle.putString("mName","Ajay Mehta");
                bundle.putInt("mAge" ,24);



                Fragment2 fragment = new Fragment2();
                FragmentManager fragmentManager = getFragmentManager();
                if (fragment != null) {
                    fragment.setArguments(bundle);         // attaching bundle with fragment to send data to that fragment...
                    fragmentManager.beginTransaction()
                            .replace(R.id.container_body, fragment).commit();
                } else {
                    Log.e("MainActivity", "Error in creating fragment");
                }


            }
        });


    }




}
