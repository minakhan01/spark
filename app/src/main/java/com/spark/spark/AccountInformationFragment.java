package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by khan32m on 4/23/16.
 */
public class AccountInformationFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = null;
    view = inflater.inflate(R.layout.fragment_account_information, container, false);

    Spinner genderSpinner = (Spinner) view.findViewById(R.id.gender_spinner);
    ArrayAdapter<CharSequence> genderAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.gender, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    genderSpinner.setAdapter(genderAdapter);

    Spinner countryOfResidenceSpinner = (Spinner) view.findViewById(R.id.country_of_residence_input);
    ArrayAdapter<CharSequence> countryOfResidenceAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.country_of_residence, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    countryOfResidenceSpinner.setAdapter(countryOfResidenceAdapter);

    Spinner palestinianOrSyrianSpinner = (Spinner) view.findViewById(R.id.palestinian_or_syrian_input);
    ArrayAdapter<CharSequence> palestinianOrSyrianAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    palestinianOrSyrianSpinner.setAdapter(palestinianOrSyrianAdapter);

    return view;
  }
}
