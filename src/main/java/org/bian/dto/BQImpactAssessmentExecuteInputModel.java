package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord;
import org.bian.dto.BQMarketTrackingExecuteInputModelExecuteRecordType;
import org.bian.dto.CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentExecuteInputModel
 */
public class BQImpactAssessmentExecuteInputModel   {
  private CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String promotionalEventManagementPlanInstanceReference = null;

  private String impactAssessmentInstanceReference = null;

  private BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord = null;

  private Object impactAssessmentExecuteActionTaskRecord = null;

  private BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Impact Assessment instance 
   * @return impactAssessmentInstanceReference
  **/

  public String getImpactAssessmentInstanceReference() {
    return impactAssessmentInstanceReference;
  }

  public void setImpactAssessmentInstanceReference(String impactAssessmentInstanceReference) {
    this.impactAssessmentInstanceReference = impactAssessmentInstanceReference;
  }


  /**
   * Get impactAssessmentInstanceRecord
   * @return impactAssessmentInstanceRecord
  **/

  public BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord getImpactAssessmentInstanceRecord() {
    return impactAssessmentInstanceRecord;
  }

  public void setImpactAssessmentInstanceRecord(BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord) {
    this.impactAssessmentInstanceRecord = impactAssessmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The execute service call consolidated processing record 
   * @return impactAssessmentExecuteActionTaskRecord
  **/

  public Object getImpactAssessmentExecuteActionTaskRecord() {
    return impactAssessmentExecuteActionTaskRecord;
  }

  public void setImpactAssessmentExecuteActionTaskRecord(Object impactAssessmentExecuteActionTaskRecord) {
    this.impactAssessmentExecuteActionTaskRecord = impactAssessmentExecuteActionTaskRecord;
  }


  /**
   * Get executeRecordType
   * @return executeRecordType
  **/

  public BQMarketTrackingExecuteInputModelExecuteRecordType getExecuteRecordType() {
    return executeRecordType;
  }

  public void setExecuteRecordType(BQMarketTrackingExecuteInputModelExecuteRecordType executeRecordType) {
    this.executeRecordType = executeRecordType;
  }


}

