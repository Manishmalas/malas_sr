// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ConfirmPlaceOrderListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView SOQ;

  @NonNull
  public final TextView tvProductName;

  private ConfirmPlaceOrderListBinding(@NonNull LinearLayout rootView, @NonNull TextView SOQ,
      @NonNull TextView tvProductName) {
    this.rootView = rootView;
    this.SOQ = SOQ;
    this.tvProductName = tvProductName;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ConfirmPlaceOrderListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ConfirmPlaceOrderListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.confirm_place_order_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ConfirmPlaceOrderListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.SOQ;
      TextView SOQ = ViewBindings.findChildViewById(rootView, id);
      if (SOQ == null) {
        break missingId;
      }

      id = R.id.tvProductName;
      TextView tvProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvProductName == null) {
        break missingId;
      }

      return new ConfirmPlaceOrderListBinding((LinearLayout) rootView, SOQ, tvProductName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}