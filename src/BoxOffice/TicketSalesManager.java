package BoxOffice;

/** Manages ticket sales data and provides access to sales tracking.
 Implements the TicketSalesData interface. **/

public class TicketSalesManager implements TicketSales {
    /**
     * Retrieves the total ticket sales revenue.
     * @return Total revenue from ticket sales as a double.
     */
    @Override
    public double getTotalSales() {
        return 0;
    }

    /**
     * Retrieves the number of tickets purchased by 'Friends of Lancaster' members.
     * @return Number of tickets bought by priority members.
     */
    @Override
    public int getFOLSales() {
        return 0;
    }
}
