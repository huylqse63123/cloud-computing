package com.cloudcomputing.nhatro.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "bedsit")
public class Bedsit implements Serializable {

    @EmbeddedId
    private BedsitPK bedsitPK;

    @Column(name = "area")
    private Float area;

    @Column(name = "detailed_address", length = 500)
    private String detailedAddress;

    @Column(name = "price", length = 11)
    private int price;

    @Column(name = "image_resource", length = 500)
    private String imageResource;

    @MapsId("provinceId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "province_id", referencedColumnName = "province_id", insertable = false, updatable = false)
    private Province province;

    @MapsId("districtId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "district_id", referencedColumnName = "district_id", insertable = false, updatable = false)
    private District district;

    @MapsId("adId")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "ad_id", referencedColumnName = "ad_id", insertable = false, updatable = false)
    private Ad ad;
}
