package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;

/**
 * Created by khan32m on 4/23/16.
 */
public class PreviousExperienceFragment extends PreferenceFragmentCompat {

  private EditText mAveragePercentageHighSchoolInput;
  private Spinner mDegreeNameHighSchoolSpinner;
  private Spinner mCountryHighSchool;
  private Spinner mToHighSchool;
  private Spinner mFromHighSchool;
  private EditText mNounHighSchool;
  private Spinner mEquivalentCertificates;
  private Spinner mHighEducationStatusSpinner;
  private EditText mAvgPercentCompleted;
  private Spinner mYearFinishedStudies;
  private Spinner mYearStoppedStudies;
  private Spinner mYearStartedStudies;
  private Spinner mCountryCompletedStudies;
  private EditText mNounCompleted;
  private EditText mLastCourseOfStudy1;
  private EditText mLastCourseOfStudy2;
  private EditText mLastAvgPercentage1;
  private EditText mLastAvgPercentage2;
  private EditText mLastDegreeName1;
  private EditText mLastDegreeName2;
  private Spinner mLastToSpinner1;
  private Spinner mLastToSpinner2;
  private Spinner mLastFromSpinner1;
  private Spinner mLastFromSpinner2;
  private Spinner mLastCountrySpinner1;
  private Spinner mLastCountrySpinner2;
  private EditText mLastName1;
  private EditText mLastName2;
  private Spinner mAreYouCurrentlyEnrolledSpinner;
  private EditText mCurrentCourse;
  private EditText mCurrentAvgGrade;
  private EditText mCurrentDegreeName;
  private Spinner mCurrentToSpinner;
  private Spinner mCurrentFromSpinner;
  private Spinner mCurrentCountrySpinner;
  private EditText mCurrentNoun;
  private Spinner mEmploymentToSpinner1;
  private Spinner mEmploymentFromSpinner1;
  private Spinner mEmploymentCountrySpinner1;
  private EditText mEmploymentOrganization1;
  private EditText mEmploymentJobtitle1;
  private Spinner mEmploymentToSpinner2;
  private Spinner mEmploymentFromSpinner2;
  private Spinner mEmploymentCountrySpinner2;
  private EditText mEmploymentOrganization2;
  private EditText mEmploymentJobtitle2;
  private Spinner mActivitiesToSpinner1;
  private Spinner mActivitiesFromSpinner1;
  private Spinner mActivitiesCountrySpinner1;
  private EditText mActivitiesOrganization1;
  private EditText mActivitiesJobtitle1;
  private Spinner mActivitiesToSpinner2;
  private Spinner mActivitiesFromSpinner2;
  private Spinner mActivitiesCountrySpinner2;
  private EditText mActivitiesOrganization2;
  private EditText mActivitiesJobtitle2;

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = null;
    view = inflater.inflate(R.layout.fragment_previous_experience, container, false);

    mAveragePercentageHighSchoolInput = (EditText) view.findViewById(R.id.avg_percent_highschool_input1);
    mNounHighSchool = (EditText) view.findViewById(R.id.noun_highschool_input1);

