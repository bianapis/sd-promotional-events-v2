package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQParticipationCreateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference;

import javax.validation.Valid;
  
/**
 * BQParticipationCreateInputModelParticipationInstanceRecord
 */
public class BQParticipationCreateInputModelParticipationInstanceRecord   {
  private BQParticipationCreateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference = null;


  /**
   * Get promotionalEventParticipationInstanceReference
   * @return promotionalEventParticipationInstanceReference
  **/

  public BQParticipationCreateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference getPromotionalEventParticipationInstanceReference() {
    return promotionalEventParticipationInstanceReference;
  }

  public void setPromotionalEventParticipationInstanceReference(BQParticipationCreateInputModelParticipationInstanceRecordPromotionalEventParticipationInstanceReference promotionalEventParticipationInstanceReference) {
    this.promotionalEventParticipationInstanceReference = promotionalEventParticipationInstanceReference;
  }


}

