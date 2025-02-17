package BoxOffice;

/** Interface for retrieving ticket sales data and tracking purchases **/

public interface TicketSales {
    /**
     * Retrieves the total sales revenue
     * @return Total revenue from ticket sales as a double
     */
    double getTotalSales();

    /**
     * Retrieves the num of tickets purchased by FOL members
     * @return Num of tickets bought by members
     */
    int getFOLSales();
}
