// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProgessDialogeBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ProgressBar gridprogressBar;

  private ProgessDialogeBinding(@NonNull RelativeLayout rootView,
      @NonNull ProgressBar gridprogressBar) {
    this.rootView = rootView;
    this.gridprogressBar = gridprogressBar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProgessDialogeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProgessDialogeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.progess_dialoge, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProgessDialogeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.gridprogressBar;
      ProgressBar gridprogressBar = ViewBindings.findChildViewById(rootView, id);
      if (gridprogressBar == null) {
        break missingId;
      }

      return new ProgessDialogeBinding((RelativeLayout) rootView, gridprogressBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
