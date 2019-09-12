package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRequestOutputModel
 */
public class CRPromotionalEventManagementPlanRequestOutputModel   {
  private CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanRequestActionTaskReference = null;

  private Object promotionalEventManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get promotionalEventManagementPlanInstanceRecord
   * @return promotionalEventManagementPlanInstanceRecord
  **/

  public CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord getPromotionalEventManagementPlanInstanceRecord() {
    return promotionalEventManagementPlanInstanceRecord;
  }

  public void setPromotionalEventManagementPlanInstanceRecord(CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord) {
    this.promotionalEventManagementPlanInstanceRecord = promotionalEventManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Promotional Event Management Plan instance request service call 
   * @return promotionalEventManagementPlanRequestActionTaskReference
  **/

  public String getPromotionalEventManagementPlanRequestActionTaskReference() {
    return promotionalEventManagementPlanRequestActionTaskReference;
  }

  public void setPromotionalEventManagementPlanRequestActionTaskReference(String promotionalEventManagementPlanRequestActionTaskReference) {
    this.promotionalEventManagementPlanRequestActionTaskReference = promotionalEventManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return promotionalEventManagementPlanRequestActionTaskRecord
  **/

  public Object getPromotionalEventManagementPlanRequestActionTaskRecord() {
    return promotionalEventManagementPlanRequestActionTaskRecord;
  }

  public void setPromotionalEventManagementPlanRequestActionTaskRecord(Object promotionalEventManagementPlanRequestActionTaskRecord) {
    this.promotionalEventManagementPlanRequestActionTaskRecord = promotionalEventManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

