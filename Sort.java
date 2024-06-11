class Sort {
    public static void main(String [] args){
      int [] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, 10, -10};
      int  store;
      for(int j = 0; j < arr.length; j++){
            for(int i = 0; i < arr.length - 1; i++){
               if(arr[i] > arr[i + 1]){
                  store = arr[i];
                  arr[i] = arr[i + 1];
                  arr[i + 1] = store; 
            }
         }
      }
      for(int n : arr)  {
         System.out.println(n);
       }        
    }
}