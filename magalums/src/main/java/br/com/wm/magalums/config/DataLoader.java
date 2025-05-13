package br.com.wm.magalums.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.wm.magalums.entity.Channel;
import br.com.wm.magalums.entity.Status;
import br.com.wm.magalums.repository.ChannelRepository;
import br.com.wm.magalums.repository.StatusRepository;

@Configuration
public class DataLoader implements CommandLineRunner {

	@Autowired
    private ChannelRepository channelRepository;
    
	@Autowired
    private StatusRepository statusRepository;

    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(Channel.Values.values())
                .map(Channel.Values::toChannel)
                .forEach(channelRepository::save);

        Arrays.stream(Status.Values.values())
                .map(Status.Values::toStatus)
                .forEach(statusRepository::save);
    }
    
}