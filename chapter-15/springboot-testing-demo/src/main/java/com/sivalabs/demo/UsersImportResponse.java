/**
 * Copyright 2016 SivaLabs.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions 
 * and limitations under the License.
 */
package com.sivalabs.demo;

/**
 * @author Siva
 *
 */
public class UsersImportResponse
{
	private int retryCount;
	private String status;
	
	public UsersImportResponse(int retryCount, String status)
	{
		this.retryCount = retryCount;
		this.status = status;
	}

	@Override
	public String toString()
	{
		return "UsersImportResponse [retryCount=" + retryCount + ", status=" + status + "]";
	}

	public int getRetryCount()
	{
		return retryCount;
	}

	public String getStatus()
	{
		return status;
	}
	
}
