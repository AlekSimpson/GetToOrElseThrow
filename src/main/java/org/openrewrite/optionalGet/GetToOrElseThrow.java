package org.openrewrite.optionalGet;

import org.openrewrite.ExecutionContext;
import org.openrewrite.Recipe;
import org.openrewrite.TreeVisitor;
import org.openrewrite.java.JavaVisitor;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GetToOrElseThrow extends Recipe {

    @Override
    public String getDisplayName() { return "Replace Optional.get with Optional::orElseThrow"; }

    @Override
    protected TreeVisitor<?, ExecutionContext> getVisitor() {
        return new JavaVisitor<ExecutionContext>() {
            @Override
            public visitGetReference()
        }
    }
}
