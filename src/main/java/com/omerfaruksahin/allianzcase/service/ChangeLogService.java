package com.omerfaruksahin.allianzcase.service;

import com.omerfaruksahin.allianzcase.dto.response.campaignResponse.ChangeLogResponseDto;
import com.omerfaruksahin.allianzcase.model.Campaign;
import com.omerfaruksahin.allianzcase.model.ChangeLog;
import com.omerfaruksahin.allianzcase.repository.ChangeLogRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChangeLogService {

    private final ModelMapper modelMapper;
    private final ChangeLogRepository changeLogRepository;

    public void saveLog(ChangeLog changeLog){
        changeLogRepository.save(changeLog);
    }

    public List<ChangeLogResponseDto> getList(Campaign campaign) {
        return changeLogRepository.findByCampaign(campaign).stream().map(item -> modelMapper.map(item,ChangeLogResponseDto.class)).toList();
    }
}
