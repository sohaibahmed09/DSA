package Arrays;

public class LinearSearch {
public static int linearSearch(int numbers[],int key){
    for(int i=0; i<numbers.length; i++){
    if(numbers[i] == key )
        return i;
    }
    return -1;
}
public static void main(String arg[]){
    int numbers[] = {2,4,6,10,12,13,};
    int key =8;
    int index = linearSearch(numbers,key);
    if(index==-1){
        System.out.println("Index is not found");
    }
    else{
        System.out.println("Index is found at " +index);
    }
}
    
}
