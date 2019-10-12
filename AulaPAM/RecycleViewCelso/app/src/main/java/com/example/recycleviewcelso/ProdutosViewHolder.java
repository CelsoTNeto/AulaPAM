package com.example.recycleviewcelso;


import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class ProdutosViewHolder extends RecyclerView.ViewHolder {


    TextView ProdutosTextView;
    TextView PrecoTextView;

    public ProdutosViewHolder(@NonNull View itemView) {
        super(itemView);

        ProdutosTextView = (TextView)
                itemView.findViewById(R.id.textViewProdutos);

        PrecoTextView = (TextView)
                itemView.findViewById(R.id.textViewPreco);



    }
}