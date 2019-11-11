package com.example.layoutexamples;

import android.os.Bundle;

import android.view.View;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        loadtabs();


    }

    /** Called when the user touches the button */
    public void clickbutton(View view)
    {
        // Do something in response to button click

        Toast.makeText(this,"d",Toast.LENGTH_LONG).show();
    }

    void loadtabs()
    {
        TabHost tabs = (TabHost) findViewById(R.id.tabhost);
        tabs.setup();

        TabHost.TabSpec spec = tabs.newTabSpec("tag1");
        spec.setContent(R.id.tab1);
        spec.setIndicator("LL Horizontal");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag2");
        spec.setContent(R.id.tab2);
        spec.setIndicator("LL Vertical");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag3");
        spec.setContent(R.id.tab3);
        spec.setIndicator("RelativeLayout");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag4");
        spec.setContent(R.id.tab4);
        spec.setIndicator("TableLayout");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag5");
        spec.setContent(R.id.tab5);
        spec.setIndicator("ConstraintLayout");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag6");
        spec.setContent(R.id.tab6);
        spec.setIndicator("GridLayout");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag7");
        spec.setContent(R.id.tab7);
        spec.setIndicator("Frame Layout");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag8");
        spec.setContent(R.id.tab8);
        spec.setIndicator("ListView");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag9");
        spec.setContent(R.id.tab9);
        spec.setIndicator("nested");
        tabs.addTab(spec);

        spec = tabs.newTabSpec("tag10");
        spec.setContent(R.id.tab10);
        spec.setIndicator("Others");
        tabs.addTab(spec);

    }
}