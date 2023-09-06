
public class FactoryRunner extends IFactory {

    @Override
    public IDeliveryOption create() {
        IDeliveryOption i = new Runner();
        i.blaa();
        return i;
    }

}
