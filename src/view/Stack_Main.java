package view;
import controller.Stack;
public class Stack_Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(5);
        st.push(40);
        st.push(-21);
        st.push(1);

        System.out.println(st.pop());
    }

}
