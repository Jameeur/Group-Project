package ExternalTeamsInterface;

import java.util.List;

public interface ReviewAccess {
    // Fetches reviews from an external review website via an API
    void fetchExternalReviews(String showOrVenueName);

    // Pushes collected reviews to the marketing advertising system
    void pushReviewsToMarketing(List<String> reviews);
}
