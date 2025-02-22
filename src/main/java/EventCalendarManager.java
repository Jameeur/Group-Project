public class EventCalendarManager implements ExternalTeamsInterface.EventCalendar {
    @Override
    public ArrayNode getAvailableTimeSlots(String date) {
        return null;
    }

    @Override
    public void reserveTimeSlot(String date, String startTime, String endTime, String filmTitle) {

    }

    @Override
    public void notifyAvailability(String date, String startTime, String endTime) {

    }

    @Override
    public double getEventCost(int eventId) {
        return 0;
    }

    @Override
    public Connection connectToDatabase() {
        return null;
    }

    @Override
    public List<Timeslot> getAvailableEvents(String name) {
        return null;
    }

    @Override
    public boolean bookEvents(int eventId, String eventName) {
        return false;
    }
}
