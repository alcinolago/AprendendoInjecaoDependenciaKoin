package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.repository.repos

import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.data.model.Github
import io.reactivex.Observable
import retrofit2.http.GET

interface GithubReposRepository {

    @GET("repositories")
    fun listRepos(): Observable<List<Github>>
}
