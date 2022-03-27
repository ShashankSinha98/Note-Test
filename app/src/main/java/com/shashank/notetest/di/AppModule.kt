package com.shashank.notetest.di

import android.app.Application
import androidx.room.Room
import com.shashank.notetest.persistence.NoteDao
import com.shashank.notetest.persistence.NoteDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule {

    // Remove companion if any problem occur due to dagger
    companion object {

        @Singleton
        @Provides
        fun provideNoteDatabase(application: Application) : NoteDatabase {
            return Room.databaseBuilder(
                application,
                NoteDatabase::class.java,
                NoteDatabase.DATABASE_NAME,
            ).build()
        }


        @Singleton
        @Provides
        fun provideNoteDao(noteDatabase: NoteDatabase): NoteDao {
            return noteDatabase.getNoteDao()
        }
    }

}