public class SubStringExam {
    public static void main(String[] args) {
        String strData1 = "I Love You";
        String strData3;


        strData3 = strData1.substring(7);
        System.out.println("strData3.subString(7)" + strData3);

        strData3 = strData1.substring(2, 5);
        System.out.println("strData3.subString(2, 5) -> " + strData3);
    }
}
