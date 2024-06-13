import java.util.Scanner;
 class Stack{  
    public static int [] stack = new int [5];
    public static int top = -1;
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        boolean loop = true;
        while(loop){
            int input = sc.nextInt();
            switch(input){
                case 0: push();
                break;
                case 1: pop();
                break;
                case 2: for(int i = 0; i <= top; i++){
                    System.out.println(stack[i]);
                };
                break;
                case 3:
                loop = false;
                break;               
            }
        }
      System.out.println("exit");  
    }
      public static void push(){
        Scanner sc = new Scanner(System.in);
        if(top != stack.length){
            top += 1;
            stack[top] = sc.nextInt();
            System.out.println("int is pushed");
            System.out.println(top);
        }else{
            System.out.print("stack is full");
        }
    }
            
    public static void pop(){
        if(top >= 0){
            top -= 1;
            System.out.println("int is pulled");
            System.out.println(top);
        }else{
            System.out.println("stack is empty");
        }    
    }
}