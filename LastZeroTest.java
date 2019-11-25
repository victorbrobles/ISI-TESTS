import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest
{
   // this test passes
   @Test public void xnull() 
   {
      int arr[] = null;
      try {
	LastZero.lastZero(arr);
      } catch (NullPointerException e) {
        return;
      }
      fail ("NullPointerException expected");
   }

    // this test fails!
   @Test public void noZeros() 
   {
      int arr[] = {4, 5, 6};
      assertEquals("No zeros", -1, LastZero.lastZero(arr));
   }

   @Test public void oneZero() 
   {
      int arr[] = {2, 0, 7};
      assertEquals("One zero", 1, LastZero.lastZero(arr));
   }

   @Test public void moreZeros() 
   {
      int arr[] = {8, 0, 0};
      assertEquals("Two zeros", 2, LastZero.lastZero(arr));
   }
}
