package com.leonardovsilva.roommigrationlib;

import androidx.room.RoomDatabase;

import java.util.List;

public interface IMigration {

    public List<BuilderScript> upperMigration();
    public List<BuilderScript> downMigration();
}
