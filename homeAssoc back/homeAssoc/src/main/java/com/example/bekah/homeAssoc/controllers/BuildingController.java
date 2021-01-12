//package com.example.bekah.homeAssoc.controllers;
//
//import com.example.bekah.homeAssoc.models.Building;
//import com.example.bekah.homeAssoc.models.Contractor;
//import com.example.bekah.homeAssoc.repositories.BuildingRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//public class BuildingController {
//
//    @Autowired
//    BuildingRepo buildingRepo;

//    @GetMapping("/buildings")
//    public ResponseEntity<List<Building>> getAllBuildings(){
//        return new ResponseEntity<>(buildingRepo.findAll(), HttpStatus.OK);
//    }
//
//    @GetMapping(value = "/buildings/{id}")
//    public ResponseEntity getBuilding(@PathVariable Long id){
//        return new ResponseEntity<>(buildingRepo.findById(id), HttpStatus.OK);
//    }
//
//    @PostMapping(value = "/buildings")
//    public ResponseEntity<Building> postBuilding(@RequestBody Building building){
//        buildingRepo.save(building);
//        return new ResponseEntity<>(building, HttpStatus.CREATED);
//    }
//
//    @PatchMapping(value = "/buildings/{id}")
//    public ResponseEntity<Building> updateBuilding(@RequestBody Building building){
//        buildingRepo.save(building);
//        return new ResponseEntity<>(building, HttpStatus.OK);
//    }
//
//    @DeleteMapping(value = "/buildings/{id}")
//    public ResponseEntity<Building> deleteBuilding(@PathVariable Long id) {
//        Building found = buildingRepo.getOne(id);
//        buildingRepo.delete(found);
//        return new ResponseEntity<>(null, HttpStatus.OK);
//    }
//}
