package com.example.chassis_bus;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

abstract class ListChassisAdapter extends RecyclerView.Adapter<ListChassisAdapter.ListViewHolder>{
    private ArrayList<Chassis> listChassis;
    private Chassis chassis;

    public ListChassisAdapter(ArrayList<Chassis> list) {
        this.listChassis = list; }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_chassis, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        final Chassis dataLaptop =listChassis.get(position);
        Glide.with(holder.itemView.getContext()).load(dataLaptop.getFoto())
                .apply(new RequestOptions())
                .into(holder.fotoChassis);

        holder.namaChassis.setText(dataLaptop.getNama());
        holder.tambahButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), BeliChassis.class);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listChassis.size(); }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoChassis;
        TextView namaChassis;
        Button tambahButton;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoChassis = itemView.findViewById(R.id.foto_chassis);
            namaChassis = itemView.findViewById(R.id.nama_chassis);
            tambahButton = itemView.findViewById(R.id.tambah); }

    }
}