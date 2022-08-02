package Page299.UsingAbstractClasses;

public class BaseBall extends Ball {

    @Override
    public int hit(int batSpeed) {
        System.out.println("Baseball hit");
        return 1;
    }
}
