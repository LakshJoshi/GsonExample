package com.example.retrofitdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    EditText editText1,editText2,editText3;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1=findViewById(R.id.e1);
        editText2=findViewById(R.id.e2);
        editText3=findViewById(R.id.e3);
        submit=findViewById(R.id.btn);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               String name=editText1.getText().toString();
               String department=editText2.getText().toString();
               String college=editText3.getText().toString();

               Faculty faculty=new Faculty("Mr. Prashant Sahatiya","IT");
               Student student=new Student(name,department,college,faculty);

                Gson gson=new Gson();
                //convert java obj to json
                String jsonData=gson.toJson(student);
                Log.d("MainActivity",jsonData);


                //convert json to java obj
                /*String data="{\"college\":\"GMIT\",\"department\":\"Information Technology\",\"faculty\":{\"dept\":\"IT\",\"f_name\":\"Mr. Prashant Sahatiya\"},\"name\":\"Laksh Joshi\"}";
                  Student student1=gson.fromJson(data,Student.class);

                 */

            }
        });

    }
}