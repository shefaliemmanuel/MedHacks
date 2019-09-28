package com.example.postopapp;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface PostOpDao
{
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertData(Data data);

    @Query("SELECT * FROM Data")
    List<Data> getAllData();

    @Delete
    void deleteData(Data data);
}


