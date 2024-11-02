package com.company.cex_project_jmix.view.snack;

import com.company.cex_project_jmix.entity.Snack;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "snacks", layout = MainView.class)
@ViewController("Snack.list")
@ViewDescriptor("snack-list-view.xml")
@LookupComponent("snacksDataGrid")
@DialogMode(width = "64em")
public class SnackListView extends StandardListView<Snack> {
}