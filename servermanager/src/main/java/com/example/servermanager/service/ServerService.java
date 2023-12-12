package com.example.servermanager.service;

import com.example.servermanager.model.Server;

import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Collection;

public interface ServerService {
    Server create(Server server);
    Server ping(String ipAddress) throws UnknownHostException,IOException;
    Collection<Server> list (int limit);
    Server get(Long id);
    Server update(Server server);
    Boolean delete(Long id);
}
