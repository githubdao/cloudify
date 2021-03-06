/*******************************************************************************
 * Copyright (c) 2011 GigaSpaces Technologies Ltd. All rights reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.cloudifysource.domain;

import org.cloudifysource.domain.internal.CloudifyDSLEntity;
/*******
 * Domain Object for storage settings required for a specific service.
 * 
 * @author adaml
 * @since 2.5.0
 */
@CloudifyDSLEntity(name = "storage", clazz = StorageDetails.class, allowInternalNode = true, allowRootNode = false,
	parent = "service")
public class StorageDetails {

	private String template;

	public String getTemplate() {
		return template;
	}

	public void setTemplate(final String template) {
		this.template = template;
	}
}
