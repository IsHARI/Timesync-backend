package net.ishari.timesync.usergroup;

import net.ishari.timesync.user.User;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class UserGroup {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private List<User> users = new ArrayList<>();
    @ManyToMany
    private List<User> admins = new ArrayList<>();

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
