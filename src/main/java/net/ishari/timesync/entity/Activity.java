package net.ishari.timesync.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToMany
    private List<Timetable> userTimetables;
    @OneToOne
    private Timetable timetable;

    public List<Timetable> getUserTimetables() {
        return userTimetables;
    }

    public void setUserTimetables(List<Timetable> userTimetables) {
        this.userTimetables = userTimetables;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timetable getTimetable() {
        return timetable;
    }

    public void setTimetable(Timetable timetable) {
        this.timetable = timetable;
    }
}
