package com.example.recycleviewcelso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.RecycleView);

        List<Produtos> listProdutos = new ArrayList<>();

        Produtos Coca = new Produtos();
        Coca.setProduto("Coca cola 2 L");
        Coca.setPreco("R$8,00");


        Produtos Cerveja = new Produtos();
        Cerveja.setProduto("Cerveja skol");
        Cerveja.setPreco("R$3,50");

        Produtos Jack = new Produtos();
        Jack.setProduto("Whisk Jack daniels");
        Jack.setPreco("R$100,00");

        listProdutos.add(Coca);
        listProdutos.add(Cerveja);
        listProdutos.add(Jack);

        recyclerView.setAdapter(new AdapterListProdutos (listProdutos, this));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, LinearLayout.VERTICAL, false);

        recyclerView.setLayoutManager(layoutManager);

    }
}

