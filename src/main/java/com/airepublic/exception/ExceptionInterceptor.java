/**
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

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

import com.airepublic.logging.java.LogLevel;
import com.airepublic.logging.java.LoggerConfig;

/**
 * Error handling intercepter.
 * 
 * @author Torsten.Oltmanns@ai-republic.com
 */
public class ExceptionInterceptor {
    @Inject
    @LoggerConfig(level = LogLevel.INFO)
    private Logger LOG;

    @AroundInvoke
    public void logExceptions(final InvocationContext ctx) throws Exception {
        try {
            ctx.proceed();
        } catch (final ErrorCodeException e) {
            LOG.log(Level.WARNING, "Classified error occurred: " + e.getErrorCode(), e);
        } catch (final Exception e) {
            LOG.log(Level.SEVERE, "Unhandled Exception occurred!", e);
        }
    }
}
