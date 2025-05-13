package br.com.wm.magalums.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wm.magalums.entity.Status;

public interface StatusRepository extends JpaRepository<Status, Long> {
	
}
