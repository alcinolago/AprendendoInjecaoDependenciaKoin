package br.com.alcinolago.aprendendoinjeodedependenciacomkoin

import android.app.Application
import br.com.alcinolago.aprendendoinjeodedependenciacomkoin.di.AppInject.appInject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AndroidApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@AndroidApplication)
            modules(appInject)
        }
    }
}
