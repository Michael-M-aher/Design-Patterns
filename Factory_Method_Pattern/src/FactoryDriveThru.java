
public class FactoryDriveThru extends IFactory {

    @Override
    public IDeliveryOption create() {
        IDeliveryOption i = new DriveThru();
        i.blaa();
        return i;
    }

}
