package org.FastTrackIt.Restaurant;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantService {
    private final List<Restaurant> restaurants;

    public RestaurantService(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    List<Restaurant> getRestaurantsFromCity(String city) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (city == null || restaurant.city().equals(city)) {
                result.add(restaurant);
            }
        }
        return result;
    }

    List<Restaurant> getRestaurantsOfType(RestaurantType type) {
        List<Restaurant> result = new ArrayList<>();
        for (Restaurant restaurant : restaurants) {
            if (type == null || restaurant.type() == type) {
                result.add(restaurant);
            }
        }
        return result;
    }

    Map<Restaurant, RestaurantType> mapRestaurantToType() {
        Map<Restaurant, RestaurantType> result = new HashMap<>();
        for (Restaurant restaurant : restaurants) {
            result.put(restaurant, restaurant.type());
        }
        return result;
    }

    Restaurant getFromCityOfTypeWithMaxRating(String city, RestaurantType type) {
        Restaurant maxRestaurant = null;
        for (Restaurant restaurant : restaurants) {
            if (restaurant.city().equals(city)
                    && restaurant.type() == type
                    && (maxRestaurant == null || maxRestaurant.rating() < restaurant.rating())) {
                maxRestaurant = restaurant;
            }
        }
        return maxRestaurant;
    }
}
