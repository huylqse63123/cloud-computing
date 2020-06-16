package com.cloudcomputing.nhatro.repository;

import com.cloudcomputing.nhatro.entity.Bedsit;
import com.cloudcomputing.nhatro.entity.BedsitPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface BedsitRepository extends JpaRepository<Bedsit, BedsitPK> {
    @Query("select bedsit from Bedsit bedsit")
    Collection<Bedsit> getAllBedsits();
}
