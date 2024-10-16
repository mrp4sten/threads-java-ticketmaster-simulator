package com.mrp4sten.org;

import com.mrp4sten.org.model.Artist;
import com.mrp4sten.org.model.City;
import com.mrp4sten.org.model.Event;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist();
        artist.setName("Sleep Token");

        City city = new City();
        city.setName("Mexico City");

        Event event = new Event();
        event.setName("Sleep Token - Live");
        event.setTicketsAvailable(1000);
        event.setArtist(artist);
        event.setCity(city);

        Thread t1 = new Thread(new TicketSeller(event, 500), "Reseller 1");
        Thread t2 = new Thread(new TicketSeller(event, 400), "Reseller 2");
        Thread t3 = new Thread(new TicketSeller(event, 100), "Reseller 3");
        Thread t4 = new Thread(new TicketSeller(event, 200), "Reseller 4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}