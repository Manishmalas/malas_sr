// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AppBarHomeBinding implements ViewBinding {
  @NonNull
  private final CoordinatorLayout rootView;

  @NonNull
  public final ImageView logoutImageview;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvTerritory;

  private AppBarHomeBinding(@NonNull CoordinatorLayout rootView, @NonNull ImageView logoutImageview,
      @NonNull Toolbar toolbar, @NonNull TextView tvTerritory) {
    this.rootView = rootView;
    this.logoutImageview = logoutImageview;
    this.toolbar = toolbar;
    this.tvTerritory = tvTerritory;
  }

  @Override
  @NonNull
  public CoordinatorLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AppBarHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AppBarHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.app_bar_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AppBarHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.logout_imageview;
      ImageView logoutImageview = ViewBindings.findChildViewById(rootView, id);
      if (logoutImageview == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tv_territory;
      TextView tvTerritory = ViewBindings.findChildViewById(rootView, id);
      if (tvTerritory == null) {
        break missingId;
      }

      return new AppBarHomeBinding((CoordinatorLayout) rootView, logoutImageview, toolbar,
          tvTerritory);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
