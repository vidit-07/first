package com.example.dbapp.dbfiles;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class mydatabase {
public static final String MY_DB = "empDB";
Context mycontext;
myhell mh;
SQLiteDatabase sdb;

public mydatabase(Context context){
    this.mycontext = context;
    mh = new myhell(mycontext,MY_DB,null,1);

}

public void open(){
    sdb=mh.getReadableDatabase();
}
public void insertemp(ContentValues cv){
    sdb.insert("emplo   yee",null,cv);
}


public Cursor getEmp(){
 sdb = mh.getReadableDatabase();
 Cursor c = sdb.query("employee",null,null,null,null,null,null);
 return c;
}
}
