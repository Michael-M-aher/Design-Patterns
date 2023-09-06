
public abstract class IFactory {
    abstract IDeliveryOption create();

    double calculateFees() {
        IDeliveryOption i = create();
        return i.calculateFees();
    }
}
