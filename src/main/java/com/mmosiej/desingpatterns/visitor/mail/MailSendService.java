package com.mmosiej.desingpatterns.visitor.mail;

import com.mmosiej.desingpatterns.visitor.mail.model.AbstractMailData;

public class MailSendService {

    private MailVisitor mailVisitor;

    public MailSendService(MailVisitor mailVisitor) {
        this.mailVisitor = mailVisitor;
    }

    public void send(AbstractMailData mailData) {
        mailData.accept(mailVisitor);
    }
}
