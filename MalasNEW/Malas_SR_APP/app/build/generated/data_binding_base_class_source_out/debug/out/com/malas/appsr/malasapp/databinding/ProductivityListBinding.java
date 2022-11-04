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

public final class ProductivityListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvDatelist;

  @NonNull
  public final TextView tvProductivitylist;

  @NonNull
  public final TextView tvTotalOuletProductivelist;

  @NonNull
  public final TextView tvTotalOutletVisitlist;

  private ProductivityListBinding(@NonNull LinearLayout rootView, @NonNull TextView tvDatelist,
      @NonNull TextView tvProductivitylist, @NonNull TextView tvTotalOuletProductivelist,
      @NonNull TextView tvTotalOutletVisitlist) {
    this.rootView = rootView;
    this.tvDatelist = tvDatelist;
    this.tvProductivitylist = tvProductivitylist;
    this.tvTotalOuletProductivelist = tvTotalOuletProductivelist;
    this.tvTotalOutletVisitlist = tvTotalOutletVisitlist;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProductivityListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProductivityListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.productivity_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProductivityListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvDatelist;
      TextView tvDatelist = ViewBindings.findChildViewById(rootView, id);
      if (tvDatelist == null) {
        break missingId;
      }

      id = R.id.tvProductivitylist;
      TextView tvProductivitylist = ViewBindings.findChildViewById(rootView, id);
      if (tvProductivitylist == null) {
        break missingId;
      }

      id = R.id.tvTotalOuletProductivelist;
      TextView tvTotalOuletProductivelist = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalOuletProductivelist == null) {
        break missingId;
      }

      id = R.id.tvTotalOutletVisitlist;
      TextView tvTotalOutletVisitlist = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalOutletVisitlist == null) {
        break missingId;
      }

      return new ProductivityListBinding((LinearLayout) rootView, tvDatelist, tvProductivitylist,
          tvTotalOuletProductivelist, tvTotalOutletVisitlist);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}