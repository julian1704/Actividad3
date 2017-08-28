package com.uninorte.actividad3;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Basic1 extends AppCompatActivity {

    TextView tv1;
    EditText et1;
    Button b1;
    LinearLayout ly1;
    LinearLayout ly2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        b1 = (Button) findViewById(R.id.b1);
        tv1 = (TextView) findViewById(R.id.tv1);
        et1 = (EditText) findViewById(R.id.et1);
        ly1 = (LinearLayout) findViewById(R.id.ly1);
        ly2 = (LinearLayout) View.inflate(this,R.layout.content_basic1, null);
        ly1.addView(ly2);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                for (int i = 0; i < 2; i++) {
                    ly2 = (LinearLayout) View.inflate(Basic1.this, R.layout.content_basic1, null);
                    ((TextView) ly2.findViewById(R.id.tv1)).setText("Campo " + (i + 1));
                    ly1.addView(ly2);
                }
            }
        });

    }
        //  if(ly1.getVisibility() == View.INVISIBLE){
        //      ly1.setVisibility(View.VISIBLE);
        //  }
        //  else{
        //      ly2.setVisibility(View.VISIBLE);
        //  }


        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_basic1, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_settings) {
                return true;
            }

            return super.onOptionsItemSelected(item);
        }
    }
