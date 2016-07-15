package com.jejunet.hellolistview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        ListView listView = (ListView) findViewById(R.id.listview);
        ArrayList<ListViewItem> data = new ArrayList<>();
        ListViewItem ice_skate = new ListViewItem(R.drawable.ice_skate, "Ice Skate");
        ListViewItem car = new ListViewItem(R.drawable.car, "car");

        data.add(ice_skate);
        data.add(car);

        ListviewAdapter adapter = new ListviewAdapter(this, R.layout.item, data);
        listView.setAdapter(adapter);
    }
}
