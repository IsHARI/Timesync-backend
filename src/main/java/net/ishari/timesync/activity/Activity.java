package net.ishari.timesync.activity;

import net.ishari.timesync.timetable.Timetable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Activity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToOne
    private Timetable mainTimetable;

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
    public Timetable getMainTimetable() {
        return mainTimetable;
    }
    public void setMainTimetable(Timetable mainTimetable) {
        this.mainTimetable = mainTimetable;
    }
}
