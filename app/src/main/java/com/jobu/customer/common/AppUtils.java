package com.jobu.customer.common;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;

/**
 * Utility class for common app functions.
 */
public class AppUtils {

  /**
   * Initializes the toolbar for an activity.
   *
   * @param activity       The activity where the toolbar is used.
   * @param toolbar        The MaterialToolbar to be initialized.
   * @param title          The title to set on the toolbar.
   * @param showBackButton Whether to show the back button in the toolbar.
   */
  public static void initToolbar(AppCompatActivity activity, MaterialToolbar toolbar, String title, boolean showBackButton) {
    activity.setSupportActionBar(toolbar);

    if (activity.getSupportActionBar() != null) {
      activity.getSupportActionBar().setTitle(title);

      if (showBackButton) {
        activity.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        activity.getSupportActionBar().setDisplayShowHomeEnabled(true);
      }
    }

    if (showBackButton) {
      toolbar.setNavigationOnClickListener(v -> activity.onBackPressed());
    }
  }

}
