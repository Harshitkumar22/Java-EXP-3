public class ReverseWords{
    public static String reverseWords(String s){  //static method reverseWords takes a string s as input.
        String[] words=s.split(" ");
        StringBuilder reversed=new StringBuilder();
        
        for(int i = words.length-1; i>=0; i--){
            reversed.append(words[i]);
            if (i!=0){
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }

    public static void main(String[] args) {
        String s = "This is decent";
        System.out.println("Input: " + s);
        System.out.println("Output: " + reverseWords(s));
    }
}
