package extra1;
//           Write  java program which remove extra space from both side “    I love java    ”
//                   Expected output: “I love java”
public class Two {
    static String name = "     I Love Java     ";

    public static void main(String[] args) {
        System.out.println(name.trim());
    }
}
