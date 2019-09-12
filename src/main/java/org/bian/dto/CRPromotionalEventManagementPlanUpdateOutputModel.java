package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanUpdateOutputModel
 */
public class CRPromotionalEventManagementPlanUpdateOutputModel   {
  private CRPromotionalEventManagementPlanUpdateInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanUpdateActionTaskReference = null;

  private Object promotionalEventManagementPlanUpdateActionTaskRecord = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return promotionalEventManagementPlanUpdateActionTaskReference
  **/

  public String getPromotionalEventManagementPlanUpdateActionTaskReference() {
    return promotionalEventManagementPlanUpdateActionTaskReference;
  }

  public void setPromotionalEventManagementPlanUpdateActionTaskReference(String promotionalEventManagementPlanUpdateActionTaskReference) {
    this.promotionalEventManagementPlanUpdateActionTaskReference = promotionalEventManagementPlanUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return promotionalEventManagementPlanUpdateActionTaskRecord
  **/

  public Object getPromotionalEventManagementPlanUpdateActionTaskRecord() {
    return promotionalEventManagementPlanUpdateActionTaskRecord;
  }

  public void setPromotionalEventManagementPlanUpdateActionTaskRecord(Object promotionalEventManagementPlanUpdateActionTaskRecord) {
    this.promotionalEventManagementPlanUpdateActionTaskRecord = promotionalEventManagementPlanUpdateActionTaskRecord;
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

