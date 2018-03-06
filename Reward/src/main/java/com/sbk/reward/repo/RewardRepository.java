package com.sbk.reward.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbk.reward.model.Reward;

public interface RewardRepository extends MongoRepository<Reward, String>
{

}
