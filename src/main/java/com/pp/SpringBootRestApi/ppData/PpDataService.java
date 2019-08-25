package com.pp.SpringBootRestApi.ppData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PpDataService {
    @Autowired
    private PpDataRepository ppDataRepository;

    public PpData savePpData(PpData ppData) {
        return ppDataRepository.save(ppData);
    }

    public List<PpData> getAllPpData() {
        return ppDataRepository.findAll();
    }
}
