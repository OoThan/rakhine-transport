package com.transportation.lm14.transport.transport_fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.transportation.lm14.transport.R;

public class TrainFragment extends Fragment {

    Button ow,rw;
    public TrainFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_train, container, false);
        /*ow = (Button)v.findViewById(R.id.oway);
        rw = (Button)v.findViewById(R.id.rway);*/

        /*ow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(new BusFragmentOneWay());
            }
        });

        rw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChangeFragment(new BusFragmentMultiCity());
            }
        });*/

        return  v;
    }

}
