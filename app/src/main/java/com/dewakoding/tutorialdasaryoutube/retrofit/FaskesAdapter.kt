package com.dewakoding.tutorialdasaryoutube.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dewakoding.tutorialdasaryoutube.databinding.ItemFaskesBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 22.11

 **/
class FaskesAdapter(val listFaskes: List<Faskes>): RecyclerView.Adapter<FaskesAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemFaskesBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemFaskesBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = listFaskes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val faskes = listFaskes[position]
        holder.binding.tvNama.text = faskes.nama
        holder.binding.tvKota.text = faskes.kota
    }


}