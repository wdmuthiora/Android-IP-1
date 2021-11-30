package com.moringaschool.android_ip_1.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.moringaschool.android_ip_1.Activity.Adapter.ListAdapter;
import com.moringaschool.android_ip_1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity3 extends AppCompatActivity {

    @BindView(R.id.listView)
    ListView listView;

    @BindView(R.id.takeSurveyBtn)
    ConstraintLayout takeSurveyBtn;

    //a bunch of items to be displayed inside the ListView, using the custom adapter.
    private String[] arrayOfItems = new String[] {"PowerPuff Girls", "Mojo Jojo", "Kids next door", "Cow and Chicken"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ButterKnife.bind(this);

        ListAdapter adapter = new ListAdapter(this, android.R.layout.simple_list_item_1, arrayOfItems);
        listView.setAdapter(adapter);

        takeSurveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                SurveyFragment surveyFragment = new SurveyFragment ();
                surveyFragment.show(fm, "Sample Fragment");
            }
        });
    }
}