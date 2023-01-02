package com.omerfaruksahin.allianzcase.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_MODIFIED)
public class CampaignNotUpdateableException extends RuntimeException{
    public CampaignNotUpdateableException(){
        super("Campaign cannot be update because campaign is MÜKERRER");
    }
}
