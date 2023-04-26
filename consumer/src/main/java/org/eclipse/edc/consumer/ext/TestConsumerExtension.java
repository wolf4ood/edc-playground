package org.eclipse.edc.consumer.ext;


import org.eclipse.edc.iam.mock.MockIdentityService;
import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.spi.event.EventRouter;
import org.eclipse.edc.spi.iam.IdentityService;
import org.eclipse.edc.spi.message.RemoteMessageDispatcherRegistry;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.system.ServiceExtensionContext;

public class TestConsumerExtension implements ServiceExtension {


//    @Inject
//    private EventRouter eventRouter;
//
//
//    @Inject
//    private InProcessCallbackRegistry callbackRegistry;
//
//    @Inject
//    private RemoteMessageDispatcherRegistry dispatcher;

    @Override
    public void initialize(ServiceExtensionContext context) {




//        callbackRegistry.registerHandler((msg) -> {
//            System.out.println(msg);
//        });


    }
}
