package Page299.UsingAbstractClasses;

public class SoftBall extends Ball {

    @Override
    public int hit(int batSpeed) {
        System.out.println("Softball hit");
        return 1;
    }
}
