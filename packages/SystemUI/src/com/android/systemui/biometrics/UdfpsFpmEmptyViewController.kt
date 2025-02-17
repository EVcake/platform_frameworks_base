/*
 * Copyright (C) 2021 The Android Open Source Project
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
package com.android.systemui.biometrics

import com.android.systemui.biometrics.domain.interactor.UdfpsOverlayInteractor
import com.android.systemui.dump.DumpManager
import com.android.systemui.plugins.statusbar.StatusBarStateController
import com.android.systemui.shade.domain.interactor.ShadeInteractor
import com.android.systemui.statusbar.phone.SystemUIDialogManager

/**
 * Class that coordinates non-HBM animations for non keyguard, or biometric prompt states.
 *
 * Currently doesn't draw anything.
 */
class UdfpsFpmEmptyViewController(
    view: UdfpsFpmEmptyView,
    statusBarStateController: StatusBarStateController,
    shadeInteractor: ShadeInteractor,
    systemUIDialogManager: SystemUIDialogManager,
    dumpManager: DumpManager,
    udfpsOverlayInteractor: UdfpsOverlayInteractor,
) : UdfpsAnimationViewController<UdfpsFpmEmptyView>(
    view,
    statusBarStateController,
    shadeInteractor,
    systemUIDialogManager,
    dumpManager,
    udfpsOverlayInteractor,
) {
    override val tag = "UdfpsFpmOtherViewController"
}
