package CheatSheet;

public class program23 {

        public static  int value(char ch) {
            if (ch == 'I')
                return 1;
            if (ch == 'V')
                return 5;
            if (ch == 'X')
                return 10;
            if (ch == 'L')
                return 50;
            if (ch == 'C')
                return 100;
            if (ch == 'D')
                return 500;
            if (ch == 'M')
                return 1000;

            return 0;
        }

        public static int romanToInt(String s) {

            if (s.length() == 0)
                return 0;

            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                int s1 = value(s.charAt(i));

                if (i + 1 < s.length()) {
                    int s2 = value(s.charAt(i + 1));
                    if (s1 >= s2)
                        sum +=s1;
                    else{
                        sum += (s2 - s1);
                        i++;
                    }
                } else
                    sum+=s1;

            }

            return sum;
        }

        public static void main(String[] args){
            String word="III";
            int value=romanToInt(word);
            System.out.println(value);
    }
}
