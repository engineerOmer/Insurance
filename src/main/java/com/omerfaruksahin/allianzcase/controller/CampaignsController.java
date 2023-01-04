package com.omerfaruksahin.allianzcase.controller;

import com.omerfaruksahin.allianzcase.dto.request.changeLogRequest.ChangeLogListRequestDto;
import com.omerfaruksahin.allianzcase.dto.request.campaignRequest.SaveCampaignRequestDto;
import com.omerfaruksahin.allianzcase.dto.request.campaignRequest.SituationUpdateRequestDto;
import com.omerfaruksahin.allianzcase.dto.response.campaignResponse.CampaignResponseDto;
import com.omerfaruksahin.allianzcase.dto.response.campaignResponse.CampaignStatusInformationDto;
import com.omerfaruksahin.allianzcase.dto.response.changeLogResponse.ChangeLogResponseDto;
import com.omerfaruksahin.allianzcase.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/campaign")
public class CampaignsController {
    private final CampaignService campaignService;

    @PostMapping("/saveCampaign")
    public ResponseEntity<CampaignResponseDto> saveCampaign(@RequestBody SaveCampaignRequestDto saveCampaignRequestDto){
        return new ResponseEntity<>(campaignService.saveCampaign(saveCampaignRequestDto), HttpStatus.CREATED);
    }


    @GetMapping("/getStatus")
    public ResponseEntity<CampaignStatusInformationDto> getCampaignStatus(){
        return new ResponseEntity<>(campaignService.getStatus(),HttpStatus.OK);
    }

    @PutMapping("/situationUpdate")
    public ResponseEntity<CampaignResponseDto> situationUpdate(@RequestBody SituationUpdateRequestDto situationUpdateRequestDto){
        return new ResponseEntity<>(campaignService.changeStatusInformation(situationUpdateRequestDto),HttpStatus.OK);
    }

    @GetMapping("/changeLogList")
    public ResponseEntity<List<ChangeLogResponseDto>> getAllLog(@RequestBody ChangeLogListRequestDto changeLogListRequestDto){
        return new ResponseEntity<>(campaignService.getCampaignStatusChange(changeLogListRequestDto),HttpStatus.OK);
    }
}
