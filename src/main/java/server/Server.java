package server;

public interface Server {
    public void beforeStart() throws Exception;

    public void start() throws Exception;

    public boolean isRunning();

    public void stop() throws Exception;

    public void afterStop() throws Exception;
}
