// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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

public final class CategoryRowBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RadioButton rbNa;

  @NonNull
  public final RadioButton rbNo;

  @NonNull
  public final RadioButton rbYes;

  @NonNull
  public final RadioGroup rgroup;

  @NonNull
  public final TextView tvRowCategory;

  private CategoryRowBinding(@NonNull RelativeLayout rootView, @NonNull RadioButton rbNa,
      @NonNull RadioButton rbNo, @NonNull RadioButton rbYes, @NonNull RadioGroup rgroup,
      @NonNull TextView tvRowCategory) {
    this.rootView = rootView;
    this.rbNa = rbNa;
    this.rbNo = rbNo;
    this.rbYes = rbYes;
    this.rgroup = rgroup;
    this.tvRowCategory = tvRowCategory;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CategoryRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CategoryRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.category_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CategoryRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rb_na;
      RadioButton rbNa = ViewBindings.findChildViewById(rootView, id);
      if (rbNa == null) {
        break missingId;
      }

      id = R.id.rb_no;
      RadioButton rbNo = ViewBindings.findChildViewById(rootView, id);
      if (rbNo == null) {
        break missingId;
      }

      id = R.id.rb_yes;
      RadioButton rbYes = ViewBindings.findChildViewById(rootView, id);
      if (rbYes == null) {
        break missingId;
      }

      id = R.id.rgroup;
      RadioGroup rgroup = ViewBindings.findChildViewById(rootView, id);
      if (rgroup == null) {
        break missingId;
      }

      id = R.id.tv_row_category;
      TextView tvRowCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvRowCategory == null) {
        break missingId;
      }

      return new CategoryRowBinding((RelativeLayout) rootView, rbNa, rbNo, rbYes, rgroup,
          tvRowCategory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
