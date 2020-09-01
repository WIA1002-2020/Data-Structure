/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author muham
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> a = new Stack<>();
        System.out.println("Insert 3 nodes into the stack");
        a.push("One");
        a.push("Two");
        a.push("Three");
        System.out.println("The number of elements in the stack is "+ a.getSize());
        a.showStack();
        System.out.println("\nPop one node from the stack");
        a.pop();
        System.out.println("The number of elements in the stack is "+ a.getSize());
        a.showStack();
        System.out.println("\nThe elements on the top of the stack is "+ a.peek());
        a.showStack();
        System.out.println("\n");
        
        Stack<String> b = new Stack<>();
        String[] infix = {"A+B", "A+B*C", "(A+B)*(C-D)", "(A*B+C)/D+E"};
        for (int i = 0; i < infix.length; i++) {
            System.out.println("The infix expression : "+ infix[i]);
            System.out.println("The postfix expression : "+ b.infixToPostfix(infix[i]));
            System.out.println("The prefix expression : "+ b.infixToPrefix(infix[i]));
            System.out.println("");           
        }
        System.out.println("\n");
        
        Stack<String> c = new Stack<>();
        String[] infixValue = {"5+9", "4+3*2", "(3+2)*(7-4)", "(5*6+2)/4+7"};
        for (int i = 0; i < infixValue.length; i++) {
            System.out.println("The infix expression : "+ infixValue[i]);
            System.out.println("The postfix expression : "+ c.infixToPostfix(infixValue[i]));
            System.out.println("The prefix expression : "+ c.infixToPrefix(infixValue[i]));
            System.out.println("The result using postfix expression : "+ c.postfixEvaluation(c.infixToPostfix(infixValue[i])));
            System.out.println("The result using prefix expression : "+ c.prefixEvaluation(c.infixToPrefix(infixValue[i])));
            System.out.println("");           
        }
    }
    
}
