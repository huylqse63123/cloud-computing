package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long cityId;

    @Column(name = "cityName")
    private String cityName;

    @OneToMany(mappedBy = "city")
    private Collection<Bedsit> bedsits;
}
