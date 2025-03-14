package com.appvillis.nicegram

import com.appvillis.nicegram.domain.BillingManager

object NicegramBillingHelper {
    var billingManager: BillingManager? = null

    val userHasNgPremiumSub get() = billingManager?.userHasActiveSub ?: false
}