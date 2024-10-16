package com.mrp4sten.org;

import com.mrp4sten.org.model.Event;

public class TicketSeller implements Runnable {
  private Event event;
  private int ticketsToBuy;

  public TicketSeller(Event event, int ticketsToBuy) {
    this.event = event;
    this.ticketsToBuy = ticketsToBuy;
  }

  @Override
  public void run() {
    event.sellTicket(ticketsToBuy);
  }
}
