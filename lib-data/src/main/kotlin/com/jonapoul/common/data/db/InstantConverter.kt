package com.jonapoul.common.data.db

import androidx.room.TypeConverter
import org.threeten.bp.Instant

object InstantConverter {
    @TypeConverter
    fun toInstant(string: String): Instant =
        Instant.parse(string)

    @TypeConverter
    fun fromInstant(instant: Instant): String =
        instant.toString()
}
