package Page299.UsingAbstractClasses;

class BallFactoryInstance {

    public static Ball getBall(String t) {
        if (t.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        }
        if (t.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }
        return null;
    }
}
