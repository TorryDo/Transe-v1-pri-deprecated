package com.torrydo.transe.dataSource.database.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.torrydo.transe.adapter.vocabSource.model.SearchResult
import com.torrydo.transe.dataSource.database.local.MyRoomDatabase
import java.sql.Date

@Entity(tableName = MyRoomDatabase.VOCAB_TABLE_NAME)
data class Vocab(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    @ColumnInfo(name = "vocab") val vocab: String,
    @ColumnInfo(name = "date") val time: Date,
    @ColumnInfo(name = "finished") var finished: Boolean,
    @ColumnInfo(name = "contentEng") var contentEng: List<SearchResult>,
//    @ColumnInfo(name = "contentVi") var contentVi: List<ViResult>?

)
