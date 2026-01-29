package Lecture11;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "IceCreAm";
        String ans = solution(s);
        System.out.println(ans);
    }

    // T.C.:- O(N)
    // S.C.:- O(N)
    public static String solution(String s) {
        char[] arr=s.toCharArray();
           int i=0,j=arr.length-1;
           while(i<j)
           {
               while(i<j && !checkVowel(arr[i]))
               {
                    i++;
               }

               while(j>i && !checkVowel(arr[j]))
               {
                   j--;
               }

               char temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j--;
           }

           return new String(arr);
    }

    public static boolean checkVowel(char ch)
    {
    return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
}
