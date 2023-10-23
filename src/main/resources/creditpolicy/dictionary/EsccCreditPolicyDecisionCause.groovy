package creditpolicy.dictionary

import com.mm.core.dsl.script.model.DecisionCause

enum EsccCreditPolicyDecisionCause implements DecisionCause {

  AGE(RISK_STATUS_CANCEL, CANCELLED_BY_SYSTEM, "AGE", "Not allowed age"),

}
