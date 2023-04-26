package org.eclipse.edc.consumer.ext;

import org.eclipse.edc.spi.iam.ClaimToken;
import org.eclipse.edc.spi.iam.IdentityService;
import org.eclipse.edc.spi.iam.TokenParameters;
import org.eclipse.edc.spi.iam.TokenRepresentation;
import org.eclipse.edc.spi.result.Result;

public class IdentityMockExtension implements IdentityService {
    @Override
    public Result<TokenRepresentation> obtainClientCredentials(TokenParameters parameters) {
        return null;
    }

    @Override
    public Result<ClaimToken> verifyJwtToken(TokenRepresentation tokenRepresentation, String audience) {
        return null;
    }
}
