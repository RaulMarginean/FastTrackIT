package HomeworkInterfaces;


public class FacedbookAdService implements AdvertismentProvider{
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Posting '%s' to Facebook", message));
    }
}
