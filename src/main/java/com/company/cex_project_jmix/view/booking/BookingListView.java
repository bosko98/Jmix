package com.company.cex_project_jmix.view.booking;

import com.company.cex_project_jmix.entity.Booking;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "bookings", layout = MainView.class)
@ViewController("Booking.list")
@ViewDescriptor("booking-list-view.xml")
@LookupComponent("bookingsDataGrid")
@DialogMode(width = "64em")
public class BookingListView extends StandardListView<Booking> {
}