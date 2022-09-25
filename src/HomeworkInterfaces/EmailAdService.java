package org.fasttrackit.HomeworkInterfaces;

public class EmailAdService implements AdvertismentProvider{
    @Override
    public void advertise(String message) {
        System.out.println(String.format("Sending and email '%s' via Email", message));
    }
}
