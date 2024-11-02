package com.company.cex_project_jmix.view.movie;

import com.company.cex_project_jmix.entity.Movie;
import com.company.cex_project_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "movies", layout = MainView.class)
@ViewController("Movie.list")
@ViewDescriptor("movie-list-view.xml")
@LookupComponent("moviesDataGrid")
@DialogMode(width = "64em")
public class MovieListView extends StandardListView<Movie> {
}