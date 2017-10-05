package com.example.dell.myfoodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        ListView listView = getListView();

        ArrayAdapter<Food> foodArrayAdapter = new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.foods);


        listView.setAdapter(foodArrayAdapter);




    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Intent intent = new Intent(FoodCategoryActivity.this,FoodActivity.class);

        intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);

        startActivity(intent);


    }
}
