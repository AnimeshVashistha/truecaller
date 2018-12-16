package com.example.animesh.truecaller.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.animesh.truecaller.R;
import com.example.animesh.truecaller.model.TrueCaller;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

   private final  ArrayList<TrueCaller> caller;
   private final Context context;

    public Adapter(ArrayList<TrueCaller> caller,Context context)
    {
        this.caller = caller;
        this.context = context;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.activity_list,null);

        return new ViewHolder(layout);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        TrueCaller trueCaller = caller.get(i);
        viewHolder.t1.setText("Name: "+trueCaller.getName());
        viewHolder.t2.setText("Phone No :"+trueCaller.getPhone());

    }


    @Override
    public int getItemCount() {
        return caller.size();
    }


    static class ViewHolder extends RecyclerView.ViewHolder
    {

        TextView t1 ;
        TextView t2 ;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            LinearLayout layout = (LinearLayout) itemView;
            t1 = layout.findViewById(R.id.Truecaller);
            t2 = layout.findViewById(R.id.Truecaller2);
        }
    }
}
