// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class OtpDialogBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final Button btnCancelOTP;

  @NonNull
  public final Button btnConfirmOTP;

  @NonNull
  public final EditText otp;

  @NonNull
  public final TextView tvDistributorNumber;

  private OtpDialogBinding(@NonNull CardView rootView, @NonNull Button btnCancelOTP,
      @NonNull Button btnConfirmOTP, @NonNull EditText otp, @NonNull TextView tvDistributorNumber) {
    this.rootView = rootView;
    this.btnCancelOTP = btnCancelOTP;
    this.btnConfirmOTP = btnConfirmOTP;
    this.otp = otp;
    this.tvDistributorNumber = tvDistributorNumber;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static OtpDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static OtpDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.otp_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static OtpDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnCancelOTP;
      Button btnCancelOTP = ViewBindings.findChildViewById(rootView, id);
      if (btnCancelOTP == null) {
        break missingId;
      }

      id = R.id.btnConfirmOTP;
      Button btnConfirmOTP = ViewBindings.findChildViewById(rootView, id);
      if (btnConfirmOTP == null) {
        break missingId;
      }

      id = R.id.otp;
      EditText otp = ViewBindings.findChildViewById(rootView, id);
      if (otp == null) {
        break missingId;
      }

      id = R.id.tvDistributorNumber;
      TextView tvDistributorNumber = ViewBindings.findChildViewById(rootView, id);
      if (tvDistributorNumber == null) {
        break missingId;
      }

      return new OtpDialogBinding((CardView) rootView, btnCancelOTP, btnConfirmOTP, otp,
          tvDistributorNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
