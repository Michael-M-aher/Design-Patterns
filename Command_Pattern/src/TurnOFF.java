
public class TurnOFF implements Command {
    Appliance app;

    TurnOFF(Appliance a) {
        this.app = a;
    }

    @Override
    public void execute() {
        app.turnOff();
    }

}
