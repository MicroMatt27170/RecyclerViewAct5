package com.matthew.micromatt.recyclerviewact5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import com.matthew.micromatt.recyclerviewact5.Model.User;

public class AdapterRecyclerViewUser extends RecyclerView.Adapter<AdapterRecyclerViewUser.ViewHolderData> {

    private ArrayList<User> UserList;
    public TextView Name;
    public TextView LastName;
    public TextView Age;

    public class ViewHolderData extends RecyclerView.ViewHolder {


        public ViewHolderData(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.NameTextView_List);
            LastName = itemView.findViewById(R.id.LastNameTextView_List);
            Age = itemView.findViewById(R.id.AgeTextView_List);
        }

    }

    public AdapterRecyclerViewUser(ArrayList<User> userList) {
        this.UserList = userList;
    }

    @NonNull
    @Override
    public ViewHolderData onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_list, viewGroup, false);
        return new ViewHolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderData viewHolderData, int i) {
        User u = UserList.get(i);

        Name.setText(u.getName());
        LastName.setText(u.getLastName());
        int a = u.getAge();
        Age.setText(String.valueOf(a));
    }

    @Override
    public int getItemCount() {
        try{
            return UserList.size();
        }
        catch (Exception e){
            return 0;
        }
    }
}