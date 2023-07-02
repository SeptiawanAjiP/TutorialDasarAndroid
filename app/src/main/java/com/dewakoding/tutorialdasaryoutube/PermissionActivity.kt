package com.dewakoding.tutorialdasaryoutube

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.dewakoding.tutorialdasaryoutube.databinding.ActivityPermissionBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 01/07/23 - 11.00

 **/
class PermissionActivity: AppCompatActivity() {
    private val binding by lazy {ActivityPermissionBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnCamera.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.CAMERA),
                1
            )
        }

        binding.btnLocation.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION),
                1
            )
        }

        binding.btnCameraLocation.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf(
                    Manifest.permission.ACCESS_COARSE_LOCATION,
                    Manifest.permission.ACCESS_FINE_LOCATION,
                    Manifest.permission.CAMERA),
                1
            )
        }
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1 -> {
                var request: Array<String> = arrayOf<String>()
                for (i in 0..permissions.size - 1) {
                    if (grantResults[i] == PackageManager.PERMISSION_DENIED) {
                        val list: MutableList<String> = request.toMutableList()
                        list.add(permissions[i])
                        request = list.toTypedArray()
                    }
                }

                if (request.size > 0) {
                    Toast.makeText(applicationContext, "Ada permission yang belum di allow", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "Permission sudah di allow semua", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}