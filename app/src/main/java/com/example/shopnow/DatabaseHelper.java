package com.example.shopnow;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;

import androidx.annotation.Nullable;

import java.sql.Blob;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="register.db";
    public static final String TABLE_NAME="regUserTable";

    public static final String Col_1="ID";
    public static final String Col_2="Name";
    public static final String Col_3="EmailId";
    public static final String Col_4="Password";
    public static final String Col_5="ProfilePic";

    public DatabaseHelper( Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE regUserTable (ID INTEGER PRIMARY KEY AUTOINCREMENT,Name TEXT,EmailId TEXT,Password PASSWORD)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);

    }

    public long addUser(String user, String password, String email) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put("Name",user);
        contentValues.put("Password",password);
        contentValues.put("EmailId",email);
//        contentValues.put("ProfilePic",profilepic);

        long res = db.insert("regUserTable",null,contentValues);

        db.close();
        return res;
    }

    public boolean checkUser(String username, String password){
        String[] columns = { Col_1};
        SQLiteDatabase db = getReadableDatabase();
        String selection = Col_2 + "=?" + "and "+ Col_4 + "=?";
        String[] selectionArgs= { username,password};
        Cursor cursor = db.query(TABLE_NAME,columns,selection,selectionArgs,null,null,null);
        int count = cursor.getCount();
        cursor.close();
        db.close();

        if(count>0)
            return  true;
        else
            return  false;
    }


}
