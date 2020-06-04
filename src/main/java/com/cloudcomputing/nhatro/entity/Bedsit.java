package com.cloudcomputing.nhatro.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "bedsit")
public class Bedsit {

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Long bedsitId;

    @Column(name = "area")
    private Float area;

    @Column(name = "detailedAddress")
    private String detailedAddress;

    @Column(name = "price")
    private int price;

    @Column(name = "imageResource")
    private String imageResource;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "cityId", referencedColumnName = "cityId")
    private City city;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "districtId", referencedColumnName = "districtId")
    private District district;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "adId", referencedColumnName = "adId")
    private Ad ad;
}
