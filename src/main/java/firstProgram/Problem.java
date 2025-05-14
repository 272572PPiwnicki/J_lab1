package firstProgram;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problem {
    private final int numberOfItems;
    private final int seed;
    private final int lowerBound;
    private final int upperBound;
    private final List<Item> items;

    public Problem(int numberOfItems, int seed, int lowerBound, int upperBound) {
        this.numberOfItems = numberOfItems;
        this.seed = seed;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.items = new ArrayList<>();

        Random random = new Random(seed);
        for (int i = 0; i < numberOfItems; i++) {
            int value = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            int weight = lowerBound + random.nextInt(upperBound - lowerBound + 1);
            items.add(new Item(value, weight));
        }
    }

    public Result solve(int capacity) {
        List<ItemWithIndex> sortedItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i++) {
            sortedItems.add(new ItemWithIndex(items.get(i), i));
        }

        sortedItems.sort((a, b) -> Double.compare(b.item.getRatio(), a.item.getRatio())); // sort descending

        List<Integer> selectedIndices = new ArrayList<>();
        int totalValue = 0;
        int totalWeight = 0;

        for (ItemWithIndex entry : sortedItems) {
            while (totalWeight + entry.item.getWeight() <= capacity) {
                totalWeight += entry.item.getWeight();
                totalValue += entry.item.getValue();
                selectedIndices.add(entry.index);
            }
        }

        return new Result(totalValue, totalWeight, selectedIndices);
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item).append("\n");
        }
        return sb.toString();
    }

    private static class ItemWithIndex {
        Item item;
        int index;

        ItemWithIndex(Item item, int index) {
            this.item = item;
            this.index = index;
        }
    }
}
