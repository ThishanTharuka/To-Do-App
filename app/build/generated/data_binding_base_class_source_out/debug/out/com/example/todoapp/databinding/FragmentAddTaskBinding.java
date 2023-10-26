// Generated by view binder compiler. Do not edit!
package com.example.todoapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class FragmentAddTaskBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addTaskBtn;

  @NonNull
  public final MaterialCardView addTaskCard;

  @NonNull
  public final TextInputEditText addTaskText;

  private FragmentAddTaskBinding(@NonNull ConstraintLayout rootView, @NonNull Button addTaskBtn,
      @NonNull MaterialCardView addTaskCard, @NonNull TextInputEditText addTaskText) {
    this.rootView = rootView;
    this.addTaskBtn = addTaskBtn;
    this.addTaskCard = addTaskCard;
    this.addTaskText = addTaskText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_add_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addTaskBtn;
      Button addTaskBtn = ViewBindings.findChildViewById(rootView, id);
      if (addTaskBtn == null) {
        break missingId;
      }

      id = R.id.addTaskCard;
      MaterialCardView addTaskCard = ViewBindings.findChildViewById(rootView, id);
      if (addTaskCard == null) {
        break missingId;
      }

      id = R.id.addTaskText;
      TextInputEditText addTaskText = ViewBindings.findChildViewById(rootView, id);
      if (addTaskText == null) {
        break missingId;
      }

      return new FragmentAddTaskBinding((ConstraintLayout) rootView, addTaskBtn, addTaskCard,
          addTaskText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
