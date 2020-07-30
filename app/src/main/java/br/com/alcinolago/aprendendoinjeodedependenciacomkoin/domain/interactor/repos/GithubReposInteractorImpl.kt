package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.domain.interactor.repos

import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.repository.repos.GithubReposRepository
import io.reactivex.Observable

class GithubReposInteractorImpl(
    private val githubReposRepository: GithubReposRepository
) : GithubReposInteractor {

    override fun listRepos(): Observable<List<Github>> {
        return githubReposRepository.listRepos()
    }
}
