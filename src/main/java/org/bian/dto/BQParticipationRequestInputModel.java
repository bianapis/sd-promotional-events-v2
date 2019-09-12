package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationRequestInputModelParticipationInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanRequestInputModelRequestRecordType;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipationRequestInputModel
 */
public class BQParticipationRequestInputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanInstanceReference = null;

  private String participationInstanceReference = null;

  private BQParticipationRequestInputModelParticipationInstanceRecord participationInstanceRecord = null;

  private Object participationRequestActionTaskRecord = null;

  private CRPromotionalEventManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQParticipationRequestInputModelParticipationInstanceRecord getParticipationInstanceRecord() {
    return participationInstanceRecord;
  }

  public void setParticipationInstanceRecord(BQParticipationRequestInputModelParticipationInstanceRecord participationInstanceRecord) {
    this.participationInstanceRecord = participationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return participationRequestActionTaskRecord
  **/

  public Object getParticipationRequestActionTaskRecord() {
    return participationRequestActionTaskRecord;
  }

  public void setParticipationRequestActionTaskRecord(Object participationRequestActionTaskRecord) {
    this.participationRequestActionTaskRecord = participationRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRPromotionalEventManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRPromotionalEventManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

