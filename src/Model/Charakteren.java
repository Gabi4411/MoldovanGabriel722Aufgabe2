package Model;

import java.util.ArrayList;

public class Charakteren {
    int id;
    String name;
    String region;
    ArrayList<String> gekauftenProdukte;

    public Charakteren(int id, String name, String region) {
        this.id = id;
        this.name = name;
        this.region = region;
        this.gekauftenProdukte = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ArrayList<String> getGekauftenProdukte() {
        return gekauftenProdukte;
    }

    public void setGekauftenProdukte(ArrayList<String> gekauftenProdukte) {
        this.gekauftenProdukte = gekauftenProdukte;
    }

    @Override
    public String toString() {
        return "Charakteren{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", gekauftenProdukte=" + gekauftenProdukte +
                '}';
    }
}
