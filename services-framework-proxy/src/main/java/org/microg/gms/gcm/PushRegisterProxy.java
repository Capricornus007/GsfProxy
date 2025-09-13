/*
 * SPDX-FileCopyrightText: 2013-2025 microG Project Team
 * SPDX-License-Identifier: Apache-2.0
 */

package org.microg.gms.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PushRegisterProxy extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        if (context == null || intent == null) return;
        intent.setPackage("com.google.android.gms");
        context.startService(intent);
    }
}
