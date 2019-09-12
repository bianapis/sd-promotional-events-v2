package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport
 */
public class BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceReport   {
  private Object impactAssessmentInstanceReportRecord = null;

  private String impactAssessmentInstanceReportType = null;

  private String impactAssessmentInstanceReportParameters = null;

  private Object impactAssessmentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return impactAssessmentInstanceReportRecord
  **/

  public Object getImpactAssessmentInstanceReportRecord() {
    return impactAssessmentInstanceReportRecord;
  }

  public void setImpactAssessmentInstanceReportRecord(Object impactAssessmentInstanceReportRecord) {
    this.impactAssessmentInstanceReportRecord = impactAssessmentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return impactAssessmentInstanceReportType
  **/

  public String getImpactAssessmentInstanceReportType() {
    return impactAssessmentInstanceReportType;
  }

  public void setImpactAssessmentInstanceReportType(String impactAssessmentInstanceReportType) {
    this.impactAssessmentInstanceReportType = impactAssessmentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return impactAssessmentInstanceReportParameters
  **/

  public String getImpactAssessmentInstanceReportParameters() {
    return impactAssessmentInstanceReportParameters;
  }

  public void setImpactAssessmentInstanceReportParameters(String impactAssessmentInstanceReportParameters) {
    this.impactAssessmentInstanceReportParameters = impactAssessmentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return impactAssessmentInstanceReport
  **/

  public Object getImpactAssessmentInstanceReport() {
    return impactAssessmentInstanceReport;
  }

  public void setImpactAssessmentInstanceReport(Object impactAssessmentInstanceReport) {
    this.impactAssessmentInstanceReport = impactAssessmentInstanceReport;
  }


}

