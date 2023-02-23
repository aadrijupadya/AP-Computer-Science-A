public class SportsTest {
    public static void main(String[] args) {

        //1 a b c
        Ball ball = new Ball();
        Sports ballSport = new Ball();
        Activity activityBall = new Ball();
    
        /* 2 a b c
         * 2a (ball) can access all methods of the Ball class (isBig), Sport class (largeSport), and Activity interface (burnCalories and storeInts)
         * 2b (ballSport) can access all methods of Sport class (largeSport) and Activity interface (burnCalories and storeInts)
         * 2c (activityBall) can access all methods of only the Activity interface (burnCalories and storeInts)
         */

        
    }
    
}
