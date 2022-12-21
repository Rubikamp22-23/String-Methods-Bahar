public class DrivingAllow {
    public static void main(String[] args) {
        // This program says that are you allowed to drive or not.
        String userName = "Bahar";
        int thisYear= 2022 , birthYear = 2000;
        int userAge = thisYear-birthYear;
        if (userAge >=18){
            System.out.println(userName+", You are allowed to drive:)");
        }
        else {
            int yearsToDrive = 18 - userAge;
            System.out.println(userName+",  You aren't allowed to drive.\n Come back "+ yearsToDrive+" years later. ");
        }
    }
}
