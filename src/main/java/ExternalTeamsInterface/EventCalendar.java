package ExternalTeamsInterface;

public interface EventCalendar {

    //Retrieves only available time slots for that event
    ArrayNode getAvailableTimeSlots(String date);

    //If an event is booked, it reserves the slot for the user
    void reserveTimeSlot(String date, String startTime, String endTime, String filmTitle);

    //Notifies the user which events are currently available
    void notifyAvailability(String date, String startTime, String endTime);

    //If there is  a cost to pay for the event, this is notified to the user
    double getEventCost(int eventId);

    //Connects to the events database to find the events
    Connection connectToDatabase();

    //Gets currently available events
    List<Timeslot> getAvailableEvents(String name);

    //User can book an event, followed by an event notification
    boolean bookEvents(int eventId, String eventName)

}
