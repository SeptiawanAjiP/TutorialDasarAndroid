package com.dewakoding.tutorialdasaryoutube.retrofit

import com.google.gson.annotations.SerializedName

data class Faskes(

	@field:SerializedName("provinsi")
	val provinsi: String? = null,

	@field:SerializedName("kota")
	val kota: String? = null,

	@field:SerializedName("telp")
	val telp: String? = null,

	@field:SerializedName("source_data")
	val sourceData: String? = null,

	@field:SerializedName("latitude")
	val latitude: String? = null,

	@field:SerializedName("alamat")
	val alamat: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("kode")
	val kode: String? = null,

	@field:SerializedName("kelas_rs")
	val kelasRs: String? = null,

	@field:SerializedName("jenis_faskes")
	val jenisFaskes: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("detail")
	val detail: List<Any?>? = null,

	@field:SerializedName("longitude")
	val longitude: String? = null,

	@field:SerializedName("status")
	val status: String? = null
)
