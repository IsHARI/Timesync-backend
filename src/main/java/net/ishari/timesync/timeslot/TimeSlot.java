package net.ishari.timesync.timeslot;

import net.ishari.timesync.activity.Activity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.Instant;

@Entity
public class TimeSlot {
    @Id
    @GeneratedValue
    private Long id;
    private Instant beginning;
    private Instant end;
    private boolean maybe;
    @ManyToOne
    private Activity activity;

    public TimeSlot() {
    }

    public TimeSlot(Instant beginning, Instant end, boolean maybe) {
        this.beginning = beginning;
        this.end = end;
        this.maybe = maybe;
    }

    public boolean isMaybe() {
        return maybe;
    }
    public void setMaybe(boolean maybe) {
        this.maybe = maybe;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Instant getBeginning() {
        return beginning;
    }
    public void setBeginning(Instant beginning) {
        this.beginning = beginning;
    }
    public Instant getEnd() {
        return end;
    }
    public void setEnd(Instant end) {
        this.end = end;
    }
    public Activity getActivity() {
        return activity;
    }
    public void setActivity(Activity activity) {
        this.activity = activity;
    }
}
