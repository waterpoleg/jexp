package collections.task03;

public class Product {
    private int count;
    private String name;
    private String manufacturer;

    public Product(int count, String name, String manufacturer) {
        this.count = count;
        this.name = name;
        this.manufacturer = manufacturer;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
