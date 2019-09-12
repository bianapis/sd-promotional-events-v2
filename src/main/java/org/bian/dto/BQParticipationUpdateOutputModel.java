package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationUpdateInputModelParticipationInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQParticipationUpdateOutputModel
 */
public class BQParticipationUpdateOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private BQParticipationUpdateInputModelParticipationInstanceRecord participationInstanceRecord = null;

  private String participationUpdateActionTaskReference = null;

  private Object participationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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

  public BQParticipationUpdateInputModelParticipationInstanceRecord getParticipationInstanceRecord() {
    return participationInstanceRecord;
  }

  public void setParticipationInstanceRecord(BQParticipationUpdateInputModelParticipationInstanceRecord participationInstanceRecord) {
    this.participationInstanceRecord = participationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return participationUpdateActionTaskReference
  **/

  public String getParticipationUpdateActionTaskReference() {
    return participationUpdateActionTaskReference;
  }

  public void setParticipationUpdateActionTaskReference(String participationUpdateActionTaskReference) {
    this.participationUpdateActionTaskReference = participationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

