// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
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

public final class ContentHomeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView appVersion;

  @NonNull
  public final TextView attendanceUpdateStatus;

  @NonNull
  public final Button btnSync;

  @NonNull
  public final CardView clockInoutReminder;

  @NonNull
  public final Button clockInoutReminderBtn;

  @NonNull
  public final TextView clockInoutReminderText;

  @NonNull
  public final ImageView homeImg;

  @NonNull
  public final LinearLayout llAttendanceUpdate;

  @NonNull
  public final TextView llFocusedText;

  @NonNull
  public final TextView llLastThreeDays;

  @NonNull
  public final LinearLayout llSync;

  private ContentHomeBinding(@NonNull RelativeLayout rootView, @NonNull TextView appVersion,
      @NonNull TextView attendanceUpdateStatus, @NonNull Button btnSync,
      @NonNull CardView clockInoutReminder, @NonNull Button clockInoutReminderBtn,
      @NonNull TextView clockInoutReminderText, @NonNull ImageView homeImg,
      @NonNull LinearLayout llAttendanceUpdate, @NonNull TextView llFocusedText,
      @NonNull TextView llLastThreeDays, @NonNull LinearLayout llSync) {
    this.rootView = rootView;
    this.appVersion = appVersion;
    this.attendanceUpdateStatus = attendanceUpdateStatus;
    this.btnSync = btnSync;
    this.clockInoutReminder = clockInoutReminder;
    this.clockInoutReminderBtn = clockInoutReminderBtn;
    this.clockInoutReminderText = clockInoutReminderText;
    this.homeImg = homeImg;
    this.llAttendanceUpdate = llAttendanceUpdate;
    this.llFocusedText = llFocusedText;
    this.llLastThreeDays = llLastThreeDays;
    this.llSync = llSync;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ContentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.content_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ContentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.app_version;
      TextView appVersion = ViewBindings.findChildViewById(rootView, id);
      if (appVersion == null) {
        break missingId;
      }

      id = R.id.attendance_update_status;
      TextView attendanceUpdateStatus = ViewBindings.findChildViewById(rootView, id);
      if (attendanceUpdateStatus == null) {
        break missingId;
      }

      id = R.id.btn_sync;
      Button btnSync = ViewBindings.findChildViewById(rootView, id);
      if (btnSync == null) {
        break missingId;
      }

      id = R.id.clock_inout_reminder;
      CardView clockInoutReminder = ViewBindings.findChildViewById(rootView, id);
      if (clockInoutReminder == null) {
        break missingId;
      }

      id = R.id.clock_inout_reminder_btn;
      Button clockInoutReminderBtn = ViewBindings.findChildViewById(rootView, id);
      if (clockInoutReminderBtn == null) {
        break missingId;
      }

      id = R.id.clock_inout_reminder_text;
      TextView clockInoutReminderText = ViewBindings.findChildViewById(rootView, id);
      if (clockInoutReminderText == null) {
        break missingId;
      }

      id = R.id.home_img;
      ImageView homeImg = ViewBindings.findChildViewById(rootView, id);
      if (homeImg == null) {
        break missingId;
      }

      id = R.id.ll_attendance_update;
      LinearLayout llAttendanceUpdate = ViewBindings.findChildViewById(rootView, id);
      if (llAttendanceUpdate == null) {
        break missingId;
      }

      id = R.id.ll_focused_text;
      TextView llFocusedText = ViewBindings.findChildViewById(rootView, id);
      if (llFocusedText == null) {
        break missingId;
      }

      id = R.id.ll_last_three_days;
      TextView llLastThreeDays = ViewBindings.findChildViewById(rootView, id);
      if (llLastThreeDays == null) {
        break missingId;
      }

      id = R.id.ll_sync;
      LinearLayout llSync = ViewBindings.findChildViewById(rootView, id);
      if (llSync == null) {
        break missingId;
      }

      return new ContentHomeBinding((RelativeLayout) rootView, appVersion, attendanceUpdateStatus,
          btnSync, clockInoutReminder, clockInoutReminderBtn, clockInoutReminderText, homeImg,
          llAttendanceUpdate, llFocusedText, llLastThreeDays, llSync);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
