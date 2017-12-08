package server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * mina服务器端
 */
public class MinaSocketServer implements Server {

    private static final Logger log = LoggerFactory.getLogger(MinaSocketServer.class);



    @Override
    public void beforeStart() throws Exception {

    }

    @Override
    public void start() throws Exception {

    }

    @Override
    public boolean isRunning() {
        return false;
    }

    @Override
    public void stop() throws Exception {

    }

    @Override
    public void afterStop() throws Exception {

    }
}
