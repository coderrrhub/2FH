package Lecture11;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean ans = solution(s);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(1)
    public static boolean solution(String s) {
        int n = s.length();
        int start = 0, end = n-1;
        while(start < end) {
            // jab tak character na mil jaye increase/decrease the pointer
            // while(start is not character and start< end) {
            //     start++;
            // }

            while(!Character.isLetterOrDigit(s.charAt(start)) && start < end){
                start++;
            }

            // while(end is not character and end>start) {
            //     end --
            // }
            while(!Character.isLetterOrDigit(s.charAt(end)) && end > start){
                end--;
            }

            // if(start character != end character) return false
            if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
