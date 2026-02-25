package com.smartcampus.model;

public class Department {
    private int id;
    private String name;
    private String headOfDepartment;
    private String building;

    public Department() {}

    public Department(int id, String name, String headOfDepartment, String building) {
        this.id = id;
        this.name = name;
        this.headOfDepartment = headOfDepartment;
        this.building = building;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getHeadOfDepartment() { return headOfDepartment; }
    public void setHeadOfDepartment(String headOfDepartment) { this.headOfDepartment = headOfDepartment; }
    public String getBuilding() { return building; }
    public void setBuilding(String building) { this.building = building; }
}