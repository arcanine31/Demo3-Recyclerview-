package com.example.demo3recycleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.demo3recycleview.R
import com.example.demo3recycleview.model.SisopModel
import kotlinx.android.synthetic.main.item_list.view.*

class ListOSAdapter(private val listHero: ArrayList<SisopModel>) :
    RecyclerView.Adapter<ListOSAdapter.ListViewHolder>() {
    class ListViewHolder (
        itemView : View
        ) : RecyclerView.ViewHolder(itemView) {
            fun bind(OS: SisopModel) {
                with(itemView){
                    Glide.with(itemView.context)
                        .load(OS.logo)
                        .into(iv_logo)
                }
            }

    }

    private var sisop : List<SisopModel> = ArrayList()

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate( R.layout.item_list, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.bind(sisop[position])
    }

    override fun getItemCount(): Int {
        return sisop.size
    }


}
