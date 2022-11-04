// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOfflineOrderBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnEdit;

  @NonNull
  public final Button btnSave;

  @NonNull
  public final Button btnSaveReason;

  @NonNull
  public final LinearLayout llOffline;

  @NonNull
  public final LinearLayout llOfflineTakeOrder;

  @NonNull
  public final LinearLayout llSaveEdit;

  @NonNull
  public final LinearLayout llSaveEditBox;

  @NonNull
  public final LinearLayout llTop;

  @NonNull
  public final ListView lvOfflineOrder;

  @NonNull
  public final TextView tvCategoryname;

  @NonNull
  public final TextView tvOutletName;

  @NonNull
  public final TextView tvProductname;

  @NonNull
  public final TextView tvQuantity;

  @NonNull
  public final TextView tvReason;

  @NonNull
  public final View viewOffline;

  private ActivityOfflineOrderBinding(@NonNull RelativeLayout rootView, @NonNull Button btnEdit,
      @NonNull Button btnSave, @NonNull Button btnSaveReason, @NonNull LinearLayout llOffline,
      @NonNull LinearLayout llOfflineTakeOrder, @NonNull LinearLayout llSaveEdit,
      @NonNull LinearLayout llSaveEditBox, @NonNull LinearLayout llTop,
      @NonNull ListView lvOfflineOrder, @NonNull TextView tvCategoryname,
      @NonNull TextView tvOutletName, @NonNull TextView tvProductname, @NonNull TextView tvQuantity,
      @NonNull TextView tvReason, @NonNull View viewOffline) {
    this.rootView = rootView;
    this.btnEdit = btnEdit;
    this.btnSave = btnSave;
    this.btnSaveReason = btnSaveReason;
    this.llOffline = llOffline;
    this.llOfflineTakeOrder = llOfflineTakeOrder;
    this.llSaveEdit = llSaveEdit;
    this.llSaveEditBox = llSaveEditBox;
    this.llTop = llTop;
    this.lvOfflineOrder = lvOfflineOrder;
    this.tvCategoryname = tvCategoryname;
    this.tvOutletName = tvOutletName;
    this.tvProductname = tvProductname;
    this.tvQuantity = tvQuantity;
    this.tvReason = tvReason;
    this.viewOffline = viewOffline;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOfflineOrderBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOfflineOrderBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_offline_order, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOfflineOrderBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_edit;
      Button btnEdit = ViewBindings.findChildViewById(rootView, id);
      if (btnEdit == null) {
        break missingId;
      }

      id = R.id.btn_save;
      Button btnSave = ViewBindings.findChildViewById(rootView, id);
      if (btnSave == null) {
        break missingId;
      }

      id = R.id.btn_save_reason;
      Button btnSaveReason = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveReason == null) {
        break missingId;
      }

      id = R.id.ll_offline;
      LinearLayout llOffline = ViewBindings.findChildViewById(rootView, id);
      if (llOffline == null) {
        break missingId;
      }

      id = R.id.ll_offline_take_order;
      LinearLayout llOfflineTakeOrder = ViewBindings.findChildViewById(rootView, id);
      if (llOfflineTakeOrder == null) {
        break missingId;
      }

      id = R.id.ll_save_edit;
      LinearLayout llSaveEdit = ViewBindings.findChildViewById(rootView, id);
      if (llSaveEdit == null) {
        break missingId;
      }

      id = R.id.ll_save_edit_box;
      LinearLayout llSaveEditBox = ViewBindings.findChildViewById(rootView, id);
      if (llSaveEditBox == null) {
        break missingId;
      }

      id = R.id.ll_top;
      LinearLayout llTop = ViewBindings.findChildViewById(rootView, id);
      if (llTop == null) {
        break missingId;
      }

      id = R.id.lv_offline_order;
      ListView lvOfflineOrder = ViewBindings.findChildViewById(rootView, id);
      if (lvOfflineOrder == null) {
        break missingId;
      }

      id = R.id.tvCategoryname;
      TextView tvCategoryname = ViewBindings.findChildViewById(rootView, id);
      if (tvCategoryname == null) {
        break missingId;
      }

      id = R.id.tvOutletName;
      TextView tvOutletName = ViewBindings.findChildViewById(rootView, id);
      if (tvOutletName == null) {
        break missingId;
      }

      id = R.id.tv_productname;
      TextView tvProductname = ViewBindings.findChildViewById(rootView, id);
      if (tvProductname == null) {
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

      id = R.id.view_offline;
      View viewOffline = ViewBindings.findChildViewById(rootView, id);
      if (viewOffline == null) {
        break missingId;
      }

      return new ActivityOfflineOrderBinding((RelativeLayout) rootView, btnEdit, btnSave,
          btnSaveReason, llOffline, llOfflineTakeOrder, llSaveEdit, llSaveEditBox, llTop,
          lvOfflineOrder, tvCategoryname, tvOutletName, tvProductname, tvQuantity, tvReason,
          viewOffline);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
