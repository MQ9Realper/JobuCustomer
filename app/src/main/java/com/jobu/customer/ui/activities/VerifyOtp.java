package com.jobu.customer.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.jobu.customer.R;
import com.jobu.customer.common.AppUtils;
import com.jobu.customer.databinding.ActivityVerifyOtpBinding;

/**
 * VerifyOtp Activity.
 */
public class VerifyOtp extends AppCompatActivity {
  private ActivityVerifyOtpBinding binding;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = ActivityVerifyOtpBinding.inflate(getLayoutInflater());
    setContentView(binding.getRoot());

    // Initialize Toolbar
    AppUtils.initToolbar(this, binding.toolbarVerifyOtp.getRoot(), getString(R.string.verify_otp), true);

    binding.btnVerifyOtp.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        startActivity(new Intent(VerifyOtp.this, Main.class));
      }
    });

  }

  @Override
  public boolean onSupportNavigateUp() {
    finish();
    return true;
  }
}