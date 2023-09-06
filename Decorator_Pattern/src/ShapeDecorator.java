
public abstract class ShapeDecorator implements Shape{

    protected Shape s;    
    ShapeDecorator(Shape sh){
        s=sh;
    }
    @Override
    public abstract void drew();

}
