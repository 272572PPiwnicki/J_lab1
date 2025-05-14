package firstProgram;

import java.util.List;

public class Result {
    private final int totalValue;
    private final int totalWeight;
    private final List<Integer> selectedItems;

    public Result(int totalValue, int totalWeight, List<Integer> selectedItems) {
        this.totalValue = totalValue;
        this.totalWeight = totalWeight;
        this.selectedItems = selectedItems;
    }

    public int getTotalValue() {
        return totalValue;
    }

    public int getTotalWeight() {
        return totalWeight;
    }

    public List<Integer> getSelectedItems() {
        return selectedItems;
    }

    @Override
    public String toString() {
        return "total value: " + totalValue +
                ", total weight: " + totalWeight +
                ", selected items: " + selectedItems;
    }
}
