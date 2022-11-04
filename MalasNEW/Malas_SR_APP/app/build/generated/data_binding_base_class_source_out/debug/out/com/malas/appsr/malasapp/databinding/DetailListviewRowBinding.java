// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
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

public final class DetailListviewRowBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final LinearLayout llOutletName;

  @NonNull
  public final LinearLayout llPacakging;

  @NonNull
  public final LinearLayout llQty;

  @NonNull
  public final LinearLayout llTaste;

  @NonNull
  public final RatingBar rbAvgPackaging;

  @NonNull
  public final RatingBar rbAvgQty;

  @NonNull
  public final RatingBar rbAvgTaste;

  @NonNull
  public final TextView tvAvgPackaging;

  @NonNull
  public final TextView tvAvgQtyRating;

  @NonNull
  public final TextView tvAvgTaste;

  @NonNull
  public final TextView tvOutletAc;

  private DetailListviewRowBinding(@NonNull CardView rootView, @NonNull LinearLayout llOutletName,
      @NonNull LinearLayout llPacakging, @NonNull LinearLayout llQty, @NonNull LinearLayout llTaste,
      @NonNull RatingBar rbAvgPackaging, @NonNull RatingBar rbAvgQty, @NonNull RatingBar rbAvgTaste,
      @NonNull TextView tvAvgPackaging, @NonNull TextView tvAvgQtyRating,
      @NonNull TextView tvAvgTaste, @NonNull TextView tvOutletAc) {
    this.rootView = rootView;
    this.llOutletName = llOutletName;
    this.llPacakging = llPacakging;
    this.llQty = llQty;
    this.llTaste = llTaste;
    this.rbAvgPackaging = rbAvgPackaging;
    this.rbAvgQty = rbAvgQty;
    this.rbAvgTaste = rbAvgTaste;
    this.tvAvgPackaging = tvAvgPackaging;
    this.tvAvgQtyRating = tvAvgQtyRating;
    this.tvAvgTaste = tvAvgTaste;
    this.tvOutletAc = tvOutletAc;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailListviewRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailListviewRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.detail_listview_row, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailListviewRowBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ll_outlet_name;
      LinearLayout llOutletName = ViewBindings.findChildViewById(rootView, id);
      if (llOutletName == null) {
        break missingId;
      }

      id = R.id.ll_pacakging;
      LinearLayout llPacakging = ViewBindings.findChildViewById(rootView, id);
      if (llPacakging == null) {
        break missingId;
      }

      id = R.id.ll_qty;
      LinearLayout llQty = ViewBindings.findChildViewById(rootView, id);
      if (llQty == null) {
        break missingId;
      }

      id = R.id.ll_taste;
      LinearLayout llTaste = ViewBindings.findChildViewById(rootView, id);
      if (llTaste == null) {
        break missingId;
      }

      id = R.id.rb_avg_packaging;
      RatingBar rbAvgPackaging = ViewBindings.findChildViewById(rootView, id);
      if (rbAvgPackaging == null) {
        break missingId;
      }

      id = R.id.rb_avg_qty;
      RatingBar rbAvgQty = ViewBindings.findChildViewById(rootView, id);
      if (rbAvgQty == null) {
        break missingId;
      }

      id = R.id.rb_avg_taste;
      RatingBar rbAvgTaste = ViewBindings.findChildViewById(rootView, id);
      if (rbAvgTaste == null) {
        break missingId;
      }

      id = R.id.tv_avg_packaging;
      TextView tvAvgPackaging = ViewBindings.findChildViewById(rootView, id);
      if (tvAvgPackaging == null) {
        break missingId;
      }

      id = R.id.tv_avg_qty_rating;
      TextView tvAvgQtyRating = ViewBindings.findChildViewById(rootView, id);
      if (tvAvgQtyRating == null) {
        break missingId;
      }

      id = R.id.tv_avg_taste;
      TextView tvAvgTaste = ViewBindings.findChildViewById(rootView, id);
      if (tvAvgTaste == null) {
        break missingId;
      }

      id = R.id.tv_outlet_ac;
      TextView tvOutletAc = ViewBindings.findChildViewById(rootView, id);
      if (tvOutletAc == null) {
        break missingId;
      }

      return new DetailListviewRowBinding((CardView) rootView, llOutletName, llPacakging, llQty,
          llTaste, rbAvgPackaging, rbAvgQty, rbAvgTaste, tvAvgPackaging, tvAvgQtyRating, tvAvgTaste,
          tvOutletAc);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
