package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanCreateInputModel
 */
public class CRPromotionalEventManagementPlanCreateInputModel   {
  private String promotionalEventsServicingSessionReference = null;

  private Object promotionalEventManagementPlanCreateActionRecord = null;

  private String promotionalEventManagementPlanInstanceStatus = null;

  private CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return promotionalEventsServicingSessionReference
  **/

  public String getPromotionalEventsServicingSessionReference() {
    return promotionalEventsServicingSessionReference;
  }

  public void setPromotionalEventsServicingSessionReference(String promotionalEventsServicingSessionReference) {
    this.promotionalEventsServicingSessionReference = promotionalEventsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return promotionalEventManagementPlanCreateActionRecord
  **/

  public Object getPromotionalEventManagementPlanCreateActionRecord() {
    return promotionalEventManagementPlanCreateActionRecord;
  }

  public void setPromotionalEventManagementPlanCreateActionRecord(Object promotionalEventManagementPlanCreateActionRecord) {
    this.promotionalEventManagementPlanCreateActionRecord = promotionalEventManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Promotional Event Management Plan instance (e.g. initialised, pending, active) 
   * @return promotionalEventManagementPlanInstanceStatus
  **/

  public String getPromotionalEventManagementPlanInstanceStatus() {
    return promotionalEventManagementPlanInstanceStatus;
  }

  public void setPromotionalEventManagementPlanInstanceStatus(String promotionalEventManagementPlanInstanceStatus) {
    this.promotionalEventManagementPlanInstanceStatus = promotionalEventManagementPlanInstanceStatus;
  }


  /**
   * Get promotionalEventManagementPlanInstanceRecord
   * @return promotionalEventManagementPlanInstanceRecord
  **/

  public CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanCreateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
    this.promotionalEventManagementPlanInstanceRecord = promotionalEventManagementPlanInstanceRecord;
  }


}

