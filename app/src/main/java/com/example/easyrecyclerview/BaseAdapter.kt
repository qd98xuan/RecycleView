package com.example.easyrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

open class BaseAdapter(val dataSet:ArrayList<String>, val resource:Int):RecyclerView.Adapter<BaseAdapter.ViewHolder>() {
    class ViewHolder(view:View):RecyclerView.ViewHolder(view) {
        var textView:TextView?=null
        init {
            textView =view.findViewById(1)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseAdapter.ViewHolder {
        var view =
            LayoutInflater.from(parent.context).inflate(resource, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: BaseAdapter.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}