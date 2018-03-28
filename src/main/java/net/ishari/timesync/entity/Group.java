package net.ishari.timesync.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private List<User> users = new ArrayList<>();
    @ManyToMany
    private List<User> admins = new ArrayList<>();
    @OneToMany
    private List<Activity> activities = new ArrayList<>();

    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

    public List<User> getAdmins() {
        return admins;
    }

    public void setAdmins(List<User> admins) {
        this.admins = admins;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
