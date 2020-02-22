package com.example.submissionsatu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activitymain_rv_hero);
        rvHero.setHasFixedSize(true);

        showRecycleList();
    }

    private void showRecycleList() {
        rvHero.setLayoutManager(new LinearLayoutManager(this));

        HeroesAdapter heroesAdapter = new HeroesAdapter(this);
        heroesAdapter.setHeroes(HeroesData.getHeroesList());

        rvHero.setAdapter(heroesAdapter);
    }
}
