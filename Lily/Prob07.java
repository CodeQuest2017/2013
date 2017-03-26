
import java.util.Scanner;
import java.io.*;

public class Prob07{
  public static void main(String[] args)throws Exception{
    File file=new File("Prob07.in.txt");
    //System.out.println(file.exists());
    Scanner scan=new Scanner(file);
    String input = "";
    String[] inputArr;
    String nl = System.getProperty("line.separator");
    int[] amts = {0,0,0,0,0,0,0,0};
    int[] vals = {2000,1000,500,100,25,10,5,1};
    String[] names = {"TWENTY", "TEN", "FIVE", "ONE", "QUARTER", "DIME", "NICKEL", "PENNY"};
    double owe = 0;
    //int cur = 0;
    while (scan.hasNext()){
      //input+=""+scan.nextLine()+"/";
      input = scan.nextLine();
      owe = (int)((Double.parseDouble(input.split(", ")[1])*100)-(Double.parseDouble(input.split(", ")[0])*100));
      if(owe!=0){
          System.out.print("$"+(""+(owe/100.0)));
          for (int i=0;i<amts.length;i++){
              amts[i]= (int)(owe/vals[i]);
              owe-=((double)amts[i]*vals[i]);
              if (amts[i]>0){
                  System.out.print(", "+names[i]+"="+amts[i]);
              }
          }
      }
      else System.out.print("NONE");
      System.out.println();
    }
    //inputArr = input.split("/");
    
    //for (int i=0;i<inputArr.length
    
    
    //bw.write(content);
    
    scan.close();
  }
}