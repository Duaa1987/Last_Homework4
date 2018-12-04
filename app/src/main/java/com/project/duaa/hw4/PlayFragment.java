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
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PlayFragment extends Fragment {


    public PlayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        final View v1 = inflater.inflate(R.layout.fragment_play, container, false);

        final TextView textView=(TextView)v1.findViewById(R.id.textView);
      //

        final DataBaseHelper myDb;
        final EditText editName,editgold ;
        final TextView editPack;
        Button btnAddData;
        Button btnviewAll;


        myDb = new DataBaseHelper(getActivity());

        editPack = (TextView)v1.findViewById(R.id.TextView_Pack);

        /**
        btnAddData.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 boolean isInserted = myDb.insertData(editName.getText().toString(),
                         editgold.getText().toString(),
                         editPack.getText().toString() );
                 if(isInserted == true)
                     Toast.makeText(getActivity(),"Data Inserted",Toast.LENGTH_LONG).show();
                 else
                     Toast.makeText(getActivity(),"Data not Inserted",Toast.LENGTH_LONG).show();  }
         });



        //

            btnviewAll.setOnClickListener(
                    new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Cursor res = myDb.getAllData();
                            if(res.getCount() == 0) {
                                // show message
                                showMessage("Error","Nothing found");
                                return;
                            }

                            StringBuffer buffer = new StringBuffer();
                            while (res.moveToNext()) {
                                buffer.append("Id :"+ res.getString(0)+"\n");
                                buffer.append("Name :"+ res.getString(1)+"\n");
                                buffer.append("Gold :"+ res.getString(2)+"\n");
                                buffer.append("Pack :"+ res.getString(3)+"\n\n");
                            }

                            // Show all data
                            showMessage("Data",buffer.toString());
                        }
                    }
            );




*/

        return v1;
    }




}
