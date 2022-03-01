package java2hw.hw3;

public class Fruit {
    private int quantity;
    private float weight;

    public Fruit(float weight) {
      this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}

