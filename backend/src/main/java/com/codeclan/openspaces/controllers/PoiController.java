package com.codeclan.openspaces.controllers;

import com.codeclan.openspaces.models.*;
import com.codeclan.openspaces.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@RestController
public class PoiController {

    @Autowired
    PoiRepository poiRepository;

    @Autowired
    BenchRepository benchRepository;

    @Autowired
    TableRepository tableRepository;

    @Autowired
    ToiletRepository toiletRepository;

    @Autowired
    SpaceRepository spaceRepository;
    private Optional<Poi> foundPoi;
    private Optional<Poi> foundPoi1;

    //    CREATE
    @PostMapping(value = "/benches")
    public ResponseEntity<Poi> postBench(@RequestBody Bench bench){
        benchRepository.save(bench);
        return new ResponseEntity<>(bench, HttpStatus.CREATED);
    }


    @PostMapping(value = "/tables")
    public ResponseEntity<Poi> postTable(@RequestBody Table table){
        tableRepository.save(table);
        return new ResponseEntity<>(table, HttpStatus.CREATED);
    }

    @PostMapping(value = "/toilets")
    public ResponseEntity<Poi> postToilet(@RequestBody Toilet toilet){
        toiletRepository.save(toilet);
        return new ResponseEntity<>(toilet, HttpStatus.CREATED);
    }

    @PostMapping(value = "/spaces")
    public ResponseEntity<Poi> postSpace(@RequestBody Space space){
        spaceRepository.save(space);
        return new ResponseEntity<>(space, HttpStatus.CREATED);
    }
//READ
    @GetMapping(value = "/pois")
    public ResponseEntity<List<Poi>> getPoisByType(
            @RequestParam(name = "type", required = false) String type
    ){
        if (type.equals("all") ){ return new ResponseEntity<>(poiRepository.findAll(), HttpStatus.OK);}
        if (type != null ){ return new ResponseEntity<>(poiRepository.findAllByType(type), HttpStatus.OK);}
        return new ResponseEntity<>(poiRepository.findAll(), HttpStatus.OK);
    }

//UPDATE



//DELETE

    @DeleteMapping(value = "/pois")
    public ResponseEntity<List<Poi>> deletePoiByIds(
            @RequestParam(name = "ids", required = true) List<String> documentIds,
            @RequestParam(name = "user", required = false) String userId
    ){
        ArrayList<Poi> deletedPois = new ArrayList<>();
        for (String id : documentIds) {
            Optional<Poi> foundPoi = poiRepository.findById(id);
//           foundPoi.ifPresent(poi -> doSomething(poi))
//           # check foundPoi has a method getCreatedBy
//           # if user == getCreatedBy the add poi to deletePois and deleteByID

            }
        return new ResponseEntity<>(deletedPois, HttpStatus.OK);
    }
}
