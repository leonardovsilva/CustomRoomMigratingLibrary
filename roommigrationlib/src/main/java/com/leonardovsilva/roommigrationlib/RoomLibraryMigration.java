package com.leonardovsilva.roommigrationlib;

import android.content.Context;

public class RoomLibraryMigration implements IRoomLibraryMigration {

    private String dataBaseName;
    private Context context;

    public RoomLibraryMigration(Context context, String dataBaseName) {
        this.context = context;
        this.dataBaseName = dataBaseName;
    }

    public IRoomLibraryMigration init() {
        if (this.context != null &&
                RoomDataBaseInstance.getInstance(this.context, this.dataBaseName) != null) {
            startLibrary();
        }
        else if(this.context == null){
            //TODO throw new exception
        }
        else {
            //TODO throw new exception
        }

        return this;
    }

    private void startLibrary() {

    }

}