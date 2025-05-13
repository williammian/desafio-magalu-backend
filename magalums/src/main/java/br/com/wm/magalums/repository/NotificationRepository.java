package br.com.wm.magalums.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.magalums.entity.Notification;
import br.com.wm.magalums.entity.Status;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
	
    List<Notification> findByStatusInAndDateTimeBefore(List<Status> status, LocalDateTime dateTime);
    
}
