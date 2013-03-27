package com.cuubonandroid.sugaredlistanimations.sample;

import android.app.ListActivity;
import android.os.Bundle;

import com.cuubonandroid.sugaredlistanimations.SpeedScrollListener;
import com.cuubonandroid.sugaredlistanimations.sample.R;

public class MainActivity extends ListActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    SpeedScrollListener listener = new SpeedScrollListener();
    getListView().setOnScrollListener(listener);
    setListAdapter(new ImageAdapter(getApplicationContext(), listener));
  }
}
