package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationRetrieveOutputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference;

import javax.validation.Valid;
  
/**
 * BQParticipationRetrieveOutputModelParticipationInstanceRecord
 */
public class BQParticipationRetrieveOutputModelParticipationInstanceRecord   {
  private BQParticipationRetrieveOutputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference = null;


  /**
   * Get promotionalEventParticipationInstanceReference
   * @return promotionalEventParticipationInstanceReference
  **/

  public BQParticipationRetrieveOutputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference getPromotionalEventParticipationInstanceReference() {
    return promotionalEventParticipationInstanceReference;
  }

  public void setPromotionalEventParticipationInstanceReference(BQParticipationRetrieveOutputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference) {
    this.promotionalEventParticipationInstanceReference = promotionalEventParticipationInstanceReference;
  }


}

