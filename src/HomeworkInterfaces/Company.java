package HomeworkInterfaces;

public class Company {
    private AdvertismentProvider advertismentProvider;

    public Company(AdvertismentProvider advertismentProvider) {
        this.advertismentProvider = advertismentProvider;
    }
    public void releaseNewFeature(){
        advertismentProvider.advertise("We have released a new Feature");
    }
}
