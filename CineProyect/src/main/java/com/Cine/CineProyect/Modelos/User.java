package com.Cine.CineProyect.Modelos;

import java.util.Date;

public class User {
    String id;
    String name;
    Date born_date;

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBorn_date() {
        return born_date;
    }

    public void setBorn_date(Date born_date) {
        this.born_date = born_date;
    }
}
