package com.leonardovsilva.roommigrationlib;

import androidx.room.Entity;


public class BuilderScript<T> implements BuilderFluentInterface.IBuilderScriptApi<T> {

    private BuilderScriptQuery builderScriptQuery;

    @Override
    public BuilderFluentInterface.IBuilderScriptQuery init(T roomClass) throws ExceptionRoomApi {
        if (!roomClass.getClass().isAnnotationPresent(Entity.class)) {
            throw new ExceptionRoomApi("Room entity Annotation is not present.",
                    ErrorStatus.NOTFOUND);
        }

        builderScriptQuery = new BuilderScriptQuery(this);

        return builderScriptQuery;
    }

    @Override
    public BuilderScript build() throws ExceptionRoomApi {
        if (this.builderScriptQuery == null || !this.builderScriptQuery.existsScriptInList()) {
            throw new ExceptionRoomApi("Empty query scripts in current BuilderScript.",
                    ErrorStatus.EMPTY);
        }

        return this;
    }
}
