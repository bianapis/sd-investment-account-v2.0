package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount;
import org.bian.dto.CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord;

import javax.validation.Valid;
  
/**
 * CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord
 */
public class CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecord   {
  private String investmentAccountNumber = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordLinkedCashAccount linkedCashAccount = null;

  private String investmentAccountInstrumentProfile = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord investmentAccountInstrumentRecord = null;

  private String entitlementOptionDefinition = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionDefinition = null;

  private String restrictionOptionSetting = null;

  private CRInvestmentAccountFulfillmentArrangementInitiateInputModelInvestmentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


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

  public CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord getInvestmentAccountInstrumentRecord() {
    return investmentAccountInstrumentRecord;
  }

  public void setInvestmentAccountInstrumentRecord(CRInvestmentAccountFulfillmentArrangementInitiateOutputModelInvestmentAccountFulfillmentArrangementInstanceRecordInvestmentAccountInstrumentRecord investmentAccountInstrumentRecord) {
    this.investmentAccountInstrumentRecord = investmentAccountInstrumentRecord;
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

