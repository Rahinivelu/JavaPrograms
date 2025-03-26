package CheatSheet;

public class CalculateNoOfDays {

    public static void main(String[] args) {
        int d1 = 10, m1 = 2, y1 = 2014;
        int d2 = 10, m2 = 3, y2 = 2015;

        int day1=countTheNumberOfDays(d1,m1,y1);
        int day2=countTheNumberOfDays(d2,m2,y2);


        System.out.println(day1);
        System.out.println(day2);
       System.out.println(Math.abs(day2-day1));

    }

    private static int countTheNumberOfDays(int d1, int m1, int y1) {
        int totalDays = 0;

        for(int i=0;i<y1;i++){
            totalDays+=isLeapYear(i)?366:365;
        }

        for(int i=1;i<m1;i++){
            totalDays+=WhichMonth(i, y1);
        }

        totalDays+=d1;


        return totalDays;
    }

    private static int WhichMonth(int i,int y1) {
        switch(i){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 2:
                return isLeapYear(y1)?29:28;

            case 4: case 6: case 9: case 11:
                return 30;
            default:
                    return 0;
        }
    }

    private static boolean isLeapYear(int i) {
        if((i%4==0 && i%100!=0)|| (i%400==0)){
            return true;
        }
        return false;
    }
}