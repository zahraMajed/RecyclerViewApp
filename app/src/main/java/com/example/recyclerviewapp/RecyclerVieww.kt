package com.example.recyclerviewapp
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.singe_rv.view.*

class RecyclerVieww(val context: Context, val names: ArrayList<String>) : RecyclerView.Adapter <RecyclerVieww.ItemViewHolder>(){
    class ItemViewHolder(itemView:View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder (
            LayoutInflater.from(context).inflate(R.layout.singe_rv,parent,false)
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val name=names[position]

        holder.itemView.apply {
            tvUserName.text= name
        }


    }

    override fun getItemCount(): Int = names.size
}