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
package hu.innovitech.quarkus.sample.jsonb;

import jakarta.enterprise.context.Dependent;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;
import jakarta.ws.rs.ext.ContextResolver;
import jakarta.ws.rs.ext.Provider;

/**
 * Custom default JSON-B JAXRS provider. Used in {@code org.jboss.resteasy.plugins.providers.jsonb.AbstractJsonBindingProvider}
 * 
 * @author speter555
 * @since 0.1.0
 * @see <a href="https://javaee.github.io/jsonb-spec/users-guide.html">JSON-B spec</a>
 * @see <a href="https://www.adam-bien.com/roller/abien/entry/private_fields_serialization_with_json">Setter/Getter hide</a>
 * @see <a href="https://github.com/eclipse-ee4j/jsonb-api/issues/172">Future configuration option</a>
 */
@Provider
@Dependent
public class CustomJsonb implements ContextResolver<Jsonb> {

    @Override
    public Jsonb getContext(Class<?> type) {
        JsonbConfig config = new JsonbConfig().withPropertyVisibilityStrategy(new FieldOnlyVisibilityStrategy());
        return JsonbBuilder.newBuilder().withConfig(config).build();
    }
}
