package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.R
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.adapter.GithubAdapter
import kotlinx.android.synthetic.main.activity_github_repos.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class GithubReposActivity : AppCompatActivity() {

    private val viewModel by viewModel<GithubReposViewModel>()
    private var gitHubList = ArrayList<Github>()
    private lateinit var githubAdapter: GithubAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_github_repos)

        viewModel.listRepos()
        observeViewModel()
        configureRecyclerView()
        configureAdapterRecyclerView()
    }

    private fun observeViewModel() {
        viewModel.reposList.observe(this, Observer { reposList ->
            gitHubList.clear()
            gitHubList.addAll(reposList)
            githubAdapter.addItems(reposList)
        })
    }

    private fun configureRecyclerView() {

        val layout = LinearLayoutManager(this,
            RecyclerView.VERTICAL, false)

        github_recycler_view.setHasFixedSize(true)
        github_recycler_view.layoutManager = layout
    }

    private fun configureAdapterRecyclerView() {

        githubAdapter = GithubAdapter(gitHubList, this)
        github_recycler_view.adapter = githubAdapter
    }
}