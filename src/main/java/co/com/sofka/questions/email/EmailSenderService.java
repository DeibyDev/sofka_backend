/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.com.sofka.questions.email;

/**
 *
 * @author Usuario
 */
public interface EmailSenderService {
    void sendEmail(String to, String subject, String message);
}
