public class Smartphone {
    private String name;
    private double memory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public Smartphone(String name, double memory) {
        this.name = name;
        this.memory = memory;
    }
}
