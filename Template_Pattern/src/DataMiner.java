
public abstract class DataMiner {

    // this is the template function
    final void mine(String s) {
        openFile("");
        extractData("s");
        parseData();
        analyzeData("s");
        sendReport("s");
        closeFIle("s");
    }

    abstract void openFile(String s);

    abstract void extractData(String s);

    abstract void parseData();

    void analyzeData(String s) {
        System.out.println("analyzeData");
    }

    void sendReport(String s) {
        System.out.println("sendReport");
    }

    abstract void closeFIle(String s);
}
