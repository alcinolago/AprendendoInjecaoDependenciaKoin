package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.R
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github

class GithubAdapter(
    private var reposList: MutableList<Github>,
    private val context: Context
) : RecyclerView.Adapter<GithubViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GithubViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.layout_cell_github_repo, parent, false)
        return GithubViewHolder(view)
    }

    override fun onBindViewHolder(holder: GithubViewHolder, position: Int) {
        holder.bind(reposList[position])
    }

    override fun getItemCount(): Int {
        return this.reposList.size
    }

    fun addItems(githubList: List<Github>) {
        this.reposList.clear()
        this.reposList.addAll(githubList)
        notifyDataSetChanged()
    }
}
