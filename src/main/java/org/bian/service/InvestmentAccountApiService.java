/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface InvestmentAccountApiService {

	SDInvestmentAccountActivateOutputModel activate(SDInvestmentAccountActivateInputModel request);
	
	SDInvestmentAccountConfigureOutputModel configure(String sdReferenceId, SDInvestmentAccountConfigureInputModel request);
	
	CRInvestmentAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRInvestmentAccountFulfillmentArrangementControlInputModel request);
	
	BQCorporateActionsExchangeOutputModel exchangeCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsExchangeInputModel request);
	
	BQDepositsandWithdrawalsExchangeOutputModel exchangeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExchangeInputModel request);
	
	BQServiceFeesExchangeOutputModel exchangeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExchangeInputModel request);
	
	BQCorporateActionsExecuteOutputModel executeCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsExecuteInputModel request);
	
	BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDInvestmentAccountFeedbackOutputModel feedback(String sdReferenceId, SDInvestmentAccountFeedbackInputModel request);
	
	CRInvestmentAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRInvestmentAccountFulfillmentArrangementInitiateInputModel request);
	
	BQCorporateActionsInitiateOutputModel initiateCorporateactions(String sdReferenceId, String crReferenceId, BQCorporateActionsInitiateInputModel request);
	
	BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQServiceFeesRequestOutputModel requestServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesRequestInputModel request);
	
	CRInvestmentAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQCorporateActionsRetrieveOutputModel retrieveCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDInvestmentAccountRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRInvestmentAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRInvestmentAccountFulfillmentArrangementUpdateInputModel request);
	
	BQCorporateActionsUpdateOutputModel updateCorporateactions(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCorporateActionsUpdateInputModel request);
	
	BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request);
	
	BQServiceFeesUpdateOutputModel updateServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesUpdateInputModel request);
	
}
