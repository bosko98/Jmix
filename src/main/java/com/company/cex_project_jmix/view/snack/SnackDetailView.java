package com.company.cex_project_jmix.view.snack;

import com.company.cex_project_jmix.entity.Snack;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "snacks/:id", layout = MainView.class)
@ViewController("Snack.detail")
@ViewDescriptor("snack-detail-view.xml")
@EditedEntityContainer("snackDc")
public class SnackDetailView extends StandardDetailView<Snack> {
}