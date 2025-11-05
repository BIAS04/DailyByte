import java.util.Scanner;
public class KUMARISONALIUPADHYAY_6606175{
    public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the data:");
String data= scan.nextLine();
String spooky= toSpookyCase(data);
System.out.println("Spooky Case Data:"+ spooky);
scan.close();
    }

    public static String toSpookyCase(String input) {
       String result ="";
       boolean makeuppercase =true;
       for (int i= 0; i < input.length(); i++){
        char currdata= input.charAt(i);
        // char currtdata = 0;
        // rules
        if( currdata == '_'|| currdata == '-'){
            result=result +'~';
            continue;
        }
        else if(Character.isLetter(currdata)){
            if(makeuppercase){
                result=result + Character.toUpperCase(currdata);
                // result=result+Character.toUpperCase(currdata);
            }
            else{
                result=result+ Character.toLowerCase(currdata);
            }
            // makeuppercase=!makeuppercase;
        }
        else{
            result=result+ currdata;
        }
        makeuppercase=!makeuppercase;
       }
       return result;
    }
    
}
    