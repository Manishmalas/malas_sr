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

public final class OfflineListOrderBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llListTakeOrderOffline;

  @NonNull
  public final LinearLayout llOfflineList;

  @NonNull
  public final TextView tvCategoryName;

  @NonNull
  public final TextView tvOutletName;

  @NonNull
  public final TextView tvProductName;

  @NonNull
  public final TextView tvQuantity;

  @NonNull
  public final TextView tvReason;

  private OfflineListOrderBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llListTakeOrderOffline, @NonNull LinearLayout llOfflineList,
      @NonNull TextView tvCategoryName, @NonNull TextView tvOutletName,
      @NonNull TextView tvProductName, @NonNull TextView tvQuantity, @NonNull TextView tvReason) {
    this.rootView = rootView;
    this.llListTakeOrderOffline = llListTakeOrderOffline;
    this.llOfflineList = llOfflineList;
    this.tvCategoryName = tvCategoryName;
    this.tvOutletName = tvOutletName;
    this.tvProductName = tvProductName;
    this.tvQuantity = tvQuantity;
    this.tvReason = tvReason;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static OfflineListOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OfflineListOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.offline_list_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OfflineListOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_list_take_order_offline;
      LinearLayout llListTakeOrderOffline = ViewBindings.findChildViewById(rootView, id);
      if (llListTakeOrderOffline == null) {
        break missingId;
      }

      id = R.id.ll_offline_list;
      LinearLayout llOfflineList = ViewBindings.findChildViewById(rootView, id);
      if (llOfflineList == null) {
        break missingId;
      }

      id = R.id.tvCategory_name;
      TextView tvCategoryName = ViewBindings.findChildViewById(rootView, id);
      if (tvCategoryName == null) {
        break missingId;
      }

      id = R.id.tv_outletName;
      TextView tvOutletName = ViewBindings.findChildViewById(rootView, id);
      if (tvOutletName == null) {
        break missingId;
      }

      id = R.id.tv_product_name;
      TextView tvProductName = ViewBindings.findChildViewById(rootView, id);
      if (tvProductName == null) {
        break missingId;
      }

      id = R.id.tv_quantity;
      TextView tvQuantity = ViewBindings.findChildViewById(rootView, id);
      if (tvQuantity == null) {
        break missingId;
      }

      id = R.id.tvReason;
      TextView tvReason = ViewBindings.findChildViewById(rootView, id);
      if (tvReason == null) {
        break missingId;
      }

      return new OfflineListOrderBinding((LinearLayout) rootView, llListTakeOrderOffline,
          llOfflineList, tvCategoryName, tvOutletName, tvProductName, tvQuantity, tvReason);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
