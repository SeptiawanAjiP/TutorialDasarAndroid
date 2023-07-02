package com.dewakoding.tutorialdasaryoutube

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.dewakoding.tutorialdasaryoutube.adapter.HobiAdapter
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityHobiBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 25/06/23 - 08.47

 **/
class HobiActivity: AppCompatActivity() {

    private val binding by lazy { ActivityHobiBinding.inflate(layoutInflater) }
    val hobies = arrayOf("Sepak Bola", "Memancing", "Futsal", "Ngoding", "Memasak", "Otomotif")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.rvHobi.adapter = HobiAdapter(hobies)

    }
}