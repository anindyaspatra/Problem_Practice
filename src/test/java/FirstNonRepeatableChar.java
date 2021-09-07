public class FirstNonRepeatableChar {

    /**
     * @author
     * @param args
     * Problem Statement - Find The First Non Repeatable Character using core java - don't use any Map or list or set
     */

    public static void main(String[] args) {
        //String s = "aabbbccdeeffggm";
        String s = "abcd";
        FirstNonRepeatableChar testClass = new FirstNonRepeatableChar();
        testClass.getNonRepeatableChar(s);
    }

    public void getNonRepeatableChar(String s) {
        int index = 0;
        int count = 0;
        char tChar = s.charAt(index);
        while (index < s.length() - 1) {
            if (tChar == s.charAt(index + 1)) {
                index++;
                count++;
            } else {
                if (count == 0) {
                    System.out.println(tChar);
                    break;
                } else {
                    tChar = s.charAt(index + 1);
                    index++;
                    count = 0;
                }
            }
            if(index==s.length()-1 && s.charAt(index)!=s.charAt(index-1)){
                System.out.println(s.charAt(index));
            }else if(index==s.length()-1 && s.charAt(index)==s.charAt(index-1))
                System.out.println("No Non Repeating character");
        }
    }
}
