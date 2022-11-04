// Generated by view binder compiler. Do not edit!
package com.malas.appsr.malasapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.malas.appsr.malasapp.R;
import com.ms.square.android.expandabletextview.ExpandableTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAboutUsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView CompanyImgIv;

  @NonNull
  public final CardView addressCard;

  @NonNull
  public final LinearLayout addressCardLl1;

  @NonNull
  public final LinearLayout addressCardLl2;

  @NonNull
  public final LinearLayout addressCardLl3;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView companyAddressText;

  @NonNull
  public final TextView companyAddressTv;

  @NonNull
  public final TextView emailIconTv;

  @NonNull
  public final TextView emailTv;

  @NonNull
  public final ImageButton expandCollapse;

  @NonNull
  public final ExpandableTextView expandTextView;

  @NonNull
  public final TextView expandableText;

  @NonNull
  public final TextView faxIconTv;

  @NonNull
  public final TextView faxTv;

  @NonNull
  public final TextView ll;

  @NonNull
  public final TextView techHelp;

  @NonNull
  public final TextView techHelpTv;

  @NonNull
  public final CardView technicalCard;

  @NonNull
  public final LinearLayout technicalCardLl1;

  @NonNull
  public final LinearLayout technicalCardLl2;

  @NonNull
  public final LinearLayout technicalCardLl3;

  @NonNull
  public final TextView telIconTv;

  @NonNull
  public final TextView telTv;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView websiteIconTv;

  @NonNull
  public final TextView websiteTv;

  private ActivityAboutUsBinding(@NonNull LinearLayout rootView, @NonNull ImageView CompanyImgIv,
      @NonNull CardView addressCard, @NonNull LinearLayout addressCardLl1,
      @NonNull LinearLayout addressCardLl2, @NonNull LinearLayout addressCardLl3,
      @NonNull CardView cardView, @NonNull TextView companyAddressText,
      @NonNull TextView companyAddressTv, @NonNull TextView emailIconTv, @NonNull TextView emailTv,
      @NonNull ImageButton expandCollapse, @NonNull ExpandableTextView expandTextView,
      @NonNull TextView expandableText, @NonNull TextView faxIconTv, @NonNull TextView faxTv,
      @NonNull TextView ll, @NonNull TextView techHelp, @NonNull TextView techHelpTv,
      @NonNull CardView technicalCard, @NonNull LinearLayout technicalCardLl1,
      @NonNull LinearLayout technicalCardLl2, @NonNull LinearLayout technicalCardLl3,
      @NonNull TextView telIconTv, @NonNull TextView telTv, @NonNull TextView textView2,
      @NonNull TextView websiteIconTv, @NonNull TextView websiteTv) {
    this.rootView = rootView;
    this.CompanyImgIv = CompanyImgIv;
    this.addressCard = addressCard;
    this.addressCardLl1 = addressCardLl1;
    this.addressCardLl2 = addressCardLl2;
    this.addressCardLl3 = addressCardLl3;
    this.cardView = cardView;
    this.companyAddressText = companyAddressText;
    this.companyAddressTv = companyAddressTv;
    this.emailIconTv = emailIconTv;
    this.emailTv = emailTv;
    this.expandCollapse = expandCollapse;
    this.expandTextView = expandTextView;
    this.expandableText = expandableText;
    this.faxIconTv = faxIconTv;
    this.faxTv = faxTv;
    this.ll = ll;
    this.techHelp = techHelp;
    this.techHelpTv = techHelpTv;
    this.technicalCard = technicalCard;
    this.technicalCardLl1 = technicalCardLl1;
    this.technicalCardLl2 = technicalCardLl2;
    this.technicalCardLl3 = technicalCardLl3;
    this.telIconTv = telIconTv;
    this.telTv = telTv;
    this.textView2 = textView2;
    this.websiteIconTv = websiteIconTv;
    this.websiteTv = websiteTv;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAboutUsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAboutUsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_about_us, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAboutUsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Company_img_iv;
      ImageView CompanyImgIv = ViewBindings.findChildViewById(rootView, id);
      if (CompanyImgIv == null) {
        break missingId;
      }

      id = R.id.address_card;
      CardView addressCard = ViewBindings.findChildViewById(rootView, id);
      if (addressCard == null) {
        break missingId;
      }

      id = R.id.address_card_ll1;
      LinearLayout addressCardLl1 = ViewBindings.findChildViewById(rootView, id);
      if (addressCardLl1 == null) {
        break missingId;
      }

      id = R.id.address_card_ll2;
      LinearLayout addressCardLl2 = ViewBindings.findChildViewById(rootView, id);
      if (addressCardLl2 == null) {
        break missingId;
      }

      id = R.id.address_card_ll3;
      LinearLayout addressCardLl3 = ViewBindings.findChildViewById(rootView, id);
      if (addressCardLl3 == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.company_address_text;
      TextView companyAddressText = ViewBindings.findChildViewById(rootView, id);
      if (companyAddressText == null) {
        break missingId;
      }

      id = R.id.company_address_tv;
      TextView companyAddressTv = ViewBindings.findChildViewById(rootView, id);
      if (companyAddressTv == null) {
        break missingId;
      }

      id = R.id.email_icon_tv;
      TextView emailIconTv = ViewBindings.findChildViewById(rootView, id);
      if (emailIconTv == null) {
        break missingId;
      }

      id = R.id.email_tv;
      TextView emailTv = ViewBindings.findChildViewById(rootView, id);
      if (emailTv == null) {
        break missingId;
      }

      id = R.id.expand_collapse;
      ImageButton expandCollapse = ViewBindings.findChildViewById(rootView, id);
      if (expandCollapse == null) {
        break missingId;
      }

      id = R.id.expand_text_view;
      ExpandableTextView expandTextView = ViewBindings.findChildViewById(rootView, id);
      if (expandTextView == null) {
        break missingId;
      }

      id = R.id.expandable_text;
      TextView expandableText = ViewBindings.findChildViewById(rootView, id);
      if (expandableText == null) {
        break missingId;
      }

      id = R.id.fax_icon_tv;
      TextView faxIconTv = ViewBindings.findChildViewById(rootView, id);
      if (faxIconTv == null) {
        break missingId;
      }

      id = R.id.fax_tv;
      TextView faxTv = ViewBindings.findChildViewById(rootView, id);
      if (faxTv == null) {
        break missingId;
      }

      id = R.id.ll;
      TextView ll = ViewBindings.findChildViewById(rootView, id);
      if (ll == null) {
        break missingId;
      }

      id = R.id.tech_help;
      TextView techHelp = ViewBindings.findChildViewById(rootView, id);
      if (techHelp == null) {
        break missingId;
      }

      id = R.id.tech_help_tv;
      TextView techHelpTv = ViewBindings.findChildViewById(rootView, id);
      if (techHelpTv == null) {
        break missingId;
      }

      id = R.id.technical_card;
      CardView technicalCard = ViewBindings.findChildViewById(rootView, id);
      if (technicalCard == null) {
        break missingId;
      }

      id = R.id.technical_card_ll1;
      LinearLayout technicalCardLl1 = ViewBindings.findChildViewById(rootView, id);
      if (technicalCardLl1 == null) {
        break missingId;
      }

      id = R.id.technical_card_ll2;
      LinearLayout technicalCardLl2 = ViewBindings.findChildViewById(rootView, id);
      if (technicalCardLl2 == null) {
        break missingId;
      }

      id = R.id.technical_card_ll3;
      LinearLayout technicalCardLl3 = ViewBindings.findChildViewById(rootView, id);
      if (technicalCardLl3 == null) {
        break missingId;
      }

      id = R.id.tel_icon_tv;
      TextView telIconTv = ViewBindings.findChildViewById(rootView, id);
      if (telIconTv == null) {
        break missingId;
      }

      id = R.id.tel_tv;
      TextView telTv = ViewBindings.findChildViewById(rootView, id);
      if (telTv == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.website_icon_tv;
      TextView websiteIconTv = ViewBindings.findChildViewById(rootView, id);
      if (websiteIconTv == null) {
        break missingId;
      }

      id = R.id.website_tv;
      TextView websiteTv = ViewBindings.findChildViewById(rootView, id);
      if (websiteTv == null) {
        break missingId;
      }

      return new ActivityAboutUsBinding((LinearLayout) rootView, CompanyImgIv, addressCard,
          addressCardLl1, addressCardLl2, addressCardLl3, cardView, companyAddressText,
          companyAddressTv, emailIconTv, emailTv, expandCollapse, expandTextView, expandableText,
          faxIconTv, faxTv, ll, techHelp, techHelpTv, technicalCard, technicalCardLl1,
          technicalCardLl2, technicalCardLl3, telIconTv, telTv, textView2, websiteIconTv,
          websiteTv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
