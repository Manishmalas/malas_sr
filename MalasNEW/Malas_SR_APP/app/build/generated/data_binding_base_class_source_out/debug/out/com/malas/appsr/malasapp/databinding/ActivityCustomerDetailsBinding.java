// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustomerDetailsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ListView lvCustDetail;

  @NonNull
  public final TextView lvEmpty;

  private ActivityCustomerDetailsBinding(@NonNull LinearLayout rootView,
      @NonNull ListView lvCustDetail, @NonNull TextView lvEmpty) {
    this.rootView = rootView;
    this.lvCustDetail = lvCustDetail;
    this.lvEmpty = lvEmpty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustomerDetailsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustomerDetailsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_customer_details, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustomerDetailsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.lv_cust_detail;
      ListView lvCustDetail = ViewBindings.findChildViewById(rootView, id);
      if (lvCustDetail == null) {
        break missingId;
      }

      id = R.id.lv_empty;
      TextView lvEmpty = ViewBindings.findChildViewById(rootView, id);
      if (lvEmpty == null) {
        break missingId;
      }

      return new ActivityCustomerDetailsBinding((LinearLayout) rootView, lvCustDetail, lvEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
