package com.calldemo.dialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String[] item = new String[]{"Red","Pink","Blue","Aqua","White","Black"};
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        //Setting The title
        builder.setTitle("Select a Color");
        // Using the setItem Method
        builder.setItems(item, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView.setText(item[which]);
            }
        });
        builder.show();
    }
}
