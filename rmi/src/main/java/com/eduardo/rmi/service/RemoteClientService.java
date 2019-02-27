package com.eduardo.rmi.service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import com.eduardo.rmi.entity.Client;

public interface RemoteClientService extends Remote {
	
	public List<Client> getClients() throws RemoteException;

}
