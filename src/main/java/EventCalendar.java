package ExternalTeamsInterface;
import com.fasterxml.jackson.databind.node.ArrayNode;

public interface EventCalendar {

    ArrayNode getAvailableTimeSlots(String date);

    void reserveTimeSlot(String date, String startTime, String endTime, String filmTitle);

    void notifyAvailability(String date, String startTime, String endTime);

    double getEventCost(int eventId);

    Connection connectToDatabase();

    List<Events> getAvailableEvents();

    List<Timeslot> getAvailableEvents(String name);

    boolean bookEvents(int eventId, String eventName)

}
