package com.shabalin13.testci.di

import com.shabalin13.testci.mediaCatalog.di.MediaCatalogDependencies
import com.shabalin13.testci.mediaDetails.di.MediaDetailsDependencies

interface FeatureDependencies :
    MediaCatalogDependencies,
    MediaDetailsDependencies
