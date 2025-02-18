package Model;

public class Produkten {
    public String name;
    public double price;
    public String unisverum;

    public Produkten(String name, double price, String unisverum) {
        this.name = name;
        this.price = price;
        this.unisverum = unisverum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUnisverum() {
        return unisverum;
    }

    public void setUnisverum(String unisverum) {
        this.unisverum = unisverum;
    }

    @Override
    public String toString() {
        return "Produkten{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", unisverum='" + unisverum + '\'' +
                '}';
    }
}
