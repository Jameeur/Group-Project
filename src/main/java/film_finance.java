package ExternalTeamsInterface;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.math.BigDecimal;

public interface film_finance {
    void logFilmCost(String filmTitle, BigDecimal cost);

    ArrayNode retrieveTicketSalesData(String filmTitle);

}

