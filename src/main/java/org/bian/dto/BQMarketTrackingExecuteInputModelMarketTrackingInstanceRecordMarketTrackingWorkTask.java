package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask
 */
public class BQMarketTrackingExecuteInputModelMarketTrackingInstanceRecordMarketTrackingWorkTask   {
  private String generalMarketResearchDirectoryEntryInstanceReference = null;

  private Object generalMarketResearchDirectoryEntryInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an internally maintained market research viewpoint 
   * @return generalMarketResearchDirectoryEntryInstanceReference
  **/

  public String getGeneralMarketResearchDirectoryEntryInstanceReference() {
    return generalMarketResearchDirectoryEntryInstanceReference;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceReference(String generalMarketResearchDirectoryEntryInstanceReference) {
    this.generalMarketResearchDirectoryEntryInstanceReference = generalMarketResearchDirectoryEntryInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The market research viewpoint definition and content 
   * @return generalMarketResearchDirectoryEntryInstanceRecord
  **/

  public Object getGeneralMarketResearchDirectoryEntryInstanceRecord() {
    return generalMarketResearchDirectoryEntryInstanceRecord;
  }

  public void setGeneralMarketResearchDirectoryEntryInstanceRecord(Object generalMarketResearchDirectoryEntryInstanceRecord) {
    this.generalMarketResearchDirectoryEntryInstanceRecord = generalMarketResearchDirectoryEntryInstanceRecord;
  }


}

