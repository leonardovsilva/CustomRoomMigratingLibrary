package com.leonardovsilva.roommigrationlib;

import java.util.List;

public class BuilderFluentInterface {

    interface IBuilderScriptApi<T> {
        public IBuilderScriptQuery init(T roomClass) throws ExceptionRoomApi;

        public BuilderScript build() throws ExceptionRoomApi;
    }

    interface IBuilderScriptQuery {
        public IBuilderScriptApi script(List<String> scripts);
    }

}
