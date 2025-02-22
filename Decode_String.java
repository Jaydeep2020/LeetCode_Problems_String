import java.util.Stack;

class Main {
    public static void main(String[] args) {
        String s = "2[ek3[ab]]";
        String ans = decode(s);
        System.out.println(ans); // Output: "ekabababekababab"
    }

    public static String decode(String s) {
        Stack<Character> stk = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            if (ch != ']') {
                stk.push(ch);  // Push all characters except ']'
            } else {
                // Step 1: Build the substring inside the brackets
                StringBuilder sb = new StringBuilder();
                while (!stk.isEmpty() && stk.peek() != '[') {
                    sb.insert(0, stk.pop());  // Reverse order by inserting at start
                }
                stk.pop();  // Remove '['

                // Step 2: Get the number (handling multi-digit cases)
                int n = 0, base = 1;                                             //   taken base so it can handle multiple digits like 20[a]
                while (!stk.isEmpty() && Character.isDigit(stk.peek())) {
                    n = (stk.pop() - '0') * base + n;
                    base *= 10;
                }

                // Step 3: Repeat and push back to stack
                String repeatedStr = sb.toString().repeat(n);  // .repeat is String class method to repeat content of string n times.
                for (char c : repeatedStr.toCharArray()) {
                    stk.push(c);
                }
            }
        }

        // Build the final result from stack
        StringBuilder result = new StringBuilder();
        while (!stk.isEmpty()) {
            result.insert(0, stk.pop());  // Reverse order
        }

        return result.toString();
    }
}
