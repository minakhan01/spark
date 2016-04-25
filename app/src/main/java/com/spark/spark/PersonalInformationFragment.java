package com.spark.spark;

import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import android.util.Log;
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
public class PersonalInformationFragment extends PreferenceFragmentCompat {

  private EditText mCurrentAddress;
  private EditText mCurrentCity;
  private EditText mCampName;
  private EditText mNountParentsInput1;
  private EditText mNountParentsInput2;
  private EditText mNounSiblingsInput1;
  private EditText mNounSiblingsInput2;
  private EditText mNounSiblingsInput3;
  private EditText mNounSiblingsInput4;
  private EditText mNounChildrenInput1;
  private EditText mNounChildrenInput2;
  private EditText mNounChildrenInput3;
  private EditText mNounChildrenInput4;
  private EditText mNounDependentsInput1;
  private EditText mNounDependentsInput2;
  private EditText mNounDependentsInput3;
  private EditText mNounDependentsInput4;
  private EditText mDisabilityDetails;
  private Spinner mAppliedResettlementSpinner;
  private Spinner mRelocationApplicationLocationSpinner;
  private Spinner mSocialStatusSpinner;
  private Spinner mLivingInRefugeeCampSpinner;
  private Spinner mCountryOfResidenceParentsSpinner1;
  private Spinner mCountryOfResidenceParentsSpinner2;
  private Spinner mCountryOfBirthParentsSpinner1;
  private Spinner mCountryOfBirthParentsSpinner2;
  private Spinner mCaseParentsSpinner1;
  private Spinner mCaseParentsSpinner2;
  private Spinner mEducationSiblingsSpinner1;
  private Spinner mEducationSiblingsSpinner2;
  private Spinner mEducationSiblingsSpinner3;
  private Spinner mEducationSiblingsSpinner4;
  private Spinner mCountryOfResidenceSiblingsSpinner1;
  private Spinner mCountryOfResidenceSiblingsSpinner2;
  private Spinner mCountryOfResidenceSiblingsSpinner3;
  private Spinner mCountryOfResidenceSiblingsSpinner4;
  private Spinner mCountryOfBirthSiblingsSpinner1;
  private Spinner mCountryOfBirthSiblingsSpinner2;
  private Spinner mCountryOfBirthSiblingsSpinner3;
  private Spinner mCountryOfBirthSiblingsSpinner4;
  private EditText mAgeSiblingsInput1;
  private EditText mAgeSiblingsInput2;
  private EditText mAgeSiblingsInput3;
  private EditText mAgeSiblingsInput4;
  private Spinner mEducationChildrenSpinner1;
  private Spinner mEducationChildrenSpinner2;
  private Spinner mEducationChildrenSpinner3;
  private Spinner mEducationChildrenSpinner4;
  private Spinner mCountryOfResidenceChildrenSpinner1;
  private Spinner mCountryOfResidenceChildrenSpinner2;
  private Spinner mCountryOfResidenceChildrenSpinner3;
  private Spinner mCountryOfResidenceChildrenSpinner4;
  private Spinner mCountryOfBirthChildrenSpinner1;
  private Spinner mCountryOfBirthChildrenSpinner2;
  private Spinner mCountryOfBirthChildrenSpinner3;
  private Spinner mCountryOfBirthChildrenSpinner4;
  private EditText mAgeChildrenInput1;
  private EditText mAgeChildrenInput2;
  private EditText mAgeChildrenInput3;
  private EditText mAgeChildrenInput4;
  private Spinner mCountryOfResidenceDependentsSpinner1;
  private Spinner mCountryOfResidenceDependentsSpinner2;
  private Spinner mCountryOfResidenceDependentsSpinner3;
  private Spinner mCountryOfResidenceDependentsSpinner4;
  private Spinner mCountryOfBirthDependentsSpinner1;
  private Spinner mCountryOfBirthDependentsSpinner2;
  private Spinner mCountryOfBirthDependentsSpinner3;
  private Spinner mCountryOfBirthDependentsSpinner4;
  private EditText mAgeDependentsInput1;
  private EditText mAgeDependentsInput2;
  private EditText mAgeDependentsInput3;
  private EditText mAgeDependentsInput4;
  private Spinner mRelationshipDependentsSpinner1;
  private Spinner mRelationshipDependentsSpinner2;
  private Spinner mRelationshipDependentsSpinner3;
  private Spinner mRelationshipDependentsSpinner4;
  private Spinner mDisabilitySpecialNeedsSpinner;

