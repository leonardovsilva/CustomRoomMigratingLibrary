package com.leonardovsilva.roommigrationlib;

import java.util.List;

public class BuilderScriptQuery implements BuilderFluentInterface.IBuilderScriptQuery {

    private List<String> scripts;
    private BuilderFluentInterface.IBuilderScriptApi builder;

    public BuilderScriptQuery(BuilderFluentInterface.IBuilderScriptApi builder) {
        this.builder = builder;
    }

    @Override
    public BuilderFluentInterface.IBuilderScriptApi script(List<String> scripts) {
        this.scripts = scripts;

        return builder;
    }

    public boolean existsScriptInList(){
        return this.scripts != null && !this.scripts.isEmpty();
    }
}