    mDegreeNameHighSchoolSpinner = (Spinner) view.findViewById(R.id.degree_name_highschool_input1);
    ArrayAdapter<CharSequence> degreeNameHighSchoolAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.degree_data, android.R.layout.simple_spinner_item);
    degreeNameHighSchoolAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mDegreeNameHighSchoolSpinner.setAdapter(degreeNameHighSchoolAdapter);

    ArrayAdapter<CharSequence> countryAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.countries, android.R.layout.simple_spinner_item);
    countryAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    ArrayAdapter<CharSequence> yearAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.years, android.R.layout.simple_spinner_item);
    yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mCountryHighSchool = (Spinner) view.findViewById(R.id.country_highschool_input1);
    mCountryHighSchool.setAdapter(countryAdapter);

    mToHighSchool = (Spinner) view.findViewById(R.id.to_start_highschool_input1);
    mToHighSchool.setAdapter(yearAdapter);

    mFromHighSchool = (Spinner) view.findViewById(R.id.from_start_highschool_input1);
    mFromHighSchool.setAdapter(yearAdapter);

    ImageButton uploadHighSchoolDiploma = (ImageButton) view.findViewById(R.id.upload_diploma_button);
    uploadHighSchoolDiploma.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

    ImageButton uploadEquivalentDiploma = (ImageButton) view.findViewById(R.id.upload_equivalent_certificate_button);
    uploadEquivalentDiploma.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

    ArrayAdapter<CharSequence> yesNoAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    yesNoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mEquivalentCertificates = (Spinner) view.findViewById(R.id.equivalent_certificate_input);
    mEquivalentCertificates.setAdapter(yesNoAdapter);

    mHighEducationStatusSpinner = (Spinner) view.findViewById(R.id.development_of_higher_education_input);
    ArrayAdapter<CharSequence> highEducationStatusAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.high_education_status, android.R.layout.simple_spinner_item);
    highEducationStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mHighEducationStatusSpinner.setAdapter(highEducationStatusAdapter);

    mAvgPercentCompleted = (EditText) view.findViewById(R.id.avg_percent_completed_input1);

    mYearFinishedStudies = (Spinner) view.findViewById(R.id.degree_finished_completed_input1);
    mYearFinishedStudies.setAdapter(yearAdapter);

    mYearStoppedStudies = (Spinner) view.findViewById(R.id.stopped_completed_input1);
    mYearStoppedStudies.setAdapter(yearAdapter);

    mYearStartedStudies = (Spinner) view.findViewById(R.id.begin_completed_input1);
    mYearStartedStudies.setAdapter(yearAdapter);

    mCountryCompletedStudies = (Spinner) view.findViewById(R.id.country_completed_input1);
    mCountryCompletedStudies.setAdapter(countryAdapter);

    mNounCompleted = (EditText) view.findViewById(R.id.noun_completed_input1);

    ArrayAdapter<CharSequence> courseofStudyAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.high_education_status, android.R.layout.simple_spinner_item);
    courseofStudyAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mLastCourseOfStudy1 = (EditText) view.findViewById(R.id.course_last_input1);
    mLastCourseOfStudy2 = (EditText) view.findViewById(R.id.course_last_input2);

    mLastDegreeName1 = (EditText) view.findViewById(R.id.degree_last_input1);
    mLastDegreeName2 = (EditText) view.findViewById(R.id.degree_last_input2);

    mLastAvgPercentage1 = (EditText) view.findViewById(R.id.avg_percent_last_input1);
    mLastAvgPercentage2 = (EditText) view.findViewById(R.id.avg_percent_last_input2);

    mLastToSpinner1 = (Spinner) view.findViewById(R.id.to_last_input1);
    mLastToSpinner1.setAdapter(yearAdapter);

    mLastToSpinner2 = (Spinner) view.findViewById(R.id.to_last_input2);
    mLastToSpinner2.setAdapter(yearAdapter);

    mLastFromSpinner1 = (Spinner) view.findViewById(R.id.from_last_input1);
    mLastFromSpinner1.setAdapter(yearAdapter);

    mLastFromSpinner2 = (Spinner) view.findViewById(R.id.from_last_input2);
    mLastFromSpinner2.setAdapter(yearAdapter);

    mLastCountrySpinner1 = (Spinner) view.findViewById(R.id.country_last_input1);
    mLastCountrySpinner1.setAdapter(countryAdapter);

    mLastCountrySpinner2 = (Spinner) view.findViewById(R.id.country_last_input2);
    mLastCountrySpinner2.setAdapter(countryAdapter);

    mLastName1 = (EditText) view.findViewById(R.id.noun_last_input1);
    mLastName2 = (EditText) view.findViewById(R.id.noun_last_input2);

    ImageButton uploadLastDiplomaButton = (ImageButton) view.findViewById(R.id.upload_last_diploma_button);
    uploadLastDiplomaButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

    ImageButton uploadLastThingsButton = (ImageButton) view.findViewById(R.id.upload_last_things_button);
    uploadLastThingsButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });

    mAreYouCurrentlyEnrolledSpinner = (Spinner) view.findViewById(R.id.currently_enrolled_input);
    mAreYouCurrentlyEnrolledSpinner.setAdapter(yesNoAdapter);

    mCurrentCourse = (EditText) view.findViewById(R.id.course_current_input1);
    mCurrentAvgGrade = (EditText) view.findViewById(R.id.avg_grade_current_input1);
    mCurrentDegreeName = (EditText) view.findViewById(R.id.degree_current_input1);

    mCurrentToSpinner = (Spinner) view.findViewById(R.id.to_current_input1);
    mCurrentToSpinner.setAdapter(yearAdapter);

    mCurrentFromSpinner = (Spinner) view.findViewById(R.id.from_current_input1);
    mCurrentFromSpinner.setAdapter(yearAdapter);

    mCurrentCountrySpinner = (Spinner) view.findViewById(R.id.country_current_input1);
    mCurrentCountrySpinner.setAdapter(countryAdapter);

    mCurrentNoun = (EditText) view.findViewById(R.id.degree_current_input1);

    mEmploymentToSpinner1 = (Spinner) view.findViewById(R.id.to_employment_input1);
    mEmploymentToSpinner1.setAdapter(yearAdapter);

    mEmploymentFromSpinner1 = (Spinner) view.findViewById(R.id.from_employment_input1);
    mEmploymentFromSpinner1.setAdapter(yearAdapter);

    mEmploymentCountrySpinner1 = (Spinner) view.findViewById(R.id.country_employment_input1);
    mEmploymentCountrySpinner1.setAdapter(countryAdapter);

    mEmploymentOrganization1 = (EditText) view.findViewById(R.id.organization_employment_input1);
    mEmploymentJobtitle1 = (EditText) view.findViewById(R.id.job_title_employment_input1);

    mEmploymentToSpinner2 = (Spinner) view.findViewById(R.id.to_employment_input2);
    mEmploymentToSpinner2.setAdapter(yearAdapter);

    mEmploymentFromSpinner2 = (Spinner) view.findViewById(R.id.from_employment_input2);
    mEmploymentFromSpinner2.setAdapter(yearAdapter);

    mEmploymentCountrySpinner2 = (Spinner) view.findViewById(R.id.country_employment_input2);
    mEmploymentCountrySpinner2.setAdapter(countryAdapter);

    mEmploymentOrganization2 = (EditText) view.findViewById(R.id.organization_employment_input2);
    mEmploymentJobtitle2 = (EditText) view.findViewById(R.id.job_title_employment_input2);

    mActivitiesToSpinner1 = (Spinner) view.findViewById(R.id.to_other_input1);
    mActivitiesToSpinner1.setAdapter(yearAdapter);

    mActivitiesFromSpinner1 = (Spinner) view.findViewById(R.id.from_other_input1);
    mActivitiesFromSpinner1.setAdapter(yearAdapter);

    mActivitiesCountrySpinner1 = (Spinner) view.findViewById(R.id.country_other_input1);
    mActivitiesCountrySpinner1.setAdapter(countryAdapter);

    mActivitiesOrganization1 = (EditText) view.findViewById(R.id.organization_other_input1);
    mActivitiesJobtitle1 = (EditText) view.findViewById(R.id.job_title_other_input1);

    mActivitiesToSpinner2 = (Spinner) view.findViewById(R.id.to_other_input2);
    mActivitiesToSpinner2.setAdapter(yearAdapter);

    mActivitiesFromSpinner2 = (Spinner) view.findViewById(R.id.from_other_input2);
    mActivitiesFromSpinner2.setAdapter(yearAdapter);

    mActivitiesCountrySpinner2 = (Spinner) view.findViewById(R.id.country_other_input2);
    mActivitiesCountrySpinner2.setAdapter(countryAdapter);

    mActivitiesOrganization2 = (EditText) view.findViewById(R.id.organization_other_input2);
    mActivitiesJobtitle2 = (EditText) view.findViewById(R.id.job_title_other_input2);

    return view;
  }
}
