package com.shashank.notetest.models

import android.os.Parcelable
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity(tableName = "notes")
@Parcelize
data class Note (

    @PrimaryKey(autoGenerate = true)
    val id: Int?= null,

    @NonNull
    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "content")
    val content: String,

    @ColumnInfo(name = "timestamp")
    val timestamp: String
) : Parcelable {

    constructor(note: Note): this(note.id, note.title, note.content, note.timestamp)



    // 2 notes are equal only if their id, title and content are same
    override fun equals(obj: Any?): Boolean {

        if(obj==null) return false

        // checking if obj belong to Note class
        if(javaClass!=obj.javaClass) return false

        val note = obj as Note
        return note.id == id && note.title == title && note.content == content
    }
}
