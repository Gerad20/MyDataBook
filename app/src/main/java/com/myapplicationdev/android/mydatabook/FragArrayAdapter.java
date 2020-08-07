package com.myapplicationdev.android.mydatabook;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class FragArrayAdapter extends ArrayAdapter {
    private ArrayList<String> frags;
    private TextView name;
    private ImageView logo;
    private Context context;
    public FragArrayAdapter(Context context, int reasource , ArrayList<String> obj){
        super(context, reasource,obj);
        frags = obj;
        this.context = context;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent,false);
        name  = rowView.findViewById(R.id.name);
        logo = rowView.findViewById(R.id.imageView);
        String fragName  = frags.get(position);

        name.setText(fragName);
      if(fragName.equals("Bio")){
          logo.setImageResource(android.R.drawable.ic_dialog_info);
      }else if(fragName.equals("Vaccination")){
          logo.setImageResource(android.R.drawable.ic_menu_edit);

      }else if (fragName.equals("Anniversary")){
          logo.setImageResource(android.R.drawable.ic_menu_my_calendar);

      }else if (fragName.equals("About Us")){
          logo.setImageResource(android.R.drawable.star_on);
      }



        return rowView;
    }

}
