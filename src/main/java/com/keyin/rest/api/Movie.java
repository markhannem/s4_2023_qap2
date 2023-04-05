package com.keyin.rest.api;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.util.Date;

@Entity
public class Movie {
    @Id
    @SequenceGenerator(name = "movie_sequence", sequenceName = "movie_sequence", allocationSize = 1, initialValue=1)
    @GeneratedValue(generator = "movie_sequence")
    private long id;
    private String title;
    private String director;
    private Date releaseDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
