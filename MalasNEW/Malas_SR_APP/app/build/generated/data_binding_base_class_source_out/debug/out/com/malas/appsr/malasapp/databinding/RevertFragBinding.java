// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class RevertFragBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout rl1;

  @NonNull
  public final RecyclerView rvLeaveRevertSubList;

  @NonNull
  public final TextView tvEmpty;

  private RevertFragBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout rl1,
      @NonNull RecyclerView rvLeaveRevertSubList, @NonNull TextView tvEmpty) {
    this.rootView = rootView;
    this.rl1 = rl1;
    this.rvLeaveRevertSubList = rvLeaveRevertSubList;
    this.tvEmpty = tvEmpty;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static RevertFragBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static RevertFragBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.revert_frag, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static RevertFragBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rl1;
      LinearLayout rl1 = ViewBindings.findChildViewById(rootView, id);
      if (rl1 == null) {
        break missingId;
      }

      id = R.id.rv_leave_revert_sub_list;
      RecyclerView rvLeaveRevertSubList = ViewBindings.findChildViewById(rootView, id);
      if (rvLeaveRevertSubList == null) {
        break missingId;
      }

      id = R.id.tv_empty;
      TextView tvEmpty = ViewBindings.findChildViewById(rootView, id);
      if (tvEmpty == null) {
        break missingId;
      }

      return new RevertFragBinding((LinearLayout) rootView, rl1, rvLeaveRevertSubList, tvEmpty);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
