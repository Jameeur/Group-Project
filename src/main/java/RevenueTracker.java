package ExternalTeamsInterface;

import java.math.BigDecimal;
import java.util.Map;


public interface RevenueTracker {

    // Retrieves a financial summary for a specific event, including revenue and expenses
    Map<String, BigDecimal> getFinancialSummary(String eventName);

    Map<String, BigDecimal> getRevenueSplit(String startDate, String endDate);


}
