package com.mmosiej.desingpatterns.visitor;

import com.mmosiej.desingpatterns.visitor.mail.MailSendService;
import com.mmosiej.desingpatterns.visitor.mail.MailVisitorImpl;
import com.mmosiej.desingpatterns.visitor.mail.model.PasswordResetMailData;

public class VisitorClient {

    public static void main(String[] args) {
        MailSendService mailSendService = new MailSendService(new MailVisitorImpl());
        mailSendService.send(new PasswordResetMailData("isolMan1337", "changeMe"));
    }
}
