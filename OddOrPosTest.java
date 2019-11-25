import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest
{
   @Test public void xnull() 
   {
      int arr[] = null;
      try {
	OddOrPos.oddOrPos(arr);
      } catch (NullPointerException e) {
        return;
      }
      fail ("NullPointerException expected");
   }

   @Test public void no_odd_no_pos() 
   {
      int arr[] = {-4, -6, -8};
      assertEquals("No odds no pos", 0, OddOrPos.oddOrPos(arr));
   }

   @Test public void onlyPos() 
   {
      int arr[] = {2, 8, 6};
      assertEquals("Only pos", 3, OddOrPos.oddOrPos(arr));
   }

   @Test public void ods_and_pos() 
   {
      int arr[] = {1, 3, 8};
      assertEquals("Ods and pos", 3, OddOrPos.oddOrPos(arr));
   }

   @Test public void onlyOds() 
   {
      int arr[] = {-5, -3, -7};
      assertEquals("Only ods", 3, OddOrPos.oddOrPos(arr));
   }

   @Test public void pos_and_negative_ods() 
   {
      int arr[] = {8, -3, -7};
      assertEquals("Only negative ods", 3, OddOrPos.oddOrPos(arr));
   }
}
