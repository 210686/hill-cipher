public class Numerate{
    private String chars = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public Numerate(String str, String EncDec){
        System.out.println();
        if(EncDec.equals("e")){
            while(str.length()%4!=0){str=str+" ";}
            int index[] = new int[str.length()];
            for(int i=0;i<str.length();i++){
                index[i] = chars.indexOf(str.substring(i,i+1));
            }
            int l=str.length()/4;
            for(int i=0;i<l;i++){Encrypt enc = new Encrypt(index[4*i],index[4*i+1],index[4*i+2],index[4*i+3]);}
        }
        
        else{
            int index[] = new int[str.length()];
            for(int i=0;i<str.length();i++){
                index[i] = chars.indexOf(str.substring(i,i+1));
            }
            int l=str.length()/5;
            for(int i=0;i<l;i++){Decrypt dec = new Decrypt(index[5*i],index[5*i+1],index[5*i+2],index[5*i+3],index[5*i+4]);}
        }
    }
}