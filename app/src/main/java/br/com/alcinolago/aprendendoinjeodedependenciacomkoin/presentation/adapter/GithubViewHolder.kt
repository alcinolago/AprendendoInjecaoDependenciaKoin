package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import kotlinx.android.synthetic.main.layout_cell_github_repo.view.*

class GithubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(github: Github){
        itemView.txProjectName.text = github.fullName
        itemView.projectDescription.text = github.description
    }
}
