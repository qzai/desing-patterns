package com.mmosiej.desingpatterns.visitor.mail.model;

import com.mmosiej.desingpatterns.visitor.mail.MailVisitor;

public class WelcomeMailData extends AbstractMailData {

    public WelcomeMailData(String userName) {
        this.userName = userName;
    }

    @Override
    public void accept(MailVisitor visitor) {
        visitor.visit(this);
    }
}
