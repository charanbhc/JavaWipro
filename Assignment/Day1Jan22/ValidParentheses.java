import java.util.Stack;

class ValidParentheses {
    public static void main(String[] args) {
        String input = "{[()]}";
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if ("({[".indexOf(c) != -1) {
                stack.push(c);
            } else {
                if (stack.isEmpty() || ")]}".indexOf(c) != "({[".indexOf(stack.pop())) {
                    System.out.println("Invalid");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "Valid" : "Invalid");
    }
}
