package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by khan32m on 4/23/16.
 */
public class FieldStudiesFragment extends PreferenceFragmentCompat {

  private Spinner mAlreadyGotScolarshipSpinner;
  private EditText mSpecifyGrantField;
  private Spinner mFirstStudyInterestSpinner;
  private Spinner mSecondStudyInterestSpinner;
  private Spinner mGrantApplicationSpinner;
  private EditText mSpecifyOtherGrants;

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    Log.d("TAG", "VIEW CREATED");

    View view = null;
    view = inflater.inflate(R.layout.fragment_field_studies, container, false);

    ArrayAdapter<CharSequence> yesNoAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    yesNoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mAlreadyGotScolarshipSpinner = (Spinner) view.findViewById(R.id.already_got_scholarship_input);
    mAlreadyGotScolarshipSpinner.setAdapter(yesNoAdapter);

    mSpecifyGrantField = (EditText) view.findViewById(R.id.specify_grant_input);

    ArrayAdapter<CharSequence> fieldOfStudyAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.course_of_study, android.R.layout.simple_spinner_item);
    fieldOfStudyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mFirstStudyInterestSpinner = (Spinner) view.findViewById(R.id.first_study_interest_input);
    mFirstStudyInterestSpinner.setAdapter(fieldOfStudyAdapter);

    mSecondStudyInterestSpinner = (Spinner) view.findViewById(R.id.second_study_interest_input);
    mSecondStudyInterestSpinner.setAdapter(fieldOfStudyAdapter);

    mGrantApplicationSpinner = (Spinner) view.findViewById(R.id.grants_applications_input);
    mGrantApplicationSpinner.setAdapter(yesNoAdapter);

    mSpecifyOtherGrants = (EditText) view.findViewById(R.id.specify_certificates_input);

    return view;
  }
}
