package palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
    String numero = String.valueOf(x);
    String invertido = "";

    for (int i = numero.length() - 1; i >= 0; i--) {
        invertido += numero.charAt(i);
    }

    return numero.equals(invertido);
 }
}
