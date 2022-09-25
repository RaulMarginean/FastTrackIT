package interfaces;

public class Main {
    public static void main(String[] args) {
        Company fastTrackIt= new Company(new KFC(),10);

        for(int i =0; i<5; i++){
            fastTrackIt.sendFoodToEmlpoyees();
        }
        fastTrackIt.printReport();
    }
}
