package com.example.animesh.truecaller.activity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.animesh.truecaller.R;
import com.example.animesh.truecaller.db.DBHelper2;
import com.example.animesh.truecaller.model.TrueCaller;

public class MainActivity extends AppCompatActivity {

    TextInputEditText name, email, phone, group; //It can be different than the id
   // String NAME , EMAIL,PHONE,GROUP;

    DBHelper2 dbHelper2;

    //TrueCaller trueCaller;
    Context context ;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.txtName);
        email = findViewById(R.id.txtEmail);
        phone = findViewById(R.id.txtPhone);
        group = findViewById(R.id.txtGroup);

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menulist,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.save)
        {
            Toast.makeText(this,"Save is selected",Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId()==R.id.help)
        {
            Toast.makeText(this,"Help is selected",Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
    public void save(View view) {

        String NAME =name.getText().toString();
        String EMAIL =email.getText().toString();
        String PHONE =phone.getText().toString();
        String GROUP =group.getText().toString();

Log.e("name",NAME);
        Log.e("name",EMAIL);
        Log.e("name",PHONE);
        Log.e("name",GROUP);

       // trueCaller=new TrueCaller(NAME,EMAIL,PHONE,GROUP);
        // truecaller object must be unique  and have to with Constructor of class

    dbHelper2.insertData(new TrueCaller(NAME,EMAIL,PHONE,GROUP));
    }

    public void cancel(View view) {
        finish();
    }
}
