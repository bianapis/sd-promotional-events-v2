package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanRequestInputModel
 */
public class CRPromotionalEventManagementPlanRequestInputModel   {
  private String promotionalEventsServicingSessionReference = null;

  private String promotionalEventManagementPlanInstanceReference = null;

  private CRPromotionalEventManagementPlanRequestInputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private Object promotionalEventManagementPlanRequestActionTaskRecord = null;

  private CRPromotionalEventManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

