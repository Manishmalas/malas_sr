// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityConfirmOutletOrdersBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnOutletOrderConfirmCancel;

  @NonNull
  public final Button btnOutletOrderConfirmConfirm;

  @NonNull
  public final LinearLayout outletOrderConfirmHeader;

  @NonNull
  public final RecyclerView outletOrderConfirmItemview;

  @NonNull
  public final LinearLayout outletOrderConfirmTotal;

  @NonNull
  public final TextView outletOrderConfirmTotalQty;

  @NonNull
  public final LinearLayout showConfirmAction;

  private ActivityConfirmOutletOrdersBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnOutletOrderConfirmCancel, @NonNull Button btnOutletOrderConfirmConfirm,
      @NonNull LinearLayout outletOrderConfirmHeader,
      @NonNull RecyclerView outletOrderConfirmItemview,
      @NonNull LinearLayout outletOrderConfirmTotal, @NonNull TextView outletOrderConfirmTotalQty,
      @NonNull LinearLayout showConfirmAction) {
    this.rootView = rootView;
    this.btnOutletOrderConfirmCancel = btnOutletOrderConfirmCancel;
    this.btnOutletOrderConfirmConfirm = btnOutletOrderConfirmConfirm;
    this.outletOrderConfirmHeader = outletOrderConfirmHeader;
    this.outletOrderConfirmItemview = outletOrderConfirmItemview;
    this.outletOrderConfirmTotal = outletOrderConfirmTotal;
    this.outletOrderConfirmTotalQty = outletOrderConfirmTotalQty;
    this.showConfirmAction = showConfirmAction;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityConfirmOutletOrdersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityConfirmOutletOrdersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_confirm_outlet_orders, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityConfirmOutletOrdersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_outlet_order_confirm_cancel;
      Button btnOutletOrderConfirmCancel = ViewBindings.findChildViewById(rootView, id);
      if (btnOutletOrderConfirmCancel == null) {
        break missingId;
      }

      id = R.id.btn_outlet_order_confirm_confirm;
      Button btnOutletOrderConfirmConfirm = ViewBindings.findChildViewById(rootView, id);
      if (btnOutletOrderConfirmConfirm == null) {
        break missingId;
      }

      id = R.id.outlet_order_confirm_header;
      LinearLayout outletOrderConfirmHeader = ViewBindings.findChildViewById(rootView, id);
      if (outletOrderConfirmHeader == null) {
        break missingId;
      }

      id = R.id.outlet_order_confirm_itemview;
      RecyclerView outletOrderConfirmItemview = ViewBindings.findChildViewById(rootView, id);
      if (outletOrderConfirmItemview == null) {
        break missingId;
      }

      id = R.id.outlet_order_confirm_total;
      LinearLayout outletOrderConfirmTotal = ViewBindings.findChildViewById(rootView, id);
      if (outletOrderConfirmTotal == null) {
        break missingId;
      }

      id = R.id.outlet_order_confirm_total_qty;
      TextView outletOrderConfirmTotalQty = ViewBindings.findChildViewById(rootView, id);
      if (outletOrderConfirmTotalQty == null) {
        break missingId;
      }

      id = R.id.show_confirm_action;
      LinearLayout showConfirmAction = ViewBindings.findChildViewById(rootView, id);
      if (showConfirmAction == null) {
        break missingId;
      }

      return new ActivityConfirmOutletOrdersBinding((RelativeLayout) rootView,
          btnOutletOrderConfirmCancel, btnOutletOrderConfirmConfirm, outletOrderConfirmHeader,
          outletOrderConfirmItemview, outletOrderConfirmTotal, outletOrderConfirmTotalQty,
          showConfirmAction);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
