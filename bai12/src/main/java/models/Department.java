package models;

import java.io.Serializable;
import java.time.Clock;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Department implements Serializable {
    private long id;
    private String name;
    private String description;
    public static int numberOfObjects = 0;

    public Department(Long id, String name, String description) {
        this.name = name;
        this.description = description;
        numberOfObjects++;
        //this.id = numberOfObjects;//auto increament
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public static long randomId() {
        long xx = System.nanoTime();
        //Integer result = (int)(Math.random() * 500 + 1);
        return System.nanoTime();

    }
}
