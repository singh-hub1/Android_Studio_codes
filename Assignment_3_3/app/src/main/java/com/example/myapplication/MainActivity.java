package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
EditText e1,e2;
TextView t1;
int n1,n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public boolean getData()
    {
        e1 = (EditText) findViewById(R.id.num1);

        e2 = (EditText) findViewById(R.id.num2);


        t1 = (TextView) findViewById(R.id.result);

        String str1 = e1.getText().toString();

        String str2 = e2.getText().toString();

        /*

        if (str1.isEmpty()&& str2.isEmpty())
        {

        if((str1.equals("") && str2.equals("")))
        {
            String res="please enter a value!!";
            t1.setText(res);
            return  false;
        }
        else
        {
            n1=Integer.parseInt(str1);
            n2=Integer.parseInt(str2);
        }
        return true;

        }

*/
        if (str1.isEmpty() || str2.isEmpty()) {
            Toast.makeText(this, "Value can't be empty", Toast.LENGTH_SHORT).show();
            return false;
        }
        else
        {
            n1=Integer.parseInt(str1);
            n2=Integer.parseInt(str2);
        }
        return true;
    }

    public void doSum(View v)
    {
            if (getData())
            {
                int sum = n1 + n2;
                t1.setText(Integer.toString(sum));
                Toast.makeText(this, "sum operation perform", Toast.LENGTH_SHORT).show();
            }

    }

    public void doSub(View v)
    {
        if (getData())
        {
            int sum = n1 - n2;
            t1.setText(Integer.toString(sum));
            Toast.makeText(this, "Subtraction operation perform ", Toast.LENGTH_SHORT).show();
        }
    }

    public void doPow(View v)
    {
       if (getData())
       {
            double sum = Math.pow(n1,n2);
            t1.setText(Double.toString(sum));
           Toast.makeText(this, "Power operation perform", Toast.LENGTH_SHORT).show();
        }
    }

    public void doMul(View v)
    {
        if (getData())
        {
            int sum = n1 * n2;
            t1.setText(Integer.toString(sum));
            Toast.makeText(this, "Multiplication operation perform ", Toast.LENGTH_SHORT).show();
        }
    }

    public void doDiv(View v)
    {
            if (getData())
            {
                if(n2!=0)
                {
                    double sum = n1 / (n2 * 1.0);
                    t1.setText(Double.toString(sum));
                    Toast.makeText(this, "Division operation perform", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "number can't be zero!!", Toast.LENGTH_SHORT).show();
                }
            }



    }

    public void doMod(View v)
    {
            if(getData())
            {
                if(n2!=0)
                {
                    double sum = n1 % n2;
                    t1.setText(Double.toString(sum));
                    Toast.makeText(this, "Modulus operation perform", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(this, "number can't be zero!!", Toast.LENGTH_SHORT).show();
                }

            }
        }

    }

