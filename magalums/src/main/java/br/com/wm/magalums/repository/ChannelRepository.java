package br.com.wm.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.magalums.entity.Channel;

public interface ChannelRepository extends JpaRepository<Channel, Long> {
	
}
