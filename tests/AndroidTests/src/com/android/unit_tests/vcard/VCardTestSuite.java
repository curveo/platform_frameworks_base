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

package com.android.unit_tests.vcard;

import com.android.unit_tests.AndroidTests;

import android.test.suitebuilder.TestSuiteBuilder;

import junit.framework.TestSuite;

public class VCardTestSuite extends TestSuite {
    public static TestSuite suite() {
        TestSuiteBuilder suiteBuilder = new TestSuiteBuilder(AndroidTests.class);
        suiteBuilder.includeAllPackagesUnderHere();
        return suiteBuilder.build();
    }
}