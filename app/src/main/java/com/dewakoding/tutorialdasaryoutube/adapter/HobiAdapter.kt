package com.dewakoding.tutorialdasaryoutube.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dewakoding.tutorialdasaryoutube.databinding.ItemHobiBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 25/06/23 - 08.57

 **/
class HobiAdapter(
    val dataSet: Array<String>
    ): RecyclerView.Adapter<HobiAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemHobiBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder (
        ItemHobiBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val hobi = dataSet[position]
        holder.binding.tvHobi.text = hobi
    }


}