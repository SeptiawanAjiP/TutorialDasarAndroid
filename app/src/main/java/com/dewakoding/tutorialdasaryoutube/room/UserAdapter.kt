package com.dewakoding.tutorialdasaryoutube.room

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dewakoding.tutorialdasaryoutube.databinding.ItemUserBinding
import com.dewakoding.tutorialdasaryoutube.room.data.entity.User


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 13/07/23 - 04.34

 **/
class UserAdapter(val users: List<User>): RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemUserBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       return ViewHolder(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.binding.tvId.text = user.uid.toString()
        holder.binding.tvFirstName.text = user.firstName
        holder.binding.tvLastName.text = user.lastName

    }
}