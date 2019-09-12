package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis
 */
public class BQImpactAssessmentRetrieveOutputModelImpactAssessmentInstanceAnalysis   {
  private Object impactAssessmentInstanceAnalysisRecord = null;

  private String impactAssessmentInstanceAnalysisReportType = null;

  private String impactAssessmentInstanceAnalysisParameters = null;

  private Object impactAssessmentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return impactAssessmentInstanceAnalysisRecord
  **/

  public Object getImpactAssessmentInstanceAnalysisRecord() {
    return impactAssessmentInstanceAnalysisRecord;
  }

  public void setImpactAssessmentInstanceAnalysisRecord(Object impactAssessmentInstanceAnalysisRecord) {
    this.impactAssessmentInstanceAnalysisRecord = impactAssessmentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return impactAssessmentInstanceAnalysisReportType
  **/

  public String getImpactAssessmentInstanceAnalysisReportType() {
    return impactAssessmentInstanceAnalysisReportType;
  }

  public void setImpactAssessmentInstanceAnalysisReportType(String impactAssessmentInstanceAnalysisReportType) {
    this.impactAssessmentInstanceAnalysisReportType = impactAssessmentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return impactAssessmentInstanceAnalysisParameters
  **/

  public String getImpactAssessmentInstanceAnalysisParameters() {
    return impactAssessmentInstanceAnalysisParameters;
  }

  public void setImpactAssessmentInstanceAnalysisParameters(String impactAssessmentInstanceAnalysisParameters) {
    this.impactAssessmentInstanceAnalysisParameters = impactAssessmentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return impactAssessmentInstanceAnalysisReport
  **/

  public Object getImpactAssessmentInstanceAnalysisReport() {
    return impactAssessmentInstanceAnalysisReport;
  }

  public void setImpactAssessmentInstanceAnalysisReport(Object impactAssessmentInstanceAnalysisReport) {
    this.impactAssessmentInstanceAnalysisReport = impactAssessmentInstanceAnalysisReport;
  }


}

