package com.matthew.micromatt.recyclerviewact5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import com.matthew.micromatt.recyclerviewact5.Model.User;

public class MainActivity extends AppCompatActivity {

    ArrayList<User> UserList;
    RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UserList = new ArrayList<User>();
        getUsers();

        mRecyclerView = findViewById(R.id.my_recycler_view);

        mAdapter = new AdapterRecyclerViewUser(UserList);
        RecyclerView.LayoutManager uManager = new LinearLayoutManager(getApplicationContext());
        mRecyclerView.setLayoutManager(uManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mAdapter);

    }

    private void getUsers(){
        UserList.add(new User("Juan", "Perez Martinez", 15));
        UserList.add(new User("Matthew", "Montes de Oca", 19));
        UserList.add(new User("Marco", "Diaz", 14));
        UserList.add(new User("Jessica", "Jones", 35));
    }
}
