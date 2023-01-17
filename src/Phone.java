public interface Phone {
    void powerOn();
     void callNumber( String phoneNumber);
    void recieveCall(String phoneNumber);
    boolean answerCall();
    boolean isRinging();

}
