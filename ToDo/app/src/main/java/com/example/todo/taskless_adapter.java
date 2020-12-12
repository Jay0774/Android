package com.example.todo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.LinkedList;


class tasklist_adapter extends RecyclerView.Adapter<tasklist_adapter.tasklistholder> {
    @NonNull
    @Override
    public tasklist_adapter.tasklistholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull tasklist_adapter.tasklistholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
    private LayoutInflater m;
    private LinkedList<String> tasklist;
    class tasklistholder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public final TextView taskholder;
        final tasklist_adapter adapter;

        public tasklistholder(View v,tasklist_adapter adapter)
        {
            super(v);
            taskholder=v.findViewById(R.id.ttask);
            this.adapter=adapter;
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            int pos=getLayoutPosition();
            String element=tasklist.get(pos);
            tasklist.set(pos,"Completed"+element);
            adapter.notifyDataSetChanged();
        }
    }
    public tasklist_adapter(Context c,LinkedList<String> task){
        m=LayoutInflater.from(c);
        this.tasklist=task;
    }

}

