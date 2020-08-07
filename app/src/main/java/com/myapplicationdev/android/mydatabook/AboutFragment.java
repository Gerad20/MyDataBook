package com.myapplicationdev.android.mydatabook;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {

    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rowView =  inflater.inflate(R.layout.fragment_about, container, false);
        ListView displayAuthors = rowView.findViewById(R.id.displayAUthors);
        ArrayList<String> authors = new ArrayList<String>();
        authors.add("C347 Android Programming II");
        ArrayAdapter aa = new ArrayAdapter(getContext(),android.R.layout.simple_list_item_1,authors);
        displayAuthors.setAdapter(aa);
        return rowView;

    }
}
