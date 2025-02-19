package ExternalTeamsInterface;
import com.fasterxml.jackson.databind.node.ArrayNode;

public interface EventCalendar {

    ArrayNode getAvailableTimeSlots(String date);

    void reserveTimeSlot(String date, String startTime, String endTime, String filmTitle);

    void notifyAvailability(String date, String startTime, String endTime);

}