  @Override
  public void onCreatePreferences(Bundle bundle, String s) {

  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    Log.d("TAG","VIEW CREATED");

    View view = null;
    view = inflater.inflate(R.layout.fragment_personal_information, container, false);
    mCurrentAddress = (EditText) view.findViewById(R.id.current_address_input);
    mCurrentAddress = (EditText) view.findViewById(R.id.current_city_input);
    mCampName = (EditText) view.findViewById(R.id.camp_name_input);
    mNountParentsInput1 = (EditText) view.findViewById(R.id.noun_parents_input1);
    mNountParentsInput2 = (EditText) view.findViewById(R.id.noun_parents_input2);
    mNounSiblingsInput1 = (EditText) view.findViewById(R.id.noun_siblings_input1);
    mNounSiblingsInput2 = (EditText) view.findViewById(R.id.noun_siblings_input2);
    mNounSiblingsInput3 = (EditText) view.findViewById(R.id.noun_siblings_input3);
    mNounSiblingsInput4 = (EditText) view.findViewById(R.id.noun_siblings_input4);
    mNounChildrenInput1 = (EditText) view.findViewById(R.id.noun_children_input1);
    mNounChildrenInput2 = (EditText) view.findViewById(R.id.noun_children_input2);
    mNounChildrenInput3 = (EditText) view.findViewById(R.id.noun_children_input3);
    mNounChildrenInput4 = (EditText) view.findViewById(R.id.noun_children_input4);
    mNounDependentsInput1 = (EditText) view.findViewById(R.id.noun_sustaining_input1);
    mNounDependentsInput2 = (EditText) view.findViewById(R.id.noun_sustaining_input2);
    mNounDependentsInput3 = (EditText) view.findViewById(R.id.noun_sustaining_input3);
    mNounDependentsInput4 = (EditText) view.findViewById(R.id.noun_sustaining_input4);
    mDisabilityDetails = (EditText) view.findViewById(R.id.disability_details_input);

    mAppliedResettlementSpinner = (Spinner) view.findViewById(R.id.applied_resettlement_input);
    ArrayAdapter<CharSequence> appliedResettlementAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    appliedResettlementAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mAppliedResettlementSpinner.setAdapter(appliedResettlementAdapter);

    mRelocationApplicationLocationSpinner = (Spinner) view.findViewById(R.id.relocation_application_location_input);
    ArrayAdapter<CharSequence> relocationApplicationLocationAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.relocation_paperwork, android.R.layout.simple_spinner_item);
    relocationApplicationLocationAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mRelocationApplicationLocationSpinner.setAdapter(relocationApplicationLocationAdapter);

