package BoxOffice;

import java.util.List;
/** Interface for handling seating configurations for different shows **/
public interface SeatingConfiguration {
    /**
     * Retrieves the seating plan for a specific show.
     * @param showId The ID of the show.
     * @return A string representing the seating plan.
     */
    String getSeatingPlan(int showId);

    /**
     * Gets a list of seats that are unavailable (priority holds, wheelchair spaces, restricted-view seats).
     * @param showId The ID of the show.
     * @return A list of unavailable seat numbers.
     */
    List<Integer> getUnavailableSeats(int showId);

    /**
     * Gets a list of available seats in a specific section.
     * @param showId  The ID of the show.
     * @param section The section to check.
     * @return A list of available seat numbers in that section.
     */
    List<Integer> getAvailableSeatsBySection(int showId, String section);

    /**
     * Temporarily holds an entire row for wheelchair users.
     * @param showId The ID of the show.
     * @return true if successful, false otherwise.
     */
    boolean holdWheelchairRow(int showId);

    /**
     * Resets the seating arrangement to its default configuration.
     * @param showId The ID of the show.
     */
    void resetSeatingArrangement(int showId);
}
