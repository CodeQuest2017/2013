
import java.util.*;
import java.io.*;

public class Problem05{
    public static void main(String[] args)throws Exception{
        File file=new File("Problem05.in.txt");
        Scanner scan=new Scanner(file);
        String input = "";
        
        String[] present = scan.nextLine().split("/");
        String[] newDate;
        String soft;
        int days = 0;
        int[] monthDays = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        while (scan.hasNextLine()){
            days = 0;
            input=""+scan.nextLine();
            newDate = input.split(":")[1].split("/");
            soft = input.split(":")[0];
            
            while(!Arrays.toString(present).equals(Arrays.toString(newDate))){
                if (Integer.parseInt(newDate[1])>=monthDays[Integer.parseInt(newDate[0])-1]){
                    newDate[1]="1";
                    if(Integer.parseInt(newDate[0])>11){
                        newDate[0] = "1";
                        newDate[2] = ""+(Integer.parseInt(newDate[2])+1);
                    }
                    else newDate[0] = ""+(Integer.parseInt(newDate[0])+1);
                }
                else newDate[1]=""+(Integer.parseInt(newDate[1])+1);
                days++;
            }
            
            if (days>=180){
                System.out.println(soft+", "+days);
            }
        }
        
        scan.close();
    }
}
