package com.jobu.customer.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.jobu.customer.databinding.FragmentJobsBinding;
import com.jobu.customer.ui.activities.RequestService;

/**
 * Jobs Fragment.
 */
public class Jobs extends Fragment {
  private FragmentJobsBinding binding;

  public Jobs() {
    // Required empty public constructor
  }

  @Override
  public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment
    binding = FragmentJobsBinding.inflate(inflater, container, false);

    binding.fabAddJob.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(getActivity(), RequestService.class));
      }
    });

    return binding.getRoot();
  }
}