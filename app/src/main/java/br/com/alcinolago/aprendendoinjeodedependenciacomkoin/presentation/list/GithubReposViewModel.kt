package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.domain.interactor.repos.GithubReposInteractor
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class GithubReposViewModel(private val githubReposInteractor: GithubReposInteractor) : ViewModel() {

    var reposList = MutableLiveData<List<Github>>()

    fun listRepos() {
        githubReposInteractor.listRepos()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::handleGithubRepos, this::handleError)
    }

    private fun handleGithubRepos(github: List<Github>?) {
        reposList.value = github
    }

    private fun handleError(error: Throwable) {

    }
}
