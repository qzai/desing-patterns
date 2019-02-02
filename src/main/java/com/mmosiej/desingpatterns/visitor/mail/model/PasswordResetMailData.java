package com.mmosiej.desingpatterns.visitor.mail.model;

import com.mmosiej.desingpatterns.visitor.mail.MailVisitor;

public class PasswordResetMailData extends AbstractMailData {

    private String newPassword;

    public PasswordResetMailData(String userName, String newPassword) {
        this.userName = userName;
        this.newPassword = newPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    @Override
    public void accept(MailVisitor visitor) {
        visitor.visit(this);
    }
}
