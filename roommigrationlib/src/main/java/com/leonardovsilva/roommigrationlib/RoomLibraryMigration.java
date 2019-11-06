package com.leonardovsilva.roommigrationlib;

import android.content.Context;

public class RoomLibraryMigration implements IRoomLibraryMigration {

    private String dataBaseName;
    private Context context;

    public RoomLibraryMigration(Context context, String dataBaseName) {
        this.context = context;
        this.dataBaseName = dataBaseName;
    }

    public IRoomLibraryMigration init() throws ExceptionRoomApi {
        if (this.context != null &&
                RoomDataBaseInstance.getInstance(this.context, this.dataBaseName) != null) {
            startLibrary();
        }
        else if(this.context == null){
            throw new ExceptionRoomApi("Application context not found.",
                    ErrorStatus.NOTFOUND);
        }
        else {
            throw new ExceptionRoomApi("Unknown error.",
                    ErrorStatus.UNKNOWN);
        }

        return this;
    }

    private void startLibrary() {
        //TODO start class scanner to create instance migrations classes
    }

}