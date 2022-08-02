package Page299.UsingAbstractClasses;

public class TestBall {

    public static void main(String[] args) {
        //    Ball b = new Ball(); //error : Ball is abstract
        BaseBall bb = new BaseBall();
        bb.hit(2);

        Ball b = BallFactoryInstance.getBall("BaseBall");
        System.out.println("returned a " + b.toString());

        Ball sb = BallFactoryInstance.getBall("SoftBall");
        System.out.println("returned a " + sb.toString());
    }
}
