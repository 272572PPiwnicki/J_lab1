package firstProgram;

public class Item {
    private final int value;
    private final int weight;

    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public double getRatio() {
        return (double) value / weight;
    }

    @Override
    public String toString() {
        return "value: " + value + ", weight: " + weight + ", ratio: " + String.format("%.2f", getRatio());
    }
}
