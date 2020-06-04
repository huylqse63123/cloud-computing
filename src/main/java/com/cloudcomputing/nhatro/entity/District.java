package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "district")
public class District {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long districtId;

    @Column(name = "districtName")
    private String districtName;

    @OneToMany(mappedBy = "district")
    private Collection<Bedsit> bedsits;
}
