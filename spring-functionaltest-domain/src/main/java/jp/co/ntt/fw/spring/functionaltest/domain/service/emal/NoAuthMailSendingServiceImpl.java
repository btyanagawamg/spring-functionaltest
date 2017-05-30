/*
 * Copyright(c) 2014-2017 NTT Corporation.
 */
package jp.co.ntt.fw.spring.functionaltest.domain.service.emal;

import java.util.Calendar;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class NoAuthMailSendingServiceImpl implements NoAuthMailSendingService {

    @Inject
    JavaMailSender mailSenderNoAuth;

    @Inject
    SimpleMailMessage templateMessage;

    @Inject
    MailReceivingSharedService mailReceivingService;

    @Value("${mail.pop3.host}")
    String pop3host;

    @Value("${mail.pop3.port}")
    int pop3port;

    @Value("${mail.from.user}")
    String pop3user;

    @Value("${mail.from.password}")
    String pop3password;

    @Override
    public void sendSimpleMessage(String to, String cc, String bcc,
            String replyTo, String text) {

        try {

            SimpleMailMessage message = new SimpleMailMessage(templateMessage);
            message.setTo(to);
            message.setCc(cc);
            message.setBcc(bcc);
            message.setReplyTo(replyTo);
            Calendar cal = Calendar.getInstance();
            cal.set(2015, 6, 6);
            message.setSentDate(cal.getTime());
            message.setText(text);
            mailSenderNoAuth.send(message);

        } finally {
            mailReceivingService.close();
        }

    }

    @Override
    public void popBeforeSmtp() {

        mailReceivingService
                .connect(pop3host, pop3port, pop3user, pop3password);

    }

}