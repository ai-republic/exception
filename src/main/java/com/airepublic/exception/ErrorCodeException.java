/**
   Copyright 2015 Torsten Oltmanns, ai-republic GmbH, Germany

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
package com.airepublic.exception;

/**
 * A generic exception the contains an error code.#
 * 
 * @author Torsten.Oltmanns
 *
 */
public class ErrorCodeException extends Exception {
	private static final long serialVersionUID = 6599809475130640828L;
	private IErrorCode errorCode;
	
	/**
	 * Default constructor.
	 */
	public ErrorCodeException() {
	}
	
	/**
	 * Constructor specifying error code and message.
	 *  
	 * @param errorCode the error code
	 * @param message the message
	 */
	public ErrorCodeException(IErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * Constructor specifying error code and message.
	 *  
	 * @param errorCode the error code
	 * @param message the message
	 * @param cause the cause
	 */
	public ErrorCodeException(IErrorCode errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}
	
	/**
	 * Gets the error code.
	 * 
	 * @return the error code
	 */
	public IErrorCode getErrorCode() {
		return errorCode;
	}
	
	@Override
	public String getMessage() {
		return getErrorCode() + ":" + super.getMessage();
	}
}
