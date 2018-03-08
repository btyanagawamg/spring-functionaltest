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
package jp.co.ntt.fw.spring.functionaltest.app.aply;

import jp.co.ntt.fw.spring.functionaltest.app.cmmn.exception.IntentionalException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.terasoluna.gfw.common.message.ResultMessages;

@Controller
@RequestMapping("aply")
public class APLY04Controller {

    @RequestMapping(value = "0401/001")
    public String handle01001(Model model) {
        return "aply/controllerCommonComplete";
    }

    @RequestMapping(value = "0401/002")
    public String handle01002(Model model) {
        return "aply/controllerCommonComplete";
    }

    // APLY0401003は APLY0401003Controller参照

    @RequestMapping(value = "0402/001")
    public String handle02001(Model model) {
        return "aply/controllerCommonComplete";
    }

    @RequestMapping(value = "0402/002")
    public String handle02002() {
        throw new IntentionalException(ResultMessages.error().add(
                "e.sf.cmmn.8003"));
    }
}
