package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private static int NEXT_ID = 0;
    private final int id;
    private String name;
    private String description;
    private ProjectType type;
    private final List<Contract> contractList;

    public Project(int id, String name, String description, ProjectType type, List<Contract> contract) {
        this.id = NEXT_ID++;
        this.name = name;
        this.description = description;
        this.type = type;
        contractList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectType getType() {
        return type;
    }

    public void setType(ProjectType type) {
        this.type = type;
    }

    public List<Contract> getContractList() {
        return contractList;
    }
}
