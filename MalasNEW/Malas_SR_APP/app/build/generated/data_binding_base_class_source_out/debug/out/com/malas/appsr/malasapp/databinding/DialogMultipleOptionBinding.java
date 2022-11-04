// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogMultipleOptionBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final Button btnDone;

  @NonNull
  public final ListView dialogboxListview;

  @NonNull
  public final EditText edittextDialog;

  private DialogMultipleOptionBinding(@NonNull ScrollView rootView, @NonNull Button btnDone,
      @NonNull ListView dialogboxListview, @NonNull EditText edittextDialog) {
    this.rootView = rootView;
    this.btnDone = btnDone;
    this.dialogboxListview = dialogboxListview;
    this.edittextDialog = edittextDialog;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogMultipleOptionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogMultipleOptionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_multiple_option, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogMultipleOptionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_done;
      Button btnDone = ViewBindings.findChildViewById(rootView, id);
      if (btnDone == null) {
        break missingId;
      }

      id = R.id.dialogbox_listview;
      ListView dialogboxListview = ViewBindings.findChildViewById(rootView, id);
      if (dialogboxListview == null) {
        break missingId;
      }

      id = R.id.edittext_dialog;
      EditText edittextDialog = ViewBindings.findChildViewById(rootView, id);
      if (edittextDialog == null) {
        break missingId;
      }

      return new DialogMultipleOptionBinding((ScrollView) rootView, btnDone, dialogboxListview,
          edittextDialog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}