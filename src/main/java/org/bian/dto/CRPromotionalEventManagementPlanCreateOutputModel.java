package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanCreateOutputModel
 */
public class CRPromotionalEventManagementPlanCreateOutputModel   {
  private String promotionalEventManagementPlanInstanceReference = null;

  private String promotionalEventManagementPlanCreateActionReference = null;

  private Object promotionalEventManagementPlanCreateActionRecord = null;

  private String promotionalEventManagementPlanInstanceStatus = null;

  private CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Promotional Event Management Plan instance 
   * @return promotionalEventManagementPlanInstanceReference
  **/

  public String getPromotionalEventManagementPlanInstanceReference() {
    return promotionalEventManagementPlanInstanceReference;
  }

  public void setPromotionalEventManagementPlanInstanceReference(String promotionalEventManagementPlanInstanceReference) {
    this.promotionalEventManagementPlanInstanceReference = promotionalEventManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return promotionalEventManagementPlanCreateActionReference
  **/

  public String getPromotionalEventManagementPlanCreateActionReference() {
    return promotionalEventManagementPlanCreateActionReference;
  }

  public void setPromotionalEventManagementPlanCreateActionReference(String promotionalEventManagementPlanCreateActionReference) {
    this.promotionalEventManagementPlanCreateActionReference = promotionalEventManagementPlanCreateActionReference;
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

  public CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
    this.promotionalEventManagementPlanInstanceRecord = promotionalEventManagementPlanInstanceRecord;
  }


}

