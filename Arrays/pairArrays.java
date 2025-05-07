package Arrays;

public class pairArrays {
//     public static void totalpairs(int numbers[]){
//         int tp =0;
//         for(int i=0; i<numbers.length; i++ ){
//            ;
//             int curr = numbers[i];
//             for(int j=i+1; j<numbers.length; j++){
//                 System.out.print("(" +curr+ "," +numbers[j] + ")");
              
//             }
//             System.out.println();
//             tp++;
//         }
//         System.out.println("total pairs is: " + tp);
//         System.out.println();
//     }
//     public static void main(String args[]){
//         int numbers[] = {2,4,6,8,10};
//         totalpairs(numbers);
//     }
    
//
public static void printSubarrays(int numbers[]){
    int tp=0;
    for(int i= 1; i<numbers.length; i++){
        int start = i;
        for(int j=i; j< numbers.length; j++){
            int end=j;
            for(int k =start; k<=end; k++) {
                System.out.print(numbers[k]+ " ");
            }
            tp++;
            System.out.println();
            }  
           System.out.println();    
        }
        System.out.print("total no. of subarrays: " + tp);
    }

public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        printSubarrays(numbers);
}
}
