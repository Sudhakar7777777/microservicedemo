package com.sbk.reward.controller;

import com.sbk.reward.model.Reward;
import com.sbk.reward.repo.RewardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reward")
public class RewardController
{
    @Autowired
    RewardRepository rewardRepository;

    //Optional Argument: produces = "application/json" is set by default
    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public Reward create(@RequestBody Reward reward){

        Reward result = rewardRepository.save(reward);
        System.out.println("Output is " + result.toString());
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{rewardId}")
    public Reward get(@PathVariable String rewardId){
        return rewardRepository.findOne(rewardId);
    }

    @RequestMapping(method = RequestMethod.GET, value="/")
    public List<Reward> getAll(){
        return rewardRepository.findAll();
    }
}
