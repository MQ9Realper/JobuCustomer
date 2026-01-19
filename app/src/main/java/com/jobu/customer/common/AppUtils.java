package com.jobu.customer.common;

import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.jobu.customer.R;
import com.jobu.customer.data.models.dto.ServiceCategory;
import com.jobu.customer.data.models.dto.ServiceSubCategory;
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
   * Initializes the toolbar for an activity with subtitle support.
   *
   * @param activity       The activity where the toolbar is used.
   * @param toolbar        The MaterialToolbar to be initialized.
   * @param title          The title to set on the toolbar.
   * @param subtitle       The subtitle to set on the toolbar.
   * @param showBackButton Whether to show the back button in the toolbar.
   */
  public static void initToolbarWithSubtitle(AppCompatActivity activity, MaterialToolbar toolbar, String title, String subtitle, boolean showBackButton) {
    activity.setSupportActionBar(toolbar);

    if (activity.getSupportActionBar() != null) {
      activity.getSupportActionBar().setTitle(title);
      activity.getSupportActionBar().setSubtitle(subtitle);

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
    plumbing.setName("Electrical Services");
    plumbing.setIconResId(R.drawable.rounded_electrical_services_24);
    categories.add(plumbing);

    ServiceCategory electrical = new ServiceCategory();
    electrical.setName("Civil Works Services");
    electrical.setIconResId(R.drawable.rounded_road_24);
    categories.add(electrical);

    ServiceCategory cleaning = new ServiceCategory();
    cleaning.setName("Mechanical Services");
    cleaning.setIconResId(R.drawable.rounded_filter_vintage_24);
    categories.add(cleaning);

    ServiceCategory carpentry = new ServiceCategory();
    carpentry.setName("Telecom Services");
    carpentry.setIconResId(R.drawable.rounded_satellite_alt_24);
    categories.add(carpentry);

    ServiceCategory painting = new ServiceCategory();
    painting.setName("IT Services");
    painting.setIconResId(R.drawable.rounded_laptop_chromebook_24);
    categories.add(painting);

    return categories;
  }

  /**
   * Provides a list of predefined service sub-categories.
   *
   * @return An ArrayList of ServiceSubCategory objects.
   */
  public static ArrayList<ServiceSubCategory> getServiceSubCategories() {
    ArrayList<ServiceSubCategory> subCategories = new ArrayList<>();

    ServiceSubCategory subCategory1 = new ServiceSubCategory();
    subCategory1.setName("Wiring & Rewiring");
    subCategories.add(subCategory1);

    ServiceSubCategory subCategory2 = new ServiceSubCategory();
    subCategory2.setName("Lighting Installation");
    subCategories.add(subCategory2);

    ServiceSubCategory subCategory3 = new ServiceSubCategory();
    subCategory3.setName("Circuit Breaker & Fuse Repair");
    subCategories.add(subCategory3);

    ServiceSubCategory subCategory4 = new ServiceSubCategory();
    subCategory4.setName("Power Backups & Solar Systems");
    subCategories.add(subCategory4);

    ServiceSubCategory subCategory5 = new ServiceSubCategory();
    subCategory5.setName("Electrical Appliances Repair");
    subCategories.add(subCategory5);

    ServiceSubCategory subCategory6 = new ServiceSubCategory();
    subCategory6.setName("Switches & Socket Installation");
    subCategories.add(subCategory6);

    ServiceSubCategory subCategory7 = new ServiceSubCategory();
    subCategory7.setName("Smart Home Electrical Systems");
    subCategories.add(subCategory7);

    ServiceSubCategory subCategory8 = new ServiceSubCategory();
    subCategory8.setName("Electric Fence Installation");
    subCategories.add(subCategory8);

    ServiceSubCategory subCategory9 = new ServiceSubCategory();
    subCategory9.setName("Meter Installation");
    subCategories.add(subCategory9);

    ServiceSubCategory subCategory10 = new ServiceSubCategory();
    subCategory10.setName("3 Phase & Single Phase Wiring");
    subCategories.add(subCategory10);

    return subCategories;
  }

  /**
   * Extracts initials from a name string.
   *
   * @param name the name string
   * @return the initials
   */
  public static String getInitials(String name, int maxLength) {
    if (name == null || name.trim().isEmpty()) {
      return "";
    }

    String trimmedName = name.trim();
    String[] nameParts = trimmedName.split("\\s+");

    StringBuilder initials = new StringBuilder();

    if (nameParts.length >= 2) {
      initials.append(nameParts[0].substring(0, 1).toUpperCase());
      initials.append(nameParts[nameParts.length - 1].substring(0, 1).toUpperCase());
    } else if (nameParts.length == 1) {
      String singleName = nameParts[0];
      int length = Math.min(singleName.length(), maxLength);
      initials.append(singleName.substring(0, length).toUpperCase());
    }

    return initials.toString();
  }

  // Overloaded method with default maxLength of 2
  public static String getInitials(String name) {
    return getInitials(name, 2);
  }

  /**
   * Displays a toast message.
   *
   * @param activity The activity context.
   * @param message  The message to display.
   */
  public static void showToast(AppCompatActivity activity, String message) {
    Toast.makeText(activity, message, Toast.LENGTH_LONG).show();
  }

}
