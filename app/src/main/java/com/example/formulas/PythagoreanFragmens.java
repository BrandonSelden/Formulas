package com.example.formulas;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PythagoreanFragmens extends Fragment {
    private EditText editTextA, editTextB;
    private TextView textViewC;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //inflate fragment_pythagorean layout
        View rootView = inflater.inflate(R.layout.fragment_pythagorean, container, false);
        // wire widgets using that layout
        wireWidgets(rootView);
        // set any listeners for those widgets
        editTextA.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!editTextA.getText().toString().equals("") && !editTextB.getText().toString().equals("")){
                    double a = Double.parseDouble(editTextA.getText().toString());
                    double b = Double.parseDouble(editTextB.getText().toString());
                    String c = calculateC(a, b) + "";
                    textViewC.setText(c);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        editTextB.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if(!editTextA.getText().toString().equals("") && !editTextB.getText().toString().equals("")){
                    double a = Double.parseDouble(editTextA.getText().toString());
                    double b = Double.parseDouble(editTextB.getText().toString());
                    String c = calculateC(a, b) + "";
                    textViewC.setText(c);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        // return he inflated view
        return rootView;
        //return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void wireWidgets(View rootView) {
        editTextA = rootView.findViewById(R.id.editText_pythagorean_a);
        editTextB = rootView.findViewById(R.id.editText_pythagorean_b);
        textViewC = rootView.findViewById(R.id.textView_pythag_c);
    }

    private double calculateC(double a, double b){
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}
