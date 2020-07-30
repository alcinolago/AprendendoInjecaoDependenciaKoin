package br.com.alcinolago.aprendendoinjeodedependenciacomkoin.di

import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.domain.interactor.repos.GithubReposInteractor
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.domain.interactor.repos.GithubReposInteractorImpl
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.presentation.list.GithubReposViewModel
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.repository.repos.GithubReposRepository
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.service.RetrofitServiceFactory
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppInject {

    val appInject = module {

        single { RetrofitServiceFactory.createService(GithubReposRepository::class.java) }

        single<GithubReposInteractor> { GithubReposInteractorImpl(get()) }

        viewModel { GithubReposViewModel(get()) }
    }
}
