package Model;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Medikamenten {
    private String name;
    private int preis;
    private String krankheit;

    public Medikamenten(String name, int preis, String krankheit) {
        this.name = name;
        this.preis = preis;
        this.krankheit = krankheit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public String getKrankheit() {
        return krankheit;
    }

    public void setKrankheit(String krankheit) {
        this.krankheit = krankheit;
    }

    @Override
    public String toString() {
        return "Medikamenten{" +
                "name='" + name + '\'' +
                ", preis=" + preis +
                ", krankheit='" + krankheit + '\'' +
                '}';
    }
}
