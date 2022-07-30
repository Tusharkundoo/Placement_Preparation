class Solution {
   public char findTheDifference(String s, String t) {
        int sumS = 0, sumT = 0;
        char ch;

        for (int i = 0; i <s.length(); i++) {
            sumS += Integer.valueOf(s.charAt(i));
        }

        for (int j = 0; j < t.length(); j++) {
            sumT += Integer.valueOf(t.charAt(j));
        }


        ch = (char) (sumT - sumS);
        return ch;
    }
}