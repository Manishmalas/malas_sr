// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.expenseutility.ExpenseManagement;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExpenseManagementBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ExpenseManagement cal;

  @NonNull
  public final RecyclerView expenseSummary;

  private ActivityExpenseManagementBinding(@NonNull LinearLayout rootView,
      @NonNull ExpenseManagement cal, @NonNull RecyclerView expenseSummary) {
    this.rootView = rootView;
    this.cal = cal;
    this.expenseSummary = expenseSummary;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExpenseManagementBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExpenseManagementBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_expense_management, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExpenseManagementBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cal;
      ExpenseManagement cal = ViewBindings.findChildViewById(rootView, id);
      if (cal == null) {
        break missingId;
      }

      id = R.id.expense_summary;
      RecyclerView expenseSummary = ViewBindings.findChildViewById(rootView, id);
      if (expenseSummary == null) {
        break missingId;
      }

      return new ActivityExpenseManagementBinding((LinearLayout) rootView, cal, expenseSummary);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
