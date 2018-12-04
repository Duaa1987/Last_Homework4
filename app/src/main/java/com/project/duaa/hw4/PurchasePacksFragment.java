package com.project.duaa.hw4;


import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class PurchasePacksFragment extends Fragment {
    TextView textView1,textView2,textView3,textView4,textView5,textView6,buycard,remain,Txt_Display;
    TextView name1,name2,name3,name4,name5,name6;
    Button button,confirm;

    public PurchasePacksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final DataBaseHelper myDb;
        final DataBaseHelper2 myDb2;

        Button btnviewAll;


        // Inflate the layout for this fragment

        final View v1 = inflater.inflate(R.layout.fragment_purchase_packs, container, false);
        ImageButton imageButton,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6;
             //
        myDb = new DataBaseHelper(getActivity());
        myDb2 = new DataBaseHelper2(getActivity());

        Cursor res = myDb.getAllData();
        res.moveToFirst();
        int gold = res.getInt(1);
        Txt_Display=(TextView) v1.findViewById(R.id.Txt_Display);
        Txt_Display.setText(String.valueOf(gold));

        textView1=(TextView) v1.findViewById(R.id.textView);
        textView2=(TextView) v1.findViewById(R.id.textView2);
        textView3=(TextView) v1.findViewById(R.id.textView3);
        textView4=(TextView) v1.findViewById(R.id.textView4);
        textView5=(TextView) v1.findViewById(R.id.textView5);
        textView6=(TextView) v1.findViewById(R.id.textView6);
        buycard=(TextView) v1.findViewById(R.id.buyCard);
        remain=(TextView) v1.findViewById(R.id.remain);

        button=(Button) v1.findViewById(R.id.button1);
        confirm=(Button) v1.findViewById(R.id.confirm);


        name1=(TextView) v1.findViewById(R.id.name1);
        name2=(TextView) v1.findViewById(R.id.name2);
        name3=(TextView) v1.findViewById(R.id.name3);
        name4=(TextView) v1.findViewById(R.id.name4);
        name5=(TextView) v1.findViewById(R.id.name5);
        name6=(TextView) v1.findViewById(R.id.name6);


        imageButton=(ImageButton)v1.findViewById(R.id.imagebutton1);
        imageButton2=(ImageButton)v1.findViewById(R.id.imageButton2);
        imageButton3=(ImageButton)v1.findViewById(R.id.imageButton3);
        imageButton4=(ImageButton)v1.findViewById(R.id.imageButton4);
        imageButton5=(ImageButton)v1.findViewById(R.id.imageButton5);
        imageButton6=(ImageButton)v1.findViewById(R.id.imageButton6);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView1.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView1.setText(String.valueOf(intPackValue));

                //

              //  boolean isInserted = myDb2.insertData2(name1.getText().toString(),
                     //   textView1.getText().toString());

               /* int s=Integer.parseInt(textView1.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));
                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();

               */

            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView2.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView2.setText(String.valueOf(intPackValue));


                //

              //  boolean isInserted = myDb2.insertData2(name2.getText().toString(),
                  //      textView2.getText().toString());

                //
                int s=Integer.parseInt(textView2.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                /*int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));

                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();
                    */
            }
        });


        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView3.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView3.setText(String.valueOf(intPackValue));


                //
              //  boolean isInserted = myDb2.insertData2(name3.getText().toString(),
              //          textView3.getText().toString());
                /*
                int s=Integer.parseInt(textView3.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));
                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();
                */
            }
        });


        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView4.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView4.setText(String.valueOf(intPackValue));

                //

              //  boolean isInserted = myDb2.insertData2(name4.getText().toString(),
              //          textView4.getText().toString());

                /*

                int s=Integer.parseInt(textView4.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));
                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();

                    */
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView5.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView5.setText(String.valueOf(intPackValue));

                //

                boolean isInserted = myDb2.insertData2(name5.getText().toString(),
                        textView5.getText().toString());

                /*
                int s=Integer.parseInt(textView5.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));
                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();
                    */
            }
        });


        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String PackValue=textView6.getText().toString();
                int intPackValue=Integer.parseInt(PackValue);
                intPackValue++;

                textView6.setText(String.valueOf(intPackValue));

               // boolean isInserted = myDb2.insertData2(name6.getText().toString(),
               //         textView6.getText().toString());

                /*
                int s=Integer.parseInt(textView6.getText().toString());
                int have=Integer.parseInt(Txt_Display.getText().toString());
                int remained=have-s*100;
                boolean isUpdate = myDb.updateData("1",
                        String.valueOf(remained));
                if(isUpdate == true)
                    Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                else
                    Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();
                    */
            }
        });


         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 int Value1=Integer.parseInt(textView1.getText().toString());
                 int Value2=Integer.parseInt(textView2.getText().toString());
                 int Value3=Integer.parseInt(textView3.getText().toString());
                 int Value4=Integer.parseInt(textView4.getText().toString());
                 int Value5=Integer.parseInt(textView5.getText().toString());
                 int Value6=Integer.parseInt(textView6.getText().toString());


                 int sum=0;

                 sum=(Value1+Value2+Value3+Value4+Value5+Value6)*100;


                 buycard.setText(String.valueOf(sum));

                // int sum=Integer.parseInt(buycard.getText().toString());

                 remain();

             }
         });

        confirm.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                   boolean isUpdate = myDb.updateData("1",
                             remain.getText().toString());
                     if(isUpdate == true)
                         Toast.makeText(getActivity(),"Data Update",Toast.LENGTH_LONG).show();

                     else
                         Toast.makeText(getActivity(),"Data not Updated",Toast.LENGTH_LONG).show();


                 boolean isInserted = myDb2.insertData2(name1.getText().toString(),
                         textView1.getText().toString());
                 boolean isInserted2 = myDb2.insertData2(name2.getText().toString(),
                         textView2.getText().toString());
                 boolean isInserted3 = myDb2.insertData2(name3.getText().toString(),
                         textView3.getText().toString());
                 boolean isInserted4 = myDb2.insertData2(name4.getText().toString(),
                         textView4.getText().toString());
                 boolean isInserted5 = myDb2.insertData2(name5.getText().toString(),
                         textView5.getText().toString());
                 boolean isInserted6 = myDb2.insertData2(name6.getText().toString(),
                         textView6.getText().toString());




                 textView1.setText("0");
                 textView2.setText("0");
                 textView3.setText("0");
                 textView4.setText("0");
                 textView5.setText("0");
                 textView6.setText("0");

             }
         });


        return v1;
    }

    private void remain() {
        int sum=Integer.parseInt(buycard.getText().toString());
        int have=Integer.parseInt(Txt_Display.getText().toString());
        int remained=have-sum;
        if(remained<=0)
            Toast.makeText(getActivity(),"your gold is not enough",Toast.LENGTH_LONG).show();
            else
            remain.setText(String.valueOf(remained));


    }
     
}
