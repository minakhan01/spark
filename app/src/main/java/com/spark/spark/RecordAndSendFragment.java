package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by khan32m on 4/23/16.
 */
public class RecordAndSendFragment extends PreferenceFragmentCompat {

  private Spinner mSparkConsent;
  private Spinner mHearAboutSpark;
  private EditText mOtherOrgDetails;
  private CheckBox mDisclosureCheckbox;

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = null;
    view = inflater.inflate(R.layout.fragment_record_and_send, container, false);

    ArrayAdapter<CharSequence> yesNoAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    yesNoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mSparkConsent = (Spinner) view.findViewById(R.id.spark_provide_grants_input);
    mSparkConsent.setAdapter(yesNoAdapter);

    ArrayAdapter<CharSequence> hearAboutUsAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.hear_about_spark, android.R.layout.simple_spinner_item);
    hearAboutUsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mHearAboutSpark = (Spinner) view.findViewById(R.id.how_did_you_hear_input);
    mHearAboutSpark.setAdapter(hearAboutUsAdapter);

    mOtherOrgDetails = (EditText) view.findViewById(R.id.organization_otherwise_details_input);

    mDisclosureCheckbox = (CheckBox) view.findViewById(R.id.disclosure_checkbox);
    mDisclosureCheckbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
      @Override
      public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        
      }
    });

    return view;
  }
}
