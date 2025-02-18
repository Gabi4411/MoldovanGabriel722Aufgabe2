package Model;

public class Produkten {
    public String name;
    public int price;
    public String unisverum;

    public Produkten(String name, int price, String unisverum) {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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
