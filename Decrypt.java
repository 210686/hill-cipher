public class Decrypt{
    private String chars = " ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    private String str = "";
    public Decrypt(int up, int one, int two, int three, int four){
        if(up>=8){up-=8; one+=27;}
        if(up>=4){up-=4; two+=27;}
        if(up>=2){up-=2; three+=27;}
        if(up==1){four+=27;}
        int d = (three+four-one)/2;
        int c = two-d;
        int b = four-d;
        int a = three-d;
        str += chars.substring(a,a+1);
        str += chars.substring(b,b+1);
        str += chars.substring(c,c+1);
        str += chars.substring(d,d+1);
        System.out.print(str);
    }
}