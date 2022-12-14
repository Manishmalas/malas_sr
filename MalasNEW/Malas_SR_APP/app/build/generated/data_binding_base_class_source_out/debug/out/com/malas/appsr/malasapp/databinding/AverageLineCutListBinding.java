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

public final class AverageLineCutListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvCountCategory;

  @NonNull
  public final TextView tvCountOulet;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDistributor;

  @NonNull
  public final TextView tvLineCut;

  @NonNull
  public final TextView tvTotalSKU;

  private AverageLineCutListBinding(@NonNull LinearLayout rootView,
      @NonNull TextView tvCountCategory, @NonNull TextView tvCountOulet, @NonNull TextView tvDate,
      @NonNull TextView tvDistributor, @NonNull TextView tvLineCut, @NonNull TextView tvTotalSKU) {
    this.rootView = rootView;
    this.tvCountCategory = tvCountCategory;
    this.tvCountOulet = tvCountOulet;
    this.tvDate = tvDate;
    this.tvDistributor = tvDistributor;
    this.tvLineCut = tvLineCut;
    this.tvTotalSKU = tvTotalSKU;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AverageLineCutListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AverageLineCutListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.average_line_cut_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AverageLineCutListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvCountCategory;
      TextView tvCountCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvCountCategory == null) {
        break missingId;
      }

      id = R.id.tvCountOulet;
      TextView tvCountOulet = ViewBindings.findChildViewById(rootView, id);
      if (tvCountOulet == null) {
        break missingId;
      }

      id = R.id.tvDate;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      id = R.id.tvDistributor;
      TextView tvDistributor = ViewBindings.findChildViewById(rootView, id);
      if (tvDistributor == null) {
        break missingId;
      }

      id = R.id.tvLineCut;
      TextView tvLineCut = ViewBindings.findChildViewById(rootView, id);
      if (tvLineCut == null) {
        break missingId;
      }

      id = R.id.tvTotalSKU;
      TextView tvTotalSKU = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalSKU == null) {
        break missingId;
      }

      return new AverageLineCutListBinding((LinearLayout) rootView, tvCountCategory, tvCountOulet,
          tvDate, tvDistributor, tvLineCut, tvTotalSKU);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
