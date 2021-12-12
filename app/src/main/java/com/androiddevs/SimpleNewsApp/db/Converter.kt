package com.androiddevs.SimpleNewsApp.db

import androidx.room.TypeConverter
import com.androiddevs.SimpleNewsApp.models.Source

class Converter {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}