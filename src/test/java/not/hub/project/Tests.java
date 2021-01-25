package not.hub.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@DisplayName("Tests")
@Execution(ExecutionMode.CONCURRENT)
class Tests {

    @Test
    @DisplayName("Test A")
    void testA() {
        Assertions.assertTrue(true);
    }

    @Test
    @DisplayName("Test B")
    void testB() {
        Assertions.assertFalse(false);
    }

}
