package com.DienstBackend.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

/**
 * Created by iris on 21-11-16.
 */
@Entity
@Table
public class Shift {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shiftId")
    private Long id;

    @Column(name = "date")
    private String date;

    @Column(name = "time")
    private String time;

    public Shift(){
    }

  /*  public Shift(String date, String time){
        this.date = date;
        this.time = time;
    }*/

  public Shift(String date){
      this.date =date;
  }

    @ManyToMany
    @JsonIgnore
    private List<Person> personList;

    @ManyToOne
    private Available available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public Available getAvailable() {
        return available;
    }

    public void setAvailable(Available available) {
        this.available = available;
    }
}
