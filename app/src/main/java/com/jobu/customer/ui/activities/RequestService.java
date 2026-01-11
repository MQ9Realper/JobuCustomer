package com.jobu.customer.ui.activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.jobu.customer.common.AppUtils;
import com.jobu.customer.databinding.ActivityRequestServiceBinding;

/**
 * Request Service Activity.
 */
public class RequestService extends AppCompatActivity {
  private ActivityRequestServiceBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityRequestServiceBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    // Initialize toolbar
    AppUtils.initToolbar(this, binding.toolbar.getRoot(), "Service Request", true);

  }
}