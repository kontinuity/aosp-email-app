/*
 * Copyright (C) 2009 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.email.activity.setup;

import android.content.Context;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import com.android.email.R;
import com.android.email.provider.ProviderTestUtils;
import com.android.emailcommon.provider.Account;
import com.android.emailcommon.provider.HostAuth;

import java.net.URISyntaxException;

/**
 * Tests of the basic UI logic in the Account Setup Incoming (IMAP / POP3) screen.
 * You can run this entire test case with:
 *   runtest -c com.android.email.activity.setup.AccountSetupExchangeTests email
 */
@MediumTest
public class AccountSetupExchangeTests extends
        ActivityInstrumentationTestCase2<AccountSetupExchange> {

    public AccountSetupExchangeTests() {
        super(AccountSetupExchange.class);
    }

}
