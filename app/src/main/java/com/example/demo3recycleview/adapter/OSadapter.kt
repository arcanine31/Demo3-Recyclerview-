package com.example.demo3recycleview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.demo3recycleview.R
import com.example.demo3recycleview.model.SisopModel


class OSadapter (val context: Context): RecyclerView.Adapter<OSadapter.OSViewHolder>(){

    private var sisop : List<SisopModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OSViewHolder {
        return OSViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
    }

    override fun onBindViewHolder(holder: OSadapter.OSViewHolder, position: Int) {
        holder.bindModel(sisop[position])
    }

    override fun getItemCount(): Int {
        return sisop.size
    }

    fun setList(data: List<SisopModel>){
        sisop = data
    }

    inner class OSViewHolder(item: View): RecyclerView.ViewHolder(item){


        val txtName: TextView = item.findViewById(R.id.tv_namaos)
        val imgLogo: ImageView = item.findViewById(R.id.iv_logo)

        fun bindModel(m: SisopModel){
            txtName.text = m.name
//            imgLogo.setImageResource(m.logo)

            imgLogo.setOnClickListener{
                Toast.makeText(context, "Nama OS : " + m.name, Toast.LENGTH_SHORT).show()
            }

        }
    }
}