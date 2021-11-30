package com.moringaschool.android_ip_1.Activity.Activity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;

import com.moringaschool.android_ip_1.R;

public class SurveyFragment extends DialogFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_survey, container, false);
        getDialog().setTitle("Simple Dialog");

        ConstraintLayout cancelSurveyBtn = (ConstraintLayout) rootView.findViewById(R.id.cancelSurveyBtn);
        ConstraintLayout submitSurveyBtn = (ConstraintLayout) rootView.findViewById(R.id.submitSurveyBtn);

        cancelSurveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dismiss();

            }
        });

        RadioGroup surveyRadioGroup = (RadioGroup) rootView.findViewById(R.id.surveyRadioGroup); //pull group
        int selectedId = surveyRadioGroup.getCheckedRadioButtonId(); //get selected ID
        final RadioButton selectedRadioButton = (RadioButton) rootView.findViewById(selectedId); //get r button val via ID

        submitSurveyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("testing", selectedRadioButton.getText().toString());
                dismiss();

            }

        });

        return rootView;
    }
}
