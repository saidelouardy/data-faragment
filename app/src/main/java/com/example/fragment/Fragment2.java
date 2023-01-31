package com.example.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    TextView ffname , llname , nnumber;
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_2, container, false);
       getParentFragmentManager().setFragmentResultListener("fragment", this, new FragmentResultListener() {
           @Override
           public void onFragmentResult(@NonNull String requestKey, @NonNull Bundle result) {
               String firtNmae = result.getString("ef");
               String lastNmae = result.getString("el");
               String number = result.getString("en");
               ffname =view.findViewById(R.id.ffname);
               llname =view.findViewById(R.id.llname);
               nnumber =view.findViewById(R.id.nnumber);
               ffname.setText(firtNmae);
               llname.setText(lastNmae);
               nnumber.setText(number);
           }
       });
        return view;
    }
}