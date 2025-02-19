public interface RevenueTracker {

    // Retrieves a financial summary for a specific event, including revenue and expenses
    Map<String, BigDecimal> getFinancialSummary(String eventName);


}
