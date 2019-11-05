package com.leonardovsilva.roommigrationlib;

import android.content.Context;
import android.util.Log;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public class RoomDataBaseInstance {

    private static final String LOG_TAG = RoomDataBaseInstance.class.getSimpleName();
    private static final Object LOCK = new Object();
    private static RoomDatabase roomDatabaseInstance;
    private static String dataBaseName;

    public static RoomDatabase getInstance(Context context, String databaseName) {
        dataBaseName = databaseName;

        if (roomDatabaseInstance == null) {
            synchronized (LOCK) {
                Log.d(LOG_TAG, "Creating new database instance");
                roomDatabaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                        RoomDatabase.class, dataBaseName)
                        .build();
            }
        }

        Log.d(LOG_TAG, "Getting the database instance");
        return roomDatabaseInstance;
    }

    public static String getDataBaseName() {
        return dataBaseName;
    }
}
