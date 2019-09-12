package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord;
import org.bian.dto.CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentCreateOutputModel
 */
public class BQImpactAssessmentCreateOutputModel   {
  private CRPromotionalEventManagementPlanCreateOutputModelPromotionalEventManagementPlanInstanceRecord promotionalEventManagementPlanInstanceRecord = null;

  private String impactAssessmentInstanceReference = null;

  private String impactAssessmentInitiateActionReference = null;

  private Object impactAssessmentInitiateActionRecord = null;

  private String impactAssessmentInstanceStatus = null;

  private BQImpactAssessmentCreateOutputModelImpactAssessmentInstanceRecord impactAssessmentInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return impactAssessmentInitiateActionReference
  **/

  public String getImpactAssessmentInitiateActionReference() {
    return impactAssessmentInitiateActionReference;
  }

  public void setImpactAssessmentInitiateActionReference(String impactAssessmentInitiateActionReference) {
    this.impactAssessmentInitiateActionReference = impactAssessmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return impactAssessmentInitiateActionRecord
  **/

  public Object getImpactAssessmentInitiateActionRecord() {
    return impactAssessmentInitiateActionRecord;
  }

  public void setImpactAssessmentInitiateActionRecord(Object impactAssessmentInitiateActionRecord) {
    this.impactAssessmentInitiateActionRecord = impactAssessmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Impact Assessment instance (e.g. initialised, pending, active) 
   * @return impactAssessmentInstanceStatus
  **/

  public String getImpactAssessmentInstanceStatus() {
    return impactAssessmentInstanceStatus;
  }

  public void setImpactAssessmentInstanceStatus(String impactAssessmentInstanceStatus) {
    this.impactAssessmentInstanceStatus = impactAssessmentInstanceStatus;
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


}

