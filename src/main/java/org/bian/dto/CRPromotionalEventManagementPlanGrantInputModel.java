package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanGrantInputModel
 */
public class CRPromotionalEventManagementPlanGrantInputModel   {
  private String promotionalEventsServicingSessionReference = null;

  private String promotionalEventManagementPlanInstanceReference = null;

  private Object promotionalEventManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRPromotionalEventManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return promotionalEventManagementPlanGrantActionTaskRecord
  **/

  public Object getPromotionalEventManagementPlanGrantActionTaskRecord() {
    return promotionalEventManagementPlanGrantActionTaskRecord;
  }

  public void setPromotionalEventManagementPlanGrantActionTaskRecord(Object promotionalEventManagementPlanGrantActionTaskRecord) {
    this.promotionalEventManagementPlanGrantActionTaskRecord = promotionalEventManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRPromotionalEventManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRPromotionalEventManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

