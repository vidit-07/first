package com.example.dbapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dbapp.dbfiles.mydatabase;

public class MainActivity extends AppCompatActivity {
    TextView n,l,s;
    Button sub;
    ListView lv;
    mydatabase mdb = new mydatabase(this);

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n= findViewById(R.id.Name);
        l= findViewById(R.id.Location);
        s= findViewById(R.id.Salary);
        sub= findViewById(R.id.Insert);
        lv= findViewById(R.id.list);
        mdb.open();
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            String strname = n.getText().toString();
            String strloc = l.getText().toString();
            Integer intsal = Integer.parseInt(s.getText().toString());
            }
        });

    }
}
