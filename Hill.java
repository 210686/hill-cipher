import java.util.Scanner;
public class Hill{
    public static void main(String[] args){
        System.out.print("\f");
        Scanner word = new Scanner(System.in).useDelimiter( "(\\b|\\B)" );
        
        System.out.print("Enter word ");
        String str = word.nextLine().toUpperCase();
        
        System.out.println("Encrypt = e  Decrypt = d");
        String EncDec = "";
        
        while(!EncDec.equalsIgnoreCase("e")&&!EncDec.equalsIgnoreCase("d")){
            EncDec = word.nextLine();
        }
        Numerate num = new Numerate(str,EncDec);
    }
}