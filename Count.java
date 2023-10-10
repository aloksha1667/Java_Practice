public class Count {
    public static void main(String[] args) {
        String x = "cotmacelectronic";

        int count = 0;
        for(int i=0; i<x.length(); i++){
            if(x.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Word Count = " + count);

    }
    
}
