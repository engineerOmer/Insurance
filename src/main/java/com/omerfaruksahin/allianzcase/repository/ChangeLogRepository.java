package com.omerfaruksahin.allianzcase.repository;

import com.omerfaruksahin.allianzcase.model.Campaign;
import com.omerfaruksahin.allianzcase.model.ChangeLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChangeLogRepository extends JpaRepository<ChangeLog,Integer> {
    List<ChangeLog> findByCampaign(Campaign campaign);
}
