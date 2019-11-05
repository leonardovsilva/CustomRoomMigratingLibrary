package com.leonardovsilva.roommigrationlib;

import androidx.room.RoomDatabase;

public abstract class BaseMigration {

    public abstract void upperMigration();
    public abstract void downMigration();
}
