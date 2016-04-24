package com.spark.spark;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by khan32m on 4/23/16.
 */
public class RecordAndSendFragment extends Fragment {
  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    View view = null;
    view = inflater.inflate(R.layout.fragment_record_and_send, container, false);
    return view;
  }
}
