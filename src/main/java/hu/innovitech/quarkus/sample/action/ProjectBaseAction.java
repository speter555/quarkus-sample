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
package hu.innovitech.quarkus.sample.action;

import hu.icellmobilsoft.coffee.dto.common.commonservice.ContextType;
import hu.icellmobilsoft.coffee.rest.action.AbstractBaseAction;
import hu.icellmobilsoft.coffee.tool.utils.date.DateUtil;
import hu.icellmobilsoft.coffee.tool.utils.string.RandomUtil;

/**
 * Project's base action class
 * 
 * @author speter55
 * @since 0.1.0
 */
public class ProjectBaseAction extends AbstractBaseAction {

    @Override
    public ContextType createContext() {
        return new ContextType().withRequestId(RandomUtil.generateId()).withTimestamp(DateUtil.nowUTCTruncatedToMillis());
    }
}
