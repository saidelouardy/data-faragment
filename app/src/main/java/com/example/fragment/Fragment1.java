package com.example.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Fragment1 extends Fragment {
    Button button;
    EditText edf , edl , edn;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view= inflater.inflate(R.layout.fragment_1, container, false);
         button = view.findViewById(R.id.buttonfragment);
        edf = view.findViewById(R.id.efname);
        edl = view.findViewById(R.id.elname);
        edn = view.findViewById(R.id.enumber);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Bundle b =new Bundle();
                 b.putString("ef", edf.getText().toString());
                 b.putString("el", edl.getText().toString());
                 b.putString("en", edn.getText().toString());
                 getParentFragmentManager().setFragmentResult("fragment",b);
             }
         });
        return view;


    }
}