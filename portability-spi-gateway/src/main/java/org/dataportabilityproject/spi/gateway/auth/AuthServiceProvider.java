package org.dataportabilityproject.spi.gateway.auth;

import org.dataportabilityproject.spi.gateway.auth.AuthServiceProviderRegistry.AuthMode;

import java.util.List;

/**
 * Factory responsible for providing {@link AuthDataGenerator} implementations.
 *
 * REVIEW: There is no distinction between offline and online generators since offline input data collection should be externalized from this layer
 */
public interface AuthServiceProvider {

    /**
     * Returns the id of the service this factory supports.
     */
    String getServiceId();

    /**
     * Returns an authentication generator for the given data type.
     *
     * @param transferDataType the data type
     */
    AuthDataGenerator getAuthDataGenerator(String transferDataType, AuthMode mode);

    /**
     * get supported import types
     * @return The list of types that are supported for IMPORT AuthMode
     */
    List<String> getImportTypes();

    /**
     * get supported export types
     * @return The list of types that are supported for EXPORT AuthMode
     */
    List<String> getExportTypes();
}
