package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Submission cant be left blank.")
    @Size(min = 1, max = 150)
    private String location;

    @OneToMany
    @JoinColumn
    private final List<Job> jobs = new ArrayList<Job>();


    public Employer() {}

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public Object getEmployer() {
        return null;
    }
}
