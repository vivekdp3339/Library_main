package com.example.win10.library_main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<Data_Model> dataSet;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView titleName;
        TextView titleView;
        TextView titleRate;


        ImageView imageViewIcon;

        public MyViewHolder(View itemView) {
            super(itemView);
            this.titleName = (TextView) itemView.findViewById(R.id.titlename);
            this.titleView = (TextView) itemView.findViewById(R.id.titleview);
            this.titleRate = (TextView) itemView.findViewById(R.id.titlerate);

            //this.textViewVersion = (TextView) itemView.findViewById(R.id.textViewVersion);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imgtitle);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v)
                {
                    if (getPosition()==0)
                    {
                        Toast.makeText(v.getContext(), " On CLick one", Toast.LENGTH_SHORT).show();

                    } if (getPosition()==1)
                {
                    Toast.makeText(v.getContext(), " On CLick Two", Toast.LENGTH_SHORT).show();

                } if (getPosition()==2)
                {
                    Toast.makeText(v.getContext(), " On CLick Three", Toast.LENGTH_SHORT).show();

                } if (getPosition()==3)
                {
                    Toast.makeText(v.getContext(), " On CLick Fore", Toast.LENGTH_SHORT).show();

                }

                }
            });
        }
    }

    public CustomAdapter(ArrayList<Data_Model> data) {
        this.dataSet = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent,
                                           int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_mainpage, parent, false);

        //view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int listPosition) {

        TextView titleName = holder.titleName;
        TextView titleView = holder.titleView;
        TextView titleRate = holder.titleRate;



        // TextView textViewVersion = holder.textViewVersion;
        ImageView imageView = holder.imageViewIcon;

        titleName.setText(dataSet.get(listPosition).getTitleName());
        titleView.setText(dataSet.get(listPosition).getViewName());
        titleRate.setText(dataSet.get(listPosition).getRateName());

        //textViewVersion.setText(dataSet.get(listPosition).getVersion());
        imageView.setImageResource(dataSet.get(listPosition).getImageLogo());
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}