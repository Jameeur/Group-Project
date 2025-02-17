package BoxOffice;
import java.util.List;

/**
 * Manages seating config, including seating plans and availability checks
 * Implements the SeatingConfiguration interface
 */

public class SeatingConfigurationManager implements SeatingConfiguration{
    /**
     * Retrieves the seating plan for a specific show
     * @param showId The ID of the show.
     * @return a string representing the seating plan
     */
    @Override
    public String getSeatingPlan(int showId) {
        return null;
    }

    /**
     * Retrieves a list of unavailable seats, including priority holds, wheelchair spaces and restricted-view seats
     * @param showId The ID of the show.
     * @return a list of seat numbers that are unavailable
     */
    @Override
    public List<Integer> getUnavailableSeats(int showId) {
        return null;
    }

    /**
     * Retrieves a list of available seats in a section of the theatre
     * @param showId  The ID of the show.
     * @param section The section to check.
     * @return a list of available seat numbers in the section
     */
    @Override
    public List<Integer> getAvailableSeatsBySection(int showId, String section) {
        return null;
    }

    /**
     * Temporarily holds an entire tow for wheelchair users if needed
     * @param showId The ID of the show.
     * @return true if the row is successfully resrrves, false otherwise
     */
    @Override
    public boolean holdWheelchairRow(int showId) {
        return false;
    }

    /**
     * Resets the seating arrangement to its default config after a temp hold expires
     * @param showId The ID of the show.
     */
    @Override
    public void resetSeatingArrangement(int showId) {

    }
}
