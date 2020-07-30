package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.domain.interactor.repos

import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import io.reactivex.Observable

interface GithubReposInteractor {

    fun listRepos() : Observable<List<Github>>
}
