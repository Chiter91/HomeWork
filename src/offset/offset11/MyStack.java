package offset.offset11;

/*
Реализуйте свой собственный стек (очередь) со стандартными функциями push() и pop(),
а так же с дополнительной функцией max() за O(1)
 */

import java.util.Stack;

public class MyStack extends Stack<Integer> {
    private Stack<Integer> max;

    public MyStack() {
        this.max = new Stack<>();
    }

    public void push (int i) {
        if (i >= max()) {
            max.push(i);
        }
        super.push(i);
    }

    public Integer pop() {
        if (super.isEmpty()) {
            return 0;
        } else {
            int i = super.pop();

            if (i == max()) {
                max.pop();
                return i;
            } else
                return 0;
        }
    }

    private int max() {
        if (max.isEmpty()) {
            return 0;
        } else {
            return max.peek();
        }
    }

//    public static void main(String[] args) {
//        MyStack myStack = new MyStack();
//        myStack.push(10);
//        myStack.push( 9 );
//        myStack.push( 10 );
//        myStack.push( 15 );
//        myStack.push( 1 );
//        myStack.push( 9 );
//        myStack.push( 7 );
//        myStack.push( 16 );
//        System.out.println("Максимальный элемент у очереди " + myStack.toString() + " = " +myStack.max());
//        myStack.pop();
//        System.out.println(myStack.max.peek());
//        System.out.println("Максимальный элемент у очереди " + myStack.toString() + " = " +myStack.max());
//    }
}
