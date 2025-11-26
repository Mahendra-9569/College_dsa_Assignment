package String1;

public class validPalindromes {
    public static void main(String[] args) {
      /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

      Given a string s, return true if it is a palindrome, or false otherwise.

      Input: s = "A man, a plan, a canal: Panama"
      Output: true
      Explanation: "amanaplanacanalpanama" is a palindrome.
     */

         String s = "A man, a plan, a canal: Panama";
         String alphanumericStr = s.replaceAll("[^a-zA-Z0-9]", "");
         String str = alphanumericStr.toLowerCase();
         int se = 0;
         int ed = str.length()-1;
         while(se<ed){
        if(str.charAt(se) != str.charAt(ed)){
            System.out.println(false);
            return;
        }

        se++;
        ed--;
        }

        System.out.println(true); 
    }
}
