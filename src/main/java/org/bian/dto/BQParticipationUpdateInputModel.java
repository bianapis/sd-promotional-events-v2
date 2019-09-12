package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationUpdateInputModelParticipationInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipationUpdateInputModel
 */
public class BQParticipationUpdateInputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanInstanceReference = null;

  private String participationInstanceReference = null;

  private BQParticipationUpdateInputModelParticipationInstanceRecord participationInstanceRecord = null;

  private Object participationUpdateActionTaskRecord = null;

  private String participationUpdateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Promotional Event Management Plan instance 
   * @return promotionalEventManagementPlanInstanceReference
  **/

  public String getPromotionalEventManagementPlanInstanceReference() {
    return promotionalEventManagementPlanInstanceReference;
  }

  public void setPromotionalEventManagementPlanInstanceReference(String promotionalEventManagementPlanInstanceReference) {
    this.promotionalEventManagementPlanInstanceReference = promotionalEventManagementPlanInstanceReference;
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
   * Get participationInstanceRecord
   * @return participationInstanceRecord
  **/

  public BQParticipationUpdateInputModelParticipationInstanceRecord getParticipationInstanceRecord() {
    return participationInstanceRecord;
  }

  public void setParticipationInstanceRecord(BQParticipationUpdateInputModelParticipationInstanceRecord participationInstanceRecord) {
    this.participationInstanceRecord = participationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return participationUpdateActionTaskRecord
  **/

  public Object getParticipationUpdateActionTaskRecord() {
    return participationUpdateActionTaskRecord;
  }

  public void setParticipationUpdateActionTaskRecord(Object participationUpdateActionTaskRecord) {
    this.participationUpdateActionTaskRecord = participationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return participationUpdateActionRequest
  **/

  public String getParticipationUpdateActionRequest() {
    return participationUpdateActionRequest;
  }

  public void setParticipationUpdateActionRequest(String participationUpdateActionRequest) {
    this.participationUpdateActionRequest = participationUpdateActionRequest;
  }


}

