package com.heqinuc.uitest;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by heqin on 17/3/29.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(final Context context, AttributeSet attrs) {
        super(context,attrs);
        LayoutInflater.from(context).inflate(R.layout.title, this);
        Button back = (Button) findViewById(R.id.title_back);
        Button edit = (Button) findViewById(R.id.title_bedit);
        TextView textView = (TextView) findViewById(R.id.title_text);
        back.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ((Activity)getContext()).finish();
            }
        });
        edit.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"You Clicked Edit Button",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
