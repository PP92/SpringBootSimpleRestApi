package com.pp.SpringBootRestApi.ppData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PpDataController {
    @Autowired
    private PpDataService ppDataService;

    @PostMapping("/add")
    public PpData savePpData(@Valid @RequestBody PpData ppData){
        return ppDataService.savePpData(ppData);
    }

    @GetMapping("/list")
    public List<PpData> listPpData(){
        return ppDataService.getAllPpData();
    }
}
