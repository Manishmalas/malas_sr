// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ActivityGridviewListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout llActivityGrid;

  @NonNull
  public final TextView tvDateSeprater;

  @NonNull
  public final TextView tvEndDate;

  @NonNull
  public final TextView tvGrid;

  @NonNull
  public final TextView tvStartDate;

  private ActivityGridviewListBinding(@NonNull CardView rootView,
      @NonNull LinearLayout llActivityGrid, @NonNull TextView tvDateSeprater,
      @NonNull TextView tvEndDate, @NonNull TextView tvGrid, @NonNull TextView tvStartDate) {
    this.rootView = rootView;
    this.llActivityGrid = llActivityGrid;
    this.tvDateSeprater = tvDateSeprater;
    this.tvEndDate = tvEndDate;
    this.tvGrid = tvGrid;
    this.tvStartDate = tvStartDate;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityGridviewListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityGridviewListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_gridview_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityGridviewListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_activity_grid;
      LinearLayout llActivityGrid = ViewBindings.findChildViewById(rootView, id);
      if (llActivityGrid == null) {
        break missingId;
      }

      id = R.id.tv_date_seprater;
      TextView tvDateSeprater = ViewBindings.findChildViewById(rootView, id);
      if (tvDateSeprater == null) {
        break missingId;
      }

      id = R.id.tv_end_date;
      TextView tvEndDate = ViewBindings.findChildViewById(rootView, id);
      if (tvEndDate == null) {
        break missingId;
      }

      id = R.id.tv_grid;
      TextView tvGrid = ViewBindings.findChildViewById(rootView, id);
      if (tvGrid == null) {
        break missingId;
      }

      id = R.id.tv_start_date;
      TextView tvStartDate = ViewBindings.findChildViewById(rootView, id);
      if (tvStartDate == null) {
        break missingId;
      }

      return new ActivityGridviewListBinding((CardView) rootView, llActivityGrid, tvDateSeprater,
          tvEndDate, tvGrid, tvStartDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
