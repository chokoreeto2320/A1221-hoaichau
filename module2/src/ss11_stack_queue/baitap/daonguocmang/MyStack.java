package ss11_stack_queue.baitap.daonguocmang;

import java.util.Stack;

public class MyStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<10;i++){
            stack.push(i);
        }
        System.out.println("mang so nguyen luc chua dao nguoc : "+stack);
        Stack<Integer> stack1=new Stack<>();
        while(stack.size()>0){
            stack1.push(stack.remove(0));
        }
        while (stack1.size()>0){
            stack.add(stack1.pop());
        }
        System.out.println("mang so nguyen luc sau khi  dao nguoc : "+stack);
    }
}
