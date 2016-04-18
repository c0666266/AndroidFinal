package com.example.jatin.splitter;


import java.util.ArrayList;
import java.util.Date;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class AddMoneyDB2 extends SQLiteOpenHelper{
          SQLiteDatabase sqlDB;
        // database constants
        public static final String DB_NAME = "splitter.db";
        public static final int    DB_VERSION = 1;

        //Table constants
        public static final String person2 = "jatinder";

        //column constants
        public static final String col1 = "id";
        public static final String col2 = "description";
        public static final String col3 = "toGive";
        public static final String col4 = "dateAdded";
        public static final String col5 = "toTake";

    public AddMoneyDB2(Context context) {
        super(context, DB_NAME, null, 1);
    }

    @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("create table " + person2 + "(" + col1 + " INTEGER PRIMARY KEY," + col2 + " TEXT," + col3 + " TEXT,"
                    + col4 + " TEXT," + col5 + " TEXT)");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion,
                              int newVersion) {
            db.execSQL("Drop Table If Exist " + person2);
            onCreate(db);
        }

        public Integer addData2(Money m){
            ContentValues values = new ContentValues();
            values.put( col2, m.getDescription());
            values.put( col3, m.getToGive());
            values.put( col4, new Date().toString());
            values.put( col5, m.getToTake());

            sqlDB = this.getWritableDatabase();

            long isInserted = sqlDB.insert(person2, null, values);
            if (isInserted == -1) {
                return 0;
            } else {
                return 1;
            }
        }


    }


