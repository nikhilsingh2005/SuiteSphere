package com.nikhil.suitesphere.services;

import com.nikhil.suitesphere.dtos.NotificationDTO;

public interface NotificationService {

    void sendEmail(NotificationDTO notificationDTO);

    void sendSms();

    void sendWhatsapp();
}
