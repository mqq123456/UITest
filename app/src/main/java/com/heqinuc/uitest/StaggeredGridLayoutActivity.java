package com.heqinuc.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StaggeredGridLayoutActivity extends AppCompatActivity {
    private String[] data = {"TextView","Button","EditText","ImageView","ProgressBar",
            "AlertDialog","ProgressDialog","LinearLayout","LayoutWeight","RelativeLayout","FrameLayout",
            "PercentFrameLayout","TitleView","Custom ListView",
            "RecyclerView"};
    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered_grid_layout);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        initFruits();
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        RecyAdapter adapter = new RecyAdapter(fruitList);
        recyclerView.setAdapter(adapter);
    }
    private void initFruits() {
        for(int i = 0; i< 13; i++) {
            Fruit apple = new Fruit(getRandomLengthName(data[i]),R.drawable.logo_58);
            fruitList.add(apple);
        }
    }
    private String getRandomLengthName(String name) {
        Random random = new Random();
        int length = random.nextInt(20) +1;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            builder.append(name);
        }
        return builder.toString();
    }
}
