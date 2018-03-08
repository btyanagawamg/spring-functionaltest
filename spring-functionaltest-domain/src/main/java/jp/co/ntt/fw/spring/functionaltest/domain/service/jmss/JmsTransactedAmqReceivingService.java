/*
 * Copyright 2014-2018 NTT Corporation.
 *
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
package jp.co.ntt.fw.spring.functionaltest.domain.service.jmss;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

import javax.jms.JMSException;
import javax.validation.Valid;

import jp.co.ntt.fw.spring.functionaltest.domain.model.JmsTodo;

import org.springframework.messaging.Message;

public interface JmsTransactedAmqReceivingService {

    void receiveMessage_TxRcvOK(
            String id) throws IOException, InterruptedException;

    void receiveMessage_TxRcvNG(String id) throws InterruptedException;

}
