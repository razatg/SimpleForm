package com.rajat.simpleform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements View.OnClickListener,RadioGroup.OnCheckedChangeListener, CompoundButton.OnCheckedChangeListener {

    private EditText editTextFn, editTextLn, editTextAdd;
    private CheckBox checkBoxH1, checkBoxH2, checkBoxH3, checkBoxH4, checkBoxH5;
    private RadioGroup radioGroup;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFn = (EditText) findViewById(R.id.editTextFn);
        editTextLn = (EditText) findViewById(R.id.editTextLn);
        editTextAdd = (EditText) findViewById(R.id.editTextAdd);
        checkBoxH1 = (CheckBox) findViewById(R.id.checkBoxH1);
        checkBoxH2 = (CheckBox) findViewById(R.id.checkBoxH2);
        checkBoxH3 = (CheckBox) findViewById(R.id.checkBoxH3);
        checkBoxH4 = (CheckBox) findViewById(R.id.checkBoxH4);
        checkBoxH5 = (CheckBox) findViewById(R.id.checkBoxH5);


        checkBoxH1.setOnCheckedChangeListener(this);
        checkBoxH2.setOnCheckedChangeListener(this);
        checkBoxH3.setOnCheckedChangeListener(this);
        checkBoxH4.setOnCheckedChangeListener(this);
        checkBoxH5.setOnCheckedChangeListener(this);

        radioGroup.setOnCheckedChangeListener(this);

        submit.setOnClickListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        String chkTxt = compoundButton.getText().toString();

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioButton rButton = (RadioButton) findViewById(i);
        String radioTxt = rButton.getText().toString();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, GoTo.class);
        intent.putExtra("chkTxtData",chkTxt);
        startActivity(intent);

    }
}

