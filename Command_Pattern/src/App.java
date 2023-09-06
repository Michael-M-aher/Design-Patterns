public class App {
    public static void main(String[] args) throws Exception {

        SmartBoard smartBoard = new SmartBoard();
        Appliance ref1 = new Refrigerator();
        Appliance ref2 = new Refrigerator();
        Appliance TV = new TV();

        smartBoard.setCommand(new TurnOFF(TV));
        smartBoard.executeCommand();

        smartBoard.setCommand(new TurnON(ref1));
        smartBoard.executeCommand();

        smartBoard.showHistory();

        smartBoard.setCommand(new TurnON(ref2));
        smartBoard.executeCommand();

        smartBoard.showHistory();
    }
}
