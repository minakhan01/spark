package com.spark.spark;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.v4.app.Fragment;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by khan32m on 4/23/16.
 */
public class AccountInformationFragment extends PreferenceFragmentCompat {

  private static final String FIRST_NAME = "FIRST_NAME";
  private static final String LAST_NAME = "LAST_NAME";
  private static final String BIRTH_DATE = "BIRTH_DATE";
  private static final String EMAIL = "EMAIL";
  private static final String GENDER = "GENDER";
  private static final String COUNTRY = "COUNTRY";
  private static final String PALESTINIANORSYRIAN = "PALESTINIANORSYRIAN";
  private EditText mFirstNameField;
  private EditText mLastNameField;
  private EditText mBirthDateField;
  private EditText mEmailField;
  private Spinner genderSpinner;
  private Spinner countryOfResidenceSpinner;
  private Spinner palestinianOrSyrianSpinner;


  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    Log.d("TAG","VIEW CREATED");

    View view = null;
    SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getActivity());
    view = inflater.inflate(R.layout.fragment_account_information, container, false);
    mFirstNameField = (EditText) view.findViewById(R.id.first_name_input);
    mLastNameField = (EditText) view.findViewById(R.id.last_name_input);
    mBirthDateField = (EditText) view.findViewById(R.id.dob_input);
    mEmailField= (EditText) view.findViewById(R.id.email_input);

    genderSpinner = (Spinner) view.findViewById(R.id.gender_spinner);
    ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    genderSpinner.setAdapter(genderAdapter);

    countryOfResidenceSpinner = (Spinner) view.findViewById(R.id.country_of_residence_input);
    ArrayAdapter<CharSequence> countryOfResidenceAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.country_of_residence, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    countryOfResidenceSpinner.setAdapter(countryOfResidenceAdapter);

    palestinianOrSyrianSpinner = (Spinner) view.findViewById(R.id.palestinian_or_syrian_input);
    ArrayAdapter<CharSequence> palestinianOrSyrianAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    palestinianOrSyrianSpinner.setAdapter(palestinianOrSyrianAdapter);
      mFirstNameField.setText(preferences.getString(FIRST_NAME,""));
      mLastNameField.setText(preferences.getString(LAST_NAME,""));
      mBirthDateField.setText(preferences.getString(BIRTH_DATE,""));
      mEmailField.setText(preferences.getString(EMAIL,""));
      String selectedGender = preferences.getString(GENDER,"");
      genderSpinner.setSelection(Utils.getIndexFromLabel(selectedGender,getResources().getStringArray(R.array.gender)));
      String selectedCountry = preferences.getString(COUNTRY,"");
      countryOfResidenceSpinner.setSelection(Utils.getIndexFromLabel(selectedCountry,getResources().getStringArray(R.array.country_of_residence)));
      String pos = preferences.getString(PALESTINIANORSYRIAN,"");
      palestinianOrSyrianSpinner.setSelection(Utils.getIndexFromLabel(pos,getResources().getStringArray(R.array.yes_no)));

    return view;
  }

  @Override
  public void onPause(){
    super.onPause();

    String firstName = "";
    String lastName = "";
    String birthDate = "";
    String email = "";
    String gender = "";
    String country = "";
    String pos = "";
    Log.d("TAG","ON SAVED");

    if(mFirstNameField != null
            && mLastNameField != null
            && mBirthDateField != null
            && mEmailField != null
            && genderSpinner != null
            && countryOfResidenceSpinner != null
            && palestinianOrSyrianSpinner != null) {
      Log.d("TAG","Saving info");
      firstName = mFirstNameField.getText().toString();
      lastName = mLastNameField.getText().toString();
      birthDate = mBirthDateField.getText().toString();
      email = mEmailField.getText().toString();
      gender = genderSpinner.getSelectedItem().toString();
      country = countryOfResidenceSpinner.getSelectedItem().toString();
      pos = palestinianOrSyrianSpinner.getSelectedItem().toString();
    }

    SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(getActivity());
    SharedPreferences.Editor editor = prefs.edit();

    editor.putString(FIRST_NAME,firstName).commit();
    editor.putString(LAST_NAME,lastName).commit();
    editor.putString(BIRTH_DATE,birthDate).commit();
    editor.putString(EMAIL,email).commit();
    editor.putString(GENDER,gender).commit();
    editor.putString(COUNTRY,country).commit();
    editor.putString(PALESTINIANORSYRIAN,pos).commit();
  }

}
