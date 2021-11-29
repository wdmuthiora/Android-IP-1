package com.moringaschool.android_ip_1.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.moringaschool.android_ip_1.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.profileGreeting)
    TextView profileGreeting;
    @BindView(R.id.searchBtn)
    ConstraintLayout searchBtn;
    @BindView(R.id.findSomething)
    TextInputEditText findSomething;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //capture user input
                String query = findSomething.getText().toString();

                Intent intent=new Intent(MainActivity2.this,MainActivity3.class);
                //pass the captured input to the next Activity
                intent.putExtra("query", query);
                startActivity(intent);
            }
        });
    }


}