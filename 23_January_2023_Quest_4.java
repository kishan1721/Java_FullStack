public class chocolateBars {
    public static int smallBar(int small, int big, int goal){
        int sm = small;
        if (small+big == goal){
            return small;
        }
        else if (small+big < goal){
            return -1;
        }
        else if (big == goal){
            return 0;
        }
        else {
            while (sm+big != goal){
                sm--;
            }
            return sm;
        }
    }
    public static void main(String[] args) {
        int small = 4;
        int big = 1*5;
        int goal = 7;
        System.out.println(smallBar(small,big,goal));
    }
}