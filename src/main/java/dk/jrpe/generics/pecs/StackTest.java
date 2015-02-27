package dk.jrpe.generics.pecs;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorperss
 */
public class StackTest {
    public static void main(String[] args) {
        StackNonPECSGeneric<Integer> stack1 = new StackNonPECSGeneric<>();
        stack1.push(new Integer("1"));
        stack1.push(new Integer("2"));
        stack1.push(new Integer("3"));
        stack1.push(new Integer("4"));

        popAll(stack1);
        
        StackNonPECSGeneric<Number> stack2 = new StackNonPECSGeneric<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(new Integer("1"));
        list1.add(new Integer("2"));
        list1.add(new Integer("3"));
        list1.add(new Integer("4"));
        
        //stack2.pushAll(list); DOE NOT COMPILE
        
        StackPECSGeneric<Number> stack3 = new StackPECSGeneric<>();
        
        stack3.pushAll(list1);
        stack3.push(new Long("1"));
        
        popAll(stack3);
        
        List<Number> list2 = new ArrayList<>();
        stack3.popAll(list2);

        StackPECSGeneric<String> stack4 = new StackPECSGeneric<>();
        stack4.push("1 String");
        
        popAll(stack4);
}
    
    private static <E> void popAll(StackGeneric stack) {
        int size = stack.getSize();
        for (int i = 0; i < size; i++) {
            E element = (E)stack.pop();
            System.out.println("Type : " + element.getClass() + " Value : " + element);
        }
    }
}
