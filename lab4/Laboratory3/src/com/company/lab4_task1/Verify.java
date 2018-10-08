package com.company.lab4_task1;

public class Verify {

    //verify if parenthesis are a pair
    static boolean isMatchingPair(char character1, char character2) {
        if (character1 == '(' && character2 == ')')
            return true;
        else if (character1 == '{' && character2 == '}')
            return true;
        else if (character1 == '[' && character2 == ']')
            return true;
        else
            return false;
    }

    //verify if expression is correct
    static boolean verifyExpression(char exp[]) {
       //Empty stack
        stack st = new stack();

        //Verify if parenthesis are matching
        for (int i = 0; i < exp.length; i++) {

            //If the element is a starting parenthesis then push it in stack
            if (exp[i] == '{' || exp[i] == '(' || exp[i] == '[')
                st.push(exp[i]);

          // If element is an ending parenthesis then pop from stack and
            // check if the popped parenthesis is a matching pair
            if (exp[i] == '}' || exp[i] == ')' || exp[i] == ']') {

              // If there is no parenthesis return false
                if (st.isEmpty()) {
                    return false;
                }

             // if the popped element have no pair then the expression is wrong
                else if (!isMatchingPair(st.pop(), exp[i])) {
                    return false;
                }
            }
        }

       // if stack is empty return true, else there is a parenthesis without matching
        if (st.isEmpty())
            return true;
        else {
            return false;
        }
    }


}