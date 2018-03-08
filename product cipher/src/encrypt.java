import java.util.ArrayList;

public class encrypt {
    private  String key;
    public encrypt(String key){this.key=key;}
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
            /**asc=asc+addval;
            if(asc>126){
                asc=asc-126+32;
            }**/
            asc=asc^addval;
            String x=Character.toString ((char) asc);
            d=d+x;
        }
        System.out.println(d);
        return d;
    }
    public int getmaxpos(ArrayList<Integer> list){
        int limit=list.size();
        int max=-1;
        int maxpos=-1;
        for (int i = 0; i < limit; i++) {
            int value = list.get(i);
            if (value > max) {
                max = value;
                maxpos = i;
            }
        }
        return maxpos;

    }

    public ArrayList<Integer> getorder(){
        ArrayList<Integer> charvals=new ArrayList<Integer>();
        for (int i = 0, n = key.length(); i < n; i++) {
            char c = key.charAt(i);
            int asc=(int) c;
            charvals.add(asc);
        }
        int count=0;
        ArrayList<Integer> maxposs=new ArrayList<Integer>();
        while (count<=4){
            int maxpos=getmaxpos(charvals);
            charvals.set(maxpos,-1);
            maxposs.add(maxpos);
            count=count+1;
        }
        ArrayList<Integer> finalorder=new ArrayList<Integer>();
        int count1=0;
        while (count1<=4){
            int maxpos=getmaxpos(maxposs);
            maxposs.set(maxpos,-1);
            finalorder.add(maxpos);
            count1=count1+1;
        }
        return finalorder;
    }
    public String swap(String original){

        ArrayList<Integer> swaporder=getorder();
        String permutate="";
        while (original.length()>=6){
            permutate=permutate+swapsub(original.substring(0,5),swaporder);
            original=original.substring(5);
        }
        if(original.length()>0){
            permutate=permutate+original;
        }
        return permutate;
    }
    public String swapsub(String s,ArrayList<Integer> swaporder1){
        String originalString = s;

        char[] c = originalString.toCharArray();
        ArrayList<Character> swapped=new ArrayList<Character>();
        for(Integer i:swaporder1){
            swapped.add(c[i]);
        }
        String swappeds="";
        for(Character ch:swapped){
            String chs=Character.toString(ch);
            swappeds=swappeds+chs;
        }

        System.out.print(swappeds);
        return  swappeds;
    }



}

