class Cal{
    public static int myAtoi(String s){
        int i =0 ,  n=s.length();
        long result=0;
        int sign=1;
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && s.charAt(i)=='-' || s.charAt(i)=='+'){
            sign=(s.charAt(i)=='-') ? -1 : 1;
        }
        if(i<n && Character.isDigit(s.charAt(i))){
            int d=s.charAt(i) - '0';

        result=result*10+d;
        if(sign == 1 && result > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign == -1 && -result< Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        i++;
    }
    return (int) (sign * result);
}
}
public class StringAtoi {
    public static void main(String[] args) {
        System.out.println(Cal.myAtoi("42"));           // 42
        System.out.println(Cal.myAtoi("   -042"));      // -42
        System.out.println(Cal.myAtoi("1337c0d3"));     // 1337
        System.out.println(Cal.myAtoi("0-1"));          // 0
        System.out.println(Cal.myAtoi("words and 987"));
        
    }
    
}
