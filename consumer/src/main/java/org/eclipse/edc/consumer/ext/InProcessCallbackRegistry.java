package org.eclipse.edc.consumer.ext;


import org.eclipse.edc.runtime.metamodel.annotation.ExtensionPoint;
//import org.eclipse.edc.spi.callback.CallbackEventRemoteMessage;
import org.eclipse.edc.spi.event.Event;

import java.util.function.Consumer;

@ExtensionPoint
public interface InProcessCallbackRegistry {
//    void registerHandler(Consumer<CallbackEventRemoteMessage<? extends Event>> consumer);
//
//    <T extends Event> void handleMessage(CallbackEventRemoteMessage<T> message);
}
