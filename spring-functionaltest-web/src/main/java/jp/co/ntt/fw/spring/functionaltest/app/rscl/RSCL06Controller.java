/*
 * Copyright(c) 2014 NTT Corporation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package jp.co.ntt.fw.spring.functionaltest.app.rscl;

import javax.inject.Inject;

import jp.co.ntt.fw.spring.functionaltest.domain.model.UserResource;
import jp.co.ntt.fw.spring.functionaltest.domain.service.rscl.HttpsRestClientService;
import jp.co.ntt.fw.spring.functionaltest.domain.service.rscl.RestClientService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("rscl")
@Controller
public class RSCL06Controller {

    @Inject
    RestClientService restClientService;

    @Inject
    HttpsRestClientService httpsRestClientService;

    @RequestMapping(value = "0601/001", method = RequestMethod.GET)
    public String handle0601001First(Model model) {

        model.addAttribute("testDescription", "Self-signed certificate");
        model.addAttribute("testId", "0601/001");

        return "rscl/setSelfSignedCertificate";
    }

    @RequestMapping(value = "0601/001", method = RequestMethod.POST)
    public String handle0601001(Model model) {

        UserResource rcvUser = this.httpsRestClientService.connectHttps();

        model.addAttribute("resultDescription", "自己署名証明書情報");
        model.addAttribute("user", rcvUser);

        return "rscl/resultUserInf";
    }

}
