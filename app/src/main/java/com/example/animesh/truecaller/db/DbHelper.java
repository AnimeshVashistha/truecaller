package com.example.animesh.truecaller.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.animesh.truecaller.model.TrueCaller;

public class DbHelper extends SQLiteOpenHelper {

    // The name of the database
    private static final String DATABASE_NAME = "trueCaller.db";
    private static final String TABLE_NAME = "Caller";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NAME = "name";
    private static final String COLUMN_EMAIL = "email";
    private static final String COLUMN_PHONE = "phoneNum";
    private static final String COLUMN_GROUP = "group";

    // If you change the database schema, you must increment the database version
    private static final int VERSION = 1;


    // Constructor
    DbHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }


    /**
     * Called when the tasks database is created for the first time.
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create tasks table (careful to follow SQL formatting rules)
        final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY, " +
                COLUMN_NAME + " TEXT NOT NULL, " +
                COLUMN_EMAIL + " TEXT NOT NULL," +
                COLUMN_PHONE + " TEXT NOT NULL," +
                COLUMN_GROUP + "TEXT NOT NULL);";

        db.execSQL(CREATE_TABLE);
    }


    /**
     * This method discards the old table of data and calls onCreate to recreate a new one.
     * This only occurs when the version number for this database (DATABASE_VERSION) is incremented.
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

//
//    public void insertData(TrueCaller trueCaller) {
//
////        db.execSQL("insert into Caller values ('Animesh', 'anime.vash@gmail.com', '+981234567','E')");
//        db.execSQL("insert into Caller values ('" + trueCaller.getName() + "', '" + trueCaller.getEmail() + "','" + trueCaller.getPhone() + "','" + trueCaller.getGroup() + "')");
//    }
//
//    public TrueCaller loadData() {
//        db = getReadableDatabase();
//        Cursor cursor = db.rawQuery("select * from Caller", null);
//
//        while (cursor.moveToNext()) {
//            return new TrueCaller(cursor.getString(0), cursor.getString(1), cursor.getString(2), cursor.getString(3));
//        }
//
//        return null;
//
//    }
}
