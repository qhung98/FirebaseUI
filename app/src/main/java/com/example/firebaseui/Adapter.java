package com.example.firebaseui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.NoteHolder>{
    ArrayList<Note> list;

    public Adapter(ArrayList<Note> list){
        this.list = list;
    }

    @NonNull
    @Override
    public NoteHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_holder, parent, false);
        return new NoteHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteHolder holder, int position) {
        holder.id.setText(list.get(position).getTitle());
        holder.desc.setText(list.get(position).getDescription());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class  NoteHolder extends RecyclerView.ViewHolder{
        TextView id, desc;
        public NoteHolder(@NonNull View itemView) {
            super(itemView);
            id = itemView.findViewById(R.id.id);
            desc = itemView.findViewById(R.id.description);
        }
    }
}
