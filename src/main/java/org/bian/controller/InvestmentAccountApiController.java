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
import org.bian.annotation.functionalpattern.Fulfill;

@BianRestController
public class InvestmentAccountApiController {

	@Autowired
	InvestmentAccountApiService service;
	
	@Fulfill.Activate
	public BianResponse<SDInvestmentAccountActivateOutputModel> activate(@RequestBody BianRequest<SDInvestmentAccountActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Fulfill.Configure
	public BianResponse<SDInvestmentAccountConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInvestmentAccountConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Control
	public BianResponse<CRInvestmentAccountFulfillmentArrangementControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInvestmentAccountFulfillmentArrangementControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("corporateactions")
	@Fulfill.Exchange
	public BianResponse<BQCorporateActionsExchangeOutputModel> exchangeCorporateactions(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCorporateActionsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeCorporateactions(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Exchange
	public BianResponse<BQDepositsandWithdrawalsExchangeOutputModel> exchangeDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsandWithdrawalsExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Exchange
	public BianResponse<BQServiceFeesExchangeOutputModel> exchangeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("corporateactions")
	@Fulfill.Execute
	public BianResponse<BQCorporateActionsExecuteOutputModel> executeCorporateactions(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCorporateActionsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeCorporateactions(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Execute
	public BianResponse<BQDepositsandWithdrawalsExecuteOutputModel> executeDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsandWithdrawalsExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Execute
	public BianResponse<BQServiceFeesExecuteOutputModel> executeServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesExecuteInputModel> bianRequest) {
		return BianResponse.forSuccess(service.executeServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Feedback
	public BianResponse<SDInvestmentAccountFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDInvestmentAccountFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Initiate
	public BianResponse<CRInvestmentAccountFulfillmentArrangementInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRInvestmentAccountFulfillmentArrangementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("corporateactions")
	@Fulfill.Initiate
	public BianResponse<BQCorporateActionsInitiateOutputModel> initiateCorporateactions(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQCorporateActionsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateCorporateactions(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Initiate
	public BianResponse<BQDepositsandWithdrawalsInitiateOutputModel> initiateDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDepositsandWithdrawalsInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateDepositsandwithdrawals(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Initiate
	public BianResponse<BQServiceFeesInitiateOutputModel> initiateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQServiceFeesInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateServicefees(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Request
	public BianResponse<BQServiceFeesRequestOutputModel> requestServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Fulfill.Retrieve
	public BianResponse<CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Fulfill.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Fulfill.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("corporateactions")
	@Fulfill.Retrieve
	public BianResponse<BQCorporateActionsRetrieveOutputModel> retrieveCorporateactions(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCorporateactions(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Retrieve
	public BianResponse<BQDepositsandWithdrawalsRetrieveOutputModel> retrieveDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("servicefees")
	@Fulfill.Retrieve
	public BianResponse<BQServiceFeesRetrieveOutputModel> retrieveServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveServicefees(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Fulfill.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Fulfill.RetrieveSD
	public BianResponse<SDInvestmentAccountRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Fulfill.Update
	public BianResponse<CRInvestmentAccountFulfillmentArrangementUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRInvestmentAccountFulfillmentArrangementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("corporateactions")
	@Fulfill.Update
	public BianResponse<BQCorporateActionsUpdateOutputModel> updateCorporateactions(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCorporateActionsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCorporateactions(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("depositsandwithdrawals")
	@Fulfill.Update
	public BianResponse<BQDepositsandWithdrawalsUpdateOutputModel> updateDepositsandwithdrawals(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDepositsandWithdrawalsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDepositsandwithdrawals(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("servicefees")
	@Fulfill.Update
	public BianResponse<BQServiceFeesUpdateOutputModel> updateServicefees(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQServiceFeesUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateServicefees(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
