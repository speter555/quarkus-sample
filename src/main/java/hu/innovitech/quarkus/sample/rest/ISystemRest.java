/*-
 * #%L
 * Quarkus Sample
 * %%
 * Copyright (C) 2022 - 2023 Innovitech Kft.
 * %%
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
 * #L%
 */
package hu.innovitech.quarkus.sample.rest;

import org.eclipse.microprofile.openapi.annotations.Operation;

import hu.icellmobilsoft.coffee.dto.exception.BaseException;
import hu.innovitech.quarkus.sample.rest.path.ServicePath;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * REST endpoint for system service functions.
 *
 * @author speter555
 * @since 0.1.0
 */
@Path(ServicePath.SYSTEM)
public interface ISystemRest {

    /**
     * Get app version informations
     * 
     * @return text format version informations
     * @throws BaseException
     *             if it has any error
     */
    @Operation(hidden = true)
    @GET
    @Path(ServicePath.VERSION_INFO)
    @Produces(MediaType.TEXT_PLAIN)
    String versionInfo() throws BaseException;
}
