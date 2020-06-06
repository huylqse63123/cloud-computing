package com.cloudcomputing.nhatro.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class BedsitPK implements Serializable {
    @Column
    private int adId;
    @Column
    private int provinceId;
    @Column
    private int districtId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BedsitPK bedsitPK = (BedsitPK) o;
        return adId == bedsitPK.adId &&
                provinceId == bedsitPK.provinceId &&
                districtId == bedsitPK.districtId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adId, provinceId, districtId);
    }
}
