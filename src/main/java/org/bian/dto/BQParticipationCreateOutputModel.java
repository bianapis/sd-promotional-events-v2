package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationCreateInputModelParticipationInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipationCreateOutputModel
 */
public class BQParticipationCreateOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String participationInstanceReference = null;

  private String participationInitiateActionReference = null;

  private Object participationInitiateActionRecord = null;

  private String participationInstanceStatus = null;

  private BQParticipationCreateInputModelParticipationInstanceRecord participationInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Participation instance 
   * @return participationInstanceReference
  **/

  public String getParticipationInstanceReference() {
    return participationInstanceReference;
  }

  public void setParticipationInstanceReference(String participationInstanceReference) {
    this.participationInstanceReference = participationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return participationInitiateActionReference
  **/

  public String getParticipationInitiateActionReference() {
    return participationInitiateActionReference;
  }

  public void setParticipationInitiateActionReference(String participationInitiateActionReference) {
    this.participationInitiateActionReference = participationInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return participationInitiateActionRecord
  **/

  public Object getParticipationInitiateActionRecord() {
    return participationInitiateActionRecord;
  }

  public void setParticipationInitiateActionRecord(Object participationInitiateActionRecord) {
    this.participationInitiateActionRecord = participationInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Participation instance (e.g. initialised, pending, active) 
   * @return participationInstanceStatus
  **/

  public String getParticipationInstanceStatus() {
    return participationInstanceStatus;
  }

  public void setParticipationInstanceStatus(String participationInstanceStatus) {
    this.participationInstanceStatus = participationInstanceStatus;
  }


  /**
   * Get participationInstanceRecord
   * @return participationInstanceRecord
  **/

  public BQParticipationCreateInputModelParticipationInstanceRecord getParticipationInstanceRecord() {
    return participationInstanceRecord;
  }

  public void setParticipationInstanceRecord(BQParticipationCreateInputModelParticipationInstanceRecord participationInstanceRecord) {
    this.participationInstanceRecord = participationInstanceRecord;
  }


}

