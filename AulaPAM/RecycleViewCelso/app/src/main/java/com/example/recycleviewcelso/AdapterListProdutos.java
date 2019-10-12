package com.example.recycleviewcelso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


    public class AdapterListProdutos extends RecyclerView.Adapter {

        private final List<Produtos> ProdutosRecebidosNoConstrutor;
        private final Context contextRecebidoNoConstrutor;

        public AdapterListProdutos(List<Produtos> listProdutos, Context context) {
            this.ProdutosRecebidosNoConstrutor = listProdutos;
            this.contextRecebidoNoConstrutor = context;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            View view =
                    LayoutInflater.from(contextRecebidoNoConstrutor).
                            inflate(R.layout.revlist, parent, false);

            ProdutosViewHolder CViewHolder = new ProdutosViewHolder(view);

            return CViewHolder;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int position) {

            ProdutosViewHolder CViewHolder = (ProdutosViewHolder) viewHolder;
            Produtos produtos = this.ProdutosRecebidosNoConstrutor.get(position);

            CViewHolder.ProdutosTextView.setText(produtos.getProduto().toString());
            CViewHolder.PrecoTextView.setText(produtos.getPreco().toString());
        }

        @Override
        public int getItemCount() {
            return this.ProdutosRecebidosNoConstrutor.size();
        }

    }

