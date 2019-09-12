/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class PromotionalEventsApiController {

	@Autowired
	PromotionalEventsApiService service;
	
	@Manage.Activate
	public BianResponse<SDPromotionalEventsActivateOutputModel> activate(@RequestBody BianRequest<SDPromotionalEventsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDPromotionalEventsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPromotionalEventsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Create
	public BianResponse<CRPromotionalEventManagementPlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRPromotionalEventManagementPlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("impactassessment")
	@Manage.Create
	public BianResponse<BQImpactAssessmentCreateOutputModel> createImpactassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQImpactAssessmentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createImpactassessment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("participation")
	@Manage.Create
	public BianResponse<BQParticipationCreateOutputModel> createParticipation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQParticipationCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createParticipation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("impactassessment")
	@Manage.Execute
	public BianResponse<BQImpactAssessmentExecuteOutputModel> executeImpactassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQImpactAssessmentExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeImpactassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Execute
	public BianResponse<BQMarketTrackingExecuteOutputModel> executeMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDPromotionalEventsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDPromotionalEventsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRPromotionalEventManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPromotionalEventManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("impactassessment")
	@Manage.Request
	public BianResponse<BQImpactAssessmentRequestOutputModel> requestImpactassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQImpactAssessmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestImpactassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Request
	public BianResponse<BQMarketTrackingRequestOutputModel> requestMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("participation")
	@Manage.Request
	public BianResponse<BQParticipationRequestOutputModel> requestParticipation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQParticipationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestParticipation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRPromotionalEventManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPromotionalEventManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("impactassessment")
	@Manage.Retrieve
	public BianResponse<BQImpactAssessmentRetrieveOutputModel> retrieveImpactassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveImpactassessment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("markettracking")
	@Manage.Retrieve
	public BianResponse<BQMarketTrackingRetrieveOutputModel> retrieveMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveMarkettracking(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("participation")
	@Manage.Retrieve
	public BianResponse<BQParticipationRetrieveOutputModel> retrieveParticipation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveParticipation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.Retrieve
	public BianResponse<CRPromotionalEventManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDPromotionalEventsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRPromotionalEventManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRPromotionalEventManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("impactassessment")
	@Manage.Update
	public BianResponse<BQImpactAssessmentUpdateOutputModel> updateImpactassessment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQImpactAssessmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateImpactassessment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("markettracking")
	@Manage.Update
	public BianResponse<BQMarketTrackingUpdateOutputModel> updateMarkettracking(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQMarketTrackingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateMarkettracking(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("participation")
	@Manage.Update
	public BianResponse<BQParticipationUpdateOutputModel> updateParticipation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQParticipationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateParticipation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
