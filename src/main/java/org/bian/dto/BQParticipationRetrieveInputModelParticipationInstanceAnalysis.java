package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveInputModelParticipationInstanceAnalysis
 */
public class BQParticipationRetrieveInputModelParticipationInstanceAnalysis   {
  private String participationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return participationInstanceAnalysisReference
  **/

  public String getParticipationInstanceAnalysisReference() {
    return participationInstanceAnalysisReference;
  }

  public void setParticipationInstanceAnalysisReference(String participationInstanceAnalysisReference) {
    this.participationInstanceAnalysisReference = participationInstanceAnalysisReference;
  }


}

