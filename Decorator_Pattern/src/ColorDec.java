
public class ColorDec extends ShapeDecorator {

    ColorDec(Shape sh) {
        super(sh);
    }

    @Override
    public void drew() {
        s.drew();
        System.out.println("color");
    }

}
