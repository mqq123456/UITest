package com.heqinuc.uitest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

// ListView
public class MainActivity extends AppCompatActivity {
    private String[] data = {"TextView","Button","EditText","ImageView","ProgressBar",
    "AlertDialog","ProgressDialog","LinearLayout","LayoutWeight","RelativeLayout","FrameLayout",
            "PercentFrameLayout","TitleView","Custom ListView",
            "RecyclerView","StaggeredGridLayout","Message"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String> adaper = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_expandable_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adaper);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent;
                switch (i) {
                    case 0:
                        intent = new Intent(MainActivity.this, TextViewActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        intent = new Intent(MainActivity.this, ButtonActivity.class);
                        startActivity(intent);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, EditTextActivity.class);
                        startActivity(intent);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, ImageViewActivity.class);
                        startActivity(intent);
                        break;
                    case 4:
                        intent = new Intent(MainActivity.this, ProgressActivity.class);
                        startActivity(intent);
                        break;
                    case 5:
                        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                        dialog.setTitle("This is Dialog");
                        dialog.setMessage("sumething importent");
                        dialog.setCancelable(false);
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                            }
                        });
                        dialog.show();
                        break;
                    case 6:
                        ProgressDialog.Builder progressDialog = new ProgressDialog.Builder(MainActivity.this);
                        progressDialog.setTitle("This is ProgressDialog");
                        progressDialog.setMessage("Loading...");
                        progressDialog.setCancelable(true);
                        progressDialog.show();
                        break;
                    case 7:
                        intent = new Intent(MainActivity.this, LinearLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case 8:
                        intent = new Intent(MainActivity.this, LayoutWeightActivity.class);
                        startActivity(intent);
                        break;
                    case 9:
                        intent = new Intent(MainActivity.this, RelativeLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case 10:
                        intent = new Intent(MainActivity.this, FrameLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case 11:
                        intent = new Intent(MainActivity.this, PercentFrameLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case 12:
                        intent = new Intent(MainActivity.this, TitleViewActivity.class);
                        startActivity(intent);
                        break;
                    case 13:
                        intent = new Intent(MainActivity.this, ListViewActivity.class);
                        startActivity(intent);
                        break;
                    case 14:
                        intent = new Intent(MainActivity.this, RecyclerViewActivity.class);
                        startActivity(intent);
                        break;
                    case 15:
                        intent = new Intent(MainActivity.this, StaggeredGridLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case 16:
                        intent = new Intent(MainActivity.this, MessageActivity.class);
                        startActivity(intent);
                        break;
                    default:
                }

            }
        });
    }

}
