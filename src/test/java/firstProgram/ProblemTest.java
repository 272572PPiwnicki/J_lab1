package firstProgram;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProblemTest {

    @Test
    void solve_AtLeastOneItemFits_ReturnsAtLeastOneElement() {
        // Arrange
        Problem problem = new Problem(5, 1, 1, 10);
        int capacity = problem.getItems().stream().mapToInt(Item::getWeight).min().orElse(1);

        // Act
        Result result = problem.solve(capacity);

        // Assert
        assertTrue(result.getSelectedItems().size() > 0, "There should be at least one selected item."); // Fail - size() > 10
    }

    @Test
    void solve_NoItemFits_ReturnsEmptySolution() {
        // Arrange
        Problem problem = new Problem(5, 1, 5, 10);
        int capacity = 4; // Fail - capacity = 1000

        // Act
        Result result = problem.solve(capacity);

        // Assert
        assertEquals(0, result.getSelectedItems().size(), "There should be no selected items.");
    }

    @Test
    void generatedItems_AreInRange() {
        // Arrange
        Problem problem = new Problem(100, 2, 1, 10); // Fail - lowerBound: -10

        // Act
        List<Item> items = problem.getItems();

        // Assert
        assertTrue(items.stream().allMatch(item -> item.getValue() >= 1 && item.getValue() <= 10),
                "All values should be between 1 and 10.");
        assertTrue(items.stream().allMatch(item -> item.getWeight() >= 1 && item.getWeight() <= 10),
                "All weights should be between 1 and 10.");
    }

    @Test
    void solve_KnownInstance_ReturnsCorrectTotalValueAndWeight() {
        // Arrange
        Problem problem = new Problem(3, 123, 1, 10);
        int capacity = 15;

        Result result = problem.solve(capacity);

        // Act & Assert
        assertTrue(result.getTotalWeight() <= capacity, "Total weight should not exceed capacity."); // Fail - > capacity
        assertTrue(result.getTotalValue() > 0, "Total value should be greater than 0.");
    }
}
