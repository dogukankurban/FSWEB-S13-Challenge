package org.example;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;
    private String password;
    private String[] healthPlans;

    public Employee(int id, String fullName, String email, String password, String[] healthPlans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthPlans = new String[2]; // Sağlık planları için bir dizi oluştur

        if (healthPlans != null && healthPlans.length > 0) {
            System.arraycopy(healthPlans, 0, this.healthPlans, 0, Math.min(Employee.this.healthPlans.length, this.healthPlans.length));
        }
    }

    public void addHealthPlan(int index, String name) {
        if (index < 0 || index >= healthPlans.length) {
            System.out.println("There is no such index");
        } else if (healthPlans[index] == null) {
            healthPlans[index] = name;
        } else {
            System.out.println("index full");
        }
    }

    // Getter ve setter metotları
    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthPlans() {
        return healthPlans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthPlans) {
        this.healthPlans = Employee.this.healthPlans;
    }

    public String toString() {
        return "Employee={" +
                "id:" + id +
                ", fullName:" + fullName +
                ", email:" + email +
                ", password:" + password +
                ", healthPlans:" + Arrays.toString(healthPlans) +
                "}";
    }
}
