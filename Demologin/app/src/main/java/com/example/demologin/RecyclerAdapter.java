package com.example.demologin;

import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private static final String TAG = "RecyclerAdapter";
//    List<Item> itemsList;
    List<String> itemsList;

    public RecyclerAdapter(List<String> itemsList) {
        this.itemsList = itemsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    // gets position
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemBrand.setText(String.valueOf(position));
//        holder.itemImage.setImageResource()
        holder.itemName.setText(itemsList.get(position));
    }

//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.itemBrand.setText(String.valueOf(position));
////        holder.itemImage.setImageResource()
////        holder.itemName.setText(itemsList.get(position));
//    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView itemImage;
        ProgressBar progressBar;
        FloatingActionButton itemPurchaseDecisionBtn;
        TextView itemName, itemBrand, itemCost, itemCostSaved;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage= itemView.findViewById(R.id.itemImage);
            itemName= itemView.findViewById(R.id.itemName);
            itemBrand= itemView.findViewById(R.id.itemBrand);
            progressBar= itemView.findViewById(R.id.progressBar);
            itemCost= itemView.findViewById(R.id.totalCost);
            itemCostSaved= itemView.findViewById(R.id.costSaved);
            itemPurchaseDecisionBtn = itemView.findViewById(R.id.purchaseDecisionBtn);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            Toast.makeText(view.getContext(), (CharSequence) itemsList.get(getAdapterPosition()), Toast.LENGTH_SHORT).show();
        }
    }
}
