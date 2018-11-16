import java.util.Scanner;
public class Ceasar{
    public static void main(String[] args){
        System.out.print("\f");
        
        Scanner shift = new Scanner(System.in);
        System.out.println("Enter shift");
        int n = shift.nextInt();
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String str = input.nextLine().toUpperCase();
        
        int[] index = new int[str.length()];
        for(int i=0;i<str.length();i++){ 
            index[i] = ((int)str.charAt(i)+n-65)%26+65; //Character.getNumericValue
        }
        
        String word="";
        for(int i=0;i<str.length();i++){
            word = word + (char)index[i];
        }
        
        System.out.println(word);
    }
}