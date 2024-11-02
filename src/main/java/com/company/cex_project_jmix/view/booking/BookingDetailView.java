package com.company.cex_project_jmix.view.booking;

import com.company.cex_project_jmix.entity.Booking;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "bookings/:id", layout = MainView.class)
@ViewController("Booking.detail")
@ViewDescriptor("booking-detail-view.xml")
@EditedEntityContainer("bookingDc")
public class BookingDetailView extends StandardDetailView<Booking> {
}