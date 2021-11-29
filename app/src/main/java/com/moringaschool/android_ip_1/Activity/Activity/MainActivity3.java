package com.moringaschool.android_ip_1.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.moringaschool.android_ip_1.Activity.Adapter.ListAdapter;
import com.moringaschool.android_ip_1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity3 extends AppCompatActivity {

    @BindView(R.id.editTextPersonName)
    TextView editTextPersonName;
    @BindView(R.id.listView)
    ListView listView;

    //a bunch of items to be displayed inside the ListView, using the custom adapter.
    private String[] arrayOfItems = new String[] {"Sweet Hereafter", "Cricket", "Hawthorne Fish House", "Viking Soul Food"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);

        ListAdapter adapter = new ListAdapter(this, android.R.layout.simple_list_item_1, arrayOfItems);
    }
}