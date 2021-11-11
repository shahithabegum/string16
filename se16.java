import java.util.*;
import java.lang.*;
class se16
{
  public static void main(String arg[])
   {
     try
         {
            String s="This Excerise 1";
             int d=s.codePointCount(1,7);
	System.out.println(d);
	}
	catch(Exception e)
	{
	  System.out.println(e);
	}
       }
}