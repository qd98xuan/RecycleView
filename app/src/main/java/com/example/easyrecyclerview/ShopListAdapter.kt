package com.example.easyrecyclerview

class ShopListAdapter(val arrayList: ArrayList<String>,val res:Int):BaseAdapter(arrayList,res) {
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)

    }

}