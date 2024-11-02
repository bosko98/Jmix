package com.company.cex_project_jmix.view.seat;

import com.company.cex_project_jmix.entity.Seat;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "seats", layout = MainView.class)
@ViewController("Seat.list")
@ViewDescriptor("seat-list-view.xml")
@LookupComponent("seatsDataGrid")
@DialogMode(width = "64em")
public class SeatListView extends StandardListView<Seat> {
}