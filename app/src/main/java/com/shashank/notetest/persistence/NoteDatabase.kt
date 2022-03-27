package com.shashank.notetest.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.shashank.notetest.models.Note

@Database(entities = [ Note::class ], version = 1)
abstract class NoteDatabase: RoomDatabase() {

    companion object {
        val DATABASE_NAME = "notes_db"
    }

    abstract fun getNoteDao(): NoteDao
}