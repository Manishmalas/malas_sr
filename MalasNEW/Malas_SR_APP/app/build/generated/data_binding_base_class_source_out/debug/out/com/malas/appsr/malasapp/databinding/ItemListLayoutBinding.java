// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemListLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText etItemQuantity;

  @NonNull
  public final TextView tvItemName;

  @NonNull
  public final TextView tvItemPrice;

  private ItemListLayoutBinding(@NonNull LinearLayout rootView, @NonNull EditText etItemQuantity,
      @NonNull TextView tvItemName, @NonNull TextView tvItemPrice) {
    this.rootView = rootView;
    this.etItemQuantity = etItemQuantity;
    this.tvItemName = tvItemName;
    this.tvItemPrice = tvItemPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemListLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemListLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_list_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemListLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.et_item_quantity;
      EditText etItemQuantity = ViewBindings.findChildViewById(rootView, id);
      if (etItemQuantity == null) {
        break missingId;
      }

      id = R.id.tv_item_name;
      TextView tvItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvItemName == null) {
        break missingId;
      }

      id = R.id.tv_item_price;
      TextView tvItemPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvItemPrice == null) {
        break missingId;
      }

      return new ItemListLayoutBinding((LinearLayout) rootView, etItemQuantity, tvItemName,
          tvItemPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
