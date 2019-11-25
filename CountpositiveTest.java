import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountpositiveTest
{
   // this test passes
   @Test public void xnull() 
   {
      int arr[] = null;
      try {
	Countpositive.countPositive(arr);
      } catch (NullPointerException e) {
        return;
      }
      fail ("NullPointerException expected");
   }

    // this test fails!
   @Test public void noPositive() 
   {
      int arr[] = {-3, -5, -7};
      assertEquals("No positives", 0, Countpositive.countPositive(arr));
   }

   @Test public void positiveWithoutZero() 
   {
      int arr[] = {2, 4, 7};
      assertEquals("Two positives", 3, Countpositive.countPositive(arr));
   }

   @Test public void positiveWithZero() 
   {
      int arr[] = {4, 0, 2};
      assertEquals("Two positives", 2, Countpositive.countPositive(arr));
   }
}
