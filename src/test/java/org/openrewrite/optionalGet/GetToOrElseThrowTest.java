package org.openrewrite.optionalGet;

import org.junit.jupiter.api.Test;
import org.openrewrite.test.RecipeSpec;
import org.openrewrite.test.RewriteTest;

import static org.openrewrite.java.Assertions.java;

public class GetToOrElseThrowTest implements RewriteTest {
    @Override
    public  void defaults(RecipeSpec spec) {
        spec.recipe(new GetToOrElseThrow()); // create this class
    }

    @Test
    void optionalGet() {
        rewriteRun(
            java(
                """
                val value = Optional.of("").get();
                """,
                """
                val value = Optional.of("").orElseThrow(NoSuchElementException::new);
                """
            )
        );
    }
}