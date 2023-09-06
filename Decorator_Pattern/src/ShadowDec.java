
public class ShadowDec extends ShapeDecorator {

    ShadowDec(Shape sh) {
        super(sh);
    }

    @Override
    public void drew() {
        s.drew();
        System.out.println(" Shadow");
    }

}
