package com.project.duaa.hw4;


import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayerStatusFragment extends Fragment {


    public PlayerStatusFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View v1 = inflater.inflate(R.layout.fragment_player_status, container, false);

        DataBaseHelper myDb;
        final TextView Txt_Display;

        myDb = new DataBaseHelper(getActivity());
        Cursor res = myDb.getAllData();
        res.moveToFirst();
        int gold = res.getInt(1);
        Txt_Display=(TextView) v1.findViewById(R.id.textView);
        Txt_Display.setText("GOLD: " + gold + "");


            return v1;
    }


}