package net.ishari.timesync.entity;

import javax.persistence.*;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Timetable {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private User user;
    @OneToMany
    private List<TimeSlot> timeSlots = new ArrayList<>();
    private Period period;

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }

    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(List<TimeSlot> timeSlots) {
        this.timeSlots = timeSlots;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
