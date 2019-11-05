package com.leonardovsilva.roommigrationlib;


import androidx.room.Entity;

import java.util.List;

interface IBuilderScriptApi<T>{
    public  IBuilderScriptQuery init(T roomClass);
    public  BuilderScript build();
}

interface IBuilderScriptQuery{
    public  IBuilderScriptApi script(List<String> scripts);
}

public class BuilderScript<T> implements IBuilderScriptApi<T>{

    @Override
    public IBuilderScriptQuery init(T roomClass) {
        if(!roomClass.getClass().isAnnotationPresent(Entity.class)){
            //TODO generate excpetion
        }
        return null;
    }

    @Override
    public BuilderScript build() {
        return this;
    }
}
