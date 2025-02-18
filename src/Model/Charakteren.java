package Model;

import java.util.ArrayList;
import java.util.List;

public class Charakteren {
    int id;
    String name;
    String region;
    List<String> gekauftenProdukte;

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

    public List<String> getGekauftenProdukte() {
        return gekauftenProdukte;
    }

    public void setGekauftenProdukte(List<String> gekauftenProdukte) {
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

    public void kaufeProduke(Produkten produkten) {
        gekauftenProdukte.add(produkten.getName());
    }
}
