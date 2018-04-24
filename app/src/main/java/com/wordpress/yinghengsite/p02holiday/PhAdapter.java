package com.wordpress.yinghengsite.p02holiday;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PhAdapter extends ArrayAdapter<PublicHoliday> {

    private ArrayList<PublicHoliday> pb;
    private Context context;
    private TextView tvName;
    private TextView tvDate;
    private ImageView ivImage;

    public PhAdapter(Context context, int resource, ArrayList<PublicHoliday> objects) {
        super(context, resource, objects);
        pb = objects;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        tvName = (TextView) rowView.findViewById(R.id.tvName);
        tvDate = (TextView) rowView.findViewById(R.id.tvDate);
        ivImage = (ImageView) rowView.findViewById(R.id.ivImage);


        PublicHoliday current = pb.get(position);

        tvName.setText(current.getName());
        tvDate.setText(current.getDate());

        int currentImg = current.getImage();
        ivImage.setImageResource(currentImg);

        return rowView;
    }
}
