public class stringManipulation {
    public static void Man(String sc){
        if (sc.length() < 1){
            System.out.println("Invalid String!");
            return;
        }
        if (sc.length() <= 2){
            System.out.println(sc+sc+sc);
        }
        else if (sc.length() > 2){
            System.out.println(sc.charAt(0)+""+sc.charAt(1)+sc+sc.charAt(0)+sc.charAt(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Man(str);
    }
}
