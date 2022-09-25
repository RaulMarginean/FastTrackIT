package org.fasttrackit.HomeworkInterfaces;

public class PrintAdService implements AdvertismentProvider{
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Printing newspapper with ad '%s' ", message));
    }
}
