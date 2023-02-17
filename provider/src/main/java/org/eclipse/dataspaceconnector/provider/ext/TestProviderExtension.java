package org.eclipse.dataspaceconnector.provider.ext;


import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSinkFactory;
import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSourceFactory;
import org.eclipse.edc.connector.dataplane.spi.pipeline.PipelineService;
import org.eclipse.edc.runtime.metamodel.annotation.Inject;
import org.eclipse.edc.spi.system.ServiceExtension;
import org.eclipse.edc.spi.system.ServiceExtensionContext;

public class TestProviderExtension implements ServiceExtension {


    @Inject
    private PipelineService pipelineService;

    @Override
    public void initialize(ServiceExtensionContext context) {


        var mockFactory = new MockDataFactory();
        pipelineService.registerFactory((DataSourceFactory) mockFactory);
        pipelineService.registerFactory((DataSinkFactory) mockFactory);

    }
}
