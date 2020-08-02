package com.example.rpgorganizationaid;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class recyclerViewAdapter extends RecyclerView.Adapter<recyclerViewAdapter.viewHolder> {

    String data1[], data2[];
    Context context;

    public recyclerViewAdapter(Context ct, String s1[], String s2[]){
        context = ct;
        data1 = s1;
        data2 = s2;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.my_row, viewGroup, false);

        // LayoutInflater inflater = new LayoutInflater.from(context);
       // View view = inflater.inflate(R.layout.my_row, parent, false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        holder.text1.setText(data1[position]);
        holder.text2.setText(data2[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        TextView text1, text2;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            text1 = itemView.findViewById(R.id.noteTitle);
            text2 = itemView.findViewById(R.id.noteDesc);
        }
    }
}
