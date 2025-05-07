package Arrays;

public class prefixsum {
//     public static void maxsubarraysSum(int numbers[]){
//         int currSum =0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];
//         prefix[0] =  numbers[0];
//         for(int i=1; i<prefix.length; i++){
//             prefix[i] = prefix[i-1] + numbers[i];
//         }
//         for(int i=0; i<numbers.length; i++){
//             int start =i;
//             for(int j=i; j<numbers.length; j++){
//                 int end =j;
//                 // int currSum =0;
//                 // for(int k=i; k<=j; k++){
//                 //     currSum += numbers[k];
//                 currSum = start ==0? prefix[end]: prefix[end] - prefix[start -1];
                
//                 if(currSum > maxSum){
//                 maxSum = currSum;
//                 }
//         }
//     }
//     System.out.print("Sum of maximum subarrays: " + maxSum);
// }
    
 
//      public static void main(String args[]){
//         int numbers[] = {1,-2,6, -1, 3};
//         maxsubarraysSum(numbers);
//      }
    
 
public static void kadanes(int numbers[]){
    int ms = Integer.MIN_VALUE;
    int cs = 0;
    for(int i=0; i<numbers.length; i++){
        cs = cs + numbers[i];
        if(cs<0){
            cs = 0;
        }
        ms = Math.max(cs,ms);
    }
    System.out.println("Sum of maximum subarrays: " +ms);
}
public static void main(String args[]){
    int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
    kadanes(numbers);
}
}


