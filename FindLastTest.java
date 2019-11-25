import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest
{
   @Test public void x_null() 
   {
      int arr[] = null;
      int y = 1;
      try {
	FindLast.findLast(arr,y);
      } catch (NullPointerException e) {
        return;
      }
      fail ("NullPointerException expected");
   }

   @Test public void no_y() 
   {
      int arr[] = {4, 5, 6};
      int y = 8;
      assertEquals("No eights", -1, FindLast.findLast(arr,y));
   }

   @Test public void one_y() 
   {
      int arr[] = {2, 0, 7};
      int y = 0;
      assertEquals("One zero", 1, FindLast.findLast(arr,y));
   }

   @Test public void two_y() 
   {
      int arr[] = {8, 0, 0};
      int y = 0;
      assertEquals("Two zeros", 2, FindLast.findLast(arr,y));
   }

   @Test public void y_inFirstPos() 
   {
      int arr[] = {5, 5, 4};
      int y = 5;
      assertEquals("Two fives", 1, FindLast.findLast(arr,y));
   }

   @Test public void y_onlyInFirstPos() 
   {
      int arr[] = {5, 0, 0};
      int y = 5;
      assertEquals("One five", 0, FindLast.findLast(arr,y));
   }
}
