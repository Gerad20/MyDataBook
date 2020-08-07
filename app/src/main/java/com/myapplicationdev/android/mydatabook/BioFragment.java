package com.myapplicationdev.android.mydatabook;

import android.app.AlertDialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.widget.Button;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BioFragment extends Fragment {

    public BioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rowView =  inflater.inflate(R.layout.fragment_bio, container, false);;
            Button edit = rowView.findViewById(R.id.Edit);
        final TextView tvBio = rowView.findViewById(R.id.BioText);



            //custom dialog

        final AlertDialog dialogBuilder = new AlertDialog.Builder(getContext()).create();
        LayoutInflater inflaters = this.getLayoutInflater();
        final View dialogView = inflaters.inflate(R.layout.custom_dialog, null);

        final EditText editText = (EditText) dialogView.findViewById(R.id.edt_comment);
        Button button1 = (Button) dialogView.findViewById(R.id.buttonSubmit);
        Button button2 = (Button) dialogView.findViewById(R.id.buttonCancel);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogBuilder.dismiss();
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvBio.setText(editText.getText());
                dialogBuilder.dismiss();
            }
        });

            edit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    dialogBuilder.setView(dialogView);
                    dialogBuilder.show();
                }
            });


        return rowView;

    }
}
