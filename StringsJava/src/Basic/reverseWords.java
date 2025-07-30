package Basic;
class BruteSolution{
    public static String reverse(String s){
        String ns="";
        for (int i = s.length()-1 ; i>-1;i--){
            ns+=s.charAt(i);
        }

        return ns;
    }


    public static String reverseWords(String s) {
        int front=0,tail=s.length()-1;
        s=" "+s;
        String ns="";
        String ans="";
        for(int i = s.length() - 1 ;i > -1 ; i--) {
            ns+=s.charAt(i);
            if(s.charAt(i) == ' '){
                ans=ans.concat(reverse(ns));
                ns="";
            }
        }
        return ans.replaceAll("\\s+", " ");
    }
}


class OptimizedSolution{
     protected static String reverseWords(String s){
         String[] words = s.trim().split("\\s+");

         StringBuilder ans=new StringBuilder();

         for (int i = words.length -1 ; i>=0;i--){
             ans.append(words[i]);

             if(i>0) ans.append(" ");
         }
         return ans.toString();
     }
}
class reverseWords {
    public static void main(String[] args) {
        String s="the sky is blue";
        System.out.print(OptimizedSolution.reverseWords(s));

    }
}

