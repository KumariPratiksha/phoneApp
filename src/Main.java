public class Main {
    public static void main(String[] args) {

        LandLine l1 =  new LandLine("12345678");
        LandLine l2 = new LandLine("87654321");

        l1.callNumber("87654321");
        l2.recieveCall("87654321");
        System.out.println(l2.answerCall());



    }
}