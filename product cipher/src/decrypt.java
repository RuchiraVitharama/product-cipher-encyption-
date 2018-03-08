import java.util.ArrayList;

public class decrypt {
    private  String key;
    public decrypt(String key){this.key=key;}

    public String Substitute(String sr){
        int addval=0;
        String s=key;
        for (int i = 0, n = s.length(); i < n; i++) {
            char c = s.charAt(i);
            int asc=(int) c;
            addval=addval+c;
        }
        if (addval>94){
            addval=addval%94;
        }
        String d="";
        for (int i = 0, n = sr.length(); i < n; i++) {
            char c = sr.charAt(i);
            int asc=(int) c;
            /**asc=asc-addval;
            if(asc<32){
                asc=asc+126-32;
            }**/
            asc=asc^addval;
            String x=Character.toString ((char) asc);
            d=d+x;
        }
        System.out.println(d);
        return d;
    }

    public String swapbsub(String s,ArrayList<Integer> swappedorder1){
        String originalString = s;

        char[] c = originalString.toCharArray();

        char[] swappedb=new char[5];
        for(int i=0;i<=4;i=i+1){
            char now=s.charAt(i);
            Integer n=swappedorder1.get(i);
            swappedb[n]=now;
        }
        String swappedbs="";
        for(Character ch:swappedb){
            String chs=Character.toString(ch);
            swappedbs=swappedbs+chs;
        }

        System.out.print(swappedbs);
        return  swappedbs;
    }

    public String swapb(String swapped,ArrayList<Integer> swappedorder1){

        String permutate="";
        while (swapped.length()>=6){
            permutate=permutate+swapbsub(swapped.substring(0,5),swappedorder1);
            swapped=swapped.substring(5);
        }
        if(swapped.length()>0){
            permutate=permutate+swapped;
        }
        return permutate;
    }

}
