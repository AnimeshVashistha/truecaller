package com.example.animesh.truecaller.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.animesh.truecaller.model.TrueCaller;

public class DBHelper2 extends SQLiteOpenHelper {

    Context context;

    private SQLiteDatabase db;
public void DBHelper2(Context context ,SQLiteDatabase db)
{

}
    public DBHelper2(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "truecallerdb.sqlite", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table Caller (name text, email text, phone text, mygroup text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {


    }

    public void insertData(TrueCaller trueCaller)
    {

        db.execSQL("insert into Caller values ('Animesh', 'anime.vash@gmail.com', '+981234567','E')");
        db.execSQL("insert into Caller values ('"+trueCaller.getName()+ "', '"+trueCaller.getEmail()+ "','"+trueCaller.getPhone()+ "','"+trueCaller.getGroup()+ "')");
    }

    public TrueCaller loadData()
    {
     db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from Caller",null);

        while (cursor.moveToNext())
        {
           return new TrueCaller(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3));
        }

        return null;

    }
}
