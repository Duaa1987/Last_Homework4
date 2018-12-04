package com.project.duaa.hw4;


import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BrowseCollection extends Fragment {
     DataBaseHelper2 myDb;
     ArrayList<String>listItem;
     ArrayAdapter adapter;
     ListView userlist;
    public BrowseCollection() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        final View v1 = inflater.inflate(R.layout.fragment_browse_collection, container, false);


        final TextView textView=(TextView)v1.findViewById(R.id.textView);
        //

        final EditText editName,editgold ;
        final TextView editPack;
        //Button btnAddData;
        Button btnviewAll;



        myDb = new DataBaseHelper2(getActivity());
        editPack = (TextView)v1.findViewById(R.id.TextView_Pack);
       // btnviewAll=(Button)v1.findViewById(R.id.button_viewAll);
        userlist=(ListView)v1.findViewById(R.id.users_list);


        listItem=new ArrayList<>();
         viewdata();

         userlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                 String text=userlist.getItemAtPosition(i).toString();
                 Toast.makeText(getActivity(),"hhd"+text,Toast.LENGTH_LONG).show();

             }
         });





       /* btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData2();


                        if(res.getCount() == 0) {
                            // show message
                           // showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();

                           while (res.moveToNext()) {
                               int z  =Integer.valueOf(res.getString(2));
                               if(z>0) {
                                   //buffer.append("Id :"+ res.getString(0)+"\n");
                                   buffer.append("Name :" + res.getString(1) + "\n");
                                   buffer.append("Times :" + res.getString(2) + "\n\n");
                                   // buffer.append("Pack :"+ res.getString(3)+"\n\n");
                               }
                        }

                        // Show all data
                        showMessage("You Purchase .. ",buffer.toString());

                    }
                }
        );
       */
        return v1;
    }

    private void viewdata() {

        Cursor cursor= myDb.ViewData();

        if(cursor.getCount()==0){
            Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();
        }else
        {
            while(cursor.moveToNext())
                listItem.add(cursor.getString(1));
               // listItem.add(cursor.getString(2));

        }
        adapter=new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,listItem);
        userlist.setAdapter(adapter);
    }


    private void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
         builder.setCancelable(true);
         builder.setTitle(title);
         builder.setMessage(Message);
         builder.show();
      }
    }








