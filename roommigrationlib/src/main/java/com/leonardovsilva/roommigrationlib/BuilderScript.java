package com.leonardovsilva.roommigrationlib;

import androidx.room.Entity;

import java.util.List;

interface IBuilderScriptApi<T> {
    public IBuilderScriptQuery init(T roomClass) throws ExceptionRoomApi;

    public BuilderScript build();
}

interface IBuilderScriptQuery {
    public IBuilderScriptApi script(List<String> scripts);
}

public class BuilderScript<T> implements IBuilderScriptApi<T> {

    @Override
    public IBuilderScriptQuery init(T roomClass) throws ExceptionRoomApi {
        if (!roomClass.getClass().isAnnotationPresent(Entity.class)) {
            throw new ExceptionRoomApi("Room entity Annotation is not present.",
                    ErrorCode.NOTFOUND);
        }
        return null;
    }

    @Override
    public BuilderScript build() {
        return this;
    }
}
