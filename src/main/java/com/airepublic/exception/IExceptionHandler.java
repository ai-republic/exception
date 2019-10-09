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

import java.io.Serializable;

/**
 * Interface for exception handlers.
 * 
 * @author Torsten.Oltmanns@comvel.de
 */
public interface IExceptionHandler extends Serializable {
	
	/**
	 * Handle the exception and returns a flag whether the exception could be handled or not.
	 * 
	 * @param e the exception
	 * @return if the exception could be handled, return true otherwise return false
	 */
	boolean handleException(Throwable t);
}
