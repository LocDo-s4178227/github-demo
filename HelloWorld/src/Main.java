import manager.ClaimManager;
import service.DataManager;

public class Main {

    public static void main(String[] args) {

        ClaimManager manager = new ClaimManager();

        // Load data when application starts
        DataManager.loadData(manager);

        // Menu của chương trình ở đây
    }
}