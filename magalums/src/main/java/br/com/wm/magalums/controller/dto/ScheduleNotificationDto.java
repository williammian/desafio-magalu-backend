package br.com.wm.magalums.controller.dto;

import java.time.LocalDateTime;

import br.com.wm.magalums.entity.Channel;
import br.com.wm.magalums.entity.Notification;
import br.com.wm.magalums.entity.Status;

public record ScheduleNotificationDto(LocalDateTime dateTime,
        String destination,
        String message,
        Channel.Values channel) {

	public Notification toNotification() {
		return new Notification(
				dateTime,
				destination,
				message,
				channel.toChannel(),
				Status.Values.PENDING.toStatus()
		);
	}
}
