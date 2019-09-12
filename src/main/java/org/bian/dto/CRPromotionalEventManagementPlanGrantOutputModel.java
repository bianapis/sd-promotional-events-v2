package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRPromotionalEventManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRPromotionalEventManagementPlanGrantOutputModel
 */
public class CRPromotionalEventManagementPlanGrantOutputModel   {
  private String promotionalEventManagementPlanGrantActionTaskReference = null;

  private Object promotionalEventManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRPromotionalEventManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Promotional Event Management Plan instance grant service call 
   * @return promotionalEventManagementPlanGrantActionTaskReference
  **/

  public String getPromotionalEventManagementPlanGrantActionTaskReference() {
    return promotionalEventManagementPlanGrantActionTaskReference;
  }

  public void setPromotionalEventManagementPlanGrantActionTaskReference(String promotionalEventManagementPlanGrantActionTaskReference) {
    this.promotionalEventManagementPlanGrantActionTaskReference = promotionalEventManagementPlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRPromotionalEventManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRPromotionalEventManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

