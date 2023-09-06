
public class Runner implements IDeliveryOption {
    double fees;

    @Override
    public double calculateFees() {
        return fees;
    }

    @Override
    public void blaa() {
        fees = 10;

    }

}
