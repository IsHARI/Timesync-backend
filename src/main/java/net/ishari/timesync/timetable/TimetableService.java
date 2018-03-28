package net.ishari.timesync.timetable;

import net.ishari.timesync.timeslot.TimeSlot;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class TimetableService {

    public void addSlot(Timetable timetable, TimeSlot newSlot) {
        cutOut(timetable, newSlot);

        timetable.getTimeSlots().add(newSlot);
    }

    // TODO to timetable validator
    private void cutOut(Timetable timetable, TimeSlot newSlot) {
        if (newSlot.getBeginning().isAfter(newSlot.getEnd())) {
            swap(newSlot);
        }

        Instant newB = newSlot.getBeginning();
        Instant newE = newSlot.getEnd();

        // If slots overlap, change the old slot to make space for the new one
        for (TimeSlot oldSlot : timetable.getTimeSlots()) {
            // Shorts for readability
            Instant oldB = oldSlot.getBeginning();
            Instant oldE = oldSlot.getEnd();

            if (oldB.isBefore(newB) && oldE.isAfter(newE)) {
                // New inside old
                timetable.getTimeSlots().add(new TimeSlot(newE, oldE, oldSlot.isMaybe()));
                oldSlot.setEnd(newB);
            } else if (oldB.isBefore(newB) && oldE.isBefore(newE)) {
                // Old end overlaps new beginning
                oldSlot.setEnd(newB);
            } else if (oldB.isAfter(newB) && oldE.isAfter(newE)) {
                // New end overlaps new beginning
                oldSlot.setBeginning(newE);
            } else if (oldB.isAfter(newB) && oldE.isBefore(newE)) {
                // New completely covers old
                timetable.getTimeSlots().remove(oldSlot);
            }
        }
    }

    // TODO to slot validator
    private void swap(TimeSlot slot) {
        Instant oldBeginning = slot.getBeginning();
        slot.setBeginning(slot.getEnd());
        slot.setEnd(oldBeginning);
    }
}
