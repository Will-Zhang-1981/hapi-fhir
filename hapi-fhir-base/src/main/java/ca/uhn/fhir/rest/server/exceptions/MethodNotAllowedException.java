package ca.uhn.fhir.rest.server.exceptions;

import ca.uhn.fhir.model.dstu.resource.OperationOutcome;
import ca.uhn.fhir.rest.server.Constants;

/*
 * #%L
 * HAPI FHIR - Core Library
 * %%
 * Copyright (C) 2014 University Health Network
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

/**
 * Represents an <b>HTTP 405 Method Not Allowed</b> response.
 * 
 * <p>
 * Note that a complete list of RESTful exceptions is available in the
 * <a href="./package-summary.html">Package Summary</a>.
 * </p>
 * 
 * @see UnprocessableEntityException Which should be used for business level validation failures
 */
public class MethodNotAllowedException extends BaseServerResponseException {
	public 	static final int STATUS_CODE = Constants.STATUS_HTTP_405_METHOD_NOT_ALLOWED;
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * 
	 * @param theMessage
	 *            The message
	 *  @param theOperationOutcome The OperationOutcome resource to return to the client
	 */
	public MethodNotAllowedException(String theMessage, OperationOutcome theOperationOutcome) {
		super(STATUS_CODE, theMessage, theOperationOutcome);
	}

	public MethodNotAllowedException(String error) {
		super(STATUS_CODE, error);
	}
}
