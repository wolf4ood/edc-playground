/*
 *  Copyright (c) 2023 Bayerische Motoren Werke Aktiengesellschaft (BMW AG)
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Bayerische Motoren Werke Aktiengesellschaft (BMW AG) - initial API and implementation
 *
 */

package org.eclipse.edc.consumer.ext;

//import org.eclipse.edc.spi.callback.CallbackEventRemoteMessage;
import org.eclipse.edc.spi.event.Event;
import org.eclipse.edc.spi.message.RemoteMessageDispatcher;
import org.eclipse.edc.spi.types.domain.message.RemoteMessage;

import java.util.concurrent.CompletableFuture;

public abstract class CallbackMessageDispatcherImpl implements RemoteMessageDispatcher {
    private final InProcessCallbackRegistry registry;

    public CallbackMessageDispatcherImpl(InProcessCallbackRegistry registry) {
        this.registry = registry;
    }

    @Override
    public String protocol() {
        return "local";
    }

//    @Override
//    public <T, M extends RemoteMessage> CompletableFuture<T> send(Class<T> responseType, M message) {
//
////        if (message instanceof CallbackEventRemoteMessage) {
////            registry.handleMessage((CallbackEventRemoteMessage<? extends Event>) message);
////        }
//        return CompletableFuture.completedFuture(null);
//    }

}
