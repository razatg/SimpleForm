package com.rajat.simpleform;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class GoTo extends Activity {

    private TextView formData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to);
        formData = (TextView) findViewById(R.id.formData);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String firstName = bundle.getString("fnData");

        formData.setText(firstName);
    }


}
