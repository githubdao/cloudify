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

service {
	name "network"
	type "APP_SERVER"

	compute {
		template "SMALL_UBUNTU"
	}

	lifecycle{
		install 'printContext.groovy'
	}

	network {
		template "My_Network"
		accessRules {
			incoming = ([
				accessRule {
					portRange "80"
					type "PUBLIC"
				},
				accessRule {
					portRange "81"
					type "SERVICE"
				}
			])
		}

		
	}
}
