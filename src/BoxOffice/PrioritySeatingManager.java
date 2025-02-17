package BoxOffice;

/**
 * Manages priority seating for 'Friends of Lancaster' (FOL) members,
 * including priority holds and accessibility accommodations.
 * Implements the PrioritySeating interface.
 */

public class PrioritySeatingManager implements PrioritySeating{
    /**
     * Holds priority seats for Friends of Lancaster members before general sales.
     * @param showId   The ID of the show.
     * @param numSeats Number of priority seats to hold.
     * @param memberId The ID of the priority member making the reservation.
     * @return true if hold is successful, false otherwise.
     */
    @Override
    public boolean holdPrioritySeats(int showId, int numSeats, int memberId) {
        return false;
    }

    /**
     * Releases priority seats if they are not booked within the holding period.
     * @param showId The ID of the show.
     */
    @Override
    public void releasePrioritySeats(int showId) {
    }

    /**
     * Checks if a member requires accessibility accommodations.
     * @param memberId The ID of the member.
     * @return true if accessibility is required, false otherwise.
     */
    @Override
    public boolean requiresAccessibility(int memberId) {
        return false;
    }

    /**
     * Automatically reserves wheelchair-accessible seats for priority members.
     * @param showId   The ID of the show.
     * @param memberId The ID of the priority member.
     * @return true if successful, false otherwise.
     */
    @Override
    public boolean reserveWheelchairSeats(int showId, int memberId) {
        return false;
    }
}
