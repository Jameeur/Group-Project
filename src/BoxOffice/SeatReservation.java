package BoxOffice;
import java.util.List;

/** Interface for seat reservation system, mainly for group bookings. **/

public interface SeatReservation {
    /**
     * Reserves seats for a group booking.
     * @param showId The ID of the show for which seats are reserved.
     * @param seatNumbers A list of seat numbers to be reserved.
     * @return true if reservation is successful, false otherwise.
     */
    boolean reserveSeats(int showId, List<Integer> seatNumbers);

    /**
     * Finalizes a group booking after confirmation.
     * @param bookingId The ID of the booking to be finalized.
     * @return true if successful, false otherwise.
     */
    boolean finalizeGroupBooking(int bookingId);

    /**
     * Checks if there are enough available seats for a group booking.
     * @param showId   The ID of the show to check availability for.
     * @param numSeats The number of seats required.
     * @return true if enough seats are available, false otherwise.
     */
    boolean checkAvailability(int showId, int numSeats);
}
