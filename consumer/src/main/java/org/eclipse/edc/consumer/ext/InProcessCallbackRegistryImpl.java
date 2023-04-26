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

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class InProcessCallbackRegistryImpl implements InProcessCallbackRegistry {

//    private final List<Consumer<CallbackEventRemoteMessage<? extends Event>>> handlers = new ArrayList<>();
//
//    @Override
//    public void registerHandler(Consumer<CallbackEventRemoteMessage<? extends Event>> consumer) {
//        handlers.add(consumer);
//    }
//
//    @Override
//    public <T extends Event> void handleMessage(CallbackEventRemoteMessage<T> message) {
//
//        for (var handler : handlers) {
//            handler.accept(message);
//        }
//    }
}
