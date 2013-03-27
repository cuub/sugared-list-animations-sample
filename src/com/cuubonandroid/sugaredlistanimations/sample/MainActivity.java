package com.cuubonandroid.sugaredlistanimations.sample;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.cuubonandroid.sugaredlistanimations.SpeedScrollListener;

public class MainActivity extends ListActivity {

  private SpeedScrollListener listener;
  private PlusImageAdapter plusAdapter;
  private NowImageAdapter nowAdapter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    listener = new SpeedScrollListener();
    getListView().setOnScrollListener(listener);
    plusAdapter = new PlusImageAdapter(getApplicationContext(), listener);
    setListAdapter(plusAdapter);
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.test, menu);
    return true;
  }

  @Override
  public boolean onMenuItemSelected(int featureId, MenuItem item) {
    boolean handled = false;
    switch (item.getItemId()) {
      case R.id.google_plus:
        plusAdapter = new PlusImageAdapter(getApplicationContext(), listener);
        setListAdapter(plusAdapter);
        break;

      case R.id.google_now:
        nowAdapter = new NowImageAdapter(getApplicationContext(), listener);
        setListAdapter(nowAdapter);
        break;
    }
    return handled;
  }

}
