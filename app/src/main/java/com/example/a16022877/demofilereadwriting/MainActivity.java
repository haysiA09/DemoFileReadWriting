package com.example.a16022877.demofilereadwriting;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainActivity extends AppCompatActivity {

    String folderLocation;
    Button btnWrite;
    Button btnRead;
//UI handlers to be defined

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //UI handlers to be defined
        btnRead=(Button)findViewById(R.id.btnRead);
        btnWrite=(Button)findViewById(R.id.btnWrite);

        folderLocation = Environment.getExternalStorageDirectory().getAbsolutePath() + "/MyFolder";

        File folder = new File(folderLocation);
        if (folder.exists() == false){
            boolean result = folder.mkdir();
            if (result == true){
                Log.d("File Read/Write", "Folder created");
            }
        }

        btnWrite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for file writing
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Code for file reading
                File targetFile=new File(folderLocation,"data.txt");
                if (targetFile.exists()==true){
                    String data="";
                    try{
                        FileReader reader=new FileReader(targetFile);
                        BufferedReader br=new Buff

                    }
                }
            }
        });
    }
}

