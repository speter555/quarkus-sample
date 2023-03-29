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
package hu.innovitech.quarkus.sample.logger;

import hu.icellmobilsoft.coffee.dto.common.LogConstants;
import hu.icellmobilsoft.coffee.rest.log.BaseRestLogger;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.Dependent;
import jakarta.ws.rs.ext.Provider;

/**
 * REST request-response logger
 *
 * @author speter55
 * @since 0.1.0
 * 
 */
@Provider
@Priority(500)
@Dependent
public class RestLogger extends BaseRestLogger {

    @Override
    public String sessionKey() {
        return LogConstants.LOG_SESSION_ID;
    }
}
