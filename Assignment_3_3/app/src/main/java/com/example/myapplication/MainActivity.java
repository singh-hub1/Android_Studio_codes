package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
EditText e1;
float res1,res2;
boolean Add,Sub,Mul,Div;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3);
        b4=(Button)findViewById(R.id.btn4);
        b5=(Button)findViewById(R.id.btn5);
        b6=(Button)findViewById(R.id.btn6);
        b7=(Button)findViewById(R.id.btn7);
        b8=(Button)findViewById(R.id.btn8);
        b9=(Button)findViewById(R.id.btn9);
        b10=(Button)findViewById(R.id.btn10);
        b11=(Button)findViewById(R.id.btn11);
        b12=(Button)findViewById(R.id.btn12);
        b13=(Button)findViewById(R.id.btn13);
        b14=(Button)findViewById(R.id.btn14);
        b15=(Button)findViewById(R.id.btn15);
        b16=(Button)findViewById(R.id.btn16);
        b17=(Button)findViewById(R.id.btn17);
        e1=(EditText)findViewById(R.id.ed);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"3");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"4");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"5");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"6");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"7");
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"8");
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"9");
            }
        });


        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+".");
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(e1.getText()+"0");
            }
        });

        //////////////////////////////////////////////////ARITHEMTIC OPERATION //////////////////////////////////////////////////////////////////////////////////

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(e1==null)
                {
//                    e1.setText("");
                    e1.setText("0");
                }
                else
                {
//                  res1=Float.parseFloat(e1.getText().toString());
                    res1=Float.parseFloat(e1.getText()+"");
                    Add=true;
                    e1.setText(null);

                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(e1==null)
                {
//                    e1.setText("");
                    e1.setText("0");
                }
                else
                {
//                  res1=Float.parseFloat(e1.getText().toString());
                    res1=Float.parseFloat(e1.getText()+"");
                    Sub=true;
                    e1.setText(null);

                }
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(e1==null)
                {
//                    e1.setText("");
                    e1.setText("0");
                }
                else
                {
//                  res1=Float.parseFloat(e1.getText().toString());
                    res1=Float.parseFloat(e1.getText()+"");
                    Mul=true;
                    e1.setText(null);

                }
            }
        });


        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(e1==null)
                {
//                    e1.setText("");
                    e1.setText("0");
                }
                else
                {
//                  res1=Float.parseFloat(e1.getText().toString());
                    res1=Float.parseFloat(e1.getText()+"");
                    Div=true;
                    e1.setText(null);

                }
            }
        });

        ////////////////////////////////////////////////////////////////////////

        b17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                res2=Float.parseFloat(e1.getText().toString());
                if(Add==true)
                {
                    e1.setText(res1+res2+" ");
                    Add=false;
                }

                if(Sub==true)
                {
                    e1.setText(res1-res2+" ");
                    Sub=false;
                }


                if(Mul==true)
                {
                    e1.setText(res1*res2+" ");
                    Mul=false;
                }


                if(Div==true)
                {
                    if(res2!=0)
                    {
                        e1.setText(res1/res2+" ");
                        Div=false;
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this,"operation can't be possible sorry!", Toast.LENGTH_SHORT).show();
                    }

                }

            }
        });

        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               e1.setText(" ");
            }
        });


    }


//    public boolean getData()
//    {
//        e1 = (EditText) findViewById(R.id.num1);
//
//        e2 = (EditText) findViewById(R.id.num2);
//
//
//        t1 = (TextView) findViewById(R.id.result);
//
//        String str1 = e1.getText().toString();
//
//        String str2 = e2.getText().toString();
//
//        /*
//
//        if (str1.isEmpty()&& str2.isEmpty())
//        {
//
//        if((str1.equals("") && str2.equals("")))
//        {
//            String res="please enter a value!!";
//            t1.setText(res);
//            return  false;
//        }
//        else
//        {
//            n1=Integer.parseInt(str1);
//            n2=Integer.parseInt(str2);
//        }
//        return true;
//
//        }
//
//*/
//        if (str1.isEmpty() || str2.isEmpty()) {
//            Toast.makeText(this, "Value can't be empty", Toast.LENGTH_SHORT).show();
//            return false;
//        }
//        else
//        {
//            n1=Integer.parseInt(str1);
//            n2=Integer.parseInt(str2);
//        }
//        return true;
//    }
//
//    public void doSum(View v)
//    {
//            if (getData())
//            {
//                int sum = n1 + n2;
//                t1.setText(Integer.toString(sum));
//                Toast.makeText(this, "sum operation perform", Toast.LENGTH_SHORT).show();
//            }
//
//    }
//
//    public void doSub(View v)
//    {
//        if (getData())
//        {
//            int sum = n1 - n2;
//            t1.setText(Integer.toString(sum));
//            Toast.makeText(this, "Subtraction operation perform ", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void doPow(View v)
//    {
//       if (getData())
//       {
//            double sum = Math.pow(n1,n2);
//            t1.setText(Double.toString(sum));
//           Toast.makeText(this, "Power operation perform", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void doMul(View v)
//    {
//        if (getData())
//        {
//            int sum = n1 * n2;
//            t1.setText(Integer.toString(sum));
//            Toast.makeText(this, "Multiplication operation perform ", Toast.LENGTH_SHORT).show();
//        }
//    }
//
//    public void doDiv(View v)
//    {
//            if (getData())
//            {
//                if(n2!=0)
//                {
//                    double sum = n1 / (n2 * 1.0);
//                    t1.setText(Double.toString(sum));
//                    Toast.makeText(this, "Division operation perform", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                    Toast.makeText(this, "number can't be zero!!", Toast.LENGTH_SHORT).show();
//                }
//            }
//
//
//
//    }
//
//    public void doMod(View v)
//    {
//            if(getData())
//            {
//                if(n2!=0)
//                {
//                    double sum = n1 % n2;
//                    t1.setText(Double.toString(sum));
//                    Toast.makeText(this, "Modulus operation perform", Toast.LENGTH_SHORT).show();
//                }
//                else
//                {
//                    Toast.makeText(this, "number can't be zero!!", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        }

    }

