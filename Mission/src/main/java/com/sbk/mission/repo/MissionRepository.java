package com.sbk.mission.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sbk.mission.model.Mission;

public interface MissionRepository extends MongoRepository<Mission, String>
{

}
