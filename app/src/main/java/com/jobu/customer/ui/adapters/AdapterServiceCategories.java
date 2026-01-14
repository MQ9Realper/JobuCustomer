package com.jobu.customer.ui.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.jobu.customer.data.models.dto.ServiceCategory;
import com.jobu.customer.databinding.LayoutServiceCategoryListItemBinding;
import java.util.ArrayList;

/**
 * Adapter for Service Categories.
 */
public class AdapterServiceCategories extends RecyclerView.Adapter<AdapterServiceCategories.ViewHolder> {
  private final ArrayList<ServiceCategory> serviceCategories;

  /**
   * Constructor for AdapterServiceCategories.
   *
   * @param serviceCategories List of service categories
   */
  public AdapterServiceCategories(ArrayList<ServiceCategory> serviceCategories) {
    this.serviceCategories = serviceCategories;
  }

  /**
   * ViewHolder class for service category items.
   */
  public static class ViewHolder extends RecyclerView.ViewHolder {
    private final LayoutServiceCategoryListItemBinding binding;

    public ViewHolder(LayoutServiceCategoryListItemBinding binding) {
      super(binding.getRoot());
      this.binding = binding;
    }
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    LayoutServiceCategoryListItemBinding binding = LayoutServiceCategoryListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
    return new ViewHolder(binding);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    ServiceCategory category = serviceCategories.get(position);
    holder.binding.txtServiceCategory.setText(category.getName());
    holder.binding.iconServiceCategory.setImageResource(category.getIconResId());

  }

  @Override
  public int getItemCount() {
    return serviceCategories.size();
  }
}
