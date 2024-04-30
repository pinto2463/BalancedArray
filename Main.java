import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the parentheses expression: ");
        String input=scan.nextLine();

        if (balanced(input)){
            System.out.println("Balanced");

        }
        else {
            System.out.println("Not balanced");
        }
    }

    public static boolean balanced(String input){

        Stack<Character> stack =new Stack<>();

        for (int i=0; i<input.length();i++){
            if (input.charAt(i)=='('||input.charAt(i)=='['||input.charAt(i)=='{'){
                stack.push(input.charAt(i));
            }
            else if (input.charAt(i)==')'||input.charAt(i)==']'||input.charAt(i)=='}'){
                if (stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if ((input.charAt(i)==')'&&top!='(')||(input.charAt(i)==']'&&top!='[')||(input.charAt(i)=='}'&&top!='{')){
                    return false;
                }
            }
        }



        return stack.isEmpty();
    }
}
