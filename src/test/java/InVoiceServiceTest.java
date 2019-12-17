import com.InvoiceService;
import com.InvoiceSummary;
import com.Ride;
import com.RideCategory;
import org.junit.Assert;
import org.junit.Test;

public class InVoiceServiceTest {
    InvoiceService invoiceService = new InvoiceService();


    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(0.1, 1),
                new Ride(2.0, 5)};
        InvoiceSummary summary = invoiceService.calculateFare(rides);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }

    @Test
    public void givenUserIdAndRides_ShouldReturnInvoiceSummary() {
        String userId="abc.com";
        Ride[] rides = {new Ride(0.1, 1),
                new Ride(2.0, 5)};
    /*    Ride[] rides1 = {new Ride(0.1, 1),
                new Ride(2.0, 5)};*/
        invoiceService.addRide(userId,rides);
        InvoiceSummary summary = invoiceService.getInvoiceService(userId, RideCategory.NORMALRIDE);
        InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30);
        Assert.assertEquals(expectedInvoiceSummary, summary);
    }


}
