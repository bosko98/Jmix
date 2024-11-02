package com.company.cex_project_jmix.view.movie;

import com.company.cex_project_jmix.entity.Movie;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "movies/:id", layout = MainView.class)
@ViewController("Movie.detail")
@ViewDescriptor("movie-detail-view.xml")
@EditedEntityContainer("movieDc")
public class MovieDetailView extends StandardDetailView<Movie> {
}