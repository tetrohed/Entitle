package com.entitle.server;

import java.net.Socket;

public class ServerConnection implements IServerConnection
{
    private Socket socket_;
    private IJob job_;

    ServerConnection(Socket socket, IJob job)
    {
        socket_ = socket;
        job_ = job;
    }

    @Override
    public void run()
    {
        job_.accomplish(socket_);
    }
}
