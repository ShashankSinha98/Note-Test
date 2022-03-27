package com.shashank.notetest.di

import com.shashank.notetest.NotesListActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeNotesListActivity(): NotesListActivity
}