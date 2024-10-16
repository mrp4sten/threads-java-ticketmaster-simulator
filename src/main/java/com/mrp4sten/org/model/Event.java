package com.mrp4sten.org.model;

import java.util.Date;

import lombok.Data;

@Data
public class Event {
  private String name;
  private Artist artist;
  private City city;
  private Date date;
  private int ticketsAvailable;

  public synchronized boolean sellTicket(int quantity) {
    if (this.ticketsAvailable >= quantity) {
        this.ticketsAvailable -= quantity;
        System.out.println(Thread.currentThread().getName() + 
            " Buy " + quantity + " tickets. Available: " + this.ticketsAvailable);
        return true;
    } else {
        System.out.println(Thread.currentThread().getName() + 
            " Try buy " + quantity + " tickets, but is not available.");
        return false;
    }
}

}
