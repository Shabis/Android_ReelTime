package com.epicodus.reeltime.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.epicodus.reeltime.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.SearchEditText) EditText mSearchEditText;
    @Bind(R.id.searchButton) Button mSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == mSearchButton) {
            String movie = mSearchEditText.getText().toString();
            Intent intent = new Intent(MainActivity.this, MovieResultsActivity.class);
            Intent.putExtra("movie", movie);
            startActivity(intent);
        }
    }
}
