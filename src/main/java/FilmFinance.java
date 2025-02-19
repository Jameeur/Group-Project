package ExternalTeamsInterface;

import com.fasterxml.jackson.databind.node.ArrayNode;
import java.math.BigDecimal;


public interface FilmFinance {

    // Logs the cost of a film with its title and cost value
    void logFilmCost(String filmTitle, BigDecimal cost);
    // Retrieves ticket sales data for a given film title
    ArrayNode retrieveTicketSalesData(String filmTitle);

}
