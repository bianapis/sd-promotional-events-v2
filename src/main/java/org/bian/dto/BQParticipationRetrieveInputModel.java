package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationRetrieveInputModelParticipationInstanceAnalysis;
import org.bian.dto.BQParticipationRetrieveInputModelParticipationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveInputModel
 */
public class BQParticipationRetrieveInputModel   {
  private Object participationRetrieveActionTaskRecord = null;

  private String participationRetrieveActionRequest = null;

  private BQParticipationRetrieveInputModelParticipationInstanceReport participationInstanceReport = null;

  private BQParticipationRetrieveInputModelParticipationInstanceAnalysis participationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return participationRetrieveActionTaskRecord
  **/

  public Object getParticipationRetrieveActionTaskRecord() {
    return participationRetrieveActionTaskRecord;
  }

  public void setParticipationRetrieveActionTaskRecord(Object participationRetrieveActionTaskRecord) {
    this.participationRetrieveActionTaskRecord = participationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return participationRetrieveActionRequest
  **/

  public String getParticipationRetrieveActionRequest() {
    return participationRetrieveActionRequest;
  }

  public void setParticipationRetrieveActionRequest(String participationRetrieveActionRequest) {
    this.participationRetrieveActionRequest = participationRetrieveActionRequest;
  }


  /**
   * Get participationInstanceReport
   * @return participationInstanceReport
  **/

  public BQParticipationRetrieveInputModelParticipationInstanceReport getParticipationInstanceReport() {
    return participationInstanceReport;
  }

  public void setParticipationInstanceReport(BQParticipationRetrieveInputModelParticipationInstanceReport participationInstanceReport) {
    this.participationInstanceReport = participationInstanceReport;
  }


  /**
   * Get participationInstanceAnalysis
   * @return participationInstanceAnalysis
  **/

  public BQParticipationRetrieveInputModelParticipationInstanceAnalysis getParticipationInstanceAnalysis() {
    return participationInstanceAnalysis;
  }

  public void setParticipationInstanceAnalysis(BQParticipationRetrieveInputModelParticipationInstanceAnalysis participationInstanceAnalysis) {
    this.participationInstanceAnalysis = participationInstanceAnalysis;
  }


}

