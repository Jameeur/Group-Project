package BoxOffice;

/** Interface for managing priority seating for FOL members **/

public interface PrioritySeating {
    /**
     * Holds priority seats for FOL members before general sales.
     * @param showId   The ID of the show.
     * @param numSeats Number of priority seats to hold.
     * @param memberId The ID of the priority member making the reservation.
     * @return true if hold is successful, false otherwise.
     */
    boolean holdPrioritySeats(int showId, int numSeats, int memberId);

    /**
     * Releases priority seats if they are not booked within the holding period.
     * @param showId The ID of the show.
     */
    void releasePrioritySeats(int showId);

    /**
     * Checks if a member requires accessibility accommodations.
     * @param memberId The ID of the member.
     * @return true if accessibility is required, false otherwise.
     */
    boolean requiresAccessibility(int memberId);

    /**
     * Automatically reserves wheelchair-accessible seats for priority members.
     * @param showId   The ID of the show.
     * @param memberId The ID of the priority member.
     * @return true if successful, false otherwise.
     */
    boolean reserveWheelchairSeats(int showId, int memberId);
}
