package com.heqinuc.uitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MessageActivity extends AppCompatActivity {
    private List<Msg> msgList = new ArrayList<>();
    private EditText inputText;
    private Button send;
    private RecyclerView recyclerView;
    private MsgAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        initMsgs();
        inputText = (EditText) findViewById(R.id.input_text);
        send = (Button) findViewById(R.id.send);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new MsgAdapter(msgList);
        recyclerView.setAdapter(adapter);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String content = inputText.getText().toString();
                if (!"".equals(content)) {
                    Msg msg = new Msg(content, Msg.TYPE_SEND);
                    msgList.add(msg);
                    adapter.notifyItemInserted(msgList.size()-1);// 当前新消息时，刷新显示
                    recyclerView.scrollToPosition(msgList.size()-1);// recyclerView定位到最后一行
                    inputText.setText(""); // 清空输入框中的内容

                }
            }
        });
    }
    private void initMsgs() {
        for (int i =0; i< 5; i++){
            Msg msg1 = new Msg("Hello guy",Msg.TYPE_RECEIVED);
            msgList.add(msg1);
            Msg msg2 = new Msg("Hello. Who is what?",Msg.TYPE_SEND);
            msgList.add(msg2);
//            Msg msg3 = new Msg("This is Tom. Nice talking to you.",Msg.TYPE_RECEIVED);
//            msgList.add(msg3);
        }

    }
}
