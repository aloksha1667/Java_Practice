public class Reverse {
    public static void main(String[] args) {
        String x = "cotmacelectronic";
        String reverseStr = "";
        for(int i=x.length()-1; i>=0; i--){
            reverseStr += x.charAt(i);  // +=  right hand side to left hand side

        }
        System.out.println(x);
        System.out.println( reverseStr);
    }
    
}
