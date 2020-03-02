import java.text.SimpleDateFormat;  
import java.util.Date;  
import java.util.*;
public class ExNum3{
   public static void main(String args[]){
   Scanner cs = new Scanner(System.in);
   System.out.println("Enter the date dd/mm/yyyy: ");
   String dateX = cs.nextLine();
   String date1 = dateX.replace("/",".");
   System.out.println(date1);

   //Date date1 = new Date();
   //String SimpleDateFormat;
   //SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");  
   
   }
}