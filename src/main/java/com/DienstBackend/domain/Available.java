package com.DienstBackend.domain;

import javax.persistence.*;
import java.util.List;


/**
 * Created by iris on 21-11-16.
 */
@Entity
public class Available {

    @Id
    @Column(name = "available")
    private boolean available;

    @OneToMany
    private List<Shift> shiftList;


    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public List<Shift> getShiftList() {
        return shiftList;
    }

    public void setShiftList(List<Shift> shiftList) {
        this.shiftList = shiftList;
    }
}
