package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount;

import javax.validation.Valid;
  
/**
 * BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord
 */
public class BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String investmentAccountNumber = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount linkedCashAccount = null;

  private String investmentAccountType = null;

  private String investmentAccountInstrumentProfile = null;

  private BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord investmentAccountInstrumentRecord = null;

  private String taxReference = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the investment account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated investment account number in any suitable format 
   * @return investmentAccountNumber
  **/

  public String getInvestmentAccountNumber() {
    return investmentAccountNumber;
  }

  public void setInvestmentAccountNumber(String investmentAccountNumber) {
    this.investmentAccountNumber = investmentAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * Get linkedCashAccount
   * @return linkedCashAccount
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount getLinkedCashAccount() {
    return linkedCashAccount;
  }

  public void setLinkedCashAccount(CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount linkedCashAccount) {
    this.linkedCashAccount = linkedCashAccount;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of investment account (e.g. discretionary, retirement, margin, restricted instrument category - securities, off-balance sheet) 
   * @return investmentAccountType
  **/

  public String getInvestmentAccountType() {
    return investmentAccountType;
  }

  public void setInvestmentAccountType(String investmentAccountType) {
    this.investmentAccountType = investmentAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details the range of instruments that are tracked by the facility (each instrument has its own transaction record/holding position 
   * @return investmentAccountInstrumentProfile
  **/

  public String getInvestmentAccountInstrumentProfile() {
    return investmentAccountInstrumentProfile;
  }

  public void setInvestmentAccountInstrumentProfile(String investmentAccountInstrumentProfile) {
    this.investmentAccountInstrumentProfile = investmentAccountInstrumentProfile;
  }


  /**
   * Get investmentAccountInstrumentRecord
   * @return investmentAccountInstrumentRecord
  **/

  public BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord getInvestmentAccountInstrumentRecord() {
    return investmentAccountInstrumentRecord;
  }

  public void setInvestmentAccountInstrumentRecord(BQServiceFeesInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord investmentAccountInstrumentRecord) {
    this.investmentAccountInstrumentRecord = investmentAccountInstrumentRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference identifier linking the investment account to appropriate tax handling 
   * @return taxReference
  **/

  public String getTaxReference() {
    return taxReference;
  }

  public void setTaxReference(String taxReference) {
    this.taxReference = taxReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable entitlement option 
   * @return entitlementOptionDefinition
  **/

  public String getEntitlementOptionDefinition() {
    return entitlementOptionDefinition;
  }

  public void setEntitlementOptionDefinition(String entitlementOptionDefinition) {
    this.entitlementOptionDefinition = entitlementOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The definition of an applicable restriction option 
   * @return restrictionOptionDefinition
  **/

  public String getRestrictionOptionDefinition() {
    return restrictionOptionDefinition;
  }

  public void setRestrictionOptionDefinition(String restrictionOptionDefinition) {
    this.restrictionOptionDefinition = restrictionOptionDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

