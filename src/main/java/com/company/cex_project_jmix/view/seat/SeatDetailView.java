package com.company.cex_project_jmix.view.seat;

import com.company.cex_project_jmix.entity.Seat;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "seats/:id", layout = MainView.class)
@ViewController("Seat.detail")
@ViewDescriptor("seat-detail-view.xml")
@EditedEntityContainer("seatDc")
public class SeatDetailView extends StandardDetailView<Seat> {
}