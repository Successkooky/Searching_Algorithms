public class Dsa4 {
    //Linear search
    public static int Linearsearch(int numbers[], int key){
        for (int i = 0; i < numbers.length; i++) {
            if (key==numbers[i]){
                return i;
                
            }
            
            
            
        }
        return -1;    }
    public static void main(String args[]){
        int numbers[]={10,23,33,43,34,5,43,5,53,45,25};
        int key=53;
        int index=Linearsearch(numbers, key);
        if(index==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("The Element is at the index" + index);
        }
    }
}
