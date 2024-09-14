public class ReverseStringByFavTutor {
        public static void main(String[] args) {
            String stringExample = "FavTutor";
            System.out.println("Original string: " + stringExample);
            char[] str = stringExample.toCharArray();
            int n = str.length;
            for (int i = 0; i < n / 2; i++) {
                char temp = str[i];
                str[i] = str[n - i - 1];
                str[n - i - 1] = temp;
            }
            System.out.println("Reversed string: " + new String(str));
        }
    }

