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

public final class ConfirmStockItemLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView confirmStockItemBoxes;

  @NonNull
  public final TextView confirmStockItemProduct;

  @NonNull
  public final TextView confirmStockItemQty;

  @NonNull
  public final LinearLayout stockConfirmHeader;

  private ConfirmStockItemLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull TextView confirmStockItemBoxes, @NonNull TextView confirmStockItemProduct,
      @NonNull TextView confirmStockItemQty, @NonNull LinearLayout stockConfirmHeader) {
    this.rootView = rootView;
    this.confirmStockItemBoxes = confirmStockItemBoxes;
    this.confirmStockItemProduct = confirmStockItemProduct;
    this.confirmStockItemQty = confirmStockItemQty;
    this.stockConfirmHeader = stockConfirmHeader;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ConfirmStockItemLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ConfirmStockItemLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.confirm_stock_item_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ConfirmStockItemLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.confirm_stock_item_boxes;
      TextView confirmStockItemBoxes = ViewBindings.findChildViewById(rootView, id);
      if (confirmStockItemBoxes == null) {
        break missingId;
      }

      id = R.id.confirm_stock_item_product;
      TextView confirmStockItemProduct = ViewBindings.findChildViewById(rootView, id);
      if (confirmStockItemProduct == null) {
        break missingId;
      }

      id = R.id.confirm_stock_item_qty;
      TextView confirmStockItemQty = ViewBindings.findChildViewById(rootView, id);
      if (confirmStockItemQty == null) {
        break missingId;
      }

      LinearLayout stockConfirmHeader = (LinearLayout) rootView;

      return new ConfirmStockItemLayoutBinding((LinearLayout) rootView, confirmStockItemBoxes,
          confirmStockItemProduct, confirmStockItemQty, stockConfirmHeader);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}