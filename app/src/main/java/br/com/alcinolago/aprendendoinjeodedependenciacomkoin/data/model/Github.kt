package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model

import com.google.gson.annotations.SerializedName

data class Github(
    @SerializedName("id") var id: Int? = null,
    @SerializedName("name") var name: String? = null,
    @SerializedName("full_name") var fullName: String? = null,
    @SerializedName("description") var description: String? = null
)
