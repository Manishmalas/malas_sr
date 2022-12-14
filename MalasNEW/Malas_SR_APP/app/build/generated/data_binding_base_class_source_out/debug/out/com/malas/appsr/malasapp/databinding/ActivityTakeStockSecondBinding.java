// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ActivityTakeStockSecondBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivAdd;

  @NonNull
  public final ExpandableListView lvjam;

  @NonNull
  public final RelativeLayout rl1;

  @NonNull
  public final TextView spnrDistributr;

  private ActivityTakeStockSecondBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivAdd,
      @NonNull ExpandableListView lvjam, @NonNull RelativeLayout rl1,
      @NonNull TextView spnrDistributr) {
    this.rootView = rootView;
    this.ivAdd = ivAdd;
    this.lvjam = lvjam;
    this.rl1 = rl1;
    this.spnrDistributr = spnrDistributr;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTakeStockSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTakeStockSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_take_stock_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTakeStockSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.iv_add;
      ImageView ivAdd = ViewBindings.findChildViewById(rootView, id);
      if (ivAdd == null) {
        break missingId;
      }

      id = R.id.lvjam;
      ExpandableListView lvjam = ViewBindings.findChildViewById(rootView, id);
      if (lvjam == null) {
        break missingId;
      }

      id = R.id.rl1;
      RelativeLayout rl1 = ViewBindings.findChildViewById(rootView, id);
      if (rl1 == null) {
        break missingId;
      }

      id = R.id.spnr_distributr;
      TextView spnrDistributr = ViewBindings.findChildViewById(rootView, id);
      if (spnrDistributr == null) {
        break missingId;
      }

      return new ActivityTakeStockSecondBinding((LinearLayout) rootView, ivAdd, lvjam, rl1,
          spnrDistributr);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
