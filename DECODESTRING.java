class Solution {
    public String decodeString(String str) {
        Stack<Character> s = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == ']') {
                StringBuilder decodedString = new StringBuilder();
                while (!s.isEmpty() && s.peek() != '[') {
                    decodedString.insert(0, s.pop());
                }
                if (!s.isEmpty()) {
                    s.pop(); 
                }
                StringBuilder num = new StringBuilder();
                while (!s.isEmpty() && Character.isDigit(s.peek())) {
                    num.insert(0, s.pop());
                }
                int numberOfTimes = Integer.parseInt(num.toString());
                String repeated = decodedString.toString().repeat(numberOfTimes);
                for (char t : repeated.toCharArray()) {
                    s.push(t);
                }
            } else {
                s.push(c);
            }
        }
        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.reverse().toString();
    }
}
