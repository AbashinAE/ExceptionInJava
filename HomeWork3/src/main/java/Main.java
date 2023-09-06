public class Main {
    public static void main(String[] args) {
        AppData test = new AppData();
        IFileWrite writer = new DataFileWrite();
        try {
            test.parseData();
            writer.write(test.getFirstName(), test.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
