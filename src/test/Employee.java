package test;

import java.util.Date;

public final class Employee {

    private final int id;
    private final String name;
    private final Date joiningDate; // Mutable object (handle carefully)

    public Employee(int id, String name, Date joiningDate) {
        this.id = id;
        this.name = name;
        // Defensive copy to protect internal state
        this.joiningDate = new Date(joiningDate.getTime());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Return defensive copy
    public Date getJoiningDate() {
        return new Date(joiningDate.getTime());
    }
}
