package net.ishari.timesync.user;

import net.ishari.timesync.group.Group;
import net.ishari.timesync.timetable.Timetable;

import javax.persistence.*;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    @Column(unique = true)
    private String email;
    @ManyToMany(mappedBy = "users")
    private List<Group> groups = new ArrayList<>();
    @OneToMany
    private List<Timetable> timetables = new ArrayList<>();
    @OneToOne(cascade = CascadeType.ALL)
    private Timetable templateTimetable;
    private ZoneId zoneId;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Group> getGroups() {
        return groups;
    }
    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
    public List<Timetable> getTimetables() {
        return timetables;
    }
    public void setTimetables(List<Timetable> timetables) {
        this.timetables = timetables;
    }
    public Timetable getTemplateTimetable() {
        return templateTimetable;
    }
    public void setTemplateTimetable(Timetable templateTimetable) {
        this.templateTimetable = templateTimetable;
    }
    public ZoneId getZoneId() {
        return zoneId;
    }
    public void setZoneId(ZoneId zoneId) {
        this.zoneId = zoneId;
    }
}
