package com.example.recyclerview_4_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;



import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Context context;
    boolean bool = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();

        List<Member> members = prepareMemberList();
        refreshAdapter(members);
    }
    private void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(context,1));
    }

    private void refreshAdapter(List<Member> members) {
        CustomAdapter adapter = new CustomAdapter(context, members, new OnBottomReachedListener() {
            @Override
            public void onBottomReached(int position) {
                Log.d("BBBB","position"+position);
                Toast.makeText(MainActivity.this,"this is the last object",Toast.LENGTH_LONG).show();
            }
        });
        recyclerView.setAdapter(adapter);
    }



    private List<Member> prepareMemberList() {
        List<Member> members = new ArrayList<>();
        members.add(new Member());//header
        for(int i = 0; i<30; i++){
            if(i == 0 || i == 5 || i == 16 || i == 25){
                members.add(new Member("Ulug'bek"+i,"Abdurasulov"+i,false));
            }else{
                members.add(new Member("Ulugbek"+i,"Abdurasulov"+i,true));
            }
        }
        members.add(new Member());//footer
        return members;
    }

}