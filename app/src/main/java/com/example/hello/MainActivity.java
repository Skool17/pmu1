package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static int min(int a, int b)   //функция нахождения минимального числа
    {
        if(a > b)
            return b;
        else
            return a;
    }
    public static int max(int a, int b)  //функция нахождения максимального числа
    {
        if(a < b)
            return b;
        else
            return a;
    }
    public class HelloWorld //функция вывода Hello World!
    {
         public void main(String[] args)
        {
            System.out.println("Hello world!");
        }
    }
}