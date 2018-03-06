package com.sbk.mission.controller;

import com.sbk.mission.model.Mission;
import com.sbk.mission.repo.MissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mission")
public class MissionController
{
    @Autowired
    MissionRepository missionRepository;

    //Optional Argument: produces = "application/json" is set by default
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Mission create(@RequestBody Mission mission){

        Mission result = missionRepository.save(mission);
        System.out.println("Output is " + result.toString());
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{missionId}")
    public Mission get(@PathVariable String missionId){
        return missionRepository.findOne(missionId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/")
    public List<Mission> getAll(){
        return missionRepository.findAll();
    }
}
