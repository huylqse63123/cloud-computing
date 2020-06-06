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
    @Column(name = "district_id", length = 11)
    private int districtId;

    @Column(name = "district_name", length = 45)
    private String districtName;

    @OneToMany(mappedBy = "district")
    private Collection<Bedsit> bedsits;
}
