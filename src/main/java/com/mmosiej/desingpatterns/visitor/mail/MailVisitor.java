package com.mmosiej.desingpatterns.visitor.mail;

import com.mmosiej.desingpatterns.visitor.mail.model.PasswordResetMailData;
import com.mmosiej.desingpatterns.visitor.mail.model.WelcomeMailData;

public interface MailVisitor {
    void visit(WelcomeMailData mailData);
    void visit(PasswordResetMailData mailData);
}
