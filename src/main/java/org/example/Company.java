package org.example;

import java.util.Arrays;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(int id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        this.giro = giro;
        this.developerNames = new String[2];

        if (developerNames != null && developerNames.length > 0) {
            System.arraycopy(developerNames, 0, this.developerNames, 0, Math.min(developerNames.length, this.developerNames.length));
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void setGiro(double giro) {
        this.giro = giro < 0 ? 0 : giro;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void addEmployee(int index, String name) {
        if (index < 0 || index >= developerNames.length) {
            System.out.println("There is no index");
        } else if (developerNames[index] != null) {
            System.out.println("Index full");
        } else {
            developerNames[index] = name;
        }
    }

    public String toString() {
        return "Company={" +
                "id:" + id +
                ", name:" + name +
                ", giro:" + giro +
                ", developerNames:" + Arrays.toString(developerNames) +
                "}";
    }
}
