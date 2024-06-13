class BinarySearch{
    public static void main(String [] args){
        int [] arr = {5,7,8,10,13,22,45,89,100,112,333,555,665,900};
        int search = 665;
        int startIndex = 0;
        int lastIndex = arr.length - 1;
        int midIndex = (startIndex + lastIndex)/2;
        while(arr[midIndex] != search ){
          if(search < arr[midIndex]){
            midIndex -= 1;

          }else if(search > arr[midIndex]){
            midIndex +=1;

          } 
        }
        
      System.out.println(midIndex);    
    }
}