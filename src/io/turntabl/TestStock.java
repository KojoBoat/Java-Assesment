package io.turntabl;
import org.junit.*;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import org.junit.runner.JUnitCore;
import org.mockito.InjectMocks;
import org.mockito.Mock;


public class TestStock {
    @Mock
    ProductPricingService productPricingService;

    @InjectMocks
    Stock stock = new Stock("B01",45.66,"EXCH","NIC");



    @Test
    public void stock_setExchange(){
        stock.setExchange("GBP");
        assertSame("Error In Stock Creation", "GBP",stock.getExchange());
    }

    public static void main(String args){
        Result result  = org.junit.runner.JUnitCore.runClasses(TestStock.class);
        for(Failure f: result.getFailures()){
            System.out.println(f);
        }
        System.out.println(result.wasSuccessful());
    }
}
