// Generated by view binder compiler. Do not edit!
package com.example.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.todoapp.R;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textfield.TextInputEditText;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignInBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialCardView emailCard;

  @NonNull
  public final TextInputEditText emailText;

  @NonNull
  public final MaterialCardView passwordCard;

  @NonNull
  public final TextInputEditText passwordText;

  @NonNull
  public final Button signInBtn;

  @NonNull
  public final Button signupBtn;

  @NonNull
  public final TextView textView;

  @NonNull
  public final ImageView todoLogo;

  private FragmentSignInBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialCardView emailCard, @NonNull TextInputEditText emailText,
      @NonNull MaterialCardView passwordCard, @NonNull TextInputEditText passwordText,
      @NonNull Button signInBtn, @NonNull Button signupBtn, @NonNull TextView textView,
      @NonNull ImageView todoLogo) {
    this.rootView = rootView;
    this.emailCard = emailCard;
    this.emailText = emailText;
    this.passwordCard = passwordCard;
    this.passwordText = passwordText;
    this.signInBtn = signInBtn;
    this.signupBtn = signupBtn;
    this.textView = textView;
    this.todoLogo = todoLogo;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignInBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_sign_in, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignInBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.emailCard;
      MaterialCardView emailCard = ViewBindings.findChildViewById(rootView, id);
      if (emailCard == null) {
        break missingId;
      }

      id = R.id.emailText;
      TextInputEditText emailText = ViewBindings.findChildViewById(rootView, id);
      if (emailText == null) {
        break missingId;
      }

      id = R.id.passwordCard;
      MaterialCardView passwordCard = ViewBindings.findChildViewById(rootView, id);
      if (passwordCard == null) {
        break missingId;
      }

      id = R.id.passwordText;
      TextInputEditText passwordText = ViewBindings.findChildViewById(rootView, id);
      if (passwordText == null) {
        break missingId;
      }

      id = R.id.signInBtn;
      Button signInBtn = ViewBindings.findChildViewById(rootView, id);
      if (signInBtn == null) {
        break missingId;
      }

      id = R.id.signupBtn;
      Button signupBtn = ViewBindings.findChildViewById(rootView, id);
      if (signupBtn == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.todoLogo;
      ImageView todoLogo = ViewBindings.findChildViewById(rootView, id);
      if (todoLogo == null) {
        break missingId;
      }

      return new FragmentSignInBinding((ConstraintLayout) rootView, emailCard, emailText,
          passwordCard, passwordText, signInBtn, signupBtn, textView, todoLogo);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
