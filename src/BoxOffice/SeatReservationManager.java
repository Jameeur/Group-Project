package BoxOffice;
import java.util.List;

/** Handles seat reservations for group bookings and availability checks
 * Implements the seat reservations interface **/

public class SeatReservationManager implements SeatReservation {
    /**
     * Reserves seats for a group booking.
     * @param showId       The ID of the show for which seats are reserved.
     * @param seatNumbers  A list of seat numbers to be reserved.
     * @return true if reservation is successful, false otherwise.
     */
    @Override
    public boolean reserveSeats(int showId, List<Integer> seatNumbers) {
        return false;
    }

    /**
     * Finalizes a group booking after confirmation.
     * @param bookingId  The ID of the booking to be finalized.
     * @return true if successful, false otherwise.
     */
    @Override
    public boolean finalizeGroupBooking(int bookingId) {
        return false;
    }

    /**
     * Checks if there are enough available seats for a group booking.
     * @param showId   The ID of the show to check availability for.
     * @param numSeats The number of seats required.
     * @return true if enough seats are available, false otherwise.
     */
    @Override
    public boolean checkAvailability(int showId, int numSeats) {
        return false;
    }
}
