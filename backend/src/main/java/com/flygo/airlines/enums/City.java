package com.flygo.airlines.enums;

import lombok.Getter;

@Getter
public enum City {

    DELHI(Country.INDIA),
    MUMBAI(Country.INDIA),
    HYDERABAD(Country.INDIA),
    BHOPAL(Country.INDIA),
    PUNE(Country.INDIA),
    BENGALURU(Country.INDIA),
    CHENNAI(Country.INDIA),
    KOLKATA(Country.INDIA);


    private final Country country;

    City(Country country) {
        this.country = country;
    }

}
