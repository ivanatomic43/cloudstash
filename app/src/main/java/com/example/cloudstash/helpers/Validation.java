package com.example.cloudstash.helpers;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;
import android.widget.EditText;

import androidx.appcompat.graphics.drawable.DrawableContainerCompat;
import androidx.core.content.ContextCompat;

import com.example.cloudstash.R;

public class Validation {

    public static void addValidationWatcher(EditText editText, int errorDrawable, int normalDrawable) {
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().trim().isEmpty()) {
                    editText.setBackgroundResource(errorDrawable);
                } else {
                    editText.setBackgroundResource(normalDrawable);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

}
