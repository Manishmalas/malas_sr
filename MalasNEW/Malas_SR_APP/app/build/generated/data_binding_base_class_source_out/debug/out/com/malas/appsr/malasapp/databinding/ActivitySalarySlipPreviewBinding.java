// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
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

public final class ActivitySalarySlipPreviewBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AutoCompleteTextView salaryMonthList;

  @NonNull
  public final Button salarySlipDownload;

  @NonNull
  public final RelativeLayout salarySlipLayout;

  @NonNull
  public final TextView salarySlipNotification;

  @NonNull
  public final ProgressBar salarySlipProgress;

  @NonNull
  public final WebView salarySlipWebview;

  private ActivitySalarySlipPreviewBinding(@NonNull LinearLayout rootView,
      @NonNull AutoCompleteTextView salaryMonthList, @NonNull Button salarySlipDownload,
      @NonNull RelativeLayout salarySlipLayout, @NonNull TextView salarySlipNotification,
      @NonNull ProgressBar salarySlipProgress, @NonNull WebView salarySlipWebview) {
    this.rootView = rootView;
    this.salaryMonthList = salaryMonthList;
    this.salarySlipDownload = salarySlipDownload;
    this.salarySlipLayout = salarySlipLayout;
    this.salarySlipNotification = salarySlipNotification;
    this.salarySlipProgress = salarySlipProgress;
    this.salarySlipWebview = salarySlipWebview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySalarySlipPreviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySalarySlipPreviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_salary_slip_preview, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySalarySlipPreviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.salary_month_list;
      AutoCompleteTextView salaryMonthList = ViewBindings.findChildViewById(rootView, id);
      if (salaryMonthList == null) {
        break missingId;
      }

      id = R.id.salary_slip_download;
      Button salarySlipDownload = ViewBindings.findChildViewById(rootView, id);
      if (salarySlipDownload == null) {
        break missingId;
      }

      id = R.id.salary_slip_layout;
      RelativeLayout salarySlipLayout = ViewBindings.findChildViewById(rootView, id);
      if (salarySlipLayout == null) {
        break missingId;
      }

      id = R.id.salary_slip_notification;
      TextView salarySlipNotification = ViewBindings.findChildViewById(rootView, id);
      if (salarySlipNotification == null) {
        break missingId;
      }

      id = R.id.salary_slip_progress;
      ProgressBar salarySlipProgress = ViewBindings.findChildViewById(rootView, id);
      if (salarySlipProgress == null) {
        break missingId;
      }

      id = R.id.salary_slip_webview;
      WebView salarySlipWebview = ViewBindings.findChildViewById(rootView, id);
      if (salarySlipWebview == null) {
        break missingId;
      }

      return new ActivitySalarySlipPreviewBinding((LinearLayout) rootView, salaryMonthList,
          salarySlipDownload, salarySlipLayout, salarySlipNotification, salarySlipProgress,
          salarySlipWebview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}