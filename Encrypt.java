public class Encrypt{
    private int count = 0;
    private String chars = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private String str = "";
    public Encrypt(int a, int b, int c, int d){
        if(a+b>26){count += 8;}
        if(c+d>26){count += 4;}
        if(a+d>26){count += 2;}
        if(b+d>26){count += 1;}
        str += chars.substring(count,count+1);
        str += chars.substring((a+b)%27,(a+b)%27+1);
        str += chars.substring((c+d)%27,(c+d)%27+1);
        str += chars.substring((a+d)%27,(a+d)%27+1);
        str += chars.substring((b+d)%27,(b+d)%27+1);
        System.out.print(str);
    }
}