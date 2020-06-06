package com.cloudcomputing.nhatro.entity;

import javax.persistence.*;

@Entity
@Table(name = "bedsit")
public class Bedsit {

    @Column(name = "area")
    private Float area;

    @Column(name = "detailed_address", length = 500)
    private String detailedAddress;

    @Column(name = "price", length = 11)
    private int price;

    @Column(name = "image_resource", length = 500)
    private String imageResource;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "province_id", referencedColumnName = "province_id")
    private Province province;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "district_id", referencedColumnName = "district_id")
    private District district;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ad_id", referencedColumnName = "ad_id")
    private Ad ad;
}
