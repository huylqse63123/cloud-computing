package com.cloudcomputing.nhatro.service;

import com.cloudcomputing.nhatro.entity.Bedsit;
import com.cloudcomputing.nhatro.repository.BedsitRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;

@Service
public class BedsitServiceImpl implements BedsitService{

    private final BedsitRepository bedsitRepository;

    public BedsitServiceImpl(BedsitRepository bedsitRepository) {
        this.bedsitRepository = bedsitRepository;
    }

    @Override
    public Collection<Bedsit> getAllBedsit() {

        return bedsitRepository.getAllBedsits();
    }
}
