package ExternalTeamsInterface;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface VenueManagement {
    // Generates a daily venue report showing booked and available spaces
    String generateDailyVenueReport(LocalDate date);

    // Checks if a specific meeting room is available on a given date
    boolean isMeetingRoomAvailable(String roomName, LocalDate date);

    // Reserves a meeting room for marketing, enforcing the 3-week limit
    Optional<String> reserveMeetingRoom(String roomName, LocalDate date, String bookedBy);


}
