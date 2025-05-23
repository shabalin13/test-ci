package com.shabalin13.testci.data.di

import com.shabalin13.testci.data.di.mediaCatalog.MediaCatalogModule
import dagger.Module
import dagger.Provides

@Module(
    includes = [
        MediaCatalogModule::class,
        MediaDetailsModule::class
    ]
)
internal class DataModule {
    @Suppress("FunctionOnlyReturningConstant")
    @Provides
    @BaseUrl
    fun provideBaseUrl(): String {
        return "https\\://api.kinopoisk.dev/v1.4/"
    }
}
