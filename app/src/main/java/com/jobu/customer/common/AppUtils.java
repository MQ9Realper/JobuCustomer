package com.jobu.customer.common;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.jobu.customer.R;
import com.jobu.customer.data.models.dto.ServiceCategory;
import java.util.ArrayList;

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

  /**
   * Provides a list of predefined service categories.
   *
   * @return An ArrayList of ServiceCategory objects.
   */
  public static ArrayList<ServiceCategory> getServiceCategories() {
    ArrayList<ServiceCategory> categories = new ArrayList<>();

    ServiceCategory plumbing = new ServiceCategory();
    plumbing.setName("Electrical");
    plumbing.setIconResId(R.drawable.rounded_electrical_services_24);
    categories.add(plumbing);

    ServiceCategory electrical = new ServiceCategory();
    electrical.setName("Civil Works");
    electrical.setIconResId(R.drawable.rounded_road_24);
    categories.add(electrical);

    ServiceCategory cleaning = new ServiceCategory();
    cleaning.setName("Mechanical");
    cleaning.setIconResId(R.drawable.rounded_filter_vintage_24);
    categories.add(cleaning);

    ServiceCategory carpentry = new ServiceCategory();
    carpentry.setName("Telecom");
    carpentry.setIconResId(R.drawable.rounded_satellite_alt_24);
    categories.add(carpentry);

    ServiceCategory painting = new ServiceCategory();
    painting.setName("IT Services");
    painting.setIconResId(R.drawable.rounded_laptop_chromebook_24);
    categories.add(painting);

    return categories;
  }

}
