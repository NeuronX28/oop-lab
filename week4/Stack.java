import java.util.Scanner;

public class Stack {
    static Scanner sc = new Scanner(System.in);
    static int top;
    static int stack[];
    static int element;

    Stack() {
        stack = new int[10];
        top = -1; 
    }

    static void push() {
        if (top == stack.length - 1) {
            System.out.println("Stack Overflow. Cannot push more elements.");
        } else {
            System.out.println("Enter the element to push:");
            element = sc.nextInt();
            stack[++top] = element;
        }
    }
    static void pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow.No elements to pop.");
        }
            else
            {
            
            System.out.println("The element popped is "+stack[top]);
            top--;
            }
        
    }
    void display() {
        if (top == -1) {
            System.out.println("NO ELEMENTS TO DISPLAY!!!");
        } else {
            System.out.print("{");
            for (int i = 0; i < top; i++) {
                System.out.print(stack[i] + ", ");
            }
            System.out.println(stack[top] + "}");
        }
    }
    

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        

        Stack myStack = new Stack();
        int ch;
        do
        {
            System.out.println("Enter your choice:\n1.Push\n2.POP\n3.Display\n4.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                
                    push();
                
                break;
                case 2:
                
                    pop();
                
                break;
                case 3:
                
                myStack.display();
            
                break;
                case 4:
                if(ch==4)
                {
                    System.out.println("Invalid choice!!");
                }
        

            }
        }while(ch!=4);
        
        sc.close();
    }
}