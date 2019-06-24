/**
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.jd.joyqueue.client.internal.trace.support;

import com.jd.joyqueue.client.internal.trace.Trace;
import com.jd.joyqueue.client.internal.trace.TraceCaller;
import com.jd.joyqueue.client.internal.trace.TraceContext;

/**
 * NoneTrace
 * author: gaohaoxiang
 * email: gaohaoxiang@jd.com
 * date: 2019/1/3
 */
public class NoneTrace implements Trace {

    private static final NoneTrace INSTANCE = new NoneTrace();

    public static NoneTrace getInstance() {
        return INSTANCE;
    }

    @Override
    public TraceCaller begin(TraceContext context) {
        return NoneTraceCaller.getInstance();
    }

    @Override
    public String type() {
        return "none";
    }
}