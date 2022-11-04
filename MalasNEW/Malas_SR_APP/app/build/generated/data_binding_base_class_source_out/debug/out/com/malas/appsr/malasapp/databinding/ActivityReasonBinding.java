// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityReasonBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnCancelReason;

  @NonNull
  public final Button btnSaveReason;

  @NonNull
  public final LinearLayout lllReason;

  @NonNull
  public final ListView lvReason;

  @NonNull
  public final Toolbar reasonToolbar;

  private ActivityReasonBinding(@NonNull RelativeLayout rootView, @NonNull Button btnCancelReason,
      @NonNull Button btnSaveReason, @NonNull LinearLayout lllReason, @NonNull ListView lvReason,
      @NonNull Toolbar reasonToolbar) {
    this.rootView = rootView;
    this.btnCancelReason = btnCancelReason;
    this.btnSaveReason = btnSaveReason;
    this.lllReason = lllReason;
    this.lvReason = lvReason;
    this.reasonToolbar = reasonToolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityReasonBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityReasonBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reason, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityReasonBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_cancel_reason;
      Button btnCancelReason = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelReason == null) {
        break missingId;
      }

      id = R.id.btn_save_reason;
      Button btnSaveReason = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveReason == null) {
        break missingId;
      }

      id = R.id.lll_reason;
      LinearLayout lllReason = ViewBindings.findChildViewById(rootView, id);
      if (lllReason == null) {
        break missingId;
      }

      id = R.id.lv_reason;
      ListView lvReason = ViewBindings.findChildViewById(rootView, id);
      if (lvReason == null) {
        break missingId;
      }

      id = R.id.reason_toolbar;
      Toolbar reasonToolbar = ViewBindings.findChildViewById(rootView, id);
      if (reasonToolbar == null) {
        break missingId;
      }

      return new ActivityReasonBinding((RelativeLayout) rootView, btnCancelReason, btnSaveReason,
          lllReason, lvReason, reasonToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
