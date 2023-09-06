
public class TurnON implements Command {
    Appliance app;

    TurnON(Appliance a) {
        this.app = a;
    }

    @Override
    public void execute() {
        app.turnOn();
    }
}