    mSocialStatusSpinner = (Spinner) view.findViewById(R.id.social_status_input);
    ArrayAdapter<CharSequence> socialStatusAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.marital_status, android.R.layout.simple_spinner_item);
    socialStatusAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mSocialStatusSpinner.setAdapter(socialStatusAdapter);

    mLivingInRefugeeCampSpinner = (Spinner) view.findViewById(R.id.living_in_refugee_camp_input);
    ArrayAdapter<CharSequence> livingInRefugeeCampAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    livingInRefugeeCampAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mLivingInRefugeeCampSpinner.setAdapter(livingInRefugeeCampAdapter);

    ArrayAdapter<CharSequence> countryOfResidenceAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.countries, android.R.layout.simple_spinner_item);
    countryOfResidenceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mCountryOfResidenceParentsSpinner1 = (Spinner) view.findViewById(R.id.country_of_residence_parents_input1);
    mCountryOfResidenceParentsSpinner1.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceParentsSpinner2 = (Spinner) view.findViewById(R.id.country_of_residence_parents_input2);
    mCountryOfResidenceParentsSpinner2.setAdapter(countryOfResidenceAdapter);

    ArrayAdapter<CharSequence> countryOfBirthAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.countries, android.R.layout.simple_spinner_item);
    countryOfBirthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mCountryOfBirthParentsSpinner1 = (Spinner) view.findViewById(R.id.country_of_birth_parents_input1);
    mCountryOfBirthParentsSpinner1.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthParentsSpinner2 = (Spinner) view.findViewById(R.id.country_of_birth_parents_input2);
    mCountryOfBirthParentsSpinner2.setAdapter(countryOfBirthAdapter);

    ArrayAdapter<CharSequence> caseAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.marital_status, android.R.layout.simple_spinner_item);
    caseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mCaseParentsSpinner1 = (Spinner) view.findViewById(R.id.case_parents_input1);
    mCaseParentsSpinner1.setAdapter(caseAdapter);

    mCaseParentsSpinner2 = (Spinner) view.findViewById(R.id.case_parents_input2);
    mCaseParentsSpinner2.setAdapter(caseAdapter);

    ArrayAdapter<CharSequence> educationAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.educational_status, android.R.layout.simple_spinner_item);
    caseAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mEducationSiblingsSpinner1 = (Spinner) view.findViewById(R.id.education_siblings_input1);
    mEducationSiblingsSpinner1.setAdapter(educationAdapter);

    mEducationSiblingsSpinner2 = (Spinner) view.findViewById(R.id.education_siblings_input2);
    mEducationSiblingsSpinner2.setAdapter(educationAdapter);

    mEducationSiblingsSpinner3 = (Spinner) view.findViewById(R.id.education_siblings_input3);
    mEducationSiblingsSpinner3.setAdapter(educationAdapter);

    mEducationSiblingsSpinner4 = (Spinner) view.findViewById(R.id.education_siblings_input4);
    mEducationSiblingsSpinner4.setAdapter(educationAdapter);

    mEducationChildrenSpinner1 = (Spinner) view.findViewById(R.id.education_children_input1);
    mEducationChildrenSpinner1.setAdapter(educationAdapter);

    mEducationChildrenSpinner2 = (Spinner) view.findViewById(R.id.education_children_input2);
    mEducationChildrenSpinner2.setAdapter(educationAdapter);

    mEducationChildrenSpinner3 = (Spinner) view.findViewById(R.id.education_children_input3);
    mEducationChildrenSpinner3.setAdapter(educationAdapter);

    mEducationChildrenSpinner4 = (Spinner) view.findViewById(R.id.education_children_input4);
    mEducationChildrenSpinner4.setAdapter(educationAdapter);

    mCountryOfResidenceSiblingsSpinner1 = (Spinner) view.findViewById(R.id.country_of_residence_siblings_input1);
    mCountryOfResidenceSiblingsSpinner1.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceSiblingsSpinner2 = (Spinner) view.findViewById(R.id.country_of_residence_siblings_input2);;
    mCountryOfResidenceSiblingsSpinner2.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceSiblingsSpinner3 = (Spinner) view.findViewById(R.id.country_of_residence_siblings_input3);;
    mCountryOfResidenceSiblingsSpinner3.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceSiblingsSpinner4 = (Spinner) view.findViewById(R.id.country_of_residence_siblings_input4);;
    mCountryOfResidenceSiblingsSpinner4.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceChildrenSpinner1 = (Spinner) view.findViewById(R.id.country_of_residence_children_input1);
    mCountryOfResidenceChildrenSpinner1.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceChildrenSpinner2 = (Spinner) view.findViewById(R.id.country_of_residence_children_input2);;
    mCountryOfResidenceChildrenSpinner2.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceChildrenSpinner3 = (Spinner) view.findViewById(R.id.country_of_residence_children_input3);;
    mCountryOfResidenceChildrenSpinner3.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceChildrenSpinner4 = (Spinner) view.findViewById(R.id.country_of_residence_children_input4);;
    mCountryOfResidenceChildrenSpinner4.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceDependentsSpinner1 = (Spinner) view.findViewById(R.id.country_of_residence_sustaining_input1);
    mCountryOfResidenceDependentsSpinner1.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceDependentsSpinner2 = (Spinner) view.findViewById(R.id.country_of_residence_sustaining_input2);;
    mCountryOfResidenceDependentsSpinner2.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceDependentsSpinner3 = (Spinner) view.findViewById(R.id.country_of_residence_sustaining_input3);;
    mCountryOfResidenceDependentsSpinner3.setAdapter(countryOfResidenceAdapter);

    mCountryOfResidenceDependentsSpinner4 = (Spinner) view.findViewById(R.id.country_of_residence_sustaining_input4);;
    mCountryOfResidenceDependentsSpinner4.setAdapter(countryOfResidenceAdapter);

    mCountryOfBirthSiblingsSpinner1 = (Spinner) view.findViewById(R.id.country_of_birth_siblings_input1);
    mCountryOfBirthSiblingsSpinner1.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthSiblingsSpinner2 = (Spinner) view.findViewById(R.id.country_of_birth_siblings_input2);
    mCountryOfBirthSiblingsSpinner2.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthSiblingsSpinner3 = (Spinner) view.findViewById(R.id.country_of_birth_siblings_input3);
    mCountryOfBirthSiblingsSpinner3.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthSiblingsSpinner4 = (Spinner) view.findViewById(R.id.country_of_birth_siblings_input4);
    mCountryOfBirthSiblingsSpinner4.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthChildrenSpinner1 = (Spinner) view.findViewById(R.id.country_of_birth_children_input1);
    mCountryOfBirthChildrenSpinner1.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthChildrenSpinner2 = (Spinner) view.findViewById(R.id.country_of_birth_children_input2);
    mCountryOfBirthChildrenSpinner2.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthChildrenSpinner3 = (Spinner) view.findViewById(R.id.country_of_birth_children_input3);
    mCountryOfBirthChildrenSpinner3.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthChildrenSpinner4 = (Spinner) view.findViewById(R.id.country_of_birth_children_input4);
    mCountryOfBirthChildrenSpinner4.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthDependentsSpinner1 = (Spinner) view.findViewById(R.id.country_of_birth_sustaining_input1);
    mCountryOfBirthDependentsSpinner1.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthDependentsSpinner2 = (Spinner) view.findViewById(R.id.country_of_birth_sustaining_input2);
    mCountryOfBirthDependentsSpinner2.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthDependentsSpinner3 = (Spinner) view.findViewById(R.id.country_of_birth_sustaining_input3);
    mCountryOfBirthDependentsSpinner3.setAdapter(countryOfBirthAdapter);

    mCountryOfBirthDependentsSpinner4 = (Spinner) view.findViewById(R.id.country_of_birth_sustaining_input4);
    mCountryOfBirthDependentsSpinner4.setAdapter(countryOfBirthAdapter);

    ArrayAdapter<CharSequence> dependantsRelationshipAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.dependents_relationship, android.R.layout.simple_spinner_item);
    dependantsRelationshipAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

    mRelationshipDependentsSpinner1 = (Spinner) view.findViewById(R.id.link_sustaining_input1);
    mRelationshipDependentsSpinner1.setAdapter(dependantsRelationshipAdapter);

    mRelationshipDependentsSpinner2 = (Spinner) view.findViewById(R.id.link_sustaining_input2);
    mRelationshipDependentsSpinner2.setAdapter(dependantsRelationshipAdapter);

    mRelationshipDependentsSpinner3 = (Spinner) view.findViewById(R.id.link_sustaining_input3);
    mRelationshipDependentsSpinner3.setAdapter(dependantsRelationshipAdapter);

    mRelationshipDependentsSpinner4 = (Spinner) view.findViewById(R.id.link_sustaining_input4);
    mRelationshipDependentsSpinner4.setAdapter(dependantsRelationshipAdapter);

    mAgeSiblingsInput1 = (EditText) view.findViewById(R.id.age_siblings_input1);
    mAgeSiblingsInput2 = (EditText) view.findViewById(R.id.age_siblings_input2);
    mAgeSiblingsInput3 = (EditText) view.findViewById(R.id.age_siblings_input3);
    mAgeSiblingsInput4 = (EditText) view.findViewById(R.id.age_siblings_input4);
    mAgeChildrenInput1 = (EditText) view.findViewById(R.id.age_children_input1);
    mAgeChildrenInput2 = (EditText) view.findViewById(R.id.age_children_input2);
    mAgeChildrenInput3 = (EditText) view.findViewById(R.id.age_children_input3);
    mAgeChildrenInput4 = (EditText) view.findViewById(R.id.age_children_input4);
    mAgeDependentsInput1 = (EditText) view.findViewById(R.id.age_sustaining_input1);
    mAgeDependentsInput2 = (EditText) view.findViewById(R.id.age_sustaining_input2);
    mAgeDependentsInput3 = (EditText) view.findViewById(R.id.age_sustaining_input3);
    mAgeDependentsInput4 = (EditText) view.findViewById(R.id.age_sustaining_input4);

    mDisabilitySpecialNeedsSpinner = (Spinner) view.findViewById(R.id.disability_field_input);
    ArrayAdapter<CharSequence> mDisabilitySpecialNeedsAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.yes_no, android.R.layout.simple_spinner_item);
    mDisabilitySpecialNeedsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
    mDisabilitySpecialNeedsSpinner.setAdapter(mDisabilitySpecialNeedsAdapter);

    ImageButton uploadPassportPicture = (ImageButton) view.findViewById(R.id.upload_passport_picture_button);
    uploadPassportPicture.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //todo
      }
    });

    ImageButton uploadUnhcrCardPicture = (ImageButton) view.findViewById(R.id.upload_unhcr_card_picture_button);
    uploadUnhcrCardPicture.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        //todo
      }
    });

    return view;
  }
}
