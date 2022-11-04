// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityCustomerFeedbackListDetailsBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnOk;

  @NonNull
  public final ListView lvFeedback;

  @NonNull
  public final TextView tvList;

  private ActivityCustomerFeedbackListDetailsBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnOk, @NonNull ListView lvFeedback, @NonNull TextView tvList) {
    this.rootView = rootView;
    this.btnOk = btnOk;
    this.lvFeedback = lvFeedback;
    this.tvList = tvList;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomerFeedbackListDetailsBinding inflate(
      @NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomerFeedbackListDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_customer_feedback_list_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomerFeedbackListDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_ok;
      Button btnOk = ViewBindings.findChildViewById(rootView, id);
      if (btnOk == null) {
        break missingId;
      }

      id = R.id.lv_feedback;
      ListView lvFeedback = ViewBindings.findChildViewById(rootView, id);
      if (lvFeedback == null) {
        break missingId;
      }

      id = R.id.tv_list;
      TextView tvList = ViewBindings.findChildViewById(rootView, id);
      if (tvList == null) {
        break missingId;
      }

      return new ActivityCustomerFeedbackListDetailsBinding((RelativeLayout) rootView, btnOk,
          lvFeedback, tvList);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
