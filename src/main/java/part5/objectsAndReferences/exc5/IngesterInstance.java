package part5.objectsAndReferences.exc5;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Optional;

public class IngesterInstance {
    private Instant updatedDate;

    public IngesterInstance()
    {
        this.updatedDate = Instant.now();
    }

    public Instant getUpdatedDate()
    {
        if (updatedDate != null)
        {
            return updatedDate.truncatedTo(ChronoUnit.MILLIS);
        }
        return updatedDate;
    }

    public void setUpdatedDate(Instant updatedDate) {
        this.updatedDate = updatedDate;
    }
}
