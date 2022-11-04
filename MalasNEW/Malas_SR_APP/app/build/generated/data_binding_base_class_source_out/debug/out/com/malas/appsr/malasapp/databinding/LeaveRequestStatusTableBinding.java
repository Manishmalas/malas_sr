// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LeaveRequestStatusTableBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView ivStatus;

  @NonNull
  public final LinearLayout llReject;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDays;

  @NonNull
  public final TextView tvEndDate;

  @NonNull
  public final TextView tvLreason;

  @NonNull
  public final TextView tvReasonIfReject;

  @NonNull
  public final TextView tvStartDate;

  @NonNull
  public final TextView type;

  private LeaveRequestStatusTableBinding(@NonNull CardView rootView, @NonNull ImageView ivStatus,
      @NonNull LinearLayout llReject, @NonNull TextView tvDate, @NonNull TextView tvDays,
      @NonNull TextView tvEndDate, @NonNull TextView tvLreason, @NonNull TextView tvReasonIfReject,
      @NonNull TextView tvStartDate, @NonNull TextView type) {
    this.rootView = rootView;
    this.ivStatus = ivStatus;
    this.llReject = llReject;
    this.tvDate = tvDate;
    this.tvDays = tvDays;
    this.tvEndDate = tvEndDate;
    this.tvLreason = tvLreason;
    this.tvReasonIfReject = tvReasonIfReject;
    this.tvStartDate = tvStartDate;
    this.type = type;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static LeaveRequestStatusTableBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LeaveRequestStatusTableBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.leave_request_status_table, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LeaveRequestStatusTableBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_status;
      ImageView ivStatus = ViewBindings.findChildViewById(rootView, id);
      if (ivStatus == null) {
        break missingId;
      }

      id = R.id.ll_reject;
      LinearLayout llReject = ViewBindings.findChildViewById(rootView, id);
      if (llReject == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tv_days;
      TextView tvDays = ViewBindings.findChildViewById(rootView, id);
      if (tvDays == null) {
        break missingId;
      }

      id = R.id.tv_end_date;
      TextView tvEndDate = ViewBindings.findChildViewById(rootView, id);
      if (tvEndDate == null) {
        break missingId;
      }

      id = R.id.tv_lreason;
      TextView tvLreason = ViewBindings.findChildViewById(rootView, id);
      if (tvLreason == null) {
        break missingId;
      }

      id = R.id.tv_reason_if_reject;
      TextView tvReasonIfReject = ViewBindings.findChildViewById(rootView, id);
      if (tvReasonIfReject == null) {
        break missingId;
      }

      id = R.id.tv_start_date;
      TextView tvStartDate = ViewBindings.findChildViewById(rootView, id);
      if (tvStartDate == null) {
        break missingId;
      }

      id = R.id.type;
      TextView type = ViewBindings.findChildViewById(rootView, id);
      if (type == null) {
        break missingId;
      }

      return new LeaveRequestStatusTableBinding((CardView) rootView, ivStatus, llReject, tvDate,
          tvDays, tvEndDate, tvLreason, tvReasonIfReject, tvStartDate, type);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
