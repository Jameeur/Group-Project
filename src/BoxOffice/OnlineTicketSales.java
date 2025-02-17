package BoxOffice;

/** Interface for handling online ticket sales & sync with external systems **/

public interface OnlineTicketSales {
    /**
     * Syncs marketing's film bookings with the online ticketing system.
     * @param filmId The ID of the film to sync.
     * @return true if sync is successful, false otherwise.
     */
    boolean syncFilmBookings(int filmId);

    /**
     * Updates seat availability in the system when bookings change.
     * @param showId The ID of the show.
     * @param availableSeats The new number of available seats.
     */
    void updateSeatAvailability(int showId, int availableSeats);

    /**
     * Retrieves total online ticket sales revenue.
     * @return Total revenue from online ticket sales.
     */
    double getOnlineSales();

    /**
     * Adds a new film showing to the online system.
     * @param filmId   The ID of the film.
     * @param filmName The name of the film.
     * @param showTime The scheduled showtime.
     * @return true if the showing is added successfully, false otherwise.
     */
    boolean addFilmShowing(int filmId, String filmName, String showTime);
}
