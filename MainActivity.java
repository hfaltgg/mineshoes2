package com.project.tianxie.mineshoes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.Women_button) ImageView WomenBtn;
    @BindView(R.id.Men_button) ImageView MenBtn;
    @BindView(R.id.Girls_button) ImageView GirlBtn;
    @BindView(R.id.Boys_button) ImageView BoyBtn;
    @BindView(R.id.All_button) ImageView AllBtn;
    @BindView(R.id.main_toolbar) Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.actionbar_menu_account) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @OnClick({R.id.Women_button, R.id.Men_button, R.id.Girls_button, R.id.Boys_button, R.id.All_button})
    public void onImageViewClick(View view) {
        Intent mIntent = new Intent(this, DepartmentActivity.class);
        startActivity(mIntent);
        switch (view.getId()) {
            case R.id.Women_button:
                break;
            case R.id.Men_button:
                break;
            case R.id.Girls_button:
                break;
            case R.id.Boys_button:
                break;
            case R.id.All_button:
                break;
        }
    }
}
