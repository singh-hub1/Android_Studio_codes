package com.example.myapplication;

import android.app.AlertDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private EditText e1,e2,e3,e4;
    private Button b1,b2;
    private DBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1 = findViewById(R.id.ed1);
        e2 = findViewById(R.id.ed2);
        e3 = findViewById(R.id.ed3);
        e4 = findViewById(R.id.ed4);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);

        dbHandler = new DBHandler(MainActivity.this);

        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                String str3 = e3.getText().toString();
                String str4 = e4.getText().toString();


                if (str1.isEmpty() && str2.isEmpty() && str3.isEmpty() && str4.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Please enter all the data..", Toast.LENGTH_SHORT).show();
                    return;
                }

                Boolean insert=dbHandler.addNewCourse(str1, str2, str3, str4);

                if (insert==true)
                {
                    Toast.makeText(MainActivity.this, "Data has been added.", Toast.LENGTH_SHORT).show();
                    e1.setText("");
                    e2.setText("");
                    e3.setText("");
                    e4.setText("");

                }
                else
                {
                    Toast.makeText(MainActivity.this, "Data not added!!", Toast.LENGTH_SHORT).show();
                }

            }
        });



        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Cursor res = dbHandler.getAllData();
                if(res.getCount() == 0)
                {
//                    showMessage("Error","Nothing found");
                    Toast.makeText(MainActivity.this, "No Data found!!", Toast.LENGTH_SHORT).show();
                    return;
                }

                StringBuffer buffer = new StringBuffer();
                while (res.moveToNext()) //read data as row wise
                {
                    buffer.append("Comapny ID :"+ res.getInt(0)+"\n");
                    buffer.append("Comapny name :"+ res.getString(1)+"\n");
                    buffer.append("Comapny Address :"+ res.getString(2)+"\n");
                    buffer.append("Comapny Phone :"+ res.getString(3)+"\n");

                }
                showMessage(" :: Comapny Details :: ",buffer.toString());
            }
        });
 }


    public void showMessage(String title,String Message)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);//agar wo alert dialog box ke bahar click kiya toh cancel ho jayega
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }
}
