package com.jobu.customer.ui.bottomsheets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jobu.customer.databinding.BottomsheetBookServiceBinding;

/**
 * Bottom sheet dialog for booking a service.
 */
public class BottomSheetBookService extends BottomSheetDialogFragment {
  private String selectedSubcategory;

  /**
   * Constructor for BottomSheetBookService.
   */
  public BottomSheetBookService() {
    // Required empty public constructor
  }

  @Nullable
  @Override
  public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
    BottomsheetBookServiceBinding binding = BottomsheetBookServiceBinding.inflate(inflater, container, false);
    binding.layoutRequestServiceSubcategory.serviceSubCategoryEditText.setText(selectedSubcategory);

    binding.btnSubmitServiceRequest.setOnClickListener(v -> dismiss());

    binding.iconClose.setOnClickListener(v -> dismiss());

    setCancelable(false);

    return binding.getRoot();
  }

  /**
   * Sets the selected subcategory.
   *
   * @param selectedSubcategory The selected subcategory.
   */
  public void setSubcategory(String selectedSubcategory) {
    this.selectedSubcategory = selectedSubcategory;
  }

  /**
   * Interface for submitting service requests.
   */
  public interface OnSubmitServiceRequestListener {

    /**
     * Called when a service request is submitted.
     *
     * @param serviceDescription The description of the service.
     * @param date               The requested date.
     * @param time               The requested time.
     */
    void onSubmitServiceRequest(String serviceDescription, String date, String time);
  }
}
