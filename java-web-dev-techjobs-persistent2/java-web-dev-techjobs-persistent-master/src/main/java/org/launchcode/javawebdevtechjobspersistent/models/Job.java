package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    private Employer employer;

    @ManyToMany
    private List<Skill> skills;


    public Job() {
    }

    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.



    public void setEmployer(Employer employer) { this.employer = employer; }

    public List<Skill> getSkills() { return skills; }

    public void setSkills(List<Skill> skills) { this.skills = skills; }

    @Override
    public Object getEmployer() {
        return null;
    }
}
