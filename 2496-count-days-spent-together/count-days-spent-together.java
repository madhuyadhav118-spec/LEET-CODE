class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        
        int days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int a1 = countOfDays(arriveAlice,days);
        int a2 = countOfDays(leaveAlice,days);

        int b1 = countOfDays(arriveBob,days);
        int b2 = countOfDays(leaveBob,days);

        int count = 0;
        for(int i =1; i <= 365; i++) {
            boolean a = (i >= a1 && i <= a2);
            boolean b = (i >= b1 && i <= b2);

            if(a && b) {
                count++;
            }
        }
        return count;
    }
    private int countOfDays(String s,int a[]) {
        String s1[] = s.split("-");

        int month = Integer.parseInt(s1[0]);
        int day = Integer.parseInt(s1[1]);

        for(int i = 0; i < month-1; i++) {
            day += a[i];
        }
        return day;
    }
}