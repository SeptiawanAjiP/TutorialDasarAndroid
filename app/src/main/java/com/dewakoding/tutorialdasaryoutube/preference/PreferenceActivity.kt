package com.dewakoding.tutorialdasaryoutube.preference

import android.os.Bundle
import android.provider.ContactsContract.Data
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityPreferenceBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 12/07/23 - 02.49

 **/
class PreferenceActivity: AppCompatActivity() {
    private val binding by lazy { ActivityPreferenceBinding.inflate(layoutInflater) }
    lateinit var dataStoreManager: DataStoreManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        dataStoreManager = DataStoreManager(this@PreferenceActivity)

        binding.btnSimpan.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                dataStoreManager.saveToDataStore(binding.etName.text.toString())
                runOnUiThread{
                    Toast.makeText(applicationContext, "Nama tersimpan", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.btnTampilkan.setOnClickListener {
            GlobalScope.launch(Dispatchers.IO) {
                dataStoreManager.getFromDataStore().catch {

                }.collect{
                    runOnUiThread{
                        Toast.makeText(applicationContext, it.toString(), Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }
}