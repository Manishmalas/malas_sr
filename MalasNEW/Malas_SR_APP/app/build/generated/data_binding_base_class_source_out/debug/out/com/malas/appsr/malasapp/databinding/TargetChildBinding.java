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

public final class TargetChildBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView tvChildAchievement;

  @NonNull
  public final TextView tvChildCategoryName;

  @NonNull
  public final TextView tvChildPercentage;

  @NonNull
  public final TextView tvChildTarget;

  private TargetChildBinding(@NonNull LinearLayout rootView, @NonNull TextView tvChildAchievement,
      @NonNull TextView tvChildCategoryName, @NonNull TextView tvChildPercentage,
      @NonNull TextView tvChildTarget) {
    this.rootView = rootView;
    this.tvChildAchievement = tvChildAchievement;
    this.tvChildCategoryName = tvChildCategoryName;
    this.tvChildPercentage = tvChildPercentage;
    this.tvChildTarget = tvChildTarget;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static TargetChildBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static TargetChildBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.target_child, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static TargetChildBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.tvChildAchievement;
      TextView tvChildAchievement = ViewBindings.findChildViewById(rootView, id);
      if (tvChildAchievement == null) {
        break missingId;
      }

      id = R.id.tvChildCategoryName;
      TextView tvChildCategoryName = ViewBindings.findChildViewById(rootView, id);
      if (tvChildCategoryName == null) {
        break missingId;
      }

      id = R.id.tvChildPercentage;
      TextView tvChildPercentage = ViewBindings.findChildViewById(rootView, id);
      if (tvChildPercentage == null) {
        break missingId;
      }

      id = R.id.tvChildTarget;
      TextView tvChildTarget = ViewBindings.findChildViewById(rootView, id);
      if (tvChildTarget == null) {
        break missingId;
      }

      return new TargetChildBinding((LinearLayout) rootView, tvChildAchievement,
          tvChildCategoryName, tvChildPercentage, tvChildTarget);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
