package com.mmosiej.desingpatterns.visitor.mail.model;

import com.mmosiej.desingpatterns.visitor.mail.MailVisitor;

public abstract class AbstractMailData {
    protected String userName;

    public String getUserName() {
        return userName;
    }

    public abstract void accept(MailVisitor visitor);
}
