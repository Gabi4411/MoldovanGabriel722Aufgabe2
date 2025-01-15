package Model;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.List;

public class Patienten {
    private int id;
    private String name;
    private String alter;
    private String diagnose;
    private List<String> medikamenten;

    public Patienten(String name, int id, String alter, String diagnose, List<String> medikamenten) {
        this.name = name;
        this.id = id;
        this.alter = alter;
        this.diagnose = diagnose;
        this.medikamenten = medikamenten;
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

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }

    public String getDiagnose() {
        return diagnose;
    }

    public void setDiagnose(String diagnose) {
        this.diagnose = diagnose;
    }

    public List<String> getMedikamenten() {
        return medikamenten;
    }

    public void setMedikamenten(List<String> medikamenten) {
        this.medikamenten = medikamenten;
    }

    @Override
    public String toString() {
        return "Patienten{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", alter='" + alter + '\'' +
                ", diagnose='" + diagnose + '\'' +
                ", medikamenten=" + medikamenten +
                '}';
    }
}
