package com.torrydo.transe.dataSource.database.remote

data class BaseVocab (
    val keyWord: String,
    val time: Long,
    var finished: Boolean
)