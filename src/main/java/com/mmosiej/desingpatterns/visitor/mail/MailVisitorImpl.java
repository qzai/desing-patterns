package com.mmosiej.desingpatterns.visitor.mail;

import com.mmosiej.desingpatterns.visitor.mail.model.PasswordResetMailData;
import com.mmosiej.desingpatterns.visitor.mail.model.WelcomeMailData;

public class MailVisitorImpl implements MailVisitor {

    @Override
    public void visit(WelcomeMailData mailData) {
        System.out.println(String.format("Sending welcome mail with - userName: %s", mailData.getUserName()));
    }

    @Override
    public void visit(PasswordResetMailData mailData) {
        System.out.println(String.format("Sending password reset mail with - userName: %s, newPassword: %s", mailData.getUserName(), mailData.getNewPassword()));
    }
}
