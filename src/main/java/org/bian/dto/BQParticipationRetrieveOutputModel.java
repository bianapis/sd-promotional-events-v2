package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationRetrieveOutputModelParticipationInstanceAnalysis;
import org.bian.dto.BQParticipationRetrieveOutputModelParticipationInstanceRecord;
import org.bian.dto.BQParticipationRetrieveOutputModelParticipationInstanceReport;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveOutputModel
 */
public class BQParticipationRetrieveOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private BQParticipationRetrieveOutputModelParticipationInstanceRecord participationInstanceRecord = null;

  private String participationRetrieveActionTaskReference = null;

  private Object participationRetrieveActionTaskRecord = null;

  private String participationRetrieveActionResponse = null;

  private BQParticipationRetrieveOutputModelParticipationInstanceReport participationInstanceReport = null;

  private BQParticipationRetrieveOutputModelParticipationInstanceAnalysis participationInstanceAnalysis = null;


  /**
   * Get promotionalEventManagementPlanInstanceRecord
   * @return promotionalEventManagementPlanInstanceRecord
  **/

  public CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
    this.promotionalEventManagementPlanInstanceRecord = promotionalEventManagementPlanInstanceRecord;
  }


  /**
   * Get participationInstanceRecord
   * @return participationInstanceRecord
  **/

  public BQParticipationRetrieveOutputModelParticipationInstanceRecord getParticipationInstanceRecord() {
    return participationInstanceRecord;
  }

  public void setParticipationInstanceRecord(BQParticipationRetrieveOutputModelParticipationInstanceRecord participationInstanceRecord) {
    this.participationInstanceRecord = participationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Participation instance retrieve service call 
   * @return participationRetrieveActionTaskReference
  **/

  public String getParticipationRetrieveActionTaskReference() {
    return participationRetrieveActionTaskReference;
  }

  public void setParticipationRetrieveActionTaskReference(String participationRetrieveActionTaskReference) {
    this.participationRetrieveActionTaskReference = participationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return participationRetrieveActionResponse
  **/

  public String getParticipationRetrieveActionResponse() {
    return participationRetrieveActionResponse;
  }

  public void setParticipationRetrieveActionResponse(String participationRetrieveActionResponse) {
    this.participationRetrieveActionResponse = participationRetrieveActionResponse;
  }


  /**
   * Get participationInstanceReport
   * @return participationInstanceReport
  **/

  public BQParticipationRetrieveOutputModelParticipationInstanceReport getParticipationInstanceReport() {
    return participationInstanceReport;
  }

  public void setParticipationInstanceReport(BQParticipationRetrieveOutputModelParticipationInstanceReport participationInstanceReport) {
    this.participationInstanceReport = participationInstanceReport;
  }


  /**
   * Get participationInstanceAnalysis
   * @return participationInstanceAnalysis
  **/

  public BQParticipationRetrieveOutputModelParticipationInstanceAnalysis getParticipationInstanceAnalysis() {
    return participationInstanceAnalysis;
  }

  public void setParticipationInstanceAnalysis(BQParticipationRetrieveOutputModelParticipationInstanceAnalysis participationInstanceAnalysis) {
    this.participationInstanceAnalysis = participationInstanceAnalysis;
  }


}

