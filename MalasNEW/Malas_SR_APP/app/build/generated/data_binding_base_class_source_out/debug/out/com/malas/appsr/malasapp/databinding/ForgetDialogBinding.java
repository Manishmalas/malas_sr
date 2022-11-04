// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
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

public final class ForgetDialogBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnSubmitDialog;

  @NonNull
  public final EditText edtForgotPassword;

  @NonNull
  public final TextView tvForgetPassword;

  private ForgetDialogBinding(@NonNull RelativeLayout rootView, @NonNull Button btnSubmitDialog,
      @NonNull EditText edtForgotPassword, @NonNull TextView tvForgetPassword) {
    this.rootView = rootView;
    this.btnSubmitDialog = btnSubmitDialog;
    this.edtForgotPassword = edtForgotPassword;
    this.tvForgetPassword = tvForgetPassword;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ForgetDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ForgetDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.forget_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ForgetDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_submit_dialog;
      Button btnSubmitDialog = ViewBindings.findChildViewById(rootView, id);
      if (btnSubmitDialog == null) {
        break missingId;
      }

      id = R.id.edt_forgot_password;
      EditText edtForgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (edtForgotPassword == null) {
        break missingId;
      }

      id = R.id.tv_forget_password;
      TextView tvForgetPassword = ViewBindings.findChildViewById(rootView, id);
      if (tvForgetPassword == null) {
        break missingId;
      }

      return new ForgetDialogBinding((RelativeLayout) rootView, btnSubmitDialog, edtForgotPassword,
          tvForgetPassword);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}