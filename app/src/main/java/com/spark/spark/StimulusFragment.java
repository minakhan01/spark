package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by khan32m on 4/23/16.
 */
public class StimulusFragment extends PreferenceFragmentCompat {

  private Spinner mReasonForFieldChoiceSpinner;
  private Spinner mPostGraduationPlans;
  private Spinner mPlansForSyrianReconstruction;

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = null;
    view = inflater.inflate(R.layout.fragment_account_stimulus, container, false);

    ArrayAdapter<CharSequence> reasonsAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.interested_particular_academic_course, android.R.layout.simple_spinner_item);
    reasonsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mReasonForFieldChoiceSpinner = (Spinner) view.findViewById(R.id.reason_for_choosing_input);
    mReasonForFieldChoiceSpinner.setAdapter(reasonsAdapter);

    ArrayAdapter<CharSequence> postPlansAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.plan_after_graduation, android.R.layout.simple_spinner_item);
    postPlansAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mPostGraduationPlans = (Spinner) view.findViewById(R.id.post_graduation_plans_input);
    mPostGraduationPlans.setAdapter(postPlansAdapter);

    ArrayAdapter<CharSequence> syrianPlansAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.how_to_rebuild_syrian, android.R.layout.simple_spinner_item);
    syrianPlansAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mPlansForSyrianReconstruction = (Spinner) view.findViewById(R.id.plans_to_help_syrian_reconstruction_input);
    mPlansForSyrianReconstruction.setAdapter(syrianPlansAdapter);

    return view;
  }
}
