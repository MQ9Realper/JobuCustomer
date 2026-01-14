package com.jobu.customer.ui.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.jobu.customer.common.AppUtils;
import com.jobu.customer.databinding.FragmentHomeBinding;
import com.jobu.customer.ui.activities.RequestService;
import com.jobu.customer.ui.adapters.AdapterServiceCategories;

/**
 * Home Fragment.
 */
public class Home extends Fragment {
  private FragmentHomeBinding binding;

  public Home() {
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
    binding = FragmentHomeBinding.inflate(inflater, container, false);

    // Display greetings
    showGreetings();

    // Display job statistics
    showStats();

    // Display service categories
    showCategories();

    // Handle Request Service button click
    binding.btnRequestService.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(getActivity(), RequestService.class));
      }
    });

    return binding.getRoot();
  }

  /**
   * Display greeting messages.
   */
  private void showGreetings() {
    binding.layoutHeader.txtGreeting.setText("Welcome, Dennis");
    binding.layoutHeader.txtGreetingSubtitle.setText("What service do you need today?");
  }

  /**
   * Display job statistics.
   */
  private void showStats() {
    binding.layoutStatistics.txtTotalJobs.setText("24");
    binding.layoutStatistics.txtOngoingJobs.setText("2");
    binding.layoutStatistics.txtCompletedJobs.setText("20");
    binding.layoutStatistics.txtCanceledJobs.setText("2");
  }

  /**
   * Display service categories.
   */
  private void showCategories() {
    AdapterServiceCategories adapter = new AdapterServiceCategories(AppUtils.getServiceCategories());
    binding.layoutServiceCategories.recyclerViewServiceCategories.setAdapter(adapter);
    binding.layoutServiceCategories.recyclerViewServiceCategories.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    binding.layoutServiceCategories.recyclerViewServiceCategories.setHasFixedSize(true);
  }
}