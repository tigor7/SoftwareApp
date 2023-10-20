package org.ulpgc.is1.model;

import java.util.List;

public class Project {
    private static int NEXT_ID = 0;
    private final int id;
    private String name;
    private String description;
    private ProjectType type;
    private List<Contract> contract;
}
