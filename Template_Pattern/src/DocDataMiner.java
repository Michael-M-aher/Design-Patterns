
public class DocDataMiner extends DataMiner {

    @Override
    void openFile(String s) {
        System.out.println("openFile Doc");

    }

    @Override
    void extractData(String s) {
        System.out.println("extractData Doc");

    }

    @Override
    void parseData() {
        System.out.println("parseData Doc");

    }

    @Override
    void closeFIle(String s) {
        System.out.println("closeFIle Doc");

    }
}
