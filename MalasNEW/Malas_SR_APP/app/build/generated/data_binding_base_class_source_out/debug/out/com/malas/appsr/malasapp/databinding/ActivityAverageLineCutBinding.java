// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
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

public final class ActivityAverageLineCutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout llLayout;

  @NonNull
  public final ListView lvAvgLineCut;

  @NonNull
  public final RelativeLayout rl1;

  @NonNull
  public final EditText spnrFinancialMonth;

  @NonNull
  public final EditText spnrFinancialYear;

  @NonNull
  public final TextView tvCategoryCount;

  @NonNull
  public final TextView tvCountCategory;

  @NonNull
  public final TextView tvCountOulet;

  @NonNull
  public final TextView tvDate;

  @NonNull
  public final TextView tvDistributor;

  @NonNull
  public final TextView tvEmptyList;

  @NonNull
  public final TextView tvLineCut;

  @NonNull
  public final TextView tvSku;

  @NonNull
  public final TextView tvTerritory;

  @NonNull
  public final TextView tvTotalCategory;

  @NonNull
  public final TextView tvTotalCountOutlet;

  @NonNull
  public final TextView tvTotalLineCut;

  @NonNull
  public final TextView tvTotalSKU;

  @NonNull
  public final TextView tvTotalSku;

  private ActivityAverageLineCutBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout llLayout, @NonNull ListView lvAvgLineCut, @NonNull RelativeLayout rl1,
      @NonNull EditText spnrFinancialMonth, @NonNull EditText spnrFinancialYear,
      @NonNull TextView tvCategoryCount, @NonNull TextView tvCountCategory,
      @NonNull TextView tvCountOulet, @NonNull TextView tvDate, @NonNull TextView tvDistributor,
      @NonNull TextView tvEmptyList, @NonNull TextView tvLineCut, @NonNull TextView tvSku,
      @NonNull TextView tvTerritory, @NonNull TextView tvTotalCategory,
      @NonNull TextView tvTotalCountOutlet, @NonNull TextView tvTotalLineCut,
      @NonNull TextView tvTotalSKU, @NonNull TextView tvTotalSku) {
    this.rootView = rootView;
    this.llLayout = llLayout;
    this.lvAvgLineCut = lvAvgLineCut;
    this.rl1 = rl1;
    this.spnrFinancialMonth = spnrFinancialMonth;
    this.spnrFinancialYear = spnrFinancialYear;
    this.tvCategoryCount = tvCategoryCount;
    this.tvCountCategory = tvCountCategory;
    this.tvCountOulet = tvCountOulet;
    this.tvDate = tvDate;
    this.tvDistributor = tvDistributor;
    this.tvEmptyList = tvEmptyList;
    this.tvLineCut = tvLineCut;
    this.tvSku = tvSku;
    this.tvTerritory = tvTerritory;
    this.tvTotalCategory = tvTotalCategory;
    this.tvTotalCountOutlet = tvTotalCountOutlet;
    this.tvTotalLineCut = tvTotalLineCut;
    this.tvTotalSKU = tvTotalSKU;
    this.tvTotalSku = tvTotalSku;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAverageLineCutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAverageLineCutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_average_line_cut, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAverageLineCutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout llLayout = (LinearLayout) rootView;

      id = R.id.lvAvgLineCut;
      ListView lvAvgLineCut = ViewBindings.findChildViewById(rootView, id);
      if (lvAvgLineCut == null) {
        break missingId;
      }

      id = R.id.rl1;
      RelativeLayout rl1 = ViewBindings.findChildViewById(rootView, id);
      if (rl1 == null) {
        break missingId;
      }

      id = R.id.spnr_financialMonth;
      EditText spnrFinancialMonth = ViewBindings.findChildViewById(rootView, id);
      if (spnrFinancialMonth == null) {
        break missingId;
      }

      id = R.id.spnr_financialYear;
      EditText spnrFinancialYear = ViewBindings.findChildViewById(rootView, id);
      if (spnrFinancialYear == null) {
        break missingId;
      }

      id = R.id.tv_category_count;
      TextView tvCategoryCount = ViewBindings.findChildViewById(rootView, id);
      if (tvCategoryCount == null) {
        break missingId;
      }

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

      id = R.id.tvEmptyList;
      TextView tvEmptyList = ViewBindings.findChildViewById(rootView, id);
      if (tvEmptyList == null) {
        break missingId;
      }

      id = R.id.tvLineCut;
      TextView tvLineCut = ViewBindings.findChildViewById(rootView, id);
      if (tvLineCut == null) {
        break missingId;
      }

      id = R.id.tv_sku;
      TextView tvSku = ViewBindings.findChildViewById(rootView, id);
      if (tvSku == null) {
        break missingId;
      }

      id = R.id.tv_territory;
      TextView tvTerritory = ViewBindings.findChildViewById(rootView, id);
      if (tvTerritory == null) {
        break missingId;
      }

      id = R.id.tv_total_category;
      TextView tvTotalCategory = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalCategory == null) {
        break missingId;
      }

      id = R.id.tv_total_count_outlet;
      TextView tvTotalCountOutlet = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalCountOutlet == null) {
        break missingId;
      }

      id = R.id.tv_total_line_cut;
      TextView tvTotalLineCut = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalLineCut == null) {
        break missingId;
      }

      id = R.id.tvTotalSKU;
      TextView tvTotalSKU = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalSKU == null) {
        break missingId;
      }

      id = R.id.tv_total_sku;
      TextView tvTotalSku = ViewBindings.findChildViewById(rootView, id);
      if (tvTotalSku == null) {
        break missingId;
      }

      return new ActivityAverageLineCutBinding((LinearLayout) rootView, llLayout, lvAvgLineCut, rl1,
          spnrFinancialMonth, spnrFinancialYear, tvCategoryCount, tvCountCategory, tvCountOulet,
          tvDate, tvDistributor, tvEmptyList, tvLineCut, tvSku, tvTerritory, tvTotalCategory,
          tvTotalCountOutlet, tvTotalLineCut, tvTotalSKU, tvTotalSku);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
