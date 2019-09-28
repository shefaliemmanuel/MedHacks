package com.example.postopapp;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


//build dependencies and modules
@Database(entities = {Data.class}, version = 1)
public abstract class Database extends RoomDatabase{
    public abstract PostOpDao postOpDao();

}
