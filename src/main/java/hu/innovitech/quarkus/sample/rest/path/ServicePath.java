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
package hu.innovitech.quarkus.sample.rest.path;

import hu.icellmobilsoft.coffee.dto.url.BaseServicePath;

/**
 * Service Paths
 *
 * @author speter555
 * @since 0.1.0
 */
public class ServicePath extends BaseServicePath {

    /**
     * {@value}
     */
    public static final String VERSION_INFO = "/versionInfo";
}
