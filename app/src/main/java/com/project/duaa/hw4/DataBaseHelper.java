package com.project.duaa.hw4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DataBaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "Student";
    public static final String TABLE_NAME = "student_table";
    public static final String COL_1 = "ID";
    public static final String COL_2 = "GOLD";




    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME +" (ID INTEGER PRIMARY KEY AUTOINCREMENT,GOLD INTEGER)");
        insertData(db, 2000);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);
    }

    public void insertData(SQLiteDatabase db, int gold) {
      //  SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,gold);
        db.insert(TABLE_NAME,null ,contentValues);
    }




    public Cursor getAllData() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor res = db.rawQuery("select * from "+TABLE_NAME,null);
        return res;
    }



   // public boolean updateData(int id,int gold) {
    //    SQLiteDatabase db = this.getWritableDatabase();
     //   ContentValues contentValues = new ContentValues();
     //   contentValues.put(COL_2,gold);
      //  db.update(TABLE_NAME, contentValues, "ID = " + 1);

       // db.execSQL("UPDATE "+ DATABASE_NAME + " SET " + "GOLD" + "=" + "'" + gold + "'" + " WHERE " + "ID" + "= " + 1 );


        public boolean updateData(String id,String gold) {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(COL_1,1);
            contentValues.put(COL_2,gold);
            db.update(TABLE_NAME, contentValues, "ID = ?",new String[] { id });
                      return true;
           }

    public Integer deleteData (String id) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "ID = ?",new String[] {id});
    }
}