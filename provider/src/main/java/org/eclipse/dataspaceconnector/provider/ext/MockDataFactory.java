package org.eclipse.dataspaceconnector.provider.ext;


import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSink;
import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSinkFactory;
import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSource;
import org.eclipse.edc.connector.dataplane.spi.pipeline.DataSourceFactory;
import org.eclipse.edc.spi.response.StatusResult;
import org.eclipse.edc.spi.result.Result;
import org.eclipse.edc.spi.types.domain.transfer.DataFlowRequest;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;

public class MockDataFactory implements DataSinkFactory, DataSourceFactory {
    @Override
    public boolean canHandle(DataFlowRequest dataFlowRequest) {
        return "file".equalsIgnoreCase(dataFlowRequest.getSourceDataAddress().getType());
    }

    @Override
    public @NotNull Result<Boolean> validate(DataFlowRequest dataFlowRequest) {
        return Result.success(true);
    }

    @Override
    public DataSource createSource(DataFlowRequest dataFlowRequest) {
        return new DataSource() {
            @Override
            public Stream<Part> openPartStream() {
                return Stream.empty();
            }
        };
    }

    @Override
    public DataSink createSink(DataFlowRequest dataFlowRequest) {
        return source -> CompletableFuture.completedFuture(StatusResult.success());
    }

    @Override
    public @NotNull Result<Void> validateRequest(DataFlowRequest request) {
        return Result.success();
    }
}